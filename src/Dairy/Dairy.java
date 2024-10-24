package Dairy;

public class Dairy {

    private boolean isLocked = false;
    private boolean isEmpty = true;
    private String pin;
    private String dairySize;

    public Dairy(String username, String password){
        pin = password;
    }

    public boolean isUnlocked() {
        return false;
    }

    public void locked() {
    }

    public void unLockedWith(String password) {
        if(password.equals(pin)) return true;
        if pin.equals("")
    }
}
