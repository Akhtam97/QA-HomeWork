public class Product {
    private String type;
    private String name;
    private int volumeBox;
    private int volumeProduct;

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

    public int getVolumeBox() {
        return volumeBox;
    }

    public void setVolumeBox(int volumeBox) {
        this.volumeBox = volumeBox;
    }

    public int getVolumeProduct() {
        return volumeProduct;
    }

    public void setVolumeProduct(int volumeProduct) {
        this.volumeProduct = volumeProduct;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s | Бренд: %s | Объем Коробки  %s | Объем продукта %s \n"  ,
                this.type,
                this.name,
                this.volumeBox,
                this.volumeProduct);
    }
}

