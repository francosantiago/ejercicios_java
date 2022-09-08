package Modelo;

import javax.swing.JOptionPane;

public class Temperatura 
{
    
    public static void main(String[] args)
    {

        int Temperatura;


        Temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la tempertura: "));

        if(Temperatura <= 10)

            JOptionPane.showMessageDialog(null, "El clima es frio");

        else if(Temperatura <= 20 )

            JOptionPane.showMessageDialog(null, "El clima es nublado");
        else if(Temperatura <= 30)

            JOptionPane.showMessageDialog(null, "El clima es caluroso");
        else if(Temperatura >30)

            JOptionPane.showMessageDialog(null, "El clima es tropical");
    }


}
