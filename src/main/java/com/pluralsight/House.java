package com.pluralsight;

public class House extends Asset{
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //region getters/setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    //endregion

    @Override
    public double getValue(){
        switch(condition){
            case 1:
                this.originalCost = 180.00 * this.squareFoot;
                break;
            case 2:
                this.originalCost = 130.00 * this.squareFoot;
                break;
            case 3:
                this.originalCost = 90.00 * this.squareFoot;
                break;
            case 4:
                this.originalCost = 80.00 * this.squareFoot;
                break;
            default:
                System.out.println("This condition is not an option");
                break;
        }
        return this.originalCost + (lotSize * 0.25);
    }
}
