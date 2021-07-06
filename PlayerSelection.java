import java.util.*;

public class PlayerSelection {

    public static void main(String[] args) {
            ArrayList<Player> PlayerArrayList = new ArrayList<Player>();

            Player player1= new Player("Dawid Malan",33 , "batsman" , 265 , 103);
            Player player2= new Player("Aaron finch" , 34 , "batsman" , 350 , 172);
            Player player3= new Player("Babar Azam" , 26 , "batsman" , 354 , 122);
            Player player4= new Player("Dewon Conway" , 29 , "batsman" , 335 , 99);
            Player player5= new Player("Virat Kohli", 32 , "batsman" , 390 , 94);

            PlayerArrayList.add(player1);
            PlayerArrayList.add(player2);
            PlayerArrayList.add(player3);
            PlayerArrayList.add(player4);
            PlayerArrayList.add(player5);

           Scanner input=new Scanner(System.in);
           System.out.println("A- add a player");
           System.out.println("V- view all player");
           System.out.println("Enter the option here: ");
           char option=input.nextline();
        
           public void addplayer(){
                System.out.println("Enter name");
                String name= input.next();
                System.out.println("Enter age");
                int age= input.nextInt();
                System.out.println("Enter type");
                String type= input.next();
                System.out.println("Enter total score");
                int name= input.next();
                System.out.println("Enter highest score");
                String highest= input.next();
                Player newplayer= new Player(name,age,type,total,highest);
            }
           public void viewplayer(){
                  System.out.println(PlayerArrayList);
            } 
           
          if (option="A") {
             addplayer();
          }
          else if(option="V") {
             viewplayer();
          }else{
             System.out.println("invalid entry");
          }

}
