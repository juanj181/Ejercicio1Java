/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author alumno
 */
public class Persona {

    private String nombre;
    private String ape1;
    private Sexo sexo;
    private String dni;

    public Persona(String nombre, String ape1, Sexo sexo, String dni) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.sexo = sexo;
        this.dni = dni;
    }

    Persona() {
    }

    /**
     * @param args the command line arguments
     */
    public String getNombre() {
        return this.nombre;
        // TODO code application logic here
    }

    public String getApe1() {
        return this.ape1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombreCompleto() {
        String nombreCompleto = nombre + " " + " " + ape1;
        return nombreCompleto;

    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
}
