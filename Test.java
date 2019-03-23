package hackathon2019;
import java.util.Random;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Test {

	public static void main(String[] args)
	{
		category engine = new category("Engine");
		category brakes = new category("Brakes");
		category transmission = new category("Transmission");
		category steering = new category("Steering");
		category misc = new category("Misc");
		
		
		Random rand = new Random();   
	  //  Generates 10 Random Numbers in the range 1 -20
		int value;
	  

		//assigns a random set of numbers to the act as error codes
		for (int i = 0; i < 20; i++)
		{
			value = rand.nextInt(90) + 10;
			engine.issue[i] = new Issue();
			engine.issue[i].set_issue_name("E" + value);
			value = rand.nextInt(90) + 10;
			brakes.issue[i] = new Issue();
			brakes.issue[i].set_issue_name("B" + value);
			value = rand.nextInt(90) + 10;
			transmission.issue[i] = new Issue();
			transmission.issue[i].set_issue_name("T" + value);
			value = rand.nextInt(90) + 10;
			steering.issue[i] = new Issue();
			steering.issue[i].set_issue_name("S" + value);
			value = rand.nextInt(90) + 10;
			misc.issue[i] = new Issue();
			misc.issue[i].set_issue_name("M" + value);
			System.out.println( misc.issue[i].get_name());
		}
		
		//long current_time = System.currentTimeMillis() / 360000;
		//System.out.println(current_time);
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
        engine.issue[0].set_timestamp(cal.getTime());
        System.out.println(engine.issue[0].timestamp);
		
	}
}
