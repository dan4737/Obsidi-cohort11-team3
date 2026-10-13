package AISLOP;

public class storeOrderSystem {
    private double discountRate = 0.10;


    // method to check if the order can even be processed
    public void processingProduct(String name, int quantity, double price) {
        if(isProcessed(name, quantity, price)) {
            double discount = calculateDiscount(price);
            System.out.println("Processing " + name);
            System.out.println("Discount: " + discount);
        }
    }

    private boolean isProcessed(String name, int quantity, double price) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        if (quantity <= 0) {
            System.out.println("Invalid Stock");
            return false;
        }
        if (price <= 0) {
            System.out.println("Invalid Price");
            return false;
        }
        return true;
    }

     private double calculateDiscount(double price) {
        if( price <=100){
            return 0.00;
        }
        return price * discountRate;
    }
}


//            if (!n.isEmpty()) {
//                if (s > 0) {
//                    if (p > 0.0) {
//                        System.out.println("Processing " + n);
//                        double d = 0.0;
//                        if (p > 100.0) {
//                            d = p * 0.1;
//                        }
//                        System.out.println("Discount: " + d);
//                    } else {
//                        System.out.println("Invalid price");
//                    }
//                } else {
//                    System.out.println("Invalid stock");
//                }
//            }
//        }
//    }
//}
