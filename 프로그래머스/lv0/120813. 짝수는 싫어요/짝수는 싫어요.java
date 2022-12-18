class Solution {
    public int[] solution(int n) {
       
        int cnt = 0;

        // 1부터 정수 n 까지의 홀수의 갯수 구하기 
        if(n % 2 == 0) cnt = n/2; 
        else cnt = n/2 + 1;

        //홀수 갯수 크기 만큼의 객체배열 생성 
        int []result = new int[cnt];
        int num = 1;

        //초기화 
        for(int i = 0; i < result.length; i++)
        {
            result[i] = num;
            num = num + 2;
        }
        return result;
    }
}