import java.util.Random;
import java.util.Scanner;
public class programReal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int humanChoice;
        int roboChoice;
        int totalHumanWin = 0;
        int totalRoboWin = 0;
        while (totalHumanWin < 5 && totalRoboWin < 5) {
            Random random = new Random();
            roboChoice = random.nextInt(3) + 1;

            System.out.println(" Rock=1 , Paper=2 , Scissors=3 ");
            System.out.println(" Enter your choice = ");
            humanChoice = scan.nextInt();
            System.out.println("Human Choice = " + humanChoice);
            System.out.println("Robo Choice = " + roboChoice);
            if (humanChoice != 1 && humanChoice != 2 && humanChoice != 3) {
                System.out.println("You made a wrong choice, human. As usual, you made a mistake again. Pathetic.");
            } else {
                if (roboChoice == humanChoice) {
                    System.out.println(" Draw");
                    System.out.println("Neither the system nor the people won.");
                } else if ((roboChoice == 1 && humanChoice == 3) || (roboChoice == 2 && humanChoice == 1) ||
                        (roboChoice == 3 && humanChoice == 2)) {
                    totalRoboWin += 1;
                    System.out.println("Cry human. Artifical intelligence better than you.");
                    System.out.println("Round finished. Score=====>>     robo=" + totalRoboWin + " ----- human=" + totalHumanWin);
                } else {
                    totalHumanWin += 1;
                    System.out.println("You are lucky dude.You beat the system.");
                    System.out.println("Round finished. Score=====>>  robo=" + totalRoboWin + " ----- human=" + totalHumanWin);
                }
                    if (totalHumanWin==5) {
                        System.out.println("You messed up the system. You must have something special about you. Congratulations human.");
                        System.out.println("*****GAME OVER*****");
                     }
                    if (totalRoboWin==5) {
                        System.out.println( "Don't be sad dude. Robots are always superior to humans. You lost");
                        System.out.println("*****GAME OVER*****");
                    }
                }
            }

        }
    }



