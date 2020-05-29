package ass2;

public class CD extends LibraryItem {
    private int duration;
    private int playerType;

    public CD(String title, String auther, int duration, int playerType) {
        super(title, auther);
        this.playerType = playerType;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + " the playerType " + playerType + " the duration " + duration;
    }
}