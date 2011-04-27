/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdr.algoritmos;

/**
 *
 * @author Alejandro Perez,
 * @author Sebastian Ramirez
 * Clase con metodos de acceso estaticos publicos para comprobar si un grafo
 * tiene ciclos hamiltonianos
 */
public class CicloHamiltoniano {

    /**
     * Este metodo permite aplicar la condicion suficiente:
     * Mayor de tres vertices, con grado de cada vertice >= n/2
     * @param mAdy
     * @return Verdadero si se cumple la condicion
     */
    private static boolean mAdy[][];
    private static Visitados visitados;

    public static boolean comprobarPorGrado(boolean mAdy[][]) {
        int gradoVertice, minGrado = mAdy.length / 2;
        if (mAdy.length < 3) {
            return false;
        }
        for (boolean[] bs : mAdy) {
            gradoVertice = 0;
            for (boolean b : bs) {
                if (b) {
                    gradoVertice++;
                }
            }
            if (gradoVertice < minGrado) {
                return false;
            }
        }

        return true;
    }

    /**
     * Comprueba si el grafo es conexo o no
     * @param mAdy
     * @return verdadero si el grafo es conexo
     */
    public static boolean comprobarConexidad(boolean mAdy[][]) {
        int gradoVertice, minGrado = mAdy.length / 2;
        for (boolean[] bs : mAdy) {
            gradoVertice = 0;
            for (boolean b : bs) {
                if (b) {
                    gradoVertice++;
                }
            }
            if (gradoVertice < 1) {
                return false;
            }
        }

        return true;
    }

    /**
     * Comprueba si un grafo es hamiltonino o no,
     * invoca al metodo esHamiltoniano
     * @param verticeInicio Vertice desde el cul se quiere arrancar
     * @param mAdy Matriz que representa la matriz de adyacencia del grafo
     * @return Verdadero si existe un ciclo hamiltoniano
     */
    static public boolean comprobarHamiltonicidad(int verticeInicio, boolean mAdy[][]) {
        CicloHamiltoniano.mAdy = mAdy;
        visitados = new Visitados(mAdy.length);
        boolean esH = false;
        for (int i = 0; i < mAdy.length; i++) {
            visitados = new Visitados(mAdy.length);
            //boolean[] bs = mAdy[i];
            esH = esHamiltoniano(mAdy[i], i, 1);
            if (esH) {
                return true;
            }

        }

        return esH;
    }

    /**
     * Este metodo permite verificar si un grafo tiene o no un ciclo
     * de hamilton
     * @param mAdy Matriz booleana que representa el grafo en forma de
     * matriz de adyacencia
     * @param conteoVertices Indica en que numero va el conteo de vertices
     * @return Verdadero si el grafo tiene un ciclo de hamilton
     */
    static public boolean esHamiltoniano(boolean vertice[], int vertActual, int conteoVertices) {
        int proxVertice;
        visitados.addVertice(vertActual);
        if (hayCiclo(vertActual)) {
            return true;
        }

        proxVertice = escogerVertice(vertActual, vertice);
        System.out.println("Vertice escogido" + proxVertice);
        while (proxVertice != -1) {
          //  visitados.addVertice(proxVertice);
            vertice[proxVertice] = false;
            esHamiltoniano(mAdy[proxVertice], proxVertice, conteoVertices++);
            System.out.println("conteo vertices = " + conteoVertices);
            visitados.eraseVertice(proxVertice);
            proxVertice = escogerVertice(vertActual, vertice);
        }
        return false;
    }

    static public boolean esHamiltonianoXXX(boolean mAdy[][]) {
        for (int i = 0; i < mAdy.length; i++) {
            boolean[] bs = mAdy[i];
            if (hayCiclo(1)) {
                return true;
            }
        }


        return false;
    }

    static private boolean hayCiclo(int verActual) {
        return visitados.isCicloCompleto(verActual);
    }

    private static int escogerVertice(int verticeActual, boolean[] ady) {
        for (int i = 0; i < ady.length; i++) {
            if (ady[i]) {
                if (!visitados.isVisitado(i)) {
                    return i;
                }
            }

        }
        return -1;
    }

    private boolean hayVertices(int nroVertices, int conteo) {
        return (nroVertices == conteo);
    }

    static class Visitados {

        private boolean[] visitados;
        private int nroVertices;
        private int[] camino;
        private int count;

        public Visitados(int nroVertices) {
            visitados = new boolean[nroVertices];
            this.nroVertices = nroVertices;
            count = -1;//se coloca en -1 para evitar doble utilizacion de variable
            camino = new int[nroVertices];
        }

        public void addVertice(int vertice) {
            visitados[vertice] = true;
            camino[++count] = vertice;
        }

        public int[] getCamino() {
            return camino;
        }

        public void eraseVertice(int vertice) {
            visitados[vertice] = false;
            count--;//Se borra el vertice del camino
        }

        public boolean isVisitado(int vertice) {
            return visitados[vertice];
        }

        public int getCount() {
            return count;
        }

        /**
         * Indica si el ciclo esta completado(Cuando todos los vertices se incluyen en el arreglo)
         * @return Verdadero si se ha completado el ciclo
         */
        public boolean isCicloCompleto(int verticeInicio) {
            return (count == nroVertices && verticeInicio == camino[0]);
        }
    }

    static public void main(String args[]) {
        /** Visitados v = new Visitados(5);
        v.addVertice(4);
        v.addVertice(3);
        v.addVertice(1);
        for (int i : v.getCamino()) {
        System.out.println(i + "-");
        }
        System.out.println("count =" + v.getCount());*/
        boolean[][] mAdyEjem = {{false, true, false, true, true},
            {true, false, true, true, false},
            {false, true, false, true, true},
            {true, true, true, false, false},
            {true, false, true, false, false}};
        System.out.println("MATRIZ ADY");
        for (boolean[] bs : mAdyEjem) {
            for (boolean b : bs) {
                System.out.print(b ? 1 : 0);
            }
            System.out.println("");
        }
        System.out.println("conexo=" + comprobarConexidad(mAdyEjem));
        System.out.println("Hamiltoniano =" + comprobarHamiltonicidad(0, mAdyEjem));


    }
}
