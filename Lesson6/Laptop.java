package lesson6.homeWork;


public class Laptop {
    public String Brand;
    public String Color;

    public Laptop(String Brand, String Color){
        this.Brand = Brand;
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Laptop -> {" +
                "Brand = '" + Brand + '\'' +
                ", Color = '" + Color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return laptop.Brand.equals(this.Brand) && laptop.Color.equals(this.Color);
    }

    @Override
    public int hashCode() {
        final int prime = 31; //31- любое число
        int result = 1;
        result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
        result = prime * result + ((Color == null) ? 0 : Color.hashCode());
        return result;
    }
}
