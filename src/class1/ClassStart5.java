package class1;

public class ClassStart5 {
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

        /* Student 배열 생성 및 할당 */
//        Student[] students = new Student[] {student1, student2, student3};
        Student[] students = {student1, student2, student3}; // 최적화 가능

        /* Loop - index 증가 */
        /*for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 점수:" + students[i].grade);
        }*/

        /* Loop - index 증가: 변수 할당 */
        /*for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("이름:" + student.name + " 나이:" + student.age + " 점수:" + student.grade);
        }*/

        /* Loop - 향상된 for문: iter */
        for (Student stduent: students) {
            System.out.println("이름:" + stduent.name + " 나이:" + stduent.age + " 점수:" + stduent.grade);
        }

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        for (int i = 0; i < students.length; i++) {
            Student student = null;
            switch (i) {
                case 0:
                    student = student1;
                    break;
                case 1:
                    student = student2;
                    break;
                case 2:
                    student = student3;
                    break;
            }
            System.out.println("student3 == students["+i+"]" + (student == students[i]));
        }

    }
}
