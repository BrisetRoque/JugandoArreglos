/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author brise
 */
public class OperacionesArreglos {

   
    public float calcularSuma(float[] num) {
        if(num==null)
            return 0f;
        
        float suma = 0f;
        for (float n : num) {
            suma += n;
        }
        return suma;
    }

    public float calcularPromedio(float[] num) {
        if(num==null)
            return 0f;
        if (num.length == 0) {
            return 0;
        }
        float suma = calcularSuma(num);
        return suma / num.length;
    }

    
    public static int contarMayoresQue(double[] num, double limite) {
        int contador = 0;
        for (double n : num) {
            if (n > limite) {
                contador++;
            }
        }
        return contador;
    }

    
    public static double[] invertir(double[] num) {
        double[] invertido = new double[num.length];
        for (int i = 0; i < num.length; i++) {
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }

    
    public static double[] valoresAbsolutos(double[] num) {
        double[] absolutos = new double[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    }

   
    public static void imprimirArreglo(double[] arreglo) {
        for (double n : arreglo) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
