
import javax.swing.JOptionPane;

public class Main {

public static void main(String[] args) {

double valorSemilla=0, valorPagar=0;
int cantSemilla=0;

//menu principal

String menuPrincipal="MENU PRINCIPAL\n\n";
menuPrincipal+="1. TOMATE\n";
menuPrincipal+="2. REPOLLO\n";
menuPrincipal+="3. PAPA\n";
menuPrincipal+="4. CEBOLLA\n";
menuPrincipal+="5. SALIR\n\n";
menuPrincipal+="Ingrese una opción\n";

//submenus

String menuTomate="MENU TOMATE\n\n";
menuTomate+="1. Chonto\n";
menuTomate+="2. Ensalada\n\n";
menuTomate+="Ingrese una opción para el tomate\n";

String menuPapa="MENU PAPA\n\n";
menuPapa+="1. CRIOLLA\n";
menuPapa+="2. PAST USA\n";
menuPapa+="3. SALENTINO\n\n";
menuPapa+="Ingrese una opción para la papa\n";

String menuCebolla="MENU cebolla\n\n";
menuCebolla+="1. CEBOLLA LARGA\n";
menuCebolla+="2. CEBOLLA DE HUEVO\n\n";
menuCebolla+="Ingrese una opción para la cebolla\n";


// BUCLE dela orden de menu principal

int opc=0;
do {

opc=Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));

if (opc!=5) 
cantSemilla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas requeridas"));


switch (opc) {
    
// ciclo para la parte del tomate

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

// ciclo repollo

case 2: System.out.println("REPOLLO");
valorSemilla=10;
break;

// ciclo papa

case 3: 
    System.out.println("PAPA");


   int opc3 = Integer.parseInt(JOptionPane.showInputDialog(menuPapa));

     switch (opc3) {
    case 1:
    System.out.println("papa criolla");
    valorSemilla=8;
    break;
    case 2:
    System.out.println("Tomate Ensalada");
    valorSemilla=9;
    break;
    case 3:
    System.out.println("Tomate Chonto");
    valorSemilla=11;
    break;
    default:System.out.println("No existe ese tipo de papa");
    break;
    }
 break;
//ciclo cebolla


case 4: System.out.println("CEBOLLA");
   int opc4 = Integer.parseInt(JOptionPane.showInputDialog(menuCebolla));

     switch (opc4) {
    case 1:
    System.out.println("cebolla larga");
    valorSemilla=8;
    break;
    case 2:
    System.out.println("cebolla de huevo");
    valorSemilla=9;
    break;
    default:System.out.println("No existe ese tipo de cebolla");
    break;
    }
break;

//finalizacion del pedido

case 5: JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
break;

// respuesta por defecto

default: System.out.println("No existe la opción");
break;
}


// valor de las semillas

if (opc!=5) {
valorPagar=cantSemilla*valorSemilla;
JOptionPane.showMessageDialog(null,"El valor a pagar es: "+valorPagar);
}

} while (opc!=5);



}

}