package boletin20_1;

import java.util.Scanner;

public class Boletin20_1 {

    public static void main(String[] args) {
        Equipos obx = new Equipos();
        /*obx.visualizar();
        obx.OrdenarMenosGoles();
        obx.visualizar();
        obx.maisGolesXornada();
        obx.EquipoXornadaMaisGolesLiga();
        //obx.buscarEquipo("Celta");
        //obx.buscarXornada("X2");
        obx.buscarEquipoXornada("Barca", "X2");
*/
        int opcion;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Selecciona una opcion: "
                    + "\n0:Salir del menu"
                    + "\n1:Visualizar tabla Liga "
                    + "\n2:Ordenar por menos goles marcados "
                    + "\n3:Mostrar equipo que marca mas goles en cada jornada "
                    + "\n4:Mostrar equipo con mas goles y en que jornada los metio "
                    + "\n5:Buscar goles de un equipo en una determinada jornada");
            System.out.println("");
            opcion = ler.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    obx.visualizar();
                    System.out.println("");
                    break;
                case 2:
                    obx.OrdenarMenosGoles();
                    System.out.println("");
                    break;
                case 3:
                    obx.maisGolesXornada();
                    System.out.println("");
                    break;
                case 4:
                    obx.EquipoXornadaMaisGolesLiga();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Indique o nome do equipo: ");
                    ler.nextLine();
                    String nomeequipo= ler.nextLine();
                    System.out.println("Indique a xornada");                                        
                    String nomexornada=ler.nextLine();
                    System.out.println("");
                    obx.buscarEquipoXornada(nomeequipo, nomexornada);
                    System.out.println("");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);

    }

}
