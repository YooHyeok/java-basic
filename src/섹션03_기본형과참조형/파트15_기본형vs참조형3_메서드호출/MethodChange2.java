package 섹션03_기본형과참조형.파트15_기본형vs참조형3_메서드호출;

/**
 * 참조형과 메소드 호출
 * <pre>
 * 메서드로 참조형 데이터를 전달하면 `참조값`이 복사되어 전달된다.
 * 이 경우, 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
 * </pre>
 */
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // [10]
        changePrimitive(dataA); // dataX에 dataA를 대입하되, dataA자체를 대입하지않고 dataA의 참조(주소)값을 복사해서 대입힌다.
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // [20] - dataA의 참조(주소)값을 복사해서 dataX에 대입했기 때문에 동일한 참조 주소를 갖게되므로 dataX의 값을 변경할 경우 dataA의 값도 변경된다.
    }
    public static void changePrimitive(Data dataX) {
        dataX.value = 20;
    }
}
