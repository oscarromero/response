package utilities.http.response.xml;

import java.io.Serializable;
import com.thoughtworks.xstream.XStream;
import utilities.http.response.ContentTypes;
import utilities.http.response.ResponseAbstract;

/**
 * The base class for a XML response.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public abstract class ResponseXmlAbstract<T> extends ResponseAbstract
implements Serializable 
{
    @Override
    public String toString() {
        String result = "";
        try {
            XStream xstream = new XStream();
            xstream.alias("response", this.getClass());
            result = xstream.toXML(this);
        } catch (Exception ex) {
            result = ex.getMessage();
        }
        
        return result;
    }
    
    @Override
    public String getContentType() {
        return ContentTypes.XML;
    }
    
}
