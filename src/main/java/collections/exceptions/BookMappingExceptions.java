package collections.exceptions;

public class BookMappingExceptions extends Exception{

    private String line;

    public BookMappingExceptions(String message){
        super(message);
        this.line = line;
    }

    public String getLine() {
        return line;
    }
}
