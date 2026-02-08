
public class Stats {
    protected int[] dataSet;

//constructor
    public Stats(int[] dataSet) {
        this.dataSet = dataSet;
    }

    public int mean(){
        int sum = 0;
        for(int i:dataSet){
            sum+=i;
        }
        return sum/dataSet.length;
    }

    public int sum(){
        int sum = 0;
        for(int i:dataSet){
            sum+=i;
        }
        return sum;
    }

    public int sum(int a){
         int sum = 0;
        for(int i:dataSet){
            sum+=i;
        }
        return sum+a;
    }
     public String sum(String a){
         int sum = 0;
        for(int i:dataSet){
            sum+=i;
        }
        return "Sum: " + sum + "  " + a;
    }

}

