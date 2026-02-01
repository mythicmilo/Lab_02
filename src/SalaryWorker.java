public class SalaryWorker extends Worker
{
    double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        double payTotal = annualSalary / 52;
        return payTotal;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked)
    {
        double payTotal = annualSalary / 52;
        System.out.println("Weekly pay (fraction of yearly salary): " + payTotal);
    }

    @Override
    public String toString()
    {
        return "SalaryWorker{" +
                super.toString() +
                "annualSalary" + annualSalary +
                "}";
    }
    @Override
    public String toCSVDataString()
    {
        return super.toCSVDataString() +
                "," + annualSalary;
    }

    @Override
    public String toJSONDataString()
    {
        return super.toJSONDataString() + ","
                + "\"annualSalary\":\"" +
                annualSalary + "\"" +
                "}";
    }

    @Override
    public String toXMLDataString()
    {
        return "<SalaryWorker>" +
                super.toXMLDataString() +
                "<annualSalary>" +
                annualSalary +
                "</annualSalary>" +
                "</SalaryWorker>";
    }
}
