package boletin20_1;

public class Equipos {

    private int[][] datos = {{3, 4, 2}, {1, 2, 1}, {3, 0, 1}, {5, 1, 7}};
    private String[] equipo = {"Celta", "Depor", "Malaga", "Barca"};
    private String[] xornada = {"Equipo/xornada", "X1", "X2", "X3"};

    public void visualizar() {
        int filas = datos.length;
        int columnas = datos[0].length;
        int acu;

        for (int a = 0; a < xornada.length; a++) {
            System.out.print(xornada[a] + "   ");
        }
        System.out.println("");

        for (int i = 0; i < filas; i++) {
            acu = 0;
            System.out.print("    " + equipo[i] + "        ");
            for (int j = 0; j < columnas; j++) {
                acu = acu + datos[i][j];
                System.out.print(datos[i][j] + "    ");
            }
            System.out.println("");
        }
    }

    public int[] menosGoles() {
        int filas = datos.length;
        int columnas = datos[0].length;
        int acu;
        int[] notas = new int[datos.length];
        for (int i = 0; i < filas; i++) {
            acu = 0;
            for (int j = 0; j < columnas; j++) {
                acu = acu + datos[i][j];
            }
            notas[i] = acu / columnas;
        }

        return notas;
    }

    public void maisGolesXornada() {
        int filas = datos[0].length;//invertir matriz(cambiar filar por columnas)
        int columnas = datos.length;//invertir matriz(cambiar filar por columnas)
        int goleador;
        int[] notas = new int[datos.length];
        String equipogoleador = "";
        String xornadas = xornada[0];
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            goleador = 0;
            for (int j = 0; j < columnas; j++) {
                if (goleador < datos[j][i]) {//comprar los goles de cada equipo y ver el nombre del equipo
                    goleador = datos[j][i];
                    equipogoleador = equipo[j];
                    xornadas = xornada[i + 1];
                }
            }
            
            System.out.println(xornadas + " " + equipogoleador + ": " + goleador + " goles");
        }

    }

    public void OrdenarMenosGoles() {
        int[] goles = menosGoles();
        int aux;
        String auxnome;
        int aux2;
        for (int i = 0; i < goles.length - 1; i++) {
            for (int j = i + 1; j < goles.length; j++) {
                if (goles[i] > goles[j]) {
                    aux = goles[i];
                    goles[i] = goles[j];
                    goles[j] = aux;

                    auxnome = equipo[i];
                    equipo[i] = equipo[j];
                    equipo[j] = auxnome;

                    for (int k = 0; k < datos[0].length; k++) {
                        aux2 = datos[i][k];
                        datos[i][k] = datos[j][k];
                        datos[j][k] = aux2;
                    }

                }
            }
        }
    }

    public void EquipoXornadaMaisGolesLiga() {
        int filas = datos[0].length;//invertir matriz(cambiar filar por columnas)
        int columnas = datos.length;//invertir matriz(cambiar filar por columnas)
        int goleador = 0;
        int[] notas = new int[datos.length];
        String equipogoleador = "";
        String xornadas = xornada[0];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (goleador < datos[j][i]) {//comprar los goles de cada equipo y ver el nombre del equipo
                    goleador = datos[j][i];
                    equipogoleador = equipo[j];
                    xornadas = xornada[i + 1];
                }
            }
        }
        System.out.println("");
        System.out.println(xornadas + " " + equipogoleador + ": " + goleador + " goles");
    
    }

    /*
    public void buscarEquipo(String nomeequipo) {
        int filas = datos.length;
        int columnas = datos[0].length;

        System.out.println("");
        for (int a = 0; a < xornada.length; a++) {
            System.out.print(xornada[a] + "   ");
        }
        for (int i = 0; i < filas; i++) {
            if (equipo[i].equalsIgnoreCase(nomeequipo)) {
                System.out.print("    " + equipo[i] + "        ");
            }
            for (int j = 0; j < columnas; j++) {
                if (equipo[i].equalsIgnoreCase(nomeequipo)) {
                    System.out.print(datos[i][j] + "    ");
                }
            }
            System.out.println("");
        }
    }
     */
 /*
    public void buscarXornada(String nomexornada) {
        int filas = datos.length;
        int columnas = datos[0].length;
        int posicion = 0;

        for (int a = 0; a < xornada.length; a++) {
            if (xornada[a].equalsIgnoreCase(nomexornada)) {
                posicion = a;
            }
        }
        System.out.println("");
        System.out.print("        " + xornada[posicion]);
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            System.out.print(equipo[i] + "    ");
            for (int j = 0; j < posicion; j++) {
                if (j == posicion - 1) {
                    System.out.print(datos[i][j] + "    ");
                }
            }
            System.out.println("");

        }
    }
     */

    public void buscarEquipoXornada(String nomeequipo, String nomexornada) {
        int filas = datos.length;
        int columnas = datos[0].length;
        int posicion = 0;

        for (int a = 0; a < xornada.length; a++) {
            if (xornada[a].equalsIgnoreCase(nomexornada)) {
                posicion = a;
            }
        }
        System.out.print("" + xornada[posicion] + " ");
        for (int i = 0; i < filas; i++) {
            if (equipo[i].equalsIgnoreCase(nomeequipo)) {
                System.out.print(equipo[i] + ": ");
            }
            for (int j = 0; j < columnas; j++) {
                if (j == posicion - 1) {
                    if (equipo[i].equalsIgnoreCase(nomeequipo)) {
                        System.out.println(datos[i][j] + " goles");
                    }
                }
            }

        }
    }

}
