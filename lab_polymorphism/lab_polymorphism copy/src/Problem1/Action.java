package Problem1;

public class Action extends Movie
{
        private int lateFee = 3;

        public Action(int id, String movieTitle, int yearRelease)
        {
                super(id, movieTitle, yearRelease);
                return;
        }

        public final int calcLateFee(int days)
        {
                return days * lateFee;
        }
}
