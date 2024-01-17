import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열 {
    public static void main(String[] args) {
        // 배열의 평균값 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double answer1 = 0;

        int sum = 0;
        for (int i: numbers1) {
            sum += i;
        }
        answer1 = sum / (double) numbers1.length;

        System.out.println(answer1);
        System.out.println(Arrays.stream(numbers1).average().orElse(0));

        // 배열 원소의 길이 : 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
        String[] strlist2 = {"We", "are", "the", "world!"};

        int[] answer2 = new int[strlist2.length];

        for (int i=0;i<strlist2.length;i++) {
            answer2[i] = strlist2[i].length();
        }

        System.out.println(Arrays.toString(answer2));


        // 배열 뒤집기 : 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
        int[] num_list3 = {1, 2, 3, 4, 5};

        int[] answer3 = new int[num_list3.length];

        for (int i=0;i<num_list3.length;i++) {
            answer3[num_list3.length -1 - i] = num_list3[i];
        }

        System.out.println(Arrays.toString(answer3));

        // 머쓱이보다 키큰 사람 : 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
        int[] array4 = {149, 180, 192, 170};
        int height4 = 167;

        int answer4 = 0;

        for (int i: array4) {
            if (i > height4)
                answer4++;
        }

        System.out.println(answer4);
        System.out.println(Arrays.stream(array4).filter(s->s>height4).count());

        // 배열의 유사도 : 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 sa과 sb가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
        String[] sa5 = {"a", "b", "c"};
        String[] sb5 = {"com", "b", "d", "p", "c"};

        int answer5 = 0;

        for (String s: sa5) {
            for (String ss: sb5) {
                if (s.equals(ss)) {
                    answer5++;
                }
            }
        }

        System.out.println(answer5);

        // 배열 자르기 : 정수 배열 numbers와 정수 numa, numb가 매개변수로 주어질 때, numbers의 numa1번 째 인덱스부터 numb2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
        int[] numbers6 = {1, 2, 3, 4, 5};
        int numa6 = 1;
        int numb6 = 3;

        int[] answer6 = new int[numb6 - numa6 + 1];

        for (int i = 0; i < numb6 - numa6 + 1 ; i++) {
            answer6[i] = numbers6[i + numa6];
        }

        //answer6 = Arrays.copyOfRange(numbers6, numa6, numb6 + 1);
        System.out.println(Arrays.toString(answer6));

        // 중앙 값 구하기 : 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
        int[] array7 = {1, 2, 7, 10, 11};
        int answer7 = 0;
        answer7 = Arrays.stream(array7).sorted().toArray()[array7.length / 2];
        //Arrays.sort(array7);
        //answer7 = array7[array7.length >> 1];

        System.out.println(answer7);


        // 인덱스 바꾸기 : 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
        String my_string8 = "hello";
        int numa8 = 1;
        int numb8 = 2;

        char[] ch8 = my_string8.toCharArray();

        ch8[numa8] = my_string8.charAt(numb8);
        ch8[numb8] = my_string8.charAt(numa8);

        String answer8 = String.valueOf(ch8);

        System.out.println(answer8);

        // 배열 회전 시키기 : 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.


    }
}
