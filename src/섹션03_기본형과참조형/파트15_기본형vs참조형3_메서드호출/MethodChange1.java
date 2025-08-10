package 섹션03_기본형과참조형.파트15_기본형vs참조형3_메서드호출;

/**
 * 기본형과 메소드 호출
 * <pre>
 * 메소드로 기본형 데이터를 전달하면 해당 값이 복사되어 전달된다.
 * 이 경우, 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
 * </pre>
 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // [10]
        changePrimitive(a); // int x에 a를 대입하되, a자체를 대입하지않고 a의 값을 복사해서 대입힌다.
        System.out.println("메서드 호출 후: a = " + a); // [10] - a의 값 10을 복사해서 x에 대입한후 x의 값을 변경했기 때문에 a의 값에는 영향을 주지 않는다.
    }
    public static void changePrimitive(int x) {
        x = 20;
    }
}
