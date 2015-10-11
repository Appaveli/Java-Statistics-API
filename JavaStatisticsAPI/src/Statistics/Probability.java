
package Statistics;

public class Probability 
{    
    public static double median(double medianArray[], int size) 
    {
        double Sorted[] = new double[medianArray.length];
        for (int i = 0; i < size; i++) 
        {
            Sorted[i] = medianArray[i];
        }
        for (int i = size - 1; i > 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (Sorted[j] > Sorted[j + 1]) 
                {
                    double temp = Sorted[j];
                    Sorted[j] = Sorted[j + 1];
                    Sorted[j + 1] = temp;
                }
            }
        }
        double med = 0.0;
        if ((size % 2) == 0) 
        {
            med = (Sorted[size / 2] + Sorted[(size / 2) - 1]) / 2.0;
        } else {
            med = Sorted[size / 2];
        }
        return med;
    }
    
    public static double mode(double modeArray[], int size) 
    {
        int repetition[] = new int[size];
        for (int i = 0; i < size; i++) {
            repetition[i] = modeArray.length;
            int j = 0;
            while ((j < i) && modeArray[i] != modeArray[j]) {
                if (modeArray[i] != modeArray[j]) {
                    j++;
                }
            }
            ++(repetition[j]);
        }
        int maxRepeat = 0;
        for (int i = 1; i < size; i++) 
        {
            if (repetition[i] > repetition[maxRepeat]) 
            {
                maxRepeat = i;
            }
        }
        return modeArray[maxRepeat];
    }

    public static double mean(double mean[], int size) 
    {
        double sum = mean[0];
        for (int i = 0; i < size; i++) 
        {
            sum += mean[i];
        }
        return sum / size;
    }

    public static double classicalProbability(double e, double outcomes)
    {
        return e / outcomes;
    }
    
    public static double empiricalProbability(double e, double frequency)
    {
        return e / frequency;
    }    
}
