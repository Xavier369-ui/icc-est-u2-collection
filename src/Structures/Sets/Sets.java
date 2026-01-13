package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

public class Sets {

    public Sets(){

    }

    public Set<String> construirHashSet(){
        Set<String>  hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");

        return hashSet; 

    }

    public Set<String> construirLinkedHahSet(){
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("A");
        linkedSet.add("B");
        linkedSet.add("C");
        linkedSet.add("A");
        linkedSet.add("D");

        return linkedSet; 


    }

    public Set<String> construirTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;


    }

    public Set<String> construirTreeSetConComparador(){
        Set<String> treeSet = new TreeSet<>(
            (pal1,pal2) -> pal1.compareToIgnoreCase(pal2));
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;

    }
    public Set<Person> personTreeSet(){
        
        Set<Person> treeSetPerson = new TreeSet<>();
        /* 
        (p1, p2) -> {
            int cmp = p1.getName().compareToIgnoreCase(p2.getName());
            if (cmp == 0) {
                return Integer.compare(p2.getAge(), p1.getAge());
            }
            return cmp;
            }
        );
        */

        treeSetPerson.add(new Person("Carlos", 27));
        treeSetPerson.add(new Person("Ana", 30));
        treeSetPerson.add(new Person("Luis", 18));
        treeSetPerson.add(new Person("Ana", 20));
        treeSetPerson.add(new Person("Andres", 23));
        treeSetPerson.add(new Person("Luis", 18));
        return treeSetPerson;
    
        /* 
        Set<Person> treeSetPerson = new TreeSet<>(
            (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())
        );
        */     
        
    }
    
}
