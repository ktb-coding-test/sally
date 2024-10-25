import java.util.*;

class Solution {
    public String solution(String new_id) {
        // 1단계
        String answer = new_id.toLowerCase();

        // 2단계
        StringBuilder sb = new StringBuilder();
        for (char c : answer.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == '-') || (c == '_') || (c == '.')) {
                sb.append(c);
            }
        }

        // 3단계
        StringBuilder newsb = new StringBuilder();
        boolean dot = false; // 전에 마침표가 없다고 판단
        for (char c : sb.toString().toCharArray()) {
            if (c == '.') {
                if (!dot) {
                    newsb.append(c);
                    dot = true;
                }
            } else {
                newsb.append(c);
                dot = false;
            }
        }

        // 4단계
        if (newsb.length() > 0 && newsb.charAt(0) == '.') {
            newsb.deleteCharAt(0);
        }
        if (newsb.length() > 0 && newsb.charAt(newsb.length() - 1) == '.') {
            newsb.deleteCharAt(newsb.length() - 1);
        }

        // 5단계
        if (newsb.length() == 0) {
            newsb.append('a');
        }

        // 6단계
        if (newsb.length() >= 16) {
            newsb.setLength(15);
            if (newsb.charAt(newsb.length() - 1) == '.') {
                newsb.deleteCharAt(newsb.length() - 1);
            }
        }

        // 7단계
        while (newsb.length() < 3) {
            newsb.append(newsb.charAt(newsb.length() - 1));
        }

        answer = newsb.toString();
        return answer;
    }
}
