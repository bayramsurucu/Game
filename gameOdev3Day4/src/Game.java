public class Game {
    int id;
    String gameName;
    String getGameDetail;
    double gamePrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGetGameDetail() {
        return getGameDetail;
    }

    public void setGetGameDetail(String getGameDetail) {
        this.getGameDetail = getGameDetail;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public Game(int id, String gameName, String getGameDetail, double gamePrice) {
        this.id = id;
        this.gameName = gameName;
        this.getGameDetail = getGameDetail;
        this.gamePrice = gamePrice;

    }
}
