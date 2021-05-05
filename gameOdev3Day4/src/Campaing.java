public class Campaing {
    int id;
    int campanyCode;
    String name;
    String detail;
    double discountPercent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCampanyCode() {
        return campanyCode;
    }

    public void setCampanyCode(int campanyCode) {
        this.campanyCode = campanyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Campaing(int id, int campanyCode, String name, String detail, double discountPercent) {
        this.id = id;
        this.campanyCode = campanyCode;
        this.name = name;
        this.detail = detail;
        this.discountPercent = discountPercent;

    }
}
