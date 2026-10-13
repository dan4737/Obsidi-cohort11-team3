package AISLOP;

public class Calculator {

    private static final int Basic_Tier= 1;
    private static final int IntermediateTier= 2;
    private static final int PremiumTier= 3;


    private static final double BaseMultiplier= 1.05;
    private static final double IntermediateMultiplier= 1.10;
    private static final double PremiumMultiplier= 1.15;

    public static double getCalculation(double amount, int tier) {
        if (tier == Basic_Tier) {
            return amount * BaseMultiplier;
        } else if (tier == IntermediateTier) {
            return amount * IntermediateMultiplier;
        } else if (tier == PremiumTier) {
            return amount * PremiumMultiplier;
        } else {
            return amount * PremiumMultiplier;
        }
    }
}
