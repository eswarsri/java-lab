// removed import Stats   
public class FinanceStats extends Stats {  
    public FinanceStats(int[] dataSet) {
        super(dataSet);
        // System.out.println("AdvancedStats " + java.util.Arrays.toString(dataSet));
    }

    public double standardDeviation() {
        double mean = mean();
        double sum = 0;
        for (int i : dataSet) {
            sum += Math.pow(i - mean, 2);
        }
        return Math.sqrt(sum / dataSet.length);
    }
}