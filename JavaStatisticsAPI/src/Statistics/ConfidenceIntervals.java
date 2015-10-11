
package Statistics;


public class ConfidenceIntervals 
{
    public static double marginError(double z, double s, double n)
    {
        return z * s / Math.sqrt(n);
    } 
     
    public static double minSampleSize(double z, double s)
    {
        return (z * s / 1) * (z * s / 1);
    }
    
    public static double pointEstimateOfP( double x, double n)
    {
        return x / n;
    }
    
    public static double confidenceInterval(double z, double a, double n)
    {
        return z * a / Math.sqrt(n);
    }
    
    public static double confidenceIntervalP(double z, double p, double q, double n)
    {
        return z * Math.sqrt((p*q)/n);    
    }
    
    public static double sampleSizeP(double p, double q, double z, double e)
    {
        return (p) * (q) *(z/e) * (z/e);
    }
    
    public static double xSquaredLeft(double ConfidenceInterval)
    {
        return 1 - ConfidenceInterval / 2;
    }
   
    public static double xSquaredRight(double ConfidenceInterval)
    {
        return 1 + ConfidenceInterval / 2;
    }
}
