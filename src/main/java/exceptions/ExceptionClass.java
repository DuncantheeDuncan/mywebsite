package exceptions;

public class ExceptionClass extends Exception {
    private String exMessage;
    ExceptionClass(String exMessage){
        this.exMessage = exMessage;
    }

    @Override
    public String getMessage() {
        return exMessage;
    }
}
