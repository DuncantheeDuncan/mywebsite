package exceptions;

public class CheckNumberException extends ExceptionClass{
    private String exMessage;

    public CheckNumberException(String exMessage){
        super(exMessage);
        this.exMessage = exMessage;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
