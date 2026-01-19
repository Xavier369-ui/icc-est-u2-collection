package Structures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicios {

    public Map contarDuplicados(List<Integer> lista) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (Integer numero : lista) {
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1);
            } else {
                mapa.put(numero, 1);
            }
        }

        return mapa;
    }
    
}
