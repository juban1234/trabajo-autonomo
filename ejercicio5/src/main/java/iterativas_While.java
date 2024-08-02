
import javax.swing.JOptionPane;

public class iterativas_While {
 public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
       
       while (numero <= 10) {
           System.out.println(numero);
           numero++;
         
    }
  }
}
