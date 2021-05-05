import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public class UserManager implements IUserService{
    private IUserCheckService _userCheckService;
    public UserManager(IUserCheckService checkService) {

        this._userCheckService=checkService;
    }

    @Override
    public void add(User user) throws Exception {
 if (_userCheckService.checkIfRealsUser(user)){

     System.out.println("User kaydedildi"+" "+user.getFirstName()+" "+user.getLastName() +" "+user.getDateofBirth());
 } else {
     throw new Exception("Not a valid person");
 }
    }

    @Override
    public void update(User user) throws Exception {
        if (_userCheckService.checkIfRealsUser(user)){

            System.out.println("User kaydedildi"+" "+user.getFirstName()+" "+user.getLastName() +" "+user.getDateofBirth());
        } else {
            throw new Exception("Not a valid person");
        }
    }



    @Override
    public void delete(User user) throws Exception {
        if (_userCheckService.checkIfRealsUser(user)){

            System.out.println("User kaydedildi"+" "+user.getFirstName()+" "+user.getLastName() +" "+user.getDateofBirth());
        } else {
            throw new Exception("Not a valid person");
        }
    }


}
