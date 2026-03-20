package practice.ComparablePrc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingClass {
    public static void main(String[] args) {
        //movie movie=new movie("nenukdine", 2014);
        List<movie> movies=new ArrayList<>();
        movies.add(new movie("rangastalam", 2018));
        movies.add(new movie("1 nenokkadine", 2014));

        System.out.println(movies.get(0).toString() +" and "+movies.get(1).toString());

        System.out.println("after sorting :");
        Collections.sort(movies);
        System.out.println(movies.get(0).toString() +" and "+movies.get(1).toString());

        List<movie> UpcomingMovies=new ArrayList<>();
        UpcomingMovies.add(new movie("varanasi", 2027));
        UpcomingMovies.add(new movie("ene2", 2028));
        System.out.println(UpcomingMovies.get(0).toString() +" and "+UpcomingMovies.get(1).toString());

        Collections.sort(UpcomingMovies, new CustomComparatorClass());

        System.out.println("after sorting of upcoming movies");
        System.out.println(UpcomingMovies.get(0).toString() +" and "+UpcomingMovies.get(1).toString());


        // we can use streams



    }
}
