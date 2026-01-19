package Structures.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ejercicios {

    public Map<Integer, Integer> contarDuplicados(List<Integer> lista) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for(Integer num : lista){
            conteo.put(num,conteo.getOrDefault(num, 0) + 1);
            /* 
            if(conteo.containsKey(num)){
                int current = conteo.get(num);
                conteo.put(num, current + 1);

            }else{
                conteo.put(num, 1);
            }
            */
        }
        return conteo;
    }

    public int noRepetir(List<Integer> lista){
        //Dada una secuencia de enteros, determine el primer número que no se repite, respetando el orden de aparición.
        // Restricción
        // Resolver usando Map<Integer, Integer>
        //
        // No ordenar la lista
        //
        // Complejidad O(N)
        Map<Integer, Integer> conteo = new HashMap<>();
        for(Integer num : lista){
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        for(Integer num : lista){
            if(conteo.get(num) == 1){
                return num;
            }
        }
        return -1;
        
        
        
        
    }
     
    
    
        
        public Map<String, Integer> ranking(List<String[]> entradas) {
        // Se recibe una lista de jugadores con su puntaje.
        // Si un jugador aparece más de una vez, se conserva el mayor puntaje.
        // Imprimir el ranking ordenado por puntaje descendente.
        // Restricción
        // No usar listas auxiliares para ordenar
        //
        // Usar Map y lógica de comparación
        //
        // Mantener solo el mayor puntaje por jugador
        // esta en al app
        Map<String, Integer> mapa = new HashMap<>();
        for (String[] entrada : entradas) {
            String nombre = entrada[0];
            int puntaje = Integer.parseInt(entrada[1]);
            
            mapa.put(nombre, Math.max(mapa.getOrDefault(nombre, 0), puntaje));
        }

        
        return mapa.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);
        
        
    }

    public Map<String, Integer> maxPorGrupo(Map<String, Integer> datos) {
        Map<String, Integer> maximos = new HashMap<>();
        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            String carrera = entry.getKey().split("-")[0];
            int nota = entry.getValue();
            maximos.put(carrera, Math.max(maximos.getOrDefault(carrera, 0), nota));
        }
        return maximos;
    }

}