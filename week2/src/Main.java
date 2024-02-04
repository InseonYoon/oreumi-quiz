public class Main {
    public static void main(String[] args) {
        Beauty cream = new Beauty();
        cream.name = "수분크림";
        cream.price = 100000;
        cream.weight = 4;

        System.out.println(cream.name + "의 배송비는 " + cream.getDeliveryCharge(cream.weight, cream.price) +"원 입니다.");
    }
}
