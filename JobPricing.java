//Filename JobPricing.java
//Tom 2/14/2020

import java.util.Scanner;

public class JobPricing
{
	public static void main(String[] args)
	{
		int materials;
		int hours;
		int labor;// 35 per hour
		int travelTime;
		int travelHours;// 12 per hour
		int total;
		String jobName;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter job name: ");
		jobName = input.nextLine();

		System.out.print("Estimated travel time in hours: ");
		travelTime = input.nextInt();
		travelHours = travelTime * 12;

		System.out.print("Estimated time for job completion(in hours): ");
		hours = input.nextInt();
		labor = hours * 35;

		System.out.print("Estimated cost of materials: ");
		materials = input.nextInt();

		total = labor + materials + travelHours;
		System.out.println("Job Name: " + jobName + "\nET for completion: " + hours + "\nET travel: " + travelTime + "\nMaterials Cost: " + materials + "\nTotal: " + total);
	}

}