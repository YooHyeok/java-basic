package 섹션02_클래스와데이터.파트06_클래스도입;

public class ClassStart3 {
    public static void main(String[] args) {

        Student student1;
        student1 = new Student(); // 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
        /* .을 통해 필드 접근 및 값 할당 */
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student(); // 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
        /* .을 통해 필드 접근 및 값 할당 */
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3;
        student3 = new Student(); // 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
        /* .을 통해 필드 접근 및 값 할당 */
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 70;
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 점수:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 점수:" + student2.grade);
        System.out.println("이름:" + student3.name + " 나이:" + student3.age + " 점수:" + student3.grade);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
    }
}
