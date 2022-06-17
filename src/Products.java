
public class Products {
    private String type;
    private String name;
    private int BoxVolume;
    private int Weight;

    public Products(String type, String name, int boxVolume, int weight) {
        this.type = type;
        this.name = name;
        BoxVolume = boxVolume;
        Weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoxVolume() {
        return BoxVolume;
    }

    public void setBoxVolume(int boxVolume) {
        BoxVolume = boxVolume;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s | Бренд: %s | Объем Коробки  %s | Объем продукта %s \n",
                this.type,
                this.name,
                this.BoxVolume,
                this.Weight);


    }
}

