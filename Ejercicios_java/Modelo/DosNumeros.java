package Modelo;

import javax.swing.JOptionPane;

public class DosNumeros 
{
    public static void main(String[] args) 
    {
        int x;
        int y;


        x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x: "));
        y= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y: "));

        if (x > y)
            
            JOptionPane.showMessageDialog(null, "El número mayor es: " + x);

        else

            JOptionPane.showMessageDialog(null, "El número mayor es: " + y);

        System.exit(0);



    }
    
}
