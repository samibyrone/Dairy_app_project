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
    public void test_newDairy_isUnlocked(){
        assertTrue(dairy.isUnlocked());
    }

    @Test
    public void testThat_newDairy_isLocked(){
        dairy.locked();
        assertTrue(dairy.isUnlocked());
    }

    @Test
    public void test_newDairy_locked_can_be_unLocked(){
        dairy.locked();
        assertTrue(dairy.isUnlocked());
        dairy.unLockedWith("Correct-password");
        assertTrue(dairy.isUnlocked());
    }

    @Test
    public void test_newDairy_can_add_newEntry_to_empty_dairy(){
        dairy.isUnlocked();
        dairy.unLockedWith("Correct-password");
        assertTrue(dairy.isEmpty());
        dairy.addEntry("title", "body");
        assertFalse(dairy.isEmpty());
        assertEquals(1, dairy.size());
    }
}
