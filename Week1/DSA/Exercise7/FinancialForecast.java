public class FinancialForecast {

    public static double predictFutureValue(
            double currentValue,
            double growthRate,
            int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return predictFutureValue(
                currentValue,
                growthRate,
                years - 1)
                * (1 + growthRate);
    }

    public static void main(String[] args) {

        double initialValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 3;

        double futureValue =
                predictFutureValue(
                        initialValue,
                        growthRate,
                        years);

        System.out.println(
                "Predicted Future Value = "
                        + futureValue);
    }
}