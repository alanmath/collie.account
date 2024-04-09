package insper.collie.account.exceptions;


public class EmailOrPasswordIncorrectException extends RuntimeException{
    
    public EmailOrPasswordIncorrectException(){
        super("Email or Password incorrect.");
    }
}
