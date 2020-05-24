package utilities.http.response.xml;

/**
 * The base class for a JSON response.
 * Different kind of responses should be implement this class.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public class ResponseXmlBase<T> extends ResponseXmlAbstract {
    
    public ResponseXmlBase() {
    }
    
    public ResponseXmlBase(T content) {
        this(content, false, "");
    }
    
    public ResponseXmlBase(String message) {
        this(null, false, message);
    }
    
    public ResponseXmlBase(T content, boolean status, String message) {
        this.status = status;
        this.content = content;
        this.message = message;
    }    
    
}
