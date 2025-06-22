# [인프런] 김영한 실전 자바 기본편

# 클래스가 필요한 이유
<details>
<summary>접기/펼치기</summary>
<br>

자바는 클래스와 객체로 이루어져 있다.  
그만큼 클래스와 객체라는 개념은 중요하다.  
그런데 클래스와 객체는 너무 많은 내용을 포함하고 있어 한번에 이해하기가 쉽지 않다.  

## 문제: 학생 정보 출력 프로그램

- 요구사항
  1. 첫 번째 학생 이름은 "학생1", 나이는 15, 성적은 90이다.
  2. 두 번째 학생 이름은 "학생2", 나이는 16, 성적은 80이다.
  3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 한다. 
      `이름: [이름] 나이: [나이] 성적: [성적]`
  4. 변수를 사용하여 학생 정보를 저장하고 변수를 사용하여 학생 정보를 출력해야 한다.
- 예시 출력
  ```
  이름:학생1 나이:15 점수:90
  이름:학생2 나이:16 점수:80
  ```
- 풀이: [ClassStart1.java](src%2Fclass1%2FClassStart1.java)
  ```java
  package class1;

  public class ClassStart1 {
  public static void main(String[] args) {
  String student1Name = "학생1";
  int student1Age = 15;
  int student1Grade = 90;
  
          String student2Name = "학생2";
          int student2Age = 16;
          int student2Grade = 80;
  
          System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 점수:" + student1Grade);
          System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 점수:" + student2Grade);
      }
  }
  ```

  학생 2명을 다뤄야 하기 때문에 각각 다른 변수를 사용했다.  
  코드의 문제는 학생이 늘어날 때 마다 변수를 추가로 선언해야 하고, 또 출력하는 코드도 추가해야 한다.  
  ```java
  package class1;

  public class ClassStart1 {
      public static void main(String[] args) {
          String student1Name = "학생1";
          int student1Age = 15;
          int student1Grade = 90;
  
          String student2Name = "학생2";
          int student2Age = 16;
          int student2Grade = 80;
  
          String student2Name = "학생3";
          int student2Age = 17;
          int student2Grade = 70;
    
          System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 점수:" + student1Grade);
          System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 점수:" + student2Grade);
          System.out.println("이름:" + student3Name + " 나이:" + student3Age + " 점수:" + student3Grade);
      }
  }
  ```
  해당 문제점은 배열을 사용하면 해결할 수 있다.

### 배열 사용
- 학생 추가 전
  ```java
  package class1;

  public class ClassStart2 {
      public static void main(String[] args) {
          String[] studentNames = {"학생1", "학생2"};
          int[] studentAges = {15, 16};
          int[] studentGrades = {90, 80};
          for (int i = 0; i < studentNames.length; i++) {
              System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 점수:" + studentGrades[i]);
          }
      }
  }
  ```
  배열을 사용한 덕분에 학생이 추가되어도 배열에 학생의 데이터만 추가하면 된다.  
  이제 변수를 더 추가하지 않아도 되고, 출력 부분의 코드도 그대로 유지할 수 있다.
- 학생 추가 후
  ```java
  package class1;

  public class ClassStart2 {
      public static void main(String[] args) {
          String[] studentNames = {"학생1", "학생2", "학생3"};
          int[] studentAges = {15, 16, 17};
          int[] studentGrades = {90, 80, 70};
          for (int i = 0; i < studentNames.length; i++) {
              System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 점수:" + studentGrades[i]);
          }
      }
  }
  ```
### 배열 사용의 한계
배열을 사용해서 코드 변경을 최소화 하는데는 성공했지만, 한 학생의 데이터가 studentNames[], studentAges[], studentGrades[] 라는 3개의 배열에 나누어져 있다.    
따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다.  
예를 들어 학생2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서 제거해줘야 한다.  

한 학생의 데이터가 3개의 배열에 나누어져있기 땜누에 3개의 배열을 각각 변경해야 한다.  
또한 한 학생의 데이터를 관리하기 위해 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 한다.  
이렇게 하면 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다.  
배열을 활용한 위 코드는 컴퓨터가 볼 때는 아무 문제가 없지만, 사람이 관리하기에는 좋은 코드가 아니다.  

#### 정리
위와 같이 배열을 활용하여 이름, 나이, 성적을 각각 따로 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.  
사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는것이다.  
그리고 각각의 핵생 별로 본인의 이름, 나이, 성적을 관리하는 것이다.
<br>

</details>
<br>

# 클래스 도입
<details>
<summary>접기/펼치기</summary>
<br>

클래스를 사용해서 학생이라는 개념을 만들고, 각각의 학생 별로 본인의 이름, 나이, 성적을 관리한다.  

## [Student.java](src%2Fclass1%2FStudent.java) 클래스
```java
public class Student {
    String name;
    int age;
    int grade;
}
```
class 키워드를 사용해서 학생 클래스(Student)를 정의한다.  
학생 클래스는 내부에 이름(name), 나이(age), 성적(grade) 변수를 가진다.

이렇게 클래스에 정의한 변수들을 멤버 변수, 또는 필드라 한다.  
- 멤버 변수(Member Variable): 이 변수들은 특정 클래스에 소속된 `멤버`이기 때문에 `멤버 변수`라고 부른다.
- 필드(Field): 데이터 항목을 가리키는 정통적인 용어이다. 데이터베이스, 액셀 등에서 데이터 각각의 항목을 필드라 한다. 
- 자바에서 멤버 변수, 필드는 같은 뜻이다. 클래스에 소속된 변수를 뜻한다.  

### 클래스는 관례상 대문자로 시작하고 낙타표기법을 사용한다.  
이를 파스칼 표기법이라 한다.  
예) Student, User, MemberService

## 학생 클래스 활용
- [ClassStart3.java](src%2Fclass1%2FClassStart3.java)
  ```java
  public class ClassStart3 {
      public static void main(String[] args) {
  
          Student student1;
          student1 = new Student(); // 객체, 인스턴스: 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
          /* .을 통해 필드 접근 및 값 할당 */
          student1.name = "학생1";
          student1.age = 15;
          student1.grade = 90;
  
          Student student2;
          student2 = new Student(); // 객체, 인스턴스: 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
          /* .을 통해 필드 접근 및 값 할당 */
          student2.name = "학생2";
          student2.age = 16;
          student2.grade = 80;
  
          Student student3;
          student3 = new Student(); // 객체, 인스턴스: 학생 클래스를 실제 메모리에 만들고 변수에 할당한다.
          /* .을 통해 필드 접근 및 값 할당 */
          student3.name = "학생2";
          student3.age = 17;
          student3.grade = 70;
          System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 점수:" + student1.grade);
          System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 점수:" + student2.grade);
          System.out.println("이름:" + student3.name + " 나이:" + student3.age + " 점수:" + student3.grade);
      }
  }
  ```
- 실행 결과
  ```
  이름:학생1 나이:15 성적:90
  이름:학생2 나이:16 성적:80
  이름:학생3 나이:17 성적:70
  ```
### 클래스와 사용자 정의 타입
- 타입은 데이터의 종류나 형태를 나타낸다.
- int라고 하면 정수 타입, String이라고 하면 문자 타입이다.
- 학생(Student)이라는 타입을 만들면 되지 않을까?
- 클래스를 사용하면 int, String과 같은 타입을 직접 만들 수 있다.
- 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하며 자바에서는 *설계도*가 바로 **클래스**이다.
- 설계도인 클래스를 사용해서 *실제 메모리에 만들어진 실체*를 **객체** 또는 **인스턴스**라 한다.
- 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.

### 용어: 클래스, 객체, 인스턴스
클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.  
둘 다 같은 의미로 사용된다.  
여기서 학생(Student)클래스를 기반으로 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.  

## 코드 분석

### 1. 변수 선언  
#### Student student1 // Student 변수 선언  
![img_1.png](img_1.png) (변수 공간 할당)
- `Student student1`
  - Student 타입을 받을 수 있는 변수를 선언하다.
  - int는 정수를, String은 문자를 담을 수 있듯이 Student는 Student 타입의 객체(인스턴스)를 받을 수 있다.

### 2. 객체 생성
#### Studnet1 = new Student() // Student 인스턴스 생성
![img_2.png](img_2.png)![img_3.png](img_3.png) (메모리 공간 확보)

- `Student1 = new Student()`
  - 객체를 사용하려면 먼저 설계도인 클래스를 기반으로 객체(인스턴스)를 생성해야 한다.
  - `new Student()`: `new`는 새로 생성한다는 뜻이다. 
    - `new Student()`는 `Student` 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
    - 이렇게 하면메모리에 실제 `Student` 객체(인스턴스)를 생성해야 한다.
  - 객체를 생성할 때는 `new 클래스명()`을 사용하면 된다. 마지막에 `()`도 추가해야 한다.
  - `Student` 클래스는 `String name`, `int age`, `int grade` 멤버 변수를 가지고 있다.
    - 이 변수를 사용하는 데 필요한 메모리 공간도 함께 확보된다.
### 3. 참조값 보관
#### Studnet1 = x001 // Student 인스턴스 참조값 보관
![img_4.png](img_4.png)![img_5.png](img_5.png)
- 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소-`x100`)을 반환한다.
  - `x100` 이라고 표현한 것이 참조값이다. (실제로 x001처럼 표현되는 것은 아니고 이해를 돕기 위한 예시이다.)
- `new` 키워드를 통해 객체가 생성되고 나면 참조값을 반환한다.  
   앞서 선언한 변수인 Student student1에 생성된 객체의 참조값(x100)을 보관한다.
  - student1 변수는 방금 만든 객체에 접근할 수 있는 참조값을 가지고 있다.  
    따라서 이 변수를 통해서 객체를 접근(참조)할 수 있다.  
    쉽게 말해 student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용할 수 있다.

### 참조값을 변수에 보관해야 하는 이유
객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다.  
이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다.  
따라서 생성한 객체에 접근할 수 있는 방법이 필요하다.  
이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다.  
앞서 Student student1 변수에 참조값(x001)을 저장해두었으므로 저장한 참조값(x001)을 통해서 실제 메모리에 존재하는 객체에 접근할 수 있다.

```java
Student student1 = new Student(); // 1. Student 객체 생성
Student student1 = x001; // 2. new Student()의 결과로 x001 참조값 반환
student1 = x001; // 3. 최종 결과
```
이후 학생 (student2)까지 생성하면 다음과 같이 Student 객체(인스턴스)가 메모리에 2개 생성된다.  
각각 참조값이 다르므로 서로 구분할 수 있다.  
![img_6.png](img_6.png)

참조값을 확인하고 싶다면 다음과 같이 객체를 담고 있는 변수를 출력해보면 된다.
```java
System.out.println(student1);
System.out.println(student2);
```

**출력 결과**
```
class1.Student@66a29884
class1.Student@4769b07b
```

</details>
<br>


# 템플릿
<details>
<summary>접기/펼치기</summary>
<br>


##
<details>
<summary>접기/펼치기</summary>
<br>


</details>
<br>

</details>
<br>
