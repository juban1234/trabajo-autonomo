
import javax.swing.JOptionPane;

public class ejercicio3 {
  public static void main(String[] args) {
   //condiciiones simples
      int x =Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
      if (x==4) {
          System.out.println("el numero es igual a 4");
      }
      
       System.out.println("no ingreso al if");
       
       System.out.println("");
      // condicionales dobles
      if (x<5) {
          System.out.println("el numero es mayor a 5");
      } else {
          System.out.println("el numero es menor a 5");
      }
  }
    
}
