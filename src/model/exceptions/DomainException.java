package model.exceptions;

public class DomainException extends RuntimeException{
    //runtime exception, o compilador não obriga a tratar
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
