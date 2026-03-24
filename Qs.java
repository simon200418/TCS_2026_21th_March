public class Qs{

    //Q1. Parking Price Calculator
    public static int parkingPriceCalculator(int n){

        if(n < 0){ System.out.println("Error");}
        int calculatedPrice = 0;        
        if(n <= 2){
            calculatedPrice = n * 100;
        }else if(n > 2 && n <= 5){
            calculatedPrice = (2 * 100) + ((n-2) * 50);
        }else if(n > 5){
            calculatedPrice = (2 * 100) + (3 * 50) +((n-5) * 20);
        }

        return calculatedPrice;
    }

    public static void main(String[] args){
        System.out.println(parkingPriceCalculator(12));

    }
}