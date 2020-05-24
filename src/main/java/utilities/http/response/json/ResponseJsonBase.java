package utilities.http.response.json;

/**
 * The base class for a JSON response.
 * Different kind of responses should be implement this class.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public class ResponseJsonBase<T> extends ResponseJsonAbstract {
    
    public ResponseJsonBase(T content) {
        this(content, false, "");
    }
    
    public ResponseJsonBase(String message) {
        this(null, false, message);
    }
    
    public ResponseJsonBase(T content, boolean status, String message) {
        this.status = status;
        this.content = content;
        this.message = message;
    }    
    
}
