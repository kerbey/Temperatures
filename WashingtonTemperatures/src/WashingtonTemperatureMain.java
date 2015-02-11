import java.util.Scanner;
public class WashingtonTemperatureMain 
{
	static int temp=0, bigNumber=0, lowNumber=0, high, low, month;
	static final int MONTHS=12, TEMP=2;
	static int [][] tempYear= new int[MONTHS][TEMP];
	public static void main(String[] args) 
	{ 
		inputTempForMonth(12,tempYear);// array and months get passed in the method and pringted out
		for (month=0; month<12; month++)
		{
			System.out.println("temperatures of month "+(month+1)+" "+tempYear[month][0]+" "+tempYear[month][1]);
		}
		double averageHigh=calculateAverageHigh(tempYear);
		System.out.println("average high temperature "+averageHigh);
		double averageLow=calculateAverageLow(tempYear);
		System.out.println("average low temperature "+averageLow);
		findHighestTemp(tempYear);
		findLowestTemp(tempYear);
	}
	public static void inputTempForMonth(final int MONTHS, int[][] tempYear2)
	{
		for (month=0; month<12; month++)
		{
			Scanner input= new Scanner (System.in);
			System.out.println("input the highest temperature for month "+(month+1));
			high=input.nextInt();
			System.out.println("high "+high);
			System.out.println("input the lowest temperature for month "+(month+1));
			low=input.nextInt();
			System.out.println("low "+low);
			inputTempForYear();
		}
	}
	public static int[][] inputTempForYear()
	{	//temperatures for the year get placed in array	
		tempYear[month][0]=high;
		tempYear[month][1]=low;
		return tempYear;
	}
	public static double calculateAverageHigh(int [][]year)
	{//gets average amount of higher temperatures 
		double averageHigh=0;
		for( month=0;month<12;month++)
		{
			averageHigh=averageHigh+tempYear[month][0];
		}
		averageHigh=averageHigh/12;
		return averageHigh;
	}
	public static double calculateAverageLow(int [][]year)
	{//gets average amount of lower temperatures
		double averageLow=0;
		for( month=0;month<12;month++)
		{
			averageLow=averageLow+tempYear[month][1];
		}
		averageLow=averageLow/12;
		return averageLow;
	}
	public static int findHighestTemp(int [][]tempYear)
	{
		for( month=0;month<tempYear.length;month++)
		{
			if(bigNumber<tempYear[month][0])
			{
				bigNumber=tempYear[month][0];
			}
		}//the nested for-if loop above is made to switch the temperatures and put them
		//in order
		System.out.println("largest number is "+bigNumber);
		for( month=0;month<tempYear.length;month++)
		{
			if(bigNumber!=tempYear[month][0])
			{
			}
			else 
			{
				System.out.println("coming from month "+(month+1));
				month=tempYear.length+1;
				return bigNumber;
			}
			if(bigNumber!=tempYear[month][1])
			{
			}
			else
			{
				System.out.println("coming from month "+(month+1));	
				month=tempYear.length+1;
				return bigNumber;
			}
		}// this for if loop looks for the month the largest temperature had first 
		return bigNumber;
	}

	public static int findLowestTemp(int [][]tempYear)
	{
		for( month=0;month<tempYear.length;month++)
		{
			if(lowNumber<tempYear[month][1])
			{
				lowNumber=tempYear[month][1];
			}
		}//the nested for-if loop above is made to switch the temperatures and put them
		//in order
		System.out.println("smallest number is "+lowNumber);
		for( month=0;month<tempYear.length;month++)
		{
			if(lowNumber!=tempYear[month][0])
			{
			}
			else 
			{
				System.out.println("coming from month "+(month+1));
				month=tempYear.length+1;
				return lowNumber;
			}
			if(lowNumber!=tempYear[month][1])
			{
			}
			else
			{
				System.out.println("coming from month "+(month+1));	
				month=tempYear.length+1;
				return lowNumber;
			}
		}// this for if loop looks for the month the smallest temperature had first
		return lowNumber;
	}
}
