//WHILE LOOP//



/*public class loops {
  public static void main(String[] args) {

  int number = 1;

    while (number <= 3) {
      System.out.println("Code inside while loop is running.");
      
      
    }
  }
}

class Main {
  public static void main(String[] args) {

      // declare numberOfTimes variable. 
      int numberOfTimes = 1;
  
      // code inside while loop will run 3 times.
      while(numberOfTimes <= 3) {
          System.out.println("Code inside while loop is running.");
          System.out.println("number - " + numberOfTimes);
          numberOfTimes = numberOfTimes + 1;
      }

      System.out.println("Outside while loop body code.");
  }
}

//Write a code to to print numbers from 5 to 1 using a while loop.

class Main {
  public static void main(String[] args) {

      // declare number variable. 
      int number = 5;
  
      // code inside while loop will run 5 times.
      while(number >= 1) {
          System.out.println(number);
          number = number - 1;
      }
  }
}

//Write a program to find the sum of first n natural numbers using a while loop.

import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
 
        int sum = 0;
 
        int count = 1;
 
        while (count <= n) {
            // adding the value of count to sum
            sum = sum + count;
            count = count + 1;
        }
 
        System.out.println("Total sum = " + sum);
        input.close();
    }
}

//FOR LOOP//

class Main {
  public static void main(String[] args) {

      // declare numberOfTimes variable. 
      int numberOfTimes = 1;
  
      // code inside for loop will run 3 times.
      for ( numberOfTimes = 1; numberOfTimes <= 3; numberOfTimes++) {
          System.out.println("Code inside for loop is running.");
      }
  }
}

//Write a code to to print odd numbers till number n using a for loop.

import java.util.Scanner;

public class loops {

  public static void main(String[] args) {
    
    System.out.println("Enter your number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i = i + 2){
      System.out.println(i);

    }

  }
}

//Write a program to find a factorial of number n.

import java.util.*;

class Main {
    public static void main(String[] args) {

        // calculate factorial of number.
        int number=5;   
        int fact=1;
        for(int i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    }
}
//Using if statement inside a loop

class Main {
  public static void main(String[] args) {

      // iterate from n = 1 to 9
      for (int n = 1; n < 10; n++) {
          
          // check if n is odd
          if (n % 2 == 1) {
              System.out.println(n);
          }
      }
  }
}

//Do WHile loop

public class loops {

  public static void main(String[] args) {
    int i = 1;
    do{
      System.out.println("Do block is runnig");
      i++;
    }while(i <= 3);
  }
}*/

