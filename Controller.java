import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller
{
    ArrayList<Player> plays;
    Team t, t2;
    public Controller(){
        plays = new ArrayList<>();
        Player pl = new Player("player1","first");
        Player pl2 = new Player("player2", "third");
        plays.add(pl);
        plays.add(pl2);
        generateTeams();
        System.out.println(t); 
        System.out.println(t2);
    }

    public void generateTeams(){
        Random rand = new Random();
        ArrayList<Player> temp = plays;
        ArrayList<Player> temp2 = new ArrayList<>(), team1 = new ArrayList<>();
        for(int i = 0; i < plays.size() / 2.0; i++){
            System.out.println(plays.size() / 2);
            int randInt = rand.nextInt(plays.size());
            temp2.add(plays.get(randInt));
            plays.remove(randInt);
        }

        t = new Team(plays);
        t2 = new Team(temp2);
        plays = temp;
    }

    public void play(){
        for(int j = 0; j<=500;j++){
            //team 1 maybe second for second team.
            for (Player p: plays){
                p.act();
            }
            Clock.updateTick;  
        }
    }
}
