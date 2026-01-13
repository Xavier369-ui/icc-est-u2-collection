package Controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {

    // metodo que ordene lsitado de maquina 
    // por su subred y leugo nombre
    // si ambos son iguales se consideren maquinas
    // y se descartan
    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas){
        Set<Maquina> maquinasTree = new TreeSet<>();
        for (Maquina maquina : maquinas) {
            maquinasTree.add(maquina);
        }

        return maquinasTree;

    }
    
}
