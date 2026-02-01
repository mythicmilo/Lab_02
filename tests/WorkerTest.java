import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest
{
    Worker w1;

    @BeforeEach
    void setUp()
    {
        w1 = new Worker("000001", "John", "Smith", "Mr.", 1990, 15);
    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(600, w1.calculateWeeklyPay(40));
        assertEquals(615, w1.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay()
    {
        w1.displayWeeklyPay(40);
        w1.displayWeeklyPay(50);
    }

    @Test
    void testToString()
    {
        assertEquals("Worker{Person{ID='000001', firstName='John', lastName='Smith', title='Mr.', YOB=1990}, hourlyPayRate=15.0}", w1.toString());
    }

    @Test
    void toCSVDataString()
    {
        assertEquals("000001, John, Smith, Mr., 1990, 15.0", w1.toCSVDataString());
    }

    @Test
    void toJSONDataString()
    {
        assertEquals("{\"ID\":\"000001\",\"firstName\":\"John\",\"lastName\":\"Smith\",\"title\":\"Mr.\",\"YOB\":\"1990\"},\"hourlyPayRate\":\"15.0\"}", w1.toJSONDataString());
    }

    @Test
    void toXMLDataString()
    {
        assertEquals("<Worker><Person><ID>000001</ID><firstName>John</firstName><lastName>Smith</lastName><title>Mr.</title><YOB>1990</YOB></Person><hourlyPayRate>15.0</hourlyPayRate></Worker>", w1.toXMLDataString());
    }
}