public class Worker extends Person
{
    double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double regularPay = 0;
        double payTotal = 0;
        if (hoursWorked > 40)
        {
            double overtime = hoursWorked - 40;
            double OTPay = overtime * 1.5;
            regularPay = 40 * hourlyPayRate;
            payTotal = regularPay + OTPay;
        }
        else
        {
            payTotal = hoursWorked * hourlyPayRate;
        }
        return payTotal;
    }

    public void displayWeeklyPay(double hoursWorked)
    {
        double regularPay = 0;
        double payTotal = 0;
        if (hoursWorked > 40)
        {
            double overtime = hoursWorked - 40;
            double OTPay = overtime * 1.5;
            regularPay = 40 * hourlyPayRate;
            payTotal = regularPay + OTPay;
            System.out.println("Number of regular hours: " + 40);
            System.out.println("Regular pay: " + regularPay);
            System.out.println("Number of overtime hours: " + overtime);
            System.out.println("Overtime pay: " + OTPay);
            System.out.println("Total combined pay: " + payTotal);
        }
        else
        {
            regularPay = hoursWorked * hourlyPayRate;
            System.out.println("Number of regular hours: " + hoursWorked);
            System.out.println("Total pay: " + regularPay);
        }
    }
    @Override
    public String toString()
    {
        return "Worker{" +
                super.toString() + ", " +
                "hourlyPayRate=" + hourlyPayRate +
                "}";
    }

    @Override
    public String toCSVDataString()
    {
        return super.toCSVDataString() +
                ", " + hourlyPayRate;
    }

    @Override
    public String toJSONDataString()
    {
        return super.toJSONDataString() + ","
                + "\"hourlyPayRate\":\"" +
                hourlyPayRate + "\"" +
                "}";
    }

    @Override
    public String toXMLDataString()
    {
        return "<Worker>" +
                super.toXMLDataString() +
                "<hourlyPayRate>" +
                hourlyPayRate +
                "</hourlyPayRate>" +
                "</Worker>";
    }
}
