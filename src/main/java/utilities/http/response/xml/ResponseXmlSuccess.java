package utilities.http.response.xml;

import java.io.Serializable;

/**
 * Represent a fail XML response.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public class ResponseXmlSuccess<T> extends ResponseXmlBase 
implements Serializable {
    
    public ResponseXmlSuccess() {        
    }
    
    public ResponseXmlSuccess(T content) {
        this(content, "");
    }

    public ResponseXmlSuccess(String message) {
        this(null, message);
    }

    public ResponseXmlSuccess(T content, String message) {
        super(content, true, message);
    }
    
}
