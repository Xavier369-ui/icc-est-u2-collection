package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public void construirTreeSetConComparador(){

    }
    
}
