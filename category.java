package hackathon2019;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class category {
	String title;
	boolean issue_present = false;
	Issue[] issue = new Issue[20];
	
	public category(String title_in){
		title = title_in;
	}
	
	public void set_issues(String issue_name, int index){
		issue[index].set_issue_name(issue_name);
	}
	
	public boolean get_issue_present()
	{
		for (int i = 0; i < 20; i++)
		{
			if (issue[i].issue_present == true);
			{
				return true;
			}
		}
		return false;
	}

}
