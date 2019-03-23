package hackathon2019;

public class Car{  

    //Driver::Driver[] list_of_drivers;
    private String car_make;
    private String car_model;
    
    
	public String get_car_make()
	{
		return car_make;
	}
	
	public String get_car_model()
	{
		return car_model;
	}
	
	public void set_car_model(String model)
	{
		car_model = model;
	}
	
	public void set_car_make(String make)
	{
		car_model = make;
	}
};

