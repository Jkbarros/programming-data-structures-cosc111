package Problem1;

public class Movie {

    private int id;
    private int yearRelease;
    private String movieTitle = "";

    private int lateFee;

    public Movie(int id, String movieTitle, int yearRelease) {
            this.id = id;
            this.movieTitle = movieTitle;
            this.yearRelease = yearRelease;
            this.lateFee = 2;
    }

    public final void setTitle(String title) {
            this.movieTitle = title;
    }

    public final void setYearRelease(int year) {
            this.yearRelease = year;
    }

    public final int getId() {
            return id;
    }

    public final String getTitle() {
            return movieTitle;
    }

    public final int getYearRelease() {
            return yearRelease;
    }

    public boolean equalsTo(Movie m) {
            return (this.id == m.id);
    }

    public int calcLateFee(int days) {
            return days * lateFee;
    }

	public void getFee() {
		// TODO Auto-generated method stub
		
	};
}
