
package Statistics;

public class HypothesisTestingOneSample 
{
    public static double leftEndPoint(double s, double value,double leftend )
    {
        return (s - 1) * (value) * (value) / (leftend);
    }
    
    public static double rightEndPoint(double s, double value,double rightend )
    {
        return (s - 1) * (value) * (value) / (rightend);
    }
   
    public static double confiLeftEndPoint(double s, double value, double leftend)
    {
           return Math.sqrt((s - 1) * (value) * (value) / (leftend));
    }
    
    public static double confiRightEndPoint(double s, double value, double rightend)
    {
           return Math.sqrt((s - 1) * (value) * (value) / (rightend));
    }
   
    public static double pTest(double value, double mean, double sample, double n)
    {
        return (value - mean) / (sample / Math.sqrt(n));
    }
    
    public static double tTest(double value, double mean, double sample, double n)
    {
        return (value - mean) / (sample / Math.sqrt(n));
    }
   
    public static double proportionTest(double value1, double value2, double p, double q, double n)
    {
        return (value1 - value2) / Math.sqrt((p*q) / n);
    }
  
    public static double zTest(double x, double n, double p, double q)
    {
        return (x / n - p) / Math.sqrt(p*q / n);
    }
   
    public static double populationVarianceTest(double n, double s, double value)
    {
        return (n - 1)  * (s) / value;
    }
}
