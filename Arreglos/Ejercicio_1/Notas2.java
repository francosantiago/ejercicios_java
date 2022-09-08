package Ejercicio_1;

import javax.swing.JOptionPane;

public class Notas2 
{
    public static void main(String[] args) 
    {
        //declaracion de variables y constantes
        final int TOTAL_EST = 3;
        final int TOTAL_MAT = 4;
        double[][] notas;

        //inicializar array
        notas = new double[TOTAL_EST][TOTAL_MAT];

        //ingresar los elementos del array
        for(int i=0; i<notas.length; i++)
        {
            for(int j=0; j < notas.length; j++)
            {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante " + (i+1) + " en la materia " + (j+1)));
            }
        }

        // nota promedio del curso
        double suma = 0;
        double promedio = 0;
        for(int i=0; i<notas.length; i++)
        {
        
            for(int j=0;j < notas.length; j++)
            {
                suma = suma + notas[i][j];
            }
        }
        promedio = suma / (TOTAL_EST*TOTAL_MAT);

        //salida
        System.out.println("Nota promedio del curso: "+ promedio);


    }

}   

