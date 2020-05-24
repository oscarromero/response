package utilities.http.response;

/**
 * Interface that represents the response to be send back to the consumer.
 * 
 * @author oscarromero
 * @param <T> The object to return, for example, a CustomerDTO?...a LoginResultDTO?
 */
public interface IResponse<T> {
    boolean getStatus();
    String getMessage();
    T getContent();
    String getContentType();
}
