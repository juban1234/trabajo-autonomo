
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        /*
        String resp="";
        do {            
            resp=JOptionPane.showInputDialog("ingrase si para continuar");
        } while (resp.toUpperCase().equals("SI"));
        */
        
        /*
        String cad=JOptionPane.showInputDialog("ingrese si:");
        
        if (cad.equals("si")) {
            System.out.println("entra cad "+cad);
        } else {
            System.out.println(" no entra cad "+cad);
        }*/
        
        String menuPrincipal="MENU PRINCIPAL\n\n";
        menuPrincipal+="1. TOMATE\n";
        menuPrincipal+="2. REPOLLO\n";
        menuPrincipal+="3. PAPA\n";
        menuPrincipal+="4. CEBOLLA\n";
        menuPrincipal+="INGRESE EL NUMERO DE MENU QUE QUIERA\n";
        
        int opc=Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
        
        switch(opc){
            case 1:System.out.println("Principal.main()"); break;
            default:
                break;
        }
    }
}
