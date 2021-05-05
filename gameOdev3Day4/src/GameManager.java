import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public class GameManager implements IGameService {
    public GameManager() {
        super();
    }

    @Override
    public void add(Game game) throws MalformedURLException, ServiceException, Exception {
        System.out.println("Oyun Eklendi: "+game.gameName+ " "+game.getGameDetail+" "+game.getGamePrice());

    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun update: "+game.gameName+ " "+game.getGameDetail+" "+game.getGamePrice());

    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun delete: "+game.gameName+ " "+game.getGameDetail+" "+game.getGamePrice());

    }

    @Override
    public void sell(Game game, User user) {
        System.out.println("Oyun Satışı yapıldı: "+game.gameName+ " "+game.getGameDetail+" "+game.getGamePrice()+" Satın Alan kullanıcı: "+user.getFirstName()+" "+user.getLastName());
        System.out.println("----------------------------------------");
    }

    @Override
    public void saleCampaing(Game game, User user, Campaing campaing) {
        System.out.println(game.getGameName() + " isimli oyun " + user.getFirstName() + " tarafından " + campaing.getName() + " isimli kampanya ile " + campaing.getDiscountPercent() + "% indirimle " + (game.getGamePrice()-+(game.getGamePrice() * campaing.getDiscountPercent()/100)) + " TL'ye satıldı.");

    }
}
