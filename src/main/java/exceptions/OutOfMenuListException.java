package exceptions;

import java.io.IOException;

public class OutOfMenuListException extends IOException {
    public OutOfMenuListException(String message){
        super(message);
    }
}
