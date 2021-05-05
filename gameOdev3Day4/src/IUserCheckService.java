import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public interface IUserCheckService {
    public  boolean checkIfRealsUser(User user) throws MalformedURLException, ServiceException;
}
