import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public interface IUserService {
     void add(User user) throws MalformedURLException, ServiceException, Exception;
      void update(User user) throws Exception;
      void delete(User user) throws Exception;
}
