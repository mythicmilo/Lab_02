import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        final int WORKER_FIELDS_LENGTH = 6;
        final int SWORKER_FIELDS_LENGTH = 7;
        String id, firstName, lastName, title;
        int yob;
        double hourlyPayRate, annualSalary;
        ArrayList<Worker> workers = new ArrayList<>();
        Worker worker1 = new Worker("000001", "John", "Smith", "Mr.", 1990, 15);
        Worker worker2 = new Worker("000002", "Jane", "Doe", "Ms.", 1995, 13.5);
        Worker worker3 = new Worker("000003", "Norman", "Simpleton", "Mr.", 1989, 12.5);
        SalaryWorker salWorker1 = new SalaryWorker("00000A", "Maria", "Hernandez", "Mrs.", 1975, 0, 50000);
        SalaryWorker salWorker2 = new SalaryWorker("00000B", "Daniel", "Rogers", "Dr.", 1985, 0, 100000);
        SalaryWorker salWorker3 = new SalaryWorker("00000C", "Larry", "Lee", "Mr.", 2000, 0, 66000);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salWorker1);
        workers.add(salWorker2);
        workers.add(salWorker3);

        double hoursWorked = 0;
        String fullNameDisplay = "Full Name";
        String weekCountDisplay = "Week #";
        String weekPay = "Weekly pay";
        System.out.printf("\n%-7s%-20s%12s\n", weekCountDisplay, fullNameDisplay, weekPay);
        System.out.println("=======================================");

        for (int week = 1; week < 4; week++)
        {
            int index = -1;
            if (week == 2)
            {
                hoursWorked = 50;
                String[] fields;
                for(Worker w: workers)
                {
                    index++;
                    fields = w.toCSVDataString().split(","); // Split the record into the fields
                    if(fields.length == WORKER_FIELDS_LENGTH)
                    {
                        firstName = fields[1].trim();
                        lastName  = fields[2].trim();
                        hourlyPayRate = Double.parseDouble(fields[5].trim());
                        String fullName = firstName + " " + lastName;
                        String weekCount = "Week " + week;
                        double payTotal = workers.get(index).calculateWeeklyPay(hoursWorked);
                        System.out.printf("%-7s%-20s%12.2f\n", weekCount, fullName, payTotal);
                    }
                    else if (fields.length == SWORKER_FIELDS_LENGTH)
                    {
                        firstName = fields[1].trim();
                        lastName  = fields[2].trim();
                        annualSalary = Double.parseDouble(fields[6].trim());
                        String fullName = firstName + " " + lastName;
                        String weekCount = "Week " + week;
                        double payTotal = workers.get(index).calculateWeeklyPay(hoursWorked);
                        System.out.printf("%-7s%-20s%12.2f\n", weekCount, fullName, payTotal);
                    }
                    else
                    {
                        System.out.println("Found a record that may be corrupt: ");
                        System.out.println(w);
                    }
                }
            }
            else
            {
                hoursWorked = 40;
                String[] fields;
                for(Worker w: workers)
                {
                    index++;
                    fields = w.toCSVDataString().split(","); // Split the record into the fields
                    if(fields.length == WORKER_FIELDS_LENGTH)
                    {
                        firstName = fields[1].trim();
                        lastName  = fields[2].trim();
                        String fullName = firstName + " " + lastName;
                        String weekCount = "Week " + week;
                        double payTotal = workers.get(index).calculateWeeklyPay(hoursWorked);
                        System.out.printf("%-7s%-20s%12.2f\n", weekCount, fullName, payTotal);
                    }
                    else if (fields.length == SWORKER_FIELDS_LENGTH)
                    {
                        firstName = fields[1].trim();
                        lastName  = fields[2].trim();
                        String fullName = firstName + " " + lastName;
                        String weekCount = "Week " + week;
                        double payTotal = workers.get(index).calculateWeeklyPay(hoursWorked);
                        System.out.printf("%-7s%-20s%12.2f\n", weekCount, fullName, payTotal);
                    }
                    else
                    {
                        System.out.println("Found a record that may be corrupt: ");
                        System.out.println(w);
                    }
                }
            }
        }
    }
}
