package beans;

import clases.Persona;
import clases.ToUpperCaseConverter;
import java.util.ArrayList;
import java.util.List;

    import javax.faces.bean.ManagedBean;


@ManagedBean
public class personaBean {

    private Persona persona = new Persona();
    private ToUpperCaseConverter toUpperCaseConverter = new ToUpperCaseConverter();
    private static List<Persona> lstPersonas = new ArrayList();

    public personaBean() {
    }

    public ToUpperCaseConverter getToUpperCaseConverter() {
        return toUpperCaseConverter;
    }

    public void setToUpperCaseConverter(ToUpperCaseConverter toUpperCaseConverter) {
        this.toUpperCaseConverter = toUpperCaseConverter;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(List<Persona> lstPersonas) {
        personaBean.lstPersonas = lstPersonas;
    }

    public void mostrarPersona() {
        personaBean.lstPersonas.add(this.persona);
    }

    public void editarPersona() {
        personaBean.lstPersonas.set(0, persona);
    }

    public void personaEliminar(Persona per) {
        personaBean.lstPersonas.remove(per);
    }
}
