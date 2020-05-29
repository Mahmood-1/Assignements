package ass2;

public class LibraryItem {
    protected String title, auther;

    public LibraryItem(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "The title is " + title + " the auther is : " + auther;
    }
}