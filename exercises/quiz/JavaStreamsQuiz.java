package quiz;

import java.util.*;

public class JavaStreamsQuiz {
    public static void main(String[] args) {

        // Data for first four challenges

        List<Integer> ages = Arrays.asList(25, 42, 37, 19, 28, 50, 34, 23, 45, 18);
        List<String> cities = Arrays.asList("Boston", "Chicago", "Dallas", "Los Angeles", "New York", "San Francisco");
        List<Double> distances = Arrays.asList(5.5, 10.75, 3.2, 12.5, 9.8, 4.0);

        // 1. Print to the console the average of the ages in the list ages above

        // 2. Print the list of ages in descending order to the stdout

        // 3. For the List named cities above print out those cities that have more than
        // one word
        // in their names. Print these in uppercase

        // 4. For the list of distances named distances above, transform it into a
        // single string
        // of all the distances rounded to one decimal place, separated by hyphens and
        // with
        // distances less than 10 prefixed with "Short" and distances 10 or greater
        // prefixed with "Long".
        // The distances should be sorted in ascending order and printed to standard
        // out.

        List<Movie> movies = generateMovies();

        // 5. Print to standard out, in one statement, all movies whose title contains
        // the word "War" and
        // were released after 2000

        // 6. Print to standard out the average duration of all movies, but omitting
        // movies with
        // duration less than 90 minutes

        // 7. Generate a list of all unique directors in alphabetical order concatenated
        // into one
        // string and print to standard out

        // 8. Print to standard out the number that represents the shortest duration of
        // any movie, but
        // excluding movies with 0 minutes

        // 9. Print the latest year a movie was released to standard out

        // 10. Print to standard out the details of the movie with the longest title
        // using toString()
    }

    public static List<Movie> generateMovies() {
        String[] titles = { "Star Wars", "The Godfather", "Pulp Fiction", "The Dark Knight", "Inception",
                "The Lord of the Rings", "Fight Club", "Forrest Gump", "The Matrix", "Interstellar" };
        String[] directors = { "George Lucas", "Francis Ford Coppola", "Quentin Tarantino", "Christopher Nolan",
                "Christopher Nolan",
                "Peter Jackson", "David Fincher", "Robert Zemeckis", "The Wachowskis", "Christopher Nolan" };
        int[] releaseYears = { 1977, 1972, 1994, 2008, 2010, 2001, 1999, 1994, 1999, 2014 };
        int[] durations = { 121, 175, 154, 152, 148, 178, 139, 142, 136, 169 };

        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            movies.add(new Movie(titles[i], directors[i], releaseYears[i], durations[i]));
        }
        return movies;
    }
}

class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private int duration;

    public Movie(String title, String director, int releaseYear, int duration) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                '}';
    }
}
