import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class car_buyer_infoSuccessTest {
    private car_buyer_info myBuyer;
    @BeforeEach
    void setUp() {
        myBuyer= new car_buyer_info("Mr", "John Doe", 1234334567891L, 1233456789, 42);
    }
    @Test
    void testTitlePass(){
        assertEquals("Mr", myBuyer.getTitle());
        myBuyer.setTitle("Ms");
        assertEquals("Ms", myBuyer.getTitle());
        myBuyer.setTitle("Mrs");
        assertEquals("Mrs", myBuyer.getTitle());
    }
    @Test
    void testNamePass(){
        assertEquals("John Doe", myBuyer.getName());
    }
    @Test
    void testPhonePass(){
        assertEquals(1233456789, myBuyer.getPhone());
    }
    @Test
    void testAgePass(){
        assertEquals(42, myBuyer.getAge());
    }
}