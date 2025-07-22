package controllers;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {
    

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral){
        Stack<Maquina> resultado = new Stack<>();
        for (Maquina maquina : maquinas) {
            if( maquina.getSubred() < umbral);
                resultado.push(maquina);
        }
        return resultado;
    }

	public TreeSet<Maquina> ordenarPorSubred(Stack<Maquina> pila) {
        TreeSet<Maquina> maquinaRes = new TreeSet<>();
        while(!pila.isEmpty()){
            maquinaRes.add(pila.pop());
        }

        return maquinaRes;
	}

    public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas) {
        return null;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa) {
        return null;
    }


}
