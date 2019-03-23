package hackathon2019;

public class User {
	private int policy;
	private String email;
	private String password;
	private Car[] garage;
	
	public User()
	{
		
	}
	
	public String get_email()
	{
		return email;
	}
	
	public String get_password()
	{
		return password;
	}
	
	public int get_policy()
	{
		return policy;
	}
	
}
