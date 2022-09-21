package juegodelavida;

public class Poblacion {

    private Array2d<Boolean> casillas = new Array2d<>(10, new Array(10));
    private int filasinicio;
    private int columnasinicio;

    public Poblacion() {

        casillas.clear(Boolean.FALSE);
    }

    public boolean getCasillas(int filas, int columnas) {
        return casillas.get_item(filas, columnas);
    }

    public void setValor(int filas, int columnas, boolean valor) {

        casillas.set_item(filas, columnas, valor);

    }

    public boolean validacion(int filas, int columnas) {

        return !(filas < 0 || filas >= 9 || columnas < 0 || columnas >= 9);
    }

    public int vecinosvivos(int filas, int columnas) {

        int vecinasVivas = 0;
       // System.out.println(casillas.get_item(filas, columnas));

        if (validacion(filas - 1, columnas - 1) && casillas.get_item(filas - 1, columnas - 1)) {
            vecinasVivas++;
        }

        if (validacion(filas - 1, columnas) && casillas.get_item(filas - 1, columnas)) {
            vecinasVivas++;
        }
        if (validacion(filas - 1, columnas + 1) && casillas.get_item(filas - 1, columnas + 1)) {
            vecinasVivas++;
        }
        if (validacion(filas, columnas - 1) && casillas.get_item(filas, columnas - 1)) {
            vecinasVivas++;
        }
        if (validacion(filas, columnas + 1) && casillas.get_item(filas, columnas + 1)) {
            vecinasVivas++;
        }
        if (validacion(filas + 1, columnas - 1) && casillas.get_item(filas + 1, columnas - 1)) {
            vecinasVivas++;
        }
        if (validacion(filas + 1, columnas) && casillas.get_item(filas + 1, columnas)) {
            vecinasVivas++;
        }
        if (validacion(filas + 1, columnas + 1) && casillas.get_item(filas + 1, columnas + 1)) {
            vecinasVivas++;
        }
       // System.out.println("vecinos vivos de " + filas + "," + columnas + "=" + vecinasVivas);
        return vecinasVivas;
    }

    public void nuevoValor(int filas, int columnas) {

        if (casillas.get_item(filas, columnas)) {
            if (vecinosvivos(filas, columnas) != 2 && vecinosvivos(filas, columnas) != 3) {
                casillas.set_item(filas, columnas, Boolean.FALSE);
            }
        } else {
            if (vecinosvivos(filas, columnas) == 3) {
                casillas.set_item(filas, columnas, Boolean.FALSE);
            }
        }

    }

    public void imprimir() {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (casillas.get_item(i, j)) {
                    System.out.print("\033[32m[O]");
                } else {
                    System.out.print("\033[31m[X]");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    /*   public void siguienteGeneracion() {
        boolean temp[][] = new boolean[10][10];
        temp = casillas;

        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                System.out.println("vecinos de " + filas + "," + columnas + "=" + vecinosvivos(filas, columnas));
                if (casillas[filas][columnas]) {
                    if (vecinosvivos(filas, columnas) != 2 && vecinosvivos(filas, columnas) != 3) {
                        temp[filas][columnas] = false;

                    } else {
                    }
                } else {
                    if (vecinosvivos(filas, columnas) == 3) {
                        temp[filas][columnas] = true;
                    }
                }
            }

        }
        ////////

        casillas = temp;

    }*/
    public void siguienteGeneracion() {
        Array2d<Boolean> temp;
        temp = casillas;
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {

                if (casillas.get_item(filas, columnas)) {
                    if (vecinosvivos(filas, columnas) != 2 && vecinosvivos(filas, columnas) != 3) {
                        temp.set_item(filas, columnas, Boolean.FALSE);
                    }
                } else {
                    if (vecinosvivos(filas, columnas) == 3) {
                        temp.set_item(filas, columnas, Boolean.FALSE);
                    }
                }

            }
            //imprimir();
            casillas = temp;
            // imprimir();
        }
    }

}
