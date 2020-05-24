package utilities.http.response.xml;

import java.io.Serializable;

/**
 * Represent a fail XML response.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public class ResponseXmlFail<T> extends ResponseXmlBase 
implements Serializable {
    public ResponseXmlFail() {        
    }
    
    public ResponseXmlFail(T content) {
        this(content, "");
    }

    public ResponseXmlFail(String message) {
        this(null, message);
    }

    public ResponseXmlFail(T content, String message) {
        super(content, false, message);
    }
    
}
