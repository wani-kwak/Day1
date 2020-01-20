import java.util.Scanner;

public class ArrayEx1 {

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static int min(int a, int b){
        return a < b ? b : a; // 최소값 구하기?
    }


    public static void main(String args[]){
       int total = 0;

        // 입력한 값에서 최대, 최소값 구하기

        System.out.println("국어점수 평균 구하는 프로그램");

        int[] scoreArray = new int[10]; // 10명 값 입력 받을수 있는 배열 생성

        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < scoreArray.length ; i++){ 
        	System.out.println(i+"번째 점수를 입력하세요");
            scoreArray[i] = scan.nextInt(); // 국어점수 입력받기 10번 동안
            total += scoreArray[i]; // 합계 구하기
        }
        
        //최대값 구하기
        int result = -1;
        for(int i = 0 ; i < scoreArray.length ; i++){
            result = max(result , scoreArray[i]);
        }
        
        //최소값 구하기
//        int result2 = 101;
//        for(int i = 0 ; i < scoreArray[i] ; i++){
//            result2 = min(result2, scoreArray[i]);
//        }
        
        //평균값 구하기
        int avg = total/scoreArray.length;

        System.out.println("총 국어점수의 합 :"+total+"점");
        System.out.println("국어점수 평균은? :"+avg+"점");

        System.out.println("최대값 :"+result);
//        System.out.println("최소값 :"+result2); // 에러발생 ㅠㅠ


    }
}