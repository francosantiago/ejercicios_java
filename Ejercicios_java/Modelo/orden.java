package Modelo;


import javax.swing.JOptionPane;;

public class orden 
{
    public static void main(String[] args) 
    {
        int x;
        int y;
        int z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número: "));

        if (x > y & x > z)
        {
            if (y > z)
            {
                JOptionPane.showMessageDialog(null, "El orden de los numeros es " + z + ", " + y + ", " + x);
            }

            else
            {
                JOptionPane.showMessageDialog(null, "El orden de los numeros es " + y + ", " + z + ", " + x);
            }
        }

        if (y > x & y > z)
        {
            if (x > z)
            {
                JOptionPane.showMessageDialog(null, "El orden de los numeros es " + z + ", " + x + ", " + y);
            }

            else
            {
                JOptionPane.showMessageDialog(null, "El orden de los numeros es " + x + ", " + z + ", " + y);
            }
        }

        if (z > x & z > y)
        {
            if (x > y)
            {
                JOptionPane.showMessageDialog(null, "El orden de los numeros es " + y + ", " + x + ", " + z);
            }

            else
            {
                JOptionPane.showMessageDialog(null, "El orden de los numeros es " + x + ", " + y + ", " + z);
            }
        }

    }
}
