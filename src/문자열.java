import java.util.Arrays;
import java.util.stream.Stream;

public class 문자열 {
    public static void main(String[] args) {
        // 특정 문자 제거 : 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
        String my_string1 = "abcdef";
        String letter = "f";

        String answer1 = my_string1.replace(letter, "");

        System.out.println(answer1);

        // 문자열 뒤집기 :
        String my_string2 = "jaron";
        String answer2 = "";

        for (int i=0;i<my_string2.length();i++) {
            answer2 += my_string2.charAt(my_string2.length() -1 -i);
        }

        System.out.println(answer2);
        //System.out.println(new StringBuilder(my_string2).reverse());

        // 편지지 : 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
        String message3 = "happy birthday!";

        int answer3 = message3.length() * 2;

        System.out.println(answer3);

        // 문자열 안에 문자열 : 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
        String stra4 = "ab6CDE443fgh22iJKlmn1o";
        String strb4 = "6CD";

        System.out.println(stra4.contains(strb4) ? 1 : 2);

        // 모음 제거 : 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
        String my_string5 = "nice to meet you";

        String answer5 = my_string5.replaceAll("[aeiou]", "");

        System.out.println(answer5);

        // 문자 반복 출력 : 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
        String my_string6 = "hello";
        int n6 = 3;
        String answer6 = "";

        for (int i = 0; i < my_string6.length(); i++) {
            for (int j = 0; j < n6; j++) {
                answer6 += my_string6.charAt(i);
            }
        }

        System.out.println(answer6);

        // 숨어있는 숫자의 덧셈 : 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
        String my_string7 = "aAb1B2cC34oOp";
        int answer7 = 0;

        //my_string7.replaceAll("[^\\d]", "")
        for (char c: my_string7.replaceAll("[^0-9]", "").toCharArray()) {
            answer7 += c - 48;
        }

        System.out.println(answer7);

        // 대문자와 소문자 : 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
        String my_string8 = "cccCCC";
        String answer8 = "";


        for (char c: my_string8.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer8 += Character.toLowerCase(c);
            } else {
                answer8 += Character.toUpperCase(c);
            }
        }

        System.out.println(answer8);

        // 가위 바위 보 : 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
        String rsp9 = "205";
        String answer9 = "";

        for (char c: rsp9.toCharArray()) {
            if (c == '2') {
                answer9 += "0";
            } else if (c == '0') {
                answer9 += "5";
            } else {
                answer9 += "2";
            }
        }

        System.out.println(answer9);


        // 암호 해독 : 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
        //암호화된 문자열 cipher를 주고받습니다.
        //그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
        //문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
        String cipher10 = "dfjardstddetckdaccccdegk";
        int code10 = 4;
        String answer10 = "";

        for (int i=1;i<=cipher10.length();i++) {
            if (i % code10 == 0)
                answer10 += cipher10.charAt(i-1);
        }

        /*for (int i = code10; i <= cipher10.length(); i = i + code10) {
            answer10 += cipher10.substring(i - 1, i);
        }*/

        System.out.println(answer10);

        // 직각삼각형 출력하기 : "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
        //Scanner sc = new Scanner(System.in);
        //int n11 = sc.nextInt();
        int n11 = 3;

        for (int i=0;i<n11;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 문자열 정렬하기 (1) : 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
        String my_string12 = "hi12392";
        int[] answer12 = Stream.of(my_string12.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).sorted().toArray();

        System.out.println(Arrays.toString(answer12));

    }
}
