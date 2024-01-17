import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 연산 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2);// 더하기
        System.out.println(num1 - num2);// 빼기
        System.out.println(num1 * num2);// 곱하기
        System.out.println(num1 / num2);// 나누기
        System.out.println(num1 % num2);// 나머지

        // 두 수의 나눗셈 : 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
        System.out.println((int) ((num1 / (double) num2) * 1000));

        // 숫자 비교 : 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
        System.out.println(num1 == num2 ? 1 : -1);

        // 분수의 덧셈 : 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        int max = 1;

        for (int i = 1; i <= n && i<= d; i++) {
            if (n%i==0 && d%i==0) {
                max = i;
            }
        }

        int[] answer = {n/max, d/max};

        System.out.println(Arrays.toString(answer));

        // 배열 두배 만들기 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        int[] answer2 = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer2[i] = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(answer2));

        // 각도기 : 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
        int angle = 70;

        int answer3 = 0;

        if (0 < angle && angle < 90) {
            answer3 = 1;
        } else if (angle == 90) {
            answer3 = 2;
        } else if (90 < angle && angle < 180) {
            answer3 = 3;
        } else if (angle == 180) {
            answer3 = 4;
        }

        System.out.println(answer3);

        // 짝수의 합 : 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
        int answer4 = 0;

        for (int i=0;i<=n;i++) {
            if (i % 2 == 0) {
                answer4 += i;
            }
        }

        System.out.println(answer4);

        // 양꼬치 : 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
        int n5 = 10;
        int k5 = 3;

        int s5 = n5 / 10;

        int answer5 = (n5 * 12000) + ((k5 - s5) * 2000);

        System.out.println(answer5);

        // 피자 나눠먹기 : 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
        int n6 = 7;

        int answer6 = 0;
        answer6 = 7 / n6 >= 1 ? 1 : (int) Math.ceil(n6 / 7.0);
        //answer6 = (n6 + 6) / 7;

        System.out.println(answer6);

        // 점의 위치 구하기 : 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
        //x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
        //x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
        //x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
        //x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
        //x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
        int[] dot7 = { 2, 4 };
        int answer7 = 0;

        if (dot7[0] > 0 && dot7[1] > 0) {
            answer7 = 1;
        } else if (dot7[0] < 0 && dot7[1] > 0) {
            answer7 = 2;
        } else if (dot7[0] < 0 && dot7[1] < 0) {
            answer7 = 3;
        } else if (dot7[0] > 0 && dot7[1] < 0) {
            answer7 = 4;
        }

        //int x7 = dot7[0] < 0 ? 1 : 0;
        //int y7 = dot7[1] < 0 ? 2 : 0;
        //answer7 = 1 + ((x7 | y7) ^ (y7 >> 1));
        System.out.println(answer7);

        // 중복된 숫자 개수 : 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
        int[] array8 = {1, 1, 2, 3, 4, 5};
        int n8 = 1;

        int answer8 = 0;

        for (int i: array8) {
            if (i == n8)
                answer8++;
        }

        System.out.println(answer8);
        System.out.println(IntStream.of(array8).filter(s->s == n8).count());

        // 최댓값 만들기 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
        int[] numbers9 = {1, 2, 3, 4, 5};

        int answer9 = 0;

        for(int i = 0; i < numbers9.length; i++) {
            for (int j = i + 1; j < numbers9.length; j++) {
                if (numbers9[i] * numbers9[j] > answer9) {
                    answer9 = numbers9[i] * numbers9[j];
                }
            }
        }

        System.out.println(answer9);
        int[] result9 = Arrays.stream(numbers9).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(result9[0] * result9[1]);


        // 삼각형의 완성 조건 : 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
        int[] sides10 = {1,2,3};

        int answer10 = 2;

        int total10 = 0;
        int max10 = 0;

        for (int i: sides10) {
            total10 += i;
            if (max10 < i) {
                max10 = i;
            }
        }

        if (total10 > (max10 * 2))
            answer10 = 1;

        System.out.println(answer10);
        //Arrays.sort(sides10);
        //System.out.println(sides10[2] >= sides10[0] + sides10[1] ? 2 : 1);

        // 짝수 홀수 개수 : 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        int[] num_list11 = {1, 2, 3, 4, 5};
        int[] answer11 = new int[2];

        for (int i: num_list11) {
            if (i % 2.0 == 0) {
                answer11[0] += 1;
            } else {
                answer11[1] += 1;
            }
        }

        //for (int i = 0; i < num_list11.length; i++)
        //    answer11[num_list11[i] % 2]++;

        System.out.println(Arrays.toString(answer11));

        // 피자 나눠먹기 (3) : 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
        int n12 = 3;
        int slice12 = 9;

        int answer12 = (n12 + slice12 - 1) / slice12;
        //int answer12 = n % slice > 0 ? n / slice + 1 : n / slice;
        System.out.println(answer12);

        // 아이스 아메리카노 : 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        int money13 = 15000;
        int[] answer13 = new int[2];

        answer13[0] = money13 / 5500;
        answer13[1] = money13 % 5500;

        System.out.println(Arrays.toString(answer13));

        // 제곱수 판별하기 : 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
        int n14 = 144;
        int answer14 = 2;

        for (int i=0;i<=n14;i++) {
            if (i*i == n14) {
                answer14 = 1;
                break;
            }
        }
        //answer14 = n14 % Math.sqrt(n14) == 0 ? 1 : 2;
        System.out.println(answer14);

        // 옷가게 할인 받기 : 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
        //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
        int price15 = 150000;
        int answer15 = 0;

        if (price15 >= 100000 && price15 < 300000) {
            answer15 = (int) (price15 * 0.95);
        } else if (price15 >= 300000 &&  price15 < 500000) {
            answer15 = (int) (price15 * 0.9);
        } else if (price15 > 500000) {
            answer15 = (int) (price15 * 0.8);
        } else {
            answer15 = price15;
        }

        System.out.println(answer15);

        // 짝수는 싫어요 : 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
        int n16 = 10;

        int count16 = n / 2 + (n16 % 2 == 0 ? 0 : 1);
        int[] answer16 = new int[count16];

        int result16 = 1;
        for (int i=0;i<count16;i++) {
            answer16[i] = result16;
            result16 += 2;
        }

        //answer16 = IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        System.out.println(Arrays.toString(answer16));

        // 세균 증식 : 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
        int n17 = 2;
        int t17 = 10;

        int answer17 = n17;

        for (int i=0;i<t17;i++) {
            answer17 = answer17 + answer17;
        }
        //answer17 = n17 << t17;
        System.out.println(answer17);

        // 자릿수 더하기 : 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
        int n18 = 1234;
        int answer18 =0;

        for (char c: String.valueOf(n18).toCharArray()) {
            answer18 += c - 48;
        }

        /*while(n18>0){
            answer18+=n18%10;
            n18/=10;
        }*/

        System.out.println(answer18);

        // 순서쌍의 개수 : 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
        int n19 = 20;
        int answer19 = 0;

        for (int i = 1; i <= n19; i++) {
            if (n19 % i == 0)
                answer19++;
        }

        System.out.println(answer19);

        // n의 배수 고르기 : 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
        int[] numlist20 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n20 = 3;

        int[] answer20 = {};
        answer20 = Arrays.stream(numlist20).filter(i->i % n20 == 0).toArray();

        System.out.println(Arrays.toString(answer20));

        // 개미 군단 : 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다. 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
        int hp21 = 20;
        int answer21 = 0;

        answer21 = hp21 / 5 + (hp21 % 5 / 3) + hp21 % 5 % 3;

        System.out.println(answer21);

        // 피자 나눠 먹기 (2) : 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
        int n22 = 10;

        int answer22 = 0;

        for (int i=1; i<= 6 * n22;i++) {
            if ((6 * i) % n22 == 0) {
                answer22 = i;
                break;
            }
        }

        System.out.println(answer22);

        // 최댓값 만들기 (2) : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
        int[] numbers23 = {1, 2, -3, 4, -5};

        int answer23 = -100000000;

        for (int i=0; i < numbers23.length; i++) {
            for (int j= i + 1; j < numbers23.length; j++) {
                if (numbers23[i] * numbers23[j] > answer23)
                    answer23 = numbers23[i] * numbers23[j];
            }
        }

        //Arrays.sort(numbers23);
        //answer23 = Math.max(numbers23[0] * numbers23[1], numbers23[numbers23.length - 2] * numbers23[numbers23.length - 1]);

        System.out.println(answer23);

        // 가장 큰 수 찾기 : 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        int[] array24 = {1, 8, 3};
        int[] answer24 = new int[2];

        for (int i=0;i<array24.length;i++) {
            if (answer24[0] < array24[i]) {
                answer24[0] = array24[i];
                answer24[1] = i;
            }
        }

        System.out.println(Arrays.toString(answer24));

        // 주사위의 개수 : 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
        int[] box25 = {10, 8, 6};
        int n25 = 3;
        int answer25 = (box25[0] / n25) * (box25[1] / n25) * (box25[2] / n25);

        System.out.println(answer25);

        // 최반값 구하기 : 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
        int[] array26 = {1, 1, 2, 2};




    }
}
