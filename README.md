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
