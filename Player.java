public class Player {
    private String name;
    private int age;
    private String type;
    private int statistics;
    private int bestPerformance;

    public Player(){

    }
    void getAverage(String name){
        float average = statistics/15;
        System.out.println("Player's bowling/batting average: "+ average);
    }
    void getDetails(String name){
        System.out.println("PLayer's name: "+name);
        System.out.println("Player's age: "+age);
        System.out.println("Player's type: "+type);
        System.out.println("Player's statistics: "+statistics);
    }
    void getBestPerformance(String name){
        System.out.println("Player's best performance: "+bestPerformance);
    }
    void getPLayerType(String name){
        System.out.println("Player's type: "+ type);
    }
}