package practice_12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String [] scrum1 = {"Hussein", "Ali","Hadi"};
        String [] scrum2 ={"Moh","Alex"};
        String [] scrum3 ={"Ann", "Welad", "Quasar"};

        String [][] scrumTeams = {{"Hussein", "Ali","Hadi"},{"Moh","Alex"}, {"Ann", "Welad", "Quasar"} };

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrum2[1]);

        System.out.println(scrumTeams[0][1]);




}
    }
