/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author brise
 */
public class JugandoArreglos {

    public static void main(String[] args) {

        OperacionesArreglos op = new OperacionesArreglos();
        
        float[] pesos = {12f, 45f, 3.5f};

        float sum = op.calcularSuma(pesos);
        System.out.println("La suma es " + sum);

        float prom = op.calcularPromedio(pesos);
        System.out.println("El promedio es " + prom);

       
        double[] pesosDouble = new double[pesos.length];
        for (int i = 0; i < pesos.length; i++) {
            pesosDouble[i] = pesos[i];
        }

        double limite = 10.0;
        int mayores = OperacionesArreglos.contarMayoresQue(pesosDouble, limite);
        System.out.println("Elementos mayores que " + limite + ": " + mayores);

       
        System.out.print("Arreglo invertido: ");
        double[] invertido = OperacionesArreglos.invertir(pesosDouble);
        OperacionesArreglos.imprimirArreglo(invertido);

       
        System.out.print("Valores absolutos: ");
        double[] absolutos = OperacionesArreglos.valoresAbsolutos(pesosDouble);
        OperacionesArreglos.imprimirArreglo(absolutos);
    }
}
