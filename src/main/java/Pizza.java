public class Pizza {
    private String dough;
    private String topping;
    private String saouce;


    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSaouce(String saouce) {
        this.saouce = saouce;
    }

    public String getDough() {
        return dough;
    }

    public String getTopping() {
        return topping;
    }

    public String getSaouce() {
        return saouce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", topping='" + topping + '\'' +
                ", saouce='" + saouce + '\'' +
                '}';
    }
}
