package romanToInteger;

import java.util.ArrayList;

public class RomanToIntSolution {
	public static int romanToInt(String s) {
		int answer = 0;
		char[] arr = s.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for(char c : arr) {
			list.add(c);
		}
		
		for(int i = 0; i < list.size() -1; i++) {
			if(list.size() < 2) {
				break;
			}
			if(list.get(i) == 'I') {
				if(list.get(i + 1) == 'V') {
					answer += 4;
					list.remove(i+1);
					list.remove(i);
					i--;
					i--;
				} else if(list.get(i + 1) == 'X') {
					answer += 9;
					list.remove(i+1);
					list.remove(i);
					i--;
					i--;
				}
			} else if(list.get(i) == 'X') {
				if(list.get(i + 1) == 'L') {
					answer += 40;
					list.remove(i+1);
					list.remove(i);
					i--;
					i--;
				} else if(list.get(i + 1) == 'C') {
					answer += 90;
					list.remove(i+1);
					list.remove(i);
					i--;
					i--;
				}
			} else if (list.get(i) == 'C') {
				if(list.get(i + 1) == 'D') {
					answer += 400;
					list.remove(i+1);
					list.remove(i);
					i--;
					i--;
				} else if(list.get(i + 1) == 'M') {
					answer += 900;
					list.remove(i+1);
					list.remove(i);
					i--;
					i--;
				}
			}
		}
		
		for(int i = 0; i < list.size() + 1; i++) {
			if(list.size() == 0) {
				break;
			}
			if(list.get(i) == 'I') {
				answer += 1;
				list.remove(i);
				i--;
			} else if(list.get(i) == 'V') {
				answer += 5;
				list.remove(i);
				i--;
			} else if(list.get(i) == 'X') {
				answer += 10;
				list.remove(i);
				i--;
			} else if(list.get(i) == 'L') {
				answer += 50;
				list.remove(i);
				i--;
			} else if(list.get(i) == 'C') {
				answer += 100;
				list.remove(i);
				i--;
			} else if(list.get(i) == 'D') {
				answer += 500;
				list.remove(i);
				i--;
			} else if(list.get(i) == 'M') {
				answer += 1000;
				list.remove(i);
				i--;
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		System.out.println(romanToInt("CMLII"));
	}

}
