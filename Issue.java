package hackathon2019;
import java.util.Date;

public class Issue
{
	   
	Date timestamp;
	String issue_name;
	boolean issue_present;
	
	public Issue(){
		timestamp = new Date();
		issue_name = " ";
		issue_present = false;
	}
	
	
	public Date get_timestamp(){
		return timestamp;
	}
	
	public String get_issue()
	{
		return issue_name;
	}
	
	public boolean get_issue_present()
	{
		return issue_present;
	}
	
	public String get_name()
	{
		return issue_name;
	}
	public void set_issue_name(String issue_name)
	{
		this.issue_name = issue_name;
	}
	public void set_timestamp(Date timestamp_in){
		timestamp = timestamp_in;
	}
	
	public void set_issue_present(boolean issue)
	{
		issue_present = issue;
	}
	
};
