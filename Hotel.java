import java.util.Scanner;   
public class Hotel{  
    int choice;  
    String menu;  
    void show(){  
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter your choice : ");  
        System.out.println("Enter 1 for Barger");  
        System.out.println("Enter 2 for Sandwich");  
        System.out.println("Enter 3 for Pasta");  
        System.out.println("Enter 4 for Pizza");  
        System.out.println("Enter 5 for Fresh Juice & Milk shake");  
        System.out.println("Enter 6 for Soft Drinks"); 		
        System.out.println("Enter you menu choice:"); 
		
        choice = s.nextInt();
		
        if (choice == 1){			
            System.out.println(" 1. Checken Barger");  
            System.out.println(" 2. Beef Barger");  
            System.out.print("Enter your Barger choice : "); 
            int Barger = s.nextInt();
			
				if(Barger == 1){
					System.out.println("you have select  Checken Barger");  
					System.out.println("One Price : 50 Tk");
				}else if (Barger == 2){
					System.out.println("you have select Beef Barger");  
					System.out.println("One Price : 125 Tk");					
				}
        } 
		
        if (choice == 2) {  
            System.out.println("1. Garden Club Sandwich");  
            System.out.println("2. Chicken Club Sandwich");  
            System.out.println("Enter your Sandwich choice : ");  
            int Sandwich = s.nextInt();  
			
			if(Sandwich == 1){
					System.out.println("you have select Garden Club Sandwich");  
					System.out.println("One Price : 250 Tk");
				}else if ( Sandwich == 2){
					System.out.println("you have select Chicken Club Sandwich");  
					System.out.println("One Price : 300 Tk");					
				}
        }  
		
        if (choice == 3) {  
            System.out.println("1. Spicy Pasta");  
            System.out.println("2. Chilli Sauce Pasta");  
			System.out.println("Enter your Pasta choice : ");
            int Pasta = s.nextInt();
			
			if(Pasta == 1){
					System.out.println("you have select Spicy Pasta");  
					System.out.println("One Price : 250 Tk");
				}else if ( Pasta == 2){
					System.out.println("you have select Chilli Sauce Pasta");  
					System.out.println("One Price : 220 Tk");					
				}
        }
		
		if (choice == 4) {  
            System.out.println("1. BBQ Pizza");  
            System.out.println("2. Beef Lover's Pizza");  
            System.out.println("3. Spicy Chicken Pizza");  
            int Pizza = s.nextInt();  
			
			if( Pizza == 1){
					System.out.println("you have select BBQ Pizza");  
					System.out.println("One Price : 400 Tk");
				}else if (Pizza == 2){
					System.out.println("you have select Beef Lover's Pizza");  
					System.out.println("One Price : 500 Tk");					
				} else if (Pizza == 3){
					System.out.println("you have select Spicy Chicken Pizza");  
					System.out.println("One Price : 330 Tk");
				}
        } 
		
		if (choice == 5) {  
            System.out.println("1. Lemon Juice");  
            System.out.println("2. Pineapple Juice");  
            System.out.println("2. Lassi ");  
            int Juice = s.nextInt();  
			
			if( Juice == 1){
					System.out.println("you have select Lemon Juice");  
					System.out.println("One Price : 50 Tk");
				}else if (Juice == 2){
					System.out.println("you have select Pineapple Juice");  
					System.out.println("One Price : 150 Tk");					
				} else if (Juice == 3){
					System.out.println("you have select Lassi");  
					System.out.println("One Price : 100 Tk");
				}
        }
		
		if (choice == 6) {  
            System.out.println("1. Tea");  
            System.out.println("2. Coffee");  
            System.out.println("3. 7UP ");  
            int Drinks = s.nextInt();  
			
			if( Drinks == 1){
					System.out.println("you have select Tea");  
					System.out.println("One Price : 30 Tk");
				}else if (Drinks == 2){
					System.out.println("you have select Pineapple Juice");  
					System.out.println("One Price : 50 Tk");					
				} else if (Drinks == 3){
					System.out.println("you have select Lassi");  
					System.out.println("One Price : 30 Tk");
				}
        }
		
    }  
      
    public static void main(String[] args) {  
        Hotel h = new Hotel();  
        h.show();  
        
    }  
}  