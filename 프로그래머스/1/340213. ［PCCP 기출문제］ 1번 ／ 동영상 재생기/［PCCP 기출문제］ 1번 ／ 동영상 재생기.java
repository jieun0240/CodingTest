class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len);
        int position = timeToSeconds(pos);
        int openingStart = timeToSeconds(op_start);
        int openingEnd = timeToSeconds(op_end);
        
        if (openingStart <= position && position <= openingEnd) {
            position = openingEnd;
        }

        for (String command : commands) {
            if (command.equals("prev")) {
                position = Math.max(0, position - 10);
            } else if (command.equals("next")) {
                position = Math.min(videoLength, position + 10);
            }
            
            // 이동 후 오프닝 구간이면 오프닝 끝으로 이동
            if (openingStart <= position && position <= openingEnd) {
                position = openingEnd;
            }
        }
        
        return secondsToTime(position);
    }

    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    private String secondsToTime(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }
}