import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DummyTest {
    @Test
    void  assertionWorked(){

        int  actual=1+1;

        int excepted= 2;

        assertEquals( actual,excepted);


    }
}
