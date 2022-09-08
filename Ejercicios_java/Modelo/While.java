package Modelo;

import javax.swing.JOptionPane;

public class While 
{
    
    public static void main(String[] args) 
    {
        
        int n;
        int contador;
        int i;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número que quieres sumar: "));
        contador = 0;
        i = 1;

        while( i <= n)
        {
            contador = contador + i;
            i++;
        }

        
        
        JOptionPane.showMessageDialog(null, "la suma de los números ingresados es: " + contador);

        System.exit(0);


    }

}
