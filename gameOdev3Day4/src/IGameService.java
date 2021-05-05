import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public interface IGameService {
    void add(Game game) throws MalformedURLException, ServiceException, Exception;
    void update(Game game);
    void delete(Game game);
   void sell(Game game,User user);
   void saleCampaing(Game game,User user,Campaing campaing);
}

