import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static String timeATM(){return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));}
    public static void main(String[] args) {

        App app = new App();
        app.addProfile("Aidan","Perez");

        Profile aidan = new Profile("Aidan","Perez");
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Hey! " + aidan.getFirst()+ ", wgat it is son!?");

        /*
        while(true){
            System.out.println("Log: l | New Task: t | Fastest Time: f | Exit: x");
            String input = scanner.nextLine();
            if(input.equals("l")){ //ALLOWS LOGGING FOR A TASK
                System.out.println("Which task would you like to log for?");
                String name = scanner.nextLine();
                if(!aidan.getTasks().containsKey(name)){
                    System.out.println("That task doesn't exist!");
                    continue;
                }
                System.out.println("Provide the time for completion   (hh:mm:ss)");
                Double time = Double.valueOf((scanner.nextLine()));
                aidan.logTask(name,time);
            }else if(input.equals("t")){ //ALLOWS NEW TASK CREATION
                System.out.println("Name for task?");
                String newt = scanner.nextLine();
                aidan.newTask(newt);
            }else if(input.equals("f")){ //Returns FASTEST time for task
                System.out.println("FFFFFFFFF");
            }else if(input.equals("x")){ //EXITS PROGRAM
                break;
            }else {System.out.println("Erm guys!?!? that wasnt an option");}
            System.out.flush();
            System.out.print("\n");
        }
        */
    }
}