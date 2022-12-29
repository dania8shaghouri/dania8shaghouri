
import java.io.*;

class Graf {
    public int[][] adjacencyMatToIncidenceMat(int[][] adj) {
        int vertices = adj.length, edges = 0;

        // count number of edges in the graph
        for (int i = 0; i < adj.length; i++) {
            for (int j = i + 1; j < adj[i].length; j++) {
                if (adj[i][j] > 0)
                    edges++;
            }
        }

        // construct incidence matrix
        int[][] incidenceMat = new int[adj.length][edges];
        for (int i = 0; i < adj.length; i++) {

            for (int j = i + 1; j < adj[i].length; j++) {
                int edgeNumber = adj[i][j];

                if (edgeNumber > 0) {
                    incidenceMat[i][edgeNumber - 1] = 1;
                    incidenceMat[j][edgeNumber - 1] = 1;
                }
            }

        }

        return incidenceMat;
    }

    // driver code
    public static void main(String[] args) {
        Graf gfg = new Graf();
        int[][] adj = {
                { 0, 1, 0, 4 },
                { 1, 0, 2, 0 },
                { 0, 2, 0, 3 },
                { 4, 0, 3, 0 },
        };
        int[][] incidence = gfg.adjacencyMatToIncidenceMat(adj);

        for (int[] row : incidence) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
