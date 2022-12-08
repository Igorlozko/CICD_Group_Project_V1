import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class carloancalcSuccessTest {
    private carloancalc myBuyer;

    @BeforeEach
    void setUp() {
        myBuyer= new carloancalc(10000, 4, 10, 4000);
    }
    @Test
    public void testamount_BorrowPass(){
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
        assertEquals(0, myBuyer.getdown_payement());
    }
    @Test
    void testcalcPass(){
        int remainingBalance = 10000 - 4000;
        int months = 4 * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * 10) / 100;
        int monthlyPayment = monthlyBalance + interest;
        double expectedresult = 135;
        assertEquals(expectedresult,carloancalc.result);
    }
    @AfterEach
    void tearDown() {
    }
}