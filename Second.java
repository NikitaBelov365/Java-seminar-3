import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;



public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rnd = (int) (Math.random()*10);
            array.add(rnd);
            
        }
        array.sort(null);
        System.out.println(array.toString());
    }
}
