package collection.collection.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmploeeNofFoundException extends RuntimeException{
    public EmploeeNofFoundException() {
    }

    public EmploeeNofFoundException(String message) {
        super(message);
    }

    public EmploeeNofFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmploeeNofFoundException(Throwable cause) {
        super(cause);
    }

    public EmploeeNofFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
