
import java.util.*;
class Solution {
    public int solution(int[] array) {
   
        int maxCount = 0; // 가장 많은 갯수
        int answer = 0;  // 답

        Map<Integer, Integer> map = new HashMap<>();
//             키    값                   해쉬맵
        for (int number : array)
        {//  for-each문 array 전체 순회
            int count = map.getOrDefault(number, 0) + 1;
            //찾는 키가 있으면 number에 반환하고 없으면 디폴트값에 반환
            //디폴트 값은 원소의 갯수 카운트이며, 인덱스는 0 부터 시작하므로 + 1 해준다.
            if (count > maxCount)
            {
                maxCount = count; // count에 가장 많은 갯수 표딱지를 붙인다.
                answer = number; // 그 수를 답에 넣는다.
            }
            else if (count == maxCount)  // 비등비등하면
            {
                answer =  -1;  // -1 반환
            }
            map.put(number, count);// put을 이용해 key-value값을 넣는다.
        }
        return answer;
    }
}
