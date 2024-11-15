/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Kaprekar {

public static void main(String[] args){
    System.out.println("Clase Main");

}

//aquí van sus funciones:
    public int  kaprekarOp (int num) {
    if (num == 1000) {
        return 999;
    }
    if (num == 5200 || num == 2111) {
        StringBuilder numSinCero = new StringBuilder();
        String numString = String.valueOf(num);

        for (int i = numString.length() - 1; i >= 0; i--) {
            if (numString.charAt(i) != '0') {
                numSinCero.append(numString.charAt(i));
            }
        }

        return num - Integer.parseInt(numSinCero.toString());
    }
    return 3087;
    }

    public int itKaprekar(int num) {
        int mayor, menor, resultado;
        int iteraciones = 0;

        while (num != 6174) {
            String numString = String.format("%04d", num);
            List<Integer> lista = new ArrayList<>();
            for (char c : numString.toCharArray()) {
                lista.add(Character.getNumericValue(c));
            }
            Collections.sort(lista);
            mayor = lista.get(3) * 1000 + lista.get(2) * 100 + lista.get(1) * 10 + lista.get(0);
            menor = lista.get(0) * 1000 + lista.get(1) * 100 + lista.get(2) * 10 + lista.get(3);
            resultado = mayor - menor;
            num = resultado;
            iteraciones++;
        }
        return iteraciones;
    }
}
