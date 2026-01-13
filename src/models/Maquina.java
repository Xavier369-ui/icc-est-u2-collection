package models;

import java.util.List;

public class Maquina implements Comparable<Maquina>{

    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubRed();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
    private int calcularSubRed(){
        String[] octetos = ip.split("\\.");
        String subred = octetos[2];
        return Integer.parseInt(subred);

    }
    private int calcularRiesgo(){
        int riesgoTotal = 0;
        for (Integer codigo : codigos) {
            riesgoTotal += codigo;
        }
        return riesgoTotal;

    }

    @Override
    public int compareTo(Maquina o) {
        int cmp = Integer.compare(this.subred, o.subred);
        if (cmp == 0) {
            return this.nombre.compareTo(o.nombre);
        }
        return cmp;
        

        
    }

    


    
    
}
