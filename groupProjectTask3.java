public class test3 {
    public static void main(String[] args) {
        Car[] cars = {new Sedan(35000, 14),
                new Truck(60000, 5440)
        };
        for (Car carDiscount : cars) {
            System.out.println("the actual price: " + carDiscount.carPrice +
                    ", the discounted price is: " + carDiscount.calculateSalePrice());
        }
    }
}
class Car {
    double carPrice;
    String color;

    Car(double carPrice) {
        this.carPrice = carPrice;
    }

    double calculateSalePrice() {
        return 0;
    }
}

class Sedan extends Car {
    int length;

    Sedan(double carPrice, int length) {
        super(carPrice);
        this.length = length;
    }

    double calculateSalePrice() {
        if (length > 20) {
            return (carPrice - (carPrice* 5 / 100));
        } else {
            return (carPrice - (carPrice * 10 / 100));
        }
    }
}
class Truck extends Car {
    int weight;

    Truck(double carPrice, int weight) {
        super(carPrice);
        this.weight = weight;
    }

    double calculateSalePrice() {
        if (weight > 2000) {
            return (carPrice - (carPrice * 10 / 100));
        } else {
            return (carPrice - (carPrice * 20 / 100));
        }
    }
}