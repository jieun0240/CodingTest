class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possibleWords = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            StringBuilder combinedWord = new StringBuilder();
            for (String possible : possibleWords) {
                if (word.contains(possible)) {
                    combinedWord.append(possible);
                }
            }
            // 발음 가능한 단어인 경우 answer를 증가시킴
            if (combinedWord.length() == word.length()) {
                answer++;
            }
        }

        return answer;
    }
}