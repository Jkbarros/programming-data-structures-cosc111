package Problem1;

public class Drama extends Movie
{
        private int lateFee = 2;

        public Drama(int id, String movieTitle, int yearRelease)
        {
                super(id, movieTitle, yearRelease);
                return;
        }

        public final int calcLateFee(int days)
        {
                return days * lateFee;
        }
}
