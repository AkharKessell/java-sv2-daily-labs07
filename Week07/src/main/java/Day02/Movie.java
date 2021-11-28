package Day02;

public class Movie {
    private final String title;
    private final int yearOfRelease;
    private final String director;

    public Movie(String title, int yearOfRelease, String director) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDirector() {
        return director;
    }
}