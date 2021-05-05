public class CampaingManager implements ICampaningService{
    @Override
    public void add(Campaing campaing) {
        System.out.println("Kampanya Eklendi: "+campaing.getCampanyCode()+" "+campaing.getName()+" "+campaing.getDetail()+" "+campaing.getDiscountPercent());

    }

    @Override
    public void update(Campaing campaing) {
        System.out.println("Kampanya Güncellendi: "+campaing.getCampanyCode()+" "+campaing.getName()+" "+campaing.getDetail()+" "+campaing.getDiscountPercent());

    }

    @Override
    public void delete(Campaing campaing) {
        System.out.println("Kampanya Silindi: "+campaing.getCampanyCode()+" "+campaing.getName()+" "+campaing.getDetail()+" "+campaing.getDiscountPercent());

    }

    @Override
    public void sale(Campaing campaing, Game game) {
        System.out.println("Oyunun kampanya Satış Detayı: "+campaing.getCampanyCode()+" "+campaing.getName()+'\n' +"Kampanya Oranı: "+"Ürün Fiyatı: "+campaing.getDiscountPercent()+"%"+'\n' +
                        game.getGamePrice()+'\n' + "İndirim Tutarı: "+(game.getGamePrice() * campaing.getDiscountPercent()/100)  + '\n'+"Kampanya Uygulandıktan Sonraki Fiyatı: "+(game.getGamePrice()-+(game.getGamePrice() * campaing.getDiscountPercent()/100)));

                System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
    }

