
package Statistics;
public class NormalProbability 
{
    public static double normalStandardDeviation(double value, double mean, double StandardDeviation)
    {
        return (value - mean) / StandardDeviation;
    }
    
    public static double ZScoreXValue(double mean, double zScore, double StandardDeviation)
    {
        return mean - zScore * (StandardDeviation);
    }
   
    public static double centralLimitTheorem(double popStandardDeviation, double n )
    {
        return  (popStandardDeviation) / (Math.sqrt(n));
    }
   
    public static double SamplingDistributions(double value, double mean,double popStandardDeviation, double n )
    {
        return (value - mean) / (centralLimitTheorem(popStandardDeviation, n));
    }
   
    public static double normalDistribution(double n, double q, double p)
    {
        return Math.sqrt(n*p*q);
    }
    
    public static double binomialProbability(double x, double mean, double n, double p, double q)
    {
        return (x - mean) / (normalDistribution(n,q,p));
    }
}
