import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class car_calcV2SuccessTest {
    private car_calcV2 myBuyer;
    @BeforeEach
    void setUp() {
        myBuyer= new car_calcV2(10000, 4, 10, 4000);
    }
    @Test
    void testamount_BorrowPass(){
        assertEquals(10000, myBuyer.getamount_Borrow());
    }
    @Test
    void testloan_lenghtPass(){
        assertEquals(4, myBuyer.getloan_lenght());
    }
    @Test
    void testinterest_ratePass(){
        assertEquals(10, myBuyer.getinterest_rate());
    }
    @Test
    void testdown_payementPass(){
        assertEquals(4000, myBuyer.getdown_payement());
    }
}