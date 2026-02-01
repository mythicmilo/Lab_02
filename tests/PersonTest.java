import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    Person p1;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        p1 = new Person("000001", "Milo", "Anderson", "Mr.", 2005);
    }

    @org.junit.jupiter.api.Test
    void setID()
    {
        p1.setID("00000A");
        assertEquals("00000A", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName()
    {
        p1.setFirstName("Andrew");
        assertEquals("Andrew", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName()
    {
        p1.setLastName("Smith");
        assertEquals("Smith", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle()
    {
        p1.setTitle("Dr.");
        assertEquals("Dr.", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB()
    {
        p1.setYOB(2010);
        assertEquals(2010, p1.getYOB());
    }

    @org.junit.jupiter.api.Test
    void testToString()
    {
        assertEquals("Person{ID='000001', firstName='Milo', lastName='Anderson', title='Mr.', YOB=2005}", p1.toString());
    }

    @org.junit.jupiter.api.Test
    void toCSVDataString()
    {
        assertEquals("000001, Milo, Anderson, Mr., 2005", p1.toCSVDataString());
    }

    @org.junit.jupiter.api.Test
    void toJSONDataString()
    {
        assertEquals("{\"ID\":\"000001\",\"firstName\":\"Milo\",\"lastName\":\"Anderson\",\"title\":\"Mr.\",\"YOB\":\"2005\"}", p1.toJSONDataString());
    }

    @org.junit.jupiter.api.Test
    void toXMLDataString()
    {
        assertEquals("<Person><ID>000001</ID><firstName>Milo</firstName><lastName>Anderson</lastName><title>Mr.</title><YOB>2005</YOB></Person>", p1.toXMLDataString());
    }
}