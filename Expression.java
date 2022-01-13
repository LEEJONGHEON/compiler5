import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Expression {
    public int num = 0;

    public void function(String s) {
        s = s.replaceAll("\\s+", "");

        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        String op1 = "+-";
        String op2 = "*/%";
        String op3 = op1+op2;
        int length = s.length();
        for (int i = 0; i < length; i+=1) {
            if ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i - 1) == '(')) {
                if (i == 0) {
                    s = "0" + s;
                } else {
                    s = s.substring(0, i) + "0" + s.substring(i);
                }
            }
        }

        char[] str = s.toCharArray();
        changePlusMinus(str);

        String s1 = new String(str);
        s1 = s1.replaceAll("\\s+", "");
        char[] str1 = s1.toCharArray();


        int len = str1.length;
        for (int i = 0; i < len; i+=1) {
            int num = 0;
            boolean flag = false;

            for (; i < len && Character.isDigit(str1[i]); i++) {
                num = num * 10 + Character.getNumericValue(str1[i]);
                flag = true;
            }
            if (flag) {
                list.add(String.valueOf(num));
                i--;
                flag = false;
                continue;
            }

            if (stack.size() == 0 || str1[i] == '(') {
                stack.push(str1[i] + "");
                continue;
            }

            if (str1[i] == ')') {
                while (stack.size() != 0 && !stack.peek().equals("(")) {
                    list.add(stack.pop());
                }
                stack.pop();
                continue;
            }

            while (stack.size() != 0 && op1.contains(str1[i] + "") && op3.contains(stack.peek())) {
                list.add(stack.pop());
            }
            while (stack.size() != 0 && op2.contains(str1[i] + "") && op2.contains(stack.peek())) {
                list.add(stack.pop());
            }
            stack.push(str1[i] + "");
        }

        while (stack.size() != 0) {
            list.add(stack.pop());
        }

        int sum = 0;
        boolean flag = false;
        for (int i = 2; list.size() != 1; i++) {
        	flag = print(list,list.get(i),i);
            if (flag) {
                num+=1;
                list.set(i, "%" + num);
                list.remove(i - 1);
                list.remove(i - 2);
                i = 1;
                flag = false;
            }
        }

        System.out.println("\tret i32 " + list.get(0));
    }
    public void makeStr(String s,int i) {
        if ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i - 1) == '(')) {
            if (i == 0) {
                s = "0" + s;
            } else if(i>0) {
                s = s.substring(0, i) + "0" + s.substring(i);
            }
        }
    }
    public boolean print(List<String> list,String temp,int i) {
        int count = 1;
        if(temp.equals("+")) {
            System.out.println("\t%" + (num + 1) + " =" + " add i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("-")) {
            System.out.println("\t%" + (num + 1) + " =" + " sub i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("*")) {
            System.out.println("\t%" + (num + 1) + " =" + " mul i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("/")) {
            System.out.println("\t%" + (num + 1) + " =" + " sdiv i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("%")) {
            count+=1;
            System.out.println("\t%" + (num + 1) + " =" + " sdiv i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            num+=1;
            System.out.println("\t%" + (num + 1) + " =" + " mul i32 " + "%" + num + ", " + list.get(i - 1));
            num+=1;
            System.out.println("\t%" + (num + 1) + " =" + " sub i32 " + list.get(i - 2) + ", " + "%" + num);
            count+=1;
        }
        if(count>1) return true;
        else return false;
    }
    public void changePlusMinus(char[] str) {
    	char t1;
        char t2;
        int count = 0;
        for(int i = 0;i < str.length - 1;) {
            t1 = str[i];
            t2 = str[i+1];
            if (t1 == '+') {
                if(t2=='-') {
                    t1 = ' ';
                    t2 = '-';
                } else if(t2=='+') {
                    t1 = ' ';
                    t2 = '+';
                }
            } else if (t1 == '-') {
                if(t2=='+') {
                    t1 = ' ';
                    t2 = '-';
                } else if(t2=='-') {
                    t1 = ' ';
                    t2 = '+';
                }
            }
            count+=1;
            str[i] = t1;
            str[i+1] = t2;
            i+=1;
        }
    }
}