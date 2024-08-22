package pruebatecnica.vueloscolombia.Utils.Grafo;

import java.util.HashMap;

public class Grafo {

    // La matriz de adyacencia se representa con la letra A
    private boolean[][] A;
    // Mapa para asignar un valor al nombre del destino
    private HashMap<String, Integer> nombreAVertice = new HashMap<>();
    // Mapa para asignar nombre de destino al valor
    private HashMap<Integer, String> verticeANombre = new HashMap<>();

    // La cantidad se determina desde el constructor
    public Grafo(String[] ciudades) {
        int vertices = ciudades.length;
        A = new boolean[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            nombreAVertice.put(ciudades[i], i);
            verticeANombre.put(i, ciudades[i]);
        }

    }

    // Añadir arista dirigida
    public void addArista(String origen, String destino) {
        Integer i = nombreAVertice.get(origen.toUpperCase());
        Integer j = nombreAVertice.get(destino.toUpperCase());
        A[i][j] = true;
    }
    // verificar si existe arista 
    public boolean checkArista(String origen, String destino) throws RuntimeException {
        Integer i = nombreAVertice.get(origen.toUpperCase());
        Integer j = nombreAVertice.get(destino.toUpperCase());
        return A[i][j];
    }
    

   
}
