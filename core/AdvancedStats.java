// removed import Stats   
public class AdvancedStats extends Stats {  
    public AdvancedStats(int[] dataSet) {
        super(dataSet);
        // System.out.println("AdvancedStats " + java.util.Arrays.toString(dataSet));
    }

    public int mean(){
        int median = 0;
        int length = dataSet.length;
        if (length % 2 == 0) {
            median = (dataSet[length / 2] + dataSet[length / 2 - 1]) / 2;
        } else {
            median = dataSet[length / 2];
        }
        return median;
    }
}