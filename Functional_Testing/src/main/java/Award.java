public class Award {

    public static String awardValidation(double avgScore, double drl) {
        if (avgScore < 0.0 || avgScore > 4.0) {
            return "invalid input";
        }
        if (drl < 0.0 || drl > 100.0) {
            return "invalid input";
        }
        if (avgScore <= 3.5 || drl <= 80) {
            return "Not Award";
        }
        return "Awarded";
    }
}
