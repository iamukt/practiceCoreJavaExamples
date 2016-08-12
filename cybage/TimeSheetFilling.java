package cybage;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeSheetFilling 
{
	private String[] actualWorkingHours = new String[7];
	private String[] timeSheetHours = new String[7];
	private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		TimeSheetFilling tsf = new TimeSheetFilling();
		tsf.accept();
		tsf.calculate();
		tsf.display();
	}
	public void accept()
	{
		for(int i=0;i<7;i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("Monday: ");
					break;
				case 1:	
					System.out.println("Tuesday: ");
					break;
				case 2:
					System.out.println("Wednesday: ");
					break;
				case 3:
					System.out.println("Thrusday: ");
					break;
				case 4: 
					System.out.println("Friday: ");
					break;
				case 5:
					System.out.println("Saturday: ");
					break;
				case 6:
					System.out.println("Sunday: ");
					break;
			}
			actualWorkingHours[i] = sc.nextLine();
		}
	}
	
	public void calculate()
	{
		int j=0;
		for(int i=0;i<7;i++)
		{
			if(!actualWorkingHours[i].equals(""))
			{
				String[] time = actualWorkingHours[i].split(":");
				DecimalFormat df = new DecimalFormat("##");
				timeSheetHours[j] = new String(time[0]).concat(":"+df.format((Float.parseFloat(time[1])/60)*100));
			}
			else
				timeSheetHours[j] = null;
			j++;
		}
		
	}
	
	public void display()
	{
		for(int i=0;i<7;i++)
			System.out.println(actualWorkingHours[i]+"++++===>>>"+timeSheetHours[i]);
	}
}
