package insper.collie.account.exceptions;


public class EmailAlreadyExistsException extends RuntimeException{
    
    public EmailAlreadyExistsException(String id){
        super("Account with email " + id + " already exists.");
    }
}
