package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Persona {

    //se definen las variables que usaremos en el formulario
    private String nombre;
    private String apellido;
    private String cedula;
    private Integer numero;
    private Date fecha;
    //creamos una variable un objeto de la clase Date para obtener la Fecha actual 
    private Date fechaActual = new Date();

    public Persona() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    //este metodo valida el sexo de la persona dependiendo del numero ingresado en la variable numero
    public char sexo() {
        this.numero = numero;
        if (numero >= 567890) {
            return 'M';
        } else {
            return 'F';
        }
    }

    //este metodo returna la fecha maxima a escoger en el calendario del formulario
    public Date getMaxdate() {
        return fechaActual;
    }

    //este metodo returna la fecha minima a escoger en el calendario del formulario
    public Date getMindate() throws ParseException {
        //creamos un objeto de la clase calendar para obtener la fecha actual
        Calendar cal = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día actual del sistema
        //Usando el método get y el parámetro correspondiente
        //Fecha minima en el calendario debe ser la fecha actual hace 18 años
        //al año actual le restamos 18 para obtener la fecha minima
        int año = cal.get(Calendar.YEAR) - 18;
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        //Concatenamos las variables año, dia, mes en una variable String
        String mindate = año + "/" + mes + "/" + dia;
        //creamos una variable Date para convertir la variable String en Date
        Date min = new SimpleDateFormat("yyyy/MM/dd").parse(mindate);
        //retornamos la variable Date para definirla como fecha minima en el calendario del formulario
        return min;
    }
}
