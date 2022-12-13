import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest
{
    BankAccount myAccount;

    @BeforeEach
    void setUp()
    {
        myAccount = new BankAccount("Connor","1234512345123451","08/24","963");
    }
    @Test
    void TestName()
    {
        myAccount.setName("Connor");
        assertEquals("Connor", myAccount.getName());
    }
    @Test
    void testNameFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myAccount.setName("Co");});
        assertEquals("This is not a valid name, name must have minimum 3 characters", exMessage.getMessage());
    }
    @Test
    void TestCardNumber()
    {
        myAccount.setName("1234512345123451");
        assertEquals("1234512345123451", myAccount.getCardNumber());
    }
    @Test
    void testCardNumberFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myAccount.setCardNumber("12345");});
        assertEquals("Card Number mus be 16 digits", exMessage.getMessage());
    }
    @Test
    void TestExpiredNumber()
    {
        myAccount.setName("08/24");
        assertEquals("08/24", myAccount.getExpiredNumber());
    }
    @Test
    void testExpiredNumberFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myAccount.setExpiredNumber("12/2002");});
        assertEquals("Enter the correct expiration data ??/??", exMessage.getMessage());
    }
    @Test
    void TestCvvNumber()
    {
        myAccount.setName("963");
        assertEquals("963", myAccount.getCvv());
    }
    @Test
    void testCvvFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myAccount.setCvv("2002");});
        assertEquals("The CVV code entered was  invalid", exMessage.getMessage());
    }
    @AfterEach
    void tearDown()
    {

    }
}
