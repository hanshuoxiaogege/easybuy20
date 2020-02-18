package entity;

import java.io.Serializable;

public class easybuyOrderDetail implements Serializable {

    private int id;

    private int orderId;;

    private int productId;

    private int quantity;

    private double costcost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCostcost() {
        return costcost;
    }

    public void setCostcost(double costcost) {
        this.costcost = costcost;
    }

    public easybuyOrderDetail(int orderId, int productId, int quantity, double costcost) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.costcost = costcost;
    }

    public easybuyOrderDetail() {
        super();
    }
}
