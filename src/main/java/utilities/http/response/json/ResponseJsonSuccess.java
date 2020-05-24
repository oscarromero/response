package utilities.http.response.json;

/**
 * Represents a success JSON response.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public class ResponseJsonSuccess<T> extends ResponseJsonBase {
    
    public ResponseJsonSuccess(T content) {
        this(content, "");
    }

    public ResponseJsonSuccess(String message) {
        this(null, message);
    }

    public ResponseJsonSuccess(T content, String message) {
        super(content, true, message);
    }
    
}
