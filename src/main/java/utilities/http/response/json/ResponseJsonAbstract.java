package utilities.http.response.json;

import com.google.gson.Gson;
import utilities.http.response.ContentTypes;
import utilities.http.response.ResponseAbstract;

/**
 * The base class for a JSON response.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public abstract class ResponseJsonAbstract<T> extends ResponseAbstract {
        
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
    
    @Override
    public String getContentType() {
        return ContentTypes.JSON;
    }
    
}
