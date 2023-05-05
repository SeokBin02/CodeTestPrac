package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 공백을 기준으로 입력받기
        String [] input = br.readLine().split(" ");
        int sum=0;
        for(String n : input){
            sum += Integer.parseInt(n);
        }
        System.out.println(sum);
    }
}
