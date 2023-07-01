import java.util.ArrayList;
import java.util.Arrays;

public class Fourth {
    public static void main(String[] args) {
        ArrayList<String> planet_List = new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер",
                "Сатурн", "Уран", "Нептун", "Венера", "Земля", "Земля"));
        planet_List.sort(null);
        System.out.println(planet_List.toString());
        int count = 0;
        String planet = planet_List.get(0);

        for (String string : planet_List) {
            if (planet != string) {
                System.out.println(planet + count + "\n");
                count = 1;
                planet = string;
            } else {
                count++;
            }
        }

        ArrayList<String> unic_list = new ArrayList<>();
        planet = "";
        for (String string : planet_List) {
            if (string != planet) {
                unic_list.add(string);
            }
            planet = string;
            
        }
        System.out.println(unic_list.toString());
    }
}
