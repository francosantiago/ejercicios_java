package Modelo;

import javax.swing.JOptionPane;

public class Determinar3_5
{
    public static void main(String[] args)
    {
        int resto;
        int resto2;
        int x;
        int y;
        int z;

        x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
        y= 3;
        z= 5;
        resto = x % y;
        resto2 = x % z;

        if (resto==0 & resto2==0 )
            JOptionPane.showMessageDialog(null, "El número ingresado si es divisible entre 3 y 5");

        else

            JOptionPane.showMessageDialog(null, "El número no es divisible entre 3 y 5");


        System.exit(0);

    }



}

