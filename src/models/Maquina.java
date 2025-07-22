package models;

import java.util.List;

public class Maquina implements Comparable<Maquina>{
    private String nombre;
    private String ip;
    private List<Integer>codigos;
    private int subred;
    private int riesgo;


    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        calcularSubred(ip);
        calcularRiesgo(codigos, nombre);
    }


    private int calcularSubred(String ip2){
        if(ip2 == null){
            return subred;
        }
        String[] resultado = ip.split(ip2);

        for (String string : resultado) {
            subred = Integer.parseInt(string);
        }

        return subred;
    }

    private int calcularRiesgo(List<Integer> calculos, String nombre){
        int resultado = 0;
        int contador = 0;
        if(calculos == null){
            return riesgo;
        }

        for(int i=0; i<nombre.length(); i++){
            char c = '\t';
            if(c == nombre.charAt(i)){
                contador++;
            }
        }

        for (Integer calc : calculos) {
            int divisor = calc/2;
            if(calc*2 != divisor){
                resultado = calc;
            }
        }
        return contador + resultado;
    }

    public int getSubread(){
        return  calcularSubred(ip);
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


    @Override
    public String toString() {
        return "Maquina [nombre=" + nombre + ", ip=" + ip + ", codigos=" + codigos + ", subred=" + subred + ", riesgo="
                + riesgo + "]";
    }


    @Override
    public int compareTo(Maquina o) {
        int resultado = o.nombre.compareTo(nombre);
        if(resultado == 0){
            return Integer.compare(o.subred, subred);
        }
        return resultado;
    }

    
    

}
