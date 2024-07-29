
import javax.swing.JOptionPane;

public class Main {

public static void main(String[] args) {

double valorSemilla=0, valorPagar=0;
int cantSemilla=0;

String menuPrincipal="MENU PRINCIPAL\n\n";
menuPrincipal+="1. TOMATE\n";
menuPrincipal+="2. REPOLLO\n";
menuPrincipal+="3. PAPA\n";
menuPrincipal+="4. CEBOLLA\n";
menuPrincipal+="5. SALIR\n\n";
menuPrincipal+="Ingrese una opción\n";


String menuTomate="MENU TOMATE\n\n";
menuTomate+="1. Chonto\n";
menuTomate+="2. Ensalada\n";
menuTomate+="Ingrese una opción para el tomate\n";

int opc=0;
do {

opc=Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));

if (opc!=5) 
cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));


switch (opc) {
case 1: 
System.out.println("TOMATE");
int opc2=Integer.parseInt(JOptionPane.showInputDialog(menuTomate));

switch (opc2) {
case 1:
System.out.println("Tomate Chonto");
valorSemilla=15;
break;
case 2:
System.out.println("Tomate Ensalada");
valorSemilla=20;
break;
default:System.out.println("No existe ese tipo de tomate");
break;
}

break;
case 2: System.out.println("REPOLLO");
valorSemilla=10;
break;
case 3: System.out.println("PAPA");break;
case 4: System.out.println("CEBOLLA");break;
case 5: JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
break;
default: System.out.println("No existe la opción");
break;
}

if (opc!=5) {
valorPagar=cantSemilla*valorSemilla;
JOptionPane.showMessageDialog(null,"El valor a pagar es: "+valorPagar);
}



} while (opc!=5);



}

}