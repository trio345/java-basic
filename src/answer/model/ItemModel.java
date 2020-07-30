package answer.model;

public class ItemModel {

    public int id, price, qty;
    public String name;

    public ItemModel(int id, String name, int price, int qty){
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" + "\"id\":" + id + ", \"name\":\"" + name + "\"" + ", \"price\":\"" + price + "\"" + ", \"qty\":\"" + qty + "\"" +"}";
    }




}
