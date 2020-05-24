package utilities.http.response;

/**
 * Base class that can be implemented for different supported formats.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public abstract class ResponseAbstract<T> implements IResponse {
    
    protected boolean status = false;
    protected String message = " ";    
    protected T content;
    
    @Override
    public boolean getStatus() {
        return status;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    @Override
    public T getContent() {
        return content;
    }

    @Override
    public String getContentType() {
        try {
            throw new Exception("Inherit this class and implement me.");
        } catch (Exception ex) {
            String className = ResponseAbstract.class.getName();
        }
        
        return null;
    }
}
