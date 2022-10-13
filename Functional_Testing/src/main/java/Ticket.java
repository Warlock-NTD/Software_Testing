public class Ticket {
    public static double ticketPayCalculate(double movieRate, double discountRate) {
        if (movieRate < 1 || movieRate > 5) {
            return -1;
        }

        if (discountRate > 40 || discountRate < 0) {
            return -1;
        }
        double pay = movieRate * 100;
        return pay - pay * discountRate / 100;
    }
}
