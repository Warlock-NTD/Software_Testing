public class EggLabotatory {
    public static int eggCollector(int chickenNumber, int eggCoefficient) {
        if (eggCoefficient > 5) {
            eggCoefficient = eggCoefficient + 5;
        }
        if (chickenNumber > 10) {
            chickenNumber = eggCoefficient + chickenNumber;
        }
        return chickenNumber + (eggCoefficient % 7);
    }
}
