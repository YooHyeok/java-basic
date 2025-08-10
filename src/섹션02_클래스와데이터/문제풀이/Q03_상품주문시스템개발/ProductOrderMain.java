package 섹션02_클래스와데이터.문제풀이.Q03_상품주문시스템개발;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] pos = new ProductOrder[3];
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        ProductOrder po1 = new ProductOrder();
        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;
        pos[0] = po1;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "김치";
        po2.price = 5000;
        po2.quantity = 1;

        pos[1] = po2;

        ProductOrder po3 = new ProductOrder();
        po3.productName = "콜라";
        po3.price = 1500;
        po3.quantity = 2;
        pos[2] = po3;

        // 상품 주문 정보와 최종 금액 출력
        int totalPrice = 0;
        for (ProductOrder po : pos) {
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수랑: " + po.quantity);
            totalPrice += po.price * po.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
