// https://leetcode.com/problems/generate-parentheses/description/
class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        fillList(n, 0, "");
        return list;
    }
    // n stands for how many open paranthesis is left to add
    // m stands for how many closed paranthesis is left to add
    void fillList(int n, int m, String s) {
        if (n == 0 && m == 0) {
            list.add(s);
            return;
        }
        if (n > 0) {
            fillList(n - 1, m + 1, s + "(");
        }
        if (m > 0) {
            fillList(n, m - 1, s + ")");
        }
    }
}