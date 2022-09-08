package Modelo;

import javax.swing.JOptionPane;

public class Switch
{

    public static void main(String[] args) 
    {
        
        // Declaracion de variable
        int n;
        String rta ="";

        // input
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el digito: "));

        //Processing
        switch(n)
        {
            case 0:
                rta="cero";
                break;
            case 1:
                rta="uno";
                break;
            case 2:
                rta="dos";
                break;
            case 3:
                rta="tres";
                break;
            case 4:
                rta="cuatro";
                break;
            case 5:
                rta="cinco";
                break;
            case 6:
                rta="seis";
                break;
            case 7:
                rta="siete";
                break;
            case 8:
                rta="ocho";
                break;
            case 9:
                rta="nueve";
                break;

            default:
                rta="No es un digito.";
                break;

        }

        JOptionPane.showMessageDialog(null,rta);


        System.exit(0);


    }

}