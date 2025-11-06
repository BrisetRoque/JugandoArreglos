/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brise
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }


    private OperacionesArreglos opa;
    
    @BeforeEach
    public void setUp() {
        opa=new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
        float[] entrada={10f, 15f, 10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada, salidaReal);
    }
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada, salidaReal);
    }
    @Test
        public void prueba1Promedio(){
        float[] entrada={15f,20f,25f};
        float salidaEsperada=20f;
        
        float salidaReal=opa.calcularPromedio(entrada);
        
        assertEquals(salidaEsperada, salidaReal);
    }
        @Test
            public void prueba2Promedio(){
         float[] entrada={0f,0f,0f};
        float salidaEsperada=0f;
        //float[] entrada= null;
        //float salidaEsperada=0f;
        
        float salidaReal=opa.calcularPromedio(entrada);
        
        assertEquals(salidaEsperada, salidaReal);
    }
         @Test
    public void prueba1ContarMayoresQue(){
        double[] entrada={10, 20, 30, 40};
        double limite=25;
        int salidaEsperada=2;
        
        int salidaReal=OperacionesArreglos.contarMayoresQue(entrada, limite);
        
        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    public void prueba2ContarMayoresQue(){
        double[] entrada={1,2,3,4,5};
        double limite=10;
        int salidaEsperada=0;
        
        int salidaReal=OperacionesArreglos.contarMayoresQue(entrada, limite);
        
        assertEquals(salidaEsperada, salidaReal);
    }

    // --- Pruebas de invertir ---
    @Test
    public void prueba1Invertir(){
        double[] entrada={1,2,3,4};
        double[] salidaEsperada={4,3,2,1};
        
        double[] salidaReal=OperacionesArreglos.invertir(entrada);
        
        assertArrayEquals(salidaEsperada, salidaReal, 0.001);
    }

    @Test
    public void prueba2InvertirUnElemento(){
        double[] entrada={5};
        double[] salidaEsperada={5};
        
        double[] salidaReal=OperacionesArreglos.invertir(entrada);
        
        assertArrayEquals(salidaEsperada, salidaReal, 0.001);
    }

    // --- Pruebas de valoresAbsolutos ---
    @Test
    public void prueba1ValoresAbsolutos(){
        double[] entrada={-1, 2, -3, 4};
        double[] salidaEsperada={1, 2, 3, 4};
        
        double[] salidaReal=OperacionesArreglos.valoresAbsolutos(entrada);
        
        assertArrayEquals(salidaEsperada, salidaReal, 0.001);
    }

    @Test
    public void prueba2ValoresAbsolutosCeros(){
        double[] entrada={0, -0, 0};
        double[] salidaEsperada={0, 0, 0};
        
        double[] salidaReal=OperacionesArreglos.valoresAbsolutos(entrada);
        
        assertArrayEquals(salidaEsperada, salidaReal, 0.001);
    }
}

