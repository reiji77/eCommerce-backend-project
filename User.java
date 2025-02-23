import java.util.List;

public class User {
    private int id;
    private String email;
    private String password;
    private List<Item> interactedItems;
    private List<Item> purchasedItems;
    private List<Item> cart;

    // Getters and Setters for each field
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Item> getInteractedItems() {
        return interactedItems;
    }

    public void setInteractedItems(List<Item> interactedItems) {
        this.interactedItems = interactedItems;
    }

    public List<Item> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<Item> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }
}
