
package Statistics;

public class DiscreteProbability 
{
    public static double standardDeviation(double variance)
    {
        return Math.sqrt(variance);
    }
    
    public static double binomial(int n, int k) 
    {
        double result = 1;
        for (int i = 1; i < k; i++) 
        {
            result *= (n - i + 1) / i;
        }
        return result;
    }
}
