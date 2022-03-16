import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {
    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop/grades/grades.csv";
        String line = "";
        String[] values = line.split(";");

        List<List<String>> llp = new ArrayList<>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) !=null) {
                llp.add(Arrays.asList(line.split(",")));
                for (var index : values){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
            System.out.println(llp.size());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
