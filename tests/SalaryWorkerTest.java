import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest
{
    SalaryWorker w1;

    @BeforeEach
    void setUp()
    {
        w1 = new SalaryWorker("00000A", "Jane", "Doe", "Ms.", 1995, 0, 65000);
    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(1250.0, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay()
    {
        w1.displayWeeklyPay(40);
    }

    @Test
    void testToString()
    {
        assertEquals("SalaryWorker{Worker{Person{ID='00000A', firstName='Jane', lastName='Doe', title='Ms.', YOB=1995}, hourlyPayRate=0.0}, annualSalary=65000.0}", w1.toString());
    }

    @Test
    void toCSVDataString()
    {
        assertEquals("00000A, Jane, Doe, Ms., 1995, 0.0, 65000.0", w1.toCSVDataString());
    }

    @Test
    void toJSONDataString()
    {
        assertEquals("{\"ID\":\"00000A\",\"firstName\":\"Jane\",\"lastName\":\"Doe\",\"title\":\"Ms.\",\"YOB\":\"1995\"},\"hourlyPayRate\":\"0.0\"},\"annualSalary\":\"65000.0\"}", w1.toJSONDataString());
    }

    @Test
    void toXMLDataString()
    {
        assertEquals("<SalaryWorker><Worker><Person><ID>00000A</ID><firstName>Jane</firstName><lastName>Doe</lastName><title>Ms.</title><YOB>1995</YOB></Person><hourlyPayRate>0.0</hourlyPayRate></Worker><annualSalary>65000.0</annualSalary></SalaryWorker>", w1.toXMLDataString());
    }
}