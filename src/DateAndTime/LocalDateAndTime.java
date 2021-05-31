package DateAndTime;

import java.time.*;

public class LocalDateAndTime 
{
	public static void main(String args[])
	{
		
		// Local Date
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDate afterSevenDays = d.plusDays(7);
		System.out.println(afterSevenDays.plusDays(7));
		
		//Local Time
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		//Local Date and Time 
		
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println(dt);
		
		
	}

}
