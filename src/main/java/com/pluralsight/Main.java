package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHome = new House("3 story brick home",
                "08/26/2020",
                690000.00,
                "3602 Willett Avenue",
                2,
                2860,
                1894
        );
        assets.add(myHome);

        House vacayHome = new House("3 story modern vacation mansion",
                "03/28/2040",
                99950000.00,
                "1200 Bel Air Rd, Los Angeles, CA 90077",
                1,
                22000,
                90605
        );
        assets.add(vacayHome);

        Vehicle myCar = new Vehicle("a sleek mountain grey coupe",
                "11/11/2023",
                57800,
                "Mercedes-AMG CLA Coupe",
                2023,
                60000
        );
        assets.add(myCar);

        Vehicle dreamCar = new Vehicle("a sleek black electric convertible",
                "08/15/2038",
                185000,
                "Audi R8 V10 Performance Spyder RWD",
                2025,
                0
        );

        assets.add(dreamCar);

        for(Asset a: assets){
            System.out.printf("\n%s || %s || %.2f || %.2f", a.description, a.dateAcquired, a.originalCost, a.getValue());

            if (a instanceof House){
                House newHouse = (House)a;
                System.out.printf("\n%s || %.2f", newHouse.getAddress(), newHouse.getValue());
            } else if (a instanceof Vehicle){
                Vehicle newVehicle = (Vehicle) a;
                System.out.printf("\n%s || %d", newVehicle.getMakeModel(), newVehicle.getYear());
            }
        }


    }
}
