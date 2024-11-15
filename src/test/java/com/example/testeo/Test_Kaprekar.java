package com.example.testeo;
import com.example.dev.Main_Kaprekar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// revisar : https://plus.maths.org/content/mysterious-number-6174
// basado en la operación de kaprekar se deben codificar 2 funciones:
// 1) la función kaprekarOp realizará el ordenamiento y resta descrita en el algoritmo
// 2) la función itKaprekar usará kaprekarOp y retonará cuantas iteraciones tomó llegar a la constante


public class Test_Kaprekar{

    Main_Kaprekar main;

    @BeforeEach
    public void start(){
         main = new Main_Kaprekar();
    }

    @Test
    public void testKaprekarOperation1() {

    // Prueba con el número 3524 (debe devolver 3087)
    Assertions.assertEquals(3087, main.kaprekarOp(3524));
    }
    @Test
    public void testKaprekarOperation2() {
        // Prueba con el número 1000 (debe devolver 999)
        Assertions.assertEquals(999,  main.kaprekarOp(1000));
    }

    @Test
    public void testKaprekarOperation3() {
        // Prueba con el número 5200 (debe devolver 5175)
        Assertions.assertEquals(5175,  main.kaprekarOp(5200));
    }

       
        @Test
        public void testKaprekarOperation4() {
            // Prueba con el número 2111 (debe devolver 999)
            Assertions.assertEquals(999,  main.kaprekarOp(2111));
        }

        @Test
        public void testIterationsToKaprekarConstant1() {
            // Prueba con el número 3524 (llega a 6174 en 3 iteraciones)
            Assertions.assertEquals(3, main.itKaprekar(3524));
        }

        @Test
        public void testIterationsToKaprekarConstant2() {
            // Prueba con el número 5200 (llega a 6174 en 7 iteraciones)
            Assertions.assertEquals(7, main.itKaprekar(5200));
        }

        @Test
        public void testIterationsToKaprekarConstant3() {
            // Prueba con el número 1000 (llega a 6174 en 5 iteraciones)
            Assertions.assertEquals(5, main.itKaprekar(1000));
        }

}