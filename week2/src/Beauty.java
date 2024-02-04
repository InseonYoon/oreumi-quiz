public class Beauty extends Product implements DeliveryChargeCalculator{

    @java.lang.Override
    public int getDeliveryCharge(double weight, int price) {
        int deliveryFee = 0;

        if(weight < 3){
            deliveryFee = 1000;
        }else if(weight < 10){
            deliveryFee = 5000;
        }else{
            deliveryFee = 10000;
        }

        if(price >= 100000){
            deliveryFee = 0;
        }
        else if(price >= 30000 && price < 100000){
            deliveryFee -= 1000;
        }

        return deliveryFee;
    }
}
