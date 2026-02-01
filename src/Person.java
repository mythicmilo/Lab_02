import java.util.Calendar;

public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    //Constructor

    public Person(String ID, String firstName, String lastName, String title, int YOB)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    //Getters & Setters

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYOB()
    {
        return YOB;
    }

    public void setYOB(int YOB)
    {
        this.YOB = YOB;
    }

    //toString() method

    @Override
    public String toString()
    {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String toCSVDataString()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getFormalName()
    {
        return title + " " + firstName + " " + lastName;
    }

    public String getAge()
    {
        Calendar currentYear = Calendar.getInstance();
        int year = currentYear.get(Calendar.YEAR);
        int age = year - YOB;
        return Integer.toString(age);
    }

    public String getAge(int year)
    {
        int howOld = year - YOB;
        return Integer.toString(howOld);
    }

    public String toJSONDataString()
    {
        return "{" +
                "\"ID\":\"" + ID + "\"," +
                "\"firstName\":\"" + firstName + "\"," +
                "\"lastName\":\"" + lastName + "\"," +
                "\"title\":\"" + title + "\"," +
                "\"YOB\":\"" + YOB + "\"" +
                "}";
    }

    public String toXMLDataString()
    {
        return "<Person>" +
                "<ID>" + ID + "</ID>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</Person>";
    }
}
