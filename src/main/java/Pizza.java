public class Pizza {
    private String dough;
    private String topping;
    private String saouce;

    public Pizza(String dough, String topping, String saouce) {
        this.dough = dough;
        this.topping = topping;
        this.saouce = saouce;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSaouce(String saouce) {
        this.saouce = saouce;
    }
}
