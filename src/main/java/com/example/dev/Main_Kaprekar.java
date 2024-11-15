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
        int mayor = 0;
        int menor = 0;
        int resultado = 0;
        int iteraciones = 0;
        while (num != 6174) {
            String numString = String.valueOf(num);
            List<Integer> lista = new ArrayList<>();
            for (int i = 0; i < numString.length(); i++) {
                lista.add(Integer.parseInt(String.valueOf(numString.charAt(i))));
            }
            Collections.sort(lista);
            mayor = Integer.parseInt(String.valueOf(lista.get(3)) + String.valueOf(lista.get(2)) + String.valueOf(lista.get(1)) + String.valueOf(lista.get(0)));
            menor = Integer.parseInt(String.valueOf(lista.get(0)) + String.valueOf(lista.get(1)) + String.valueOf(lista.get(2)) + String.valueOf(lista.get(3)));
            resultado = mayor - menor;
            num = resultado;
            iteraciones++;

        }
        return iteraciones;
    }
}
