import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Gymnastics {

    public static void main(String[] args) throws IOException {

        //1. Read scores from file
        List<Double> scores = new MyList<>();

        Scanner s = new Scanner(new File("data/file.txt"));

        //2. Put them into list
        while (s.hasNextDouble()){
            scores.add(s.nextDouble());
        }


        //3. Go through list remove extrema
        double max = scores.get(0);
        double min = scores.get(0);

        for (int i = 0; i < scores.size(); i++){
            if(scores.get(i) > max){
                max = scores.get(i);
            }
            if(scores.get(i) < max){
                min = scores.get(i);
            }
        }

        //System.out.println(min);
        //System.out.println(max);

        boolean maxr = false;
        boolean minr = false;

        for (int j = 0; j < scores.size(); j++){
            if(maxr && minr){
                break;
            }
            if (!maxr && scores.get(j) == max){
                scores.remove(j);
                maxr = true;
                j--;
            }
            if (!minr && scores.get(j) == min){
                scores.remove(j);
                minr = true;
                j--;
            }
        }

        //4. Calculate average print
        double sum = 0;

        for (int i = 0; i < scores.size(); i++){
            sum += scores.get(i);
        }

        //System.out.println(sum);
        System.out.println(sum / scores.size());



    }



}
