package practice.ComparablePrc;

public class movie implements Comparable<movie> {
    String name;
    int year ;

    public movie(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public int compareTo(movie Other) {
        return Integer.compare(this.year, Other.year );
    }

    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
