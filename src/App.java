import java.util.Set;

import Structures.Sets.Sets;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Xavier Fajardo");
        Sets setsClase = new Sets();
        Set<String> hashSet = setsClase.construirHashSet();
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("A"));
        String a1 = "A";
        String a2 = "A";

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

        Node<String> n1 = new Node<>("A");
        Node<String> n2 = new Node<>("B");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        System.out.println();

        Set<String> linkhashSet = setsClase.construirLinkedHahSet();
        System.out.println(linkhashSet);

        System.out.println();

        Set<String> treSet = setsClase.construirTreeSet();
        System.out.println(treSet);


        
        
    }
}
