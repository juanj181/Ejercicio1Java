/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, Persona> mapPersonas = new HashMap<>();
        List<Persona> personas=new ArrayList<>();
        Persona persona1 = new Persona("pepe", "Perez", Sexo.Hombre, "48599967C");
        Persona persona2 = new Persona("pepa", "Martinez", Sexo.Mujer, "8588874B");
        Persona persona3 = new Persona("Luis", "Lopez", Sexo.Hombre, "78966635B");
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
        //cacaculopis
        mapPersonas.put(persona1.getDni(),persona1);
        mapPersonas.put(persona2.getDni(),persona2);
        mapPersonas.put(persona3.getDni(),persona3);
        
        Persona personaBuscada = mapPersonas.get("78966635B");
        System.out.println(personaBuscada.getNombreCompleto());
        
        Set<String> dnis=mapPersonas.keySet();
        for(String dni:dnis){
            Persona persona= mapPersonas.get(dni);
            System.out.println(dni+ " " + persona.getNombreCompleto());
        }
        
        String ape1="Navarro";
        for(Persona persona:personas){
        
            if(persona.getApe1().equals(ape1)){
                System.out.println(persona.getNombreCompleto());
            }
        }
            System.out.println("Nº de elementos:"+personas.size());
        
       /*
        borrarPersonas(personas);
        imprimirImpresoraPersonas(personas);
        
        private static void imprimirConsolaPersonas(List<Persona>personas){
            
        }
        private static void borrarPersonas(List<Persona>personas){
            
        }
        private static void borrarPersonas(List<Persona>personas){
            
        }
        */
        Persona persona = new Persona("Navarro", "Juanjo", Sexo.Hombre, "48588874X");
        
        /*persona.setApe1("Navarro");
        persona.setNombre("Juanjo");
        persona.setSexo(Sexo.Hombre);
        // TODO code application logic here*/
        
        
        System.out.println("Mi nombre es: "+persona.getNombre());
        System.out.println("Mi apellido es: "+persona.getApe1());
        System.out.println("Mi sexo es: "+persona.getSexo());

    }
}
