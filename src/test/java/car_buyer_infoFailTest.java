import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class car_buyer_infofailTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_buyer_info("Mister", "John Doe", 1235473822, 1222222223, 19);});
        assertEquals("This is not a valid name. Use Mr, Ms or Mrs.", exMessage.getMessage());
    }
    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_buyer_info("Mr", "ls", 1235422173822L, 1222222223, 19);});
        assertEquals("This is not a valid name.", exMessage.getMessage());
    }
    @Test
    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_buyer_info("Mr", "John Doe", 123542, 1222222223, 19);});
        assertEquals("This is not a valid ID.", exMessage.getMessage());
    }
    @Test
    void testPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_buyer_info("Mr", "John Doe", 1235423221213L, 122222, 19);});
        assertEquals("This is not a valid phone number.", exMessage.getMessage());
    }
    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new car_buyer_info("Mr", "John Doe", 1235423243243L, 1222222223, 13);});
        assertEquals("You must be over 16.", exMessage.getMessage());
    }
}