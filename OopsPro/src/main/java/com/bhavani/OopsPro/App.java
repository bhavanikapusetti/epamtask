package com.bhavani.OopsPro;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	 List<Sweets> gift = new ArrayList<>();
         //Runtime polymorphism
         Sweets chco1=new Chocklate("dark Choclate","100%", 2,10);
         gift.add(chco1);
         Sweets chco2=new Chocklate("white Choclate","100%", 1,20);
         gift.add(chco2);
         Sweets chco3=new Candy("Cramel","50%", 2,10);
         gift.add(chco3);
         Sweets chco4=new Candy("Milk","20%", 8,10);
         gift.add(chco4);
         Sweets chco5=new toffy("Teady","20%",5,2);
         gift.add(chco5);
         Sweets chco6=new Candy("Toffe","60%",2,2);
         gift.add(chco6);
         Sweets chco7=new Candy("Bars","75%",5,7);
         gift.add(chco7);
         Sweets chco8=new Candy("Nuts","65%",6,4);
         gift.add(chco8);
         List<Sweets> chocklate=new ArrayList<>();
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Chocklate){
                 chocklate.add(gift.get(i));
             }
         }
         //sorted by weigth of choclates
         System.out.println("Chocklates sorted by their weights");
         Collections.sort(chocklate,new Sortbyweigth());
         for(int i=0;i<chocklate.size();i++){
             System.out.println(chocklate.get(i).name+" choco% is "+chocklate.get(i).type+" cost is "+chocklate.get(i).cost+" weigth of chocklate is "+chocklate.get(i).weigth+"gms");
         }
         //sorted by the cost of chocolates
         System.out.println();
         System.out.println("Chocolates sorted by their cost");
         Collections.sort(chocklate,new Sortbycost());
         for(int i=0;i<chocklate.size();i++){
         	System.out.println(chocklate.get(i).name+" choco% is "+chocklate.get(i).type+" cost is "+chocklate.get(i).cost+" weigth of chocklate is "+chocklate.get(i).weigth+"gms");
         }
         //sorted by the type of content
         System.out.println();
         Collections.sort(chocklate,new Sortbytype());
         System.out.println("Chocklates sorted by their content %");
         for(int i=0;i<chocklate.size();i++){
         	System.out.println(chocklate.get(i).name+" choco% is "+chocklate.get(i).type+" cost is "+chocklate.get(i).cost+" weigth of chocklate is "+chocklate.get(i).weigth+"gms");
         }
         // calculates the total weigth of the gifts
         int net_weigth=0;
         for(int i=0;i<gift.size();i++){
             net_weigth+=gift.get(i).weigth;
         }
         System.out.println();
         System.out.println("Total weigth of gift "+net_weigth+"gm");
         //Calculates the total no of candy
         int count_candies=0;
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Candy){
                 count_candies++;
             }
         }
         System.out.println();
         System.out.println("No of Candies is "+count_candies);
         //candies between range of the cost in between 2 to 5
         System.out.println("");
         System.out.println("candies between range of the cost in between 2 to 5\n");
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Candy){
                 if(gift.get(i).cost<=5 && gift.get(i).cost>=2) {
                 	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of candy is "+gift.get(i).weigth+"gms");
                 }
             }
         }
       //candies between range of the cost in between 2 to 5
         System.out.println("");
         System.out.println("candies between range of the weigth in between 2 to 9\n");
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Candy){
                 if(gift.get(i).weigth<=5 && gift.get(i).weigth>=2) {
                 	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of candy is "+gift.get(i).weigth+"gms");
                 }
             }
         }
         
     }
 }
    
