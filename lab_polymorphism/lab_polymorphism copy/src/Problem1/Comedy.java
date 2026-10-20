package Problem1;

public class Comedy extends Movie
{
        private int lateFee = (int)2.5;

        public Comedy(int id, String movieTitle, int yearRelease)
        {
                super(id, movieTitle, yearRelease);
                return;
        }

        public final int calcLateFee(int days)
        {
                return days * lateFee;
        }
}
