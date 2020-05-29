package ass2;

public class Book extends LibraryItem {
    private String issudeDate;
    private String printOutNo;

    public Book(String title, String auther, String issuedDate, String printOutNo) {
        super(title, auther);
        this.issudeDate = issuedDate;
        this.printOutNo = printOutNo;
    }

    @Override
    public String toString() {
        return super.toString() + " the issued date " + issudeDate + " the printOutNo " + printOutNo;
    }
}