package lesson06;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }else if(n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println("Operation is İncorrect");
        }


          }
            
        }







