package clases;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class calendar {

    public static void main(String[] args) throws ParseException {
//Creamos un objeto de la clase Calendar.
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día, hora, minuto y segundo del sistema.
        //Usando el método get y el parámetro correspondiente.
        int ano = fecha.get(Calendar.YEAR) - 18;
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        String mindate = ano + "/" + mes + "/" + dia;
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);
        System.out.println(mindate);
        Date min = new SimpleDateFormat("yyyy/MM/dd").parse(mindate);

        System.out.println(min);
        Date fechaActual = new Date();
        System.out.println(fechaActual);

        DateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println(formato.format(fechaActual));
    }

}
