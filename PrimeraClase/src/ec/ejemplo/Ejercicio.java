package ec.ejemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ec.ejemplo.pojo.Persona;

public class Ejercicio {
    
    public static void main(String[] args) {
        String sexo = "";
        List<Persona> lstPersona = new ArrayList<Persona>();
        Map<Long, Persona> mapPersona = new HashMap<Long, Persona>();
        //---------------------------------
        Persona persona = new Persona((long) 555471354, "Jean Carlos", 29, "Masculino", "Los Esteros", "Superior");
        /*persona.setNombre();
        persona.setCedula((long) 555471354);
        persona.setSexo("Masculino");
        persona.setEdad(29);
        persona.setLugarResidencia("Los Esteros");
        persona.setEducacion("Superior");*/
        lstPersona.add(persona);
        mapPersona.put((long) 555471354, persona);
        //---------------------------------
        Persona persona2 = new Persona((long) 20542004, "Walther Joao", 29, "Masculino", "Guangala", "Superior");
        persona2.setNombre("Debora");
        persona2.setCedula((long) 20542004);
        persona.setSexo("Femenino");
        persona2.setEdad(32);
        persona2.setLugarResidencia("Recreo");
        persona2.setEducacion("Superior");
        lstPersona.add(persona2);
        mapPersona.put((long) 20542004, persona2);
        //lstDeLaLista.add(lstPersona);
        
        System.out.println("Cedula  "+lstPersona.get(1).getCedula()+"\n");
        Persona personaBusq = mapPersona.get((long) 555471354);
        System.out.println("Dame el nombre   "+personaBusq.getNombre());
        for(Persona perso : lstPersona) {
            System.out.println(" <<<foreach>>   Nombre "+perso.getNombre()+"\n");
        }
        
        if(persona.getSexo() != null) {
            persona.setSexo("Masculino");
            sexo = persona.getSexo();
        } else {
            sexo = "No se ha llenado el objeto";
        }
        System.out.println("Nombre "+persona.getNombre()+ " Nombre persona 2 "+persona2.getNombre());
        
    }

}
