package Dairy;

public class Dairy {

    private boolean isLocked = false;
    private boolean isEmpty = true;
    private String pin;
    private String dairySize;

    public Dairy(String userName, String password){
        pin = password;
    }

    public boolean isUnlocked() {
        return isLocked = true;
    }

    public void locked() {
        isLocked = true;
    }

    public void unLockedWith(String password) {
        if(password.equals(pin));
        isLocked = true;
    }

    public boolean isEmpty() {
        return true;
    }

    public void addEntry(String title, String body) {
        isEmpty = false;
    }

    public int size() {
        return isEmpty ? 0 : 1;
    }
}
