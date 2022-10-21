package docs;

public class DocumentChecker {

    public static void main(String[] args) {
        Document exceldoc = new ExcelDocument();
        Document pdfdoc = new PdfDocument();

        exceldoc.getDescription();
        pdfdoc.getDescription();
    }
}
