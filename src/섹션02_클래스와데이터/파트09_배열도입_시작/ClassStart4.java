package 섹션02_클래스와데이터.파트09_배열도입_시작;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student(); // 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
        /* .을 통해 필드 접근 및 값 할당 */
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
        /* .을 통해 필드 접근 및 값 할당 */
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3 = new Student(); // 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
        /* .을 통해 필드 접근 및 값 할당 */
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 70;

        /* Student 배열 생성 */
        Student[] students = new Student[3];
        /* 각 인덱스에 접근하여 stduent 객체 할당 */
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 점수:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 점수:" + students[1].grade);
        System.out.println("이름:" + students[2].name + " 나이:" + students[2].age + " 점수:" + students[2].grade);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student1 == students[0]" + (student1 == students[0]));
        System.out.println("student2 == students[1]" + (student2 == students[1]));
        System.out.println("student3 == students[2]" + (student3 == students[2]));
    }
}
