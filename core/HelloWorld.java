

public class HelloWorld {
    static void printStats(Stats stats){
        System.out.println("Mean" + stats.mean());
    }

    public static void main(String[] args) {
        int[] dataSet = {2,4,5,6,7,10,35,57,78};
        // int[] dataSet2 = {2,34,54,67,24,5,57,78};
        AdvancedStats advStats = new AdvancedStats(dataSet);
        // System.out.println("dataSet" + stats.dataSet);
        // System.out.println("Mean" + advStats.mean());
        // System.out.println("Median" + advStats.median());
        printStats(advStats);
        FinanceStats financeStats = new FinanceStats(dataSet);
        // System.out.println("Mean" + financeStats.mean());
        printStats(financeStats);   

        System.out.println("Sum" + financeStats.sum());
        System.out.println("Sum" + financeStats.sum(10));
        System.out.println("Sum" + financeStats.sum("Hello"));
    
        // System.out.println("Standard Deviation" + financeStats.standardDeviation());
    }
}


// Encapsulation

//Abstraction

//Inheritance 

//STATIC POLYMORPHISM
// where the method is overriden at compile time

//Polymorphism (Dynamic/ Runtime Polymorphism)
// where the method is overriden at runtime 


