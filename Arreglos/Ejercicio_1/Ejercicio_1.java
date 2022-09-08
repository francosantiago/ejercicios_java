package Ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1
{

    public static void main(String[] args) 
    {
        //declaracion de variables y constantes
        final int TOTAL_EST = 12;
        
        double[] notas;

        //inicializar array
        notas = new double[TOTAL_EST];

        //ingresar los elementos del array
        for(int i=0; i<notas.length; i++)
        {

            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante: " + (i+1)));

        }

        //calcular promedio de notas del curso
        double suma = 0;
        double promedio = 0;
        for(int i=0; i<notas.length; i++)
        {
            suma = suma + notas[i];
        }
        promedio = suma / TOTAL_EST;

        //Numero de estudiantes por encima del promedio
        int canEstudiantesEncimaPromedio = 0;
        for(int i=0; i< notas.length; i++)
        {
            if(notas[i] >promedio)
            {
                canEstudiantesEncimaPromedio++;
            }
        }

        //salida
        String salida = "notas = [";
        for(int i=0; i<notas.length; i++)
        {

            if(i !=(TOTAL_EST))
            {
                salida = salida + notas[i] + " , ";
            }
            else
            {
                salida = salida + notas[1];
            }
            

        }
        salida = salida + "[";
        salida = salida + "\nNota promedio del curso = " + promedio;
        salida = salida + "\nEstudiantes por encima del promedio = " + canEstudiantesEncimaPromedio;
        System.out.println(salida);

    }
}



