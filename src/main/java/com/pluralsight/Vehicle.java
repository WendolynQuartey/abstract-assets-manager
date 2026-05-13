package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle extends Asset{
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //region getters/setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //endregion

    @Override
    public double getValue(){
        int yearsOld = LocalDateTime.now().getYear() - this.year;
        if(yearsOld >= 0 && yearsOld <= 3) {this.originalCost *= 0.97;}
        else if (yearsOld >= 4 && yearsOld <= 6) {this.originalCost *= 0.94;}
        else if (yearsOld >= 7 && yearsOld <= 10) {this.originalCost *= 0.92;}
        else if (yearsOld >= 10) {this.originalCost = 1000;}
        else {System.out.println("This condition is not an option");}

        if (odometer >= 100000 && (!makeModel.contains("Honda") || !makeModel.contains("Toyota"))){
            this.originalCost *= .75;
        }

        return this.originalCost;
    }
}
