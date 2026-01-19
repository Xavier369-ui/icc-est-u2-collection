package Structures.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class Maps {
 
    // mapas o diccionarios
    public Map<String, Integer> construirHashMap(){
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("A", 2);
        hasMap.put("B", 3);
        hasMap.put("A", 5);
        hasMap.put("C", 50);
        hasMap.put("D", 5);
        hasMap.put("F", 3);
        hasMap.put("G", 8);
        hasMap.put("H", 85);
        hasMap.put("I", 5);
        hasMap.size();
        for(int i = 0; i < hasMap.size(); i++){
            System.out.println(hasMap.values().toArray()[i]);
        }
        for(String key : hasMap.keySet()){
            System.out.println("Llave: " + key + " - Valor: " + hasMap.get(key));
        }
        
        
        return hasMap;
        
    }
    public Map<String, Integer> construirlinkedHashMap(){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("A", 5);
        linkedHashMap.put("C", 50);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("F", 3);
        linkedHashMap.put("G", 8);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());
        
         for(String key : linkedHashMap.keySet()){
            System.out.println("Llave: " + key + " - Valor: " + linkedHashMap.get(key));
        }

        
        return linkedHashMap;

    }

    public Map<String, Integer> construirTreeMap(){
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 2);
        treeMap.put("B", 3);
        treeMap.put("A", 5);
        treeMap.put("C", 50);
        treeMap.put("D", 5);
        treeMap.put("F", 3);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("I", 5);
        System.out.println(treeMap.size());
        System.out.println(treeMap.values());
        System.out.println(treeMap.keySet());
        
         for(String key : treeMap.keySet()){
            System.out.println("Llave: " + key + " - Valor: " + treeMap.get(key));
        }

        return treeMap;
    }
    public Map<Person, Integer> personTreeMap(){
        Map<Person, Integer> personTreeMap = new TreeMap<>();
        personTreeMap.put(new Person("Carlos", 23), 1000);
        personTreeMap.put(new Person("Ana", 30), 2000);
        personTreeMap.put(new Person("Luis", 18), 3000);    
        personTreeMap.put(new Person("Ana", 20), 4000);
        personTreeMap.put(new Person("Andres", 23), 5000);
        personTreeMap.put(new Person("Luis", 18), 5000);

        for(Person key : personTreeMap.keySet()){
            System.out.println("Llave: " + key + " - Valor: " + personTreeMap.get(key));
        }

        return personTreeMap;
    }
    public void printFiler(Map<Person, Integer> personIntegerMap){
        // imprimir todas las personas con valor sea > 2000
        //y la edad sea >= 20
        for(Person key : personIntegerMap.keySet()){
            if(personIntegerMap.get(key) > 2000 && key.getAge() >= 20){
                System.out.println("Llave: " + key + " - Valor: " + personIntegerMap.get(key));
            }
        }

        
    }

    public Map<Integer, Person> construirTreeHashMap(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Carlos", 23, 123));
        list.add(new Person("Ana", 30, 124));
        list.add(new Person("Luis", 18, 125));
        list.add(new Person("Ana", 20, 123));
        list.add(new Person("Andres", 23, 129));
        list.add(new Person("Luis", 18, 124));

        // ordene por la edad y nombre y
        // no permita duplicados (cedula unica)
        // mapa tipo cedula, persona

        

        Map<Integer, Person> personas = new TreeMap<>();
        // for al listado para ingresa al mapa
        // personsas.put(cedula, person);
        for(Person p : list){
            personas.put(p.getCedula(), p);
        }
        
        
        /* 
        personas.put(11, new Person("Carlos", 23, 123456789));
        personas.put(9, new Person("Ana", 30, 123456789));
        personas.put(70, new Person("Luis", 18, 123456789));
        personas.put(8, new Person("Ana", 20, 123456789));
        personas.put(7, new Person("Andres", 23, 123456789));
        personas.put(10, new Person("Luis", 18, 123456789));
        */
        return personas;

    }
}