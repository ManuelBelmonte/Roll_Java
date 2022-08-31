package While;

import java.util.Scanner;

public class Rolljava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start. ");
        scan.nextLine();

        System.out.println("Great here are the rules: \n- If you roll a 6 the game stops.");
        System.out.println("-If you roll a 4 nothing happens.\n- Otherwise, you get 1 point.\nYou must collect 3 points to win. Enter anything to roll: ");


        int count = 0;

        while(true){

            int ricedol = Rollit();
            scan.nextLine();
            if (ricedol == 6){
                System.out.println("You rolled a "+ricedol+". End game");
                break;
            }
            else if (ricedol == 4){
                System.out.println("You rolled a "+ricedol+". Zero point. Try again");
            }
            else{
                System.out.println("You rolled a "+ricedol+". One point. Keep Rolling");
                count++;
            }
        }
        System.out.println("\nYour score is : "+count);

        if (count >= 3) {
            System.out.print("Wow That´s lucky you win");
        }else {
            System.out.print("Though luck, you lose :(");
        }

    }
    public static int Rollit(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

}
