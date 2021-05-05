import tcdogrulama.KPSPublicLocator;
import tcdogrulama.KPSPublicSoap_PortType;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.time.LocalDate;

public class MernisServiceAdapter implements IUserCheckService {
    private KPSPublicSoap_PortType soap;
    @Override
    public boolean checkIfRealsUser(User user) throws MalformedURLException, ServiceException {
        KPSPublicLocator service =new KPSPublicLocator();
        final URL url = new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl");
        soap = service.getKPSPublicSoap(url);
        boolean result=true;
        try{
            result=soap.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toLowerCase(),user.getLastName().toLowerCase(),user.getDateofBirth().getYear());

        }catch (NumberFormatException exception){
            exception.printStackTrace();
        }catch (RemoteException exception){
            exception.printStackTrace();
        }
        return result;
    }
}
