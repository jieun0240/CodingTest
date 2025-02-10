import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> friendIndex = new HashMap<>();
        int[][] giftRecord = new int[n][n];
        int[] giftGiven = new int[n];
        int[] giftReceived = new int[n];

        for (int i = 0; i < n; i++) {
            friendIndex.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = friendIndex.get(parts[0]);
            int receiver = friendIndex.get(parts[1]);

            giftRecord[giver][receiver]++;
            giftGiven[giver]++;
            giftReceived[receiver]++;
        }

        int[] giftScore = new int[n];
        for (int i = 0; i < n; i++) {
            giftScore[i] = giftGiven[i] - giftReceived[i];
        }

        int[] nextMonthGifts = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (giftRecord[i][j] > giftRecord[j][i]) {
                    nextMonthGifts[i]++;
                } else if (giftRecord[i][j] < giftRecord[j][i]) {
                    nextMonthGifts[j]++;
                } else {
                    if (giftScore[i] > giftScore[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftScore[i] < giftScore[j]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }

        return Arrays.stream(nextMonthGifts).max().getAsInt();
    }
}