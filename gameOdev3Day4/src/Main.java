import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
UserManager userManager=new UserManager(new MernisServiceAdapter());
User user= new User(1,"Bayram","Sürücü","12590767232", LocalDate.of(1994,06,22));
try {
    userManager.add(user);
    userManager.update(user);
    userManager.delete(user);
    System.out.println("-------------->------------>---------->");
}catch (Exception exception){
    exception.printStackTrace();

        }
        GameManager gameManager=new GameManager();
Game game=new Game(1,"BayramGame","Aksiyon",1500);
        CampaingManager campaingManager =new CampaingManager();
        Campaing campaing =new Campaing(1,1230,"Deli Kampanya","Sepette %25 indirim",25);
gameManager.add(game);
        gameManager.delete(game);
        gameManager.update(game);
        gameManager.sell(game,user);

        campaingManager.add(campaing);
        campaingManager.sale(campaing,game);
        gameManager.saleCampaing(game,user,campaing);
    }
}
