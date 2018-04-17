import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        st s[] = new st[5];
        option o = new option();
        boolean flag = true;

        for (int i = 0; i < 5; i++) {
            s[i] = new st(scn.next(), scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        }
        while (flag) {
            o.options();
            System.out.println();
            System.out.print("請輸入想要的選項");
            int n = scn.nextInt();
            int num = 0;
            float sum = 0;
            switch (n) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + "." + s[i].getName());
                    }
                    System.out.print("請輸入你要哪一位同學");
                    num = scn.nextInt();
                    s[num - 1].showinfo();
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        s[i].showinfo();
                        System.out.println("=============================");
                    }
                    break;
                case 3:
                    System.out.println("國文");
                    System.out.println("英文");
                    System.out.println("數學");
                    System.out.print("請輸入要查詢哪一個項目");
                    num = scn.nextInt();
                    switch (num) {
                        case 1:
                            for (int i = 0; i < 5; i++) {
                                sum += s[i].getChinese();
                            }
                            sum /= 5;
                            System.out.println("國文平均" + sum);
                            sum = 0;
                            break;
                        case 2:
                            for (int i = 0; i < 5; i++) {
                                sum += s[i].getEnglish();
                            }
                            sum /= 5;
                            System.out.println("英文平均" + sum);
                            sum = 0;
                            break;
                        case 3:
                            for (int i = 0; i < 5; i++) {
                                sum += s[i].getMath();
                            }
                            sum /= 5;
                            System.out.println("數學平均" + sum);
                            break;
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + s[i].getName());
                    }
                    System.out.print("請輸入要查詢的同學");
                    num = scn.nextInt();
                    sum = s[num - 1].getSum();
                    System.out.println("總分" + sum);
                    sum = s[num - 1].getAverage();
                    System.out.println("平均" + sum);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}