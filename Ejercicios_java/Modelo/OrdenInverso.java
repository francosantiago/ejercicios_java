package Modelo;

import javax.swing.JOptionPane;

public class OrdenInverso
{
    public static void main(String[] args) 
    {
       int a;
       int b;
       int c;
       int d;
       int e;

       a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer digito: "));
       b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo digito: "));
       c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer digito: "));
       d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto digito: "));
       e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el quinto digito: "));


       JOptionPane.showMessageDialog(null, "El número digitado de manera inversa es " + e + d + c + b + a);


       System.exit(0);

    

        

    }
}