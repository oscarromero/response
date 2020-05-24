package utilities.http.response.json;

/**
 * Represent a fail JSON response.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public class ResponseJsonFail<T> extends ResponseJsonBase {
    
    public ResponseJsonFail(T content) {
        this(content, "");
    }

    public ResponseJsonFail(String message) {
        this(null, message);
    }

    public ResponseJsonFail(T content, String message) {
        super(content, false, message);
    }
    
}
