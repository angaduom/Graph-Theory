import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 * Created by Angad on 2016-03-24.
 */
public class DmpAgorithm {

    public void printMatrix(int [][]adj, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("  "+adj[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public int [][] readFile(String path){

        int adj[][]=null;
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
             int adjSize = Integer.parseInt(br.readLine());
            adj= new int[adjSize+1][adjSize+1];
            String line;
            int i=1;
            while ((line = br.readLine()) != null) {
                System.out.println("line text :"+line);
                StringTokenizer st = new StringTokenizer(line," ");
                while(st.hasMoreTokens()){
                    int j =Integer.parseInt(st.nextToken());
                    if(j>0) {
                        adj[i][j] = 1;
                        adj[j][i] = 1;
                    }
                }
                i++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    return adj;
    }

    public static void main(String args[]){
        System.out.println("Starting reading the file");
        DmpAgorithm object = new DmpAgorithm();
        int [][] adjacencyMatrix = object.readFile("C:\\Users\\Angad\\software\\Work\\Projects\\Graph-Theory\\graph.txt");
        object.printMatrix(adjacencyMatrix,adjacencyMatrix[0].length);
    }
}
