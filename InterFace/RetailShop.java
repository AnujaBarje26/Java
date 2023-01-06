package InterFace;
import java.util.*;

public class RetailShop implements RetailInterface{

    @Override
    public float getTotalCost(float tax, float cost, float number) {
        float totalCost = (cost*(1+(tax/100)))*number;
        return totalCost;
    }

    @Override
    public float getTotalExtendedCost(float cosmetics, float perfume, float clothes) {
        float totalExtendedCost = cosmetics+perfume+clothes;
        System.out.println("Total cost of all items: " + totalExtendedCost);
        return totalExtendedCost;
    }

    @Override
    public void getDiscountedCost(float totalcost) {
        double discount = 2;
        double discountedcost =  (totalcost*(1-(discount/100)));
        System.out.println("Discounted price is: " + discountedcost);
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to Retail Shop---");
        System.out.println("Enter quantity of cosmetics: ");
        float cosmetics = sc.nextFloat();
        System.out.println("Enter quantity of perfume: ");
        float perfume = sc.nextFloat();
        System.out.println("Enter quantity of clothes: ");
        float clothes = sc.nextFloat();

        RetailShop s1 = new RetailShop();
        float cost1 = s1.getTotalCost(7,10000,cosmetics); //cosmetics
        System.out.println("Total cost of cosmetics: " + cost1);
        float cost2 = s1.getTotalCost(12,5000,perfume); //perfume
        System.out.println("Total cost of perfume: " + cost2);
        float cost3 = s1.getTotalCost(4,7000,clothes); //clothes
        System.out.println("Total cost of clothes: " + cost3);

        float totalcost =s1.getTotalExtendedCost(cost1,cost2,cost3);

        s1.getDiscountedCost(totalcost);

    }
   
}
