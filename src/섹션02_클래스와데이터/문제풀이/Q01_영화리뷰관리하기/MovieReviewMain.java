package 섹션02_클래스와데이터.문제풀이.Q01_영화리뷰관리하기;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview mr1 = new MovieReview();
        mr1.title = "인셉션";
        mr1.review = "인생은 무한루프";

        MovieReview mr2 = new MovieReview();
        mr2.title = "어바웃 타임";
        mr2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + mr1.title + ", 리뷰: " + mr1.review);
        System.out.println("영화 제목: " + mr2.title + ", 리뷰: " + mr2.review);

    }
}
