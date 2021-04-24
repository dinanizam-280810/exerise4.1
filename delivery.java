
package main1;

import java.util.Scanner;
public class delivery {
    
    private double address;
    private String address1;
    int answer;
    Scanner input = new Scanner(System.in);
    
    
    delivery(){
        System.out.println("\nDo you want to 1.delivery or 2.self-pickup?");
        this.answer=input.nextInt();
        while(answer!= 1 && answer!= 2) {
                System.out.println("Wrong input! Please input 1 or 2 only!");
            System.out.print("Do you want to 1.delivery or 2.self-pickup?");
           this.answer= input.nextInt();
        }
          if ( answer== 1) {
       
        System.out.print("\nEnter Your Address: ");
        System.out.print("\nnumber: ");
        this.address=input.nextDouble();
        System.out.println("Jalan: ");
        this.address1=input.nextLine();
    }
          else if(answer==2){
              System.out.println("Please pick-up in 30 minutes");
          }
    }
    Double getaddress(){
        return this.address;
    }
    String getaddress1(){
        return this.address1;
}
    int getanswer(){
        return this.answer;
    }
}