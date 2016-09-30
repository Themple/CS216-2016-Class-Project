import java.util.Random;
/**this class will create random numbers from 1 to a designated number**/
public class Randomizer
{
    private Random rgen;
    public Randomizer()
    {
       rgen = new Random();
    }
    
    public int randomize()
    {
        return rgen.nextInt(10)+1;
    }
    
    public void randomList()
    {
        int x=1;
        while (x==1)
        {
            System.out.println(rgen.nextInt(100000)+1);
        }
    }
}
