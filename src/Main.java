
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void winner(int UserInput, int CompInput)
    {
        switch(UserInput){
            //s , p , r

            case 0: //scissor
                if(CompInput == 0){
                    //against scissor
                    System.out.println("It's a draw.");
                }else if(CompInput == 1){
                    //against paper
                    System.out.println("You WIN !!!");
                }else{
                    //against rock
                    System.out.println("Computer WON!!");
                }
                break;
            case 1: //paper
                if(CompInput == 1){
                    //against paper
                    System.out.println("It's a draw.");
                }else if(CompInput == 2){
                    //against rock
                    System.out.println("You WIN !!!");
                }else{
                    //against scissor
                    System.out.println("Computer WON!!");
                }
                break;

            case 2: //rock
                if(CompInput == 2){
                    //against rock
                    System.out.println("It's a draw.");
                }else if(CompInput == 0){
                    //against scissor
                    System.out.println("You WIN !!!");
                }else{
                    //against paper
                    System.out.println("Computer WON!!");
                }
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        char input;
        char[] choices = {'s','p','r'};
        String[] options = {"Scissor", "Paper", "Rock"};
        int choice;
        int inputIndex = 0;

        System.out.println("Enter your choice[R,P,S]:");
        input = Character.toLowerCase(scannerObj.next().charAt(0));
        switch(input){
            case 's':
                    inputIndex = 0;
                    break;

            case 'p':
                    inputIndex = 1;
                    break;

            case 'r':
                    inputIndex = 2;
                    break;
        }
        System.out.println("User's input: " + options[inputIndex]);
        choice = (int)(Math.random() * 3);
        System.out.println("Computer's choice: " + options[choice]);
        winner(inputIndex, choice);
//        switch(inputIndex){
//            //s , p , r
//
//            case 0: //scissor
//                if(choice == 0){
//                    //against scissor
//                    System.out.println("It's a draw.");
//                }else if(choice == 1){
//                    //against paper
//                    System.out.println("You WIN !!!");
//            }else{
//                    //against rock
//                    System.out.println("Computer WON!!");
//                }
//                break;
//            case 1: //paper
//                if(choice == 1){
//                    //against paper
//                    System.out.println("It's a draw.");
//                }else if(choice == 2){
//                    //against rock
//                    System.out.println("You WIN !!!");
//                }else{
//                    //against scissor
//                    System.out.println("Computer WON!!");
//                }
//                break;
//
//            case 2: //rock
//                if(choice == 2){
//                    //against rock
//                    System.out.println("It's a draw.");
//                }else if(choice == 0){
//                    //against scissor
//                    System.out.println("You WIN !!!");
//                }else{
//                    //against paper
//                    System.out.println("Computer WON!!");
//                }
//                break;
//        }

    }
}