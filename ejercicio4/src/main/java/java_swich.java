
import javax.swing.JOptionPane;

public class java_swich {
 public static void main(String[] args) {
     
   String dias=JOptionPane.showInputDialog("un dia de la semana");
   
   switch(dias.toLowerCase()){
       case "lunes":System.out.println("inicio del dia"); 
    break;
    
        case "martes":System.out.println("pelicula"); 
    break;
    
        case "miercoles":System.out.println("fiesta"); 
    break;
    
        case "jueves":System.out.println("clase"); 
    break;
    
        case "viernes":System.out.println("clase"); 
    break;
    
        case "sabado":System.out.println("festivo"); 
    break;
    
        case "domingo":System.out.println("festivo"); 
    break;
    
    default: System.out.println("no exixte este dia");
    break;
   }
}
    
}
