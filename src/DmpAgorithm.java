import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Angad on 2016-03-24.
 */
public class DmpAgorithm {

    public int [][] readFile(String path){

        int adj[][]=null;
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
             int adjSize = Integer.parseInt(br.readLine());
            adj= new int[adjSize][adjSize];
            String line;
            while ((line = br.readLine()) != null) {
            System.out.println("line text :"+line);
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

    }
}
