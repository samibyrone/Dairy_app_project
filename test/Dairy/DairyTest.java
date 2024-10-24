package Dairy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {

    private Dairy dairy;

    @BeforeEach
    public void setup(){
        dairy = new Dairy("Samibyrone", "Samibyrone2024");
    }

    @Test
    public void testNewDairyisUnlocked(){
        assertTrue(dairy.isUnlocked());
    }

    @Test
    public void testNewDairyisLocked(){
        dairy.locked();
        assertFalse(dairy.isUnlocked());
    }

    @Test
    public void test_newDairy_locked_can_be_unLocked(){
        dairy.locked();
        assertTrue(dairy.isUnlocked());
        dairy.unLockedWith("Correct-password");
        assertFalse(dairy.isUnlocked());
    }

    @Test
    public void
}
