import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class car_calcV2FailTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void testamount_BorrowFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_calcV2(0, 7, 55, 0);});
        assertEquals("Borrow amount must be more than 0", exMessage.getMessage());
    }
    @Test
    void testloan_lenghtFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_calcV2(0, 7, 55, 0);});
        assertEquals("Loan lenght must be between 1 and 5", exMessage.getMessage());
    }
    @Test
    void testinterest_rateFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_calcV2(0, 7, 55, 0);});
        assertEquals("Interest rate must be between 1 and 23 %", exMessage.getMessage());
    }
    @Test
    void testdown_paymentFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_calcV2(0, 7, 55, 0);});
        assertEquals("Down payment must be more than 0", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}