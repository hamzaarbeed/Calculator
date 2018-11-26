
package com.test.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculater extends AppCompatActivity {
    String s = "";
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button pb;
    Button pe;
    Button equal;
    Button dot;
    Button del;
    Button sin;
    Button cos;
    Button tan;
    Button pi;
    Button asin;
    Button acos;
    Button atan;
    Button e;
    Button log;
    Button ln;
    Button factorial;
    Button power;
    Button sqrt;
    TextView result;
    TextView question;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        getIDs();
        setListeners();

    }
    void getIDs(){

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        dot = (Button) findViewById(R.id.dot);
        del = (Button) findViewById(R.id.del);
        sqrt = (Button) findViewById(R.id.sqrt);
        pb = (Button) findViewById(R.id.pb);
        pe = (Button) findViewById(R.id.pe);
        equal = (Button) findViewById(R.id.equal);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        pi = (Button) findViewById(R.id.pi);
        asin = (Button) findViewById(R.id.asin);
        acos = (Button) findViewById(R.id.acos);
        atan = (Button) findViewById(R.id.atan);
        e = (Button) findViewById(R.id.e);
        log = (Button) findViewById(R.id.log);
        ln = (Button) findViewById(R.id.ln);
        factorial = (Button) findViewById(R.id.factorial);
        power = (Button) findViewById(R.id.power);
        result = (TextView) findViewById(R.id.result);
        question = (TextView) findViewById(R.id.question);



    }
    void setListeners(){
        final Cal cal=new Cal();
        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("1");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("2");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("3");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("4");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("5");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("6");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("7");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("8");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("9");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });

        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("0");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("+");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("-");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("*");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("/");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        dot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append(".");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String temp =cal.getResult(true);
                if (temp.length()<5){
                    cal.setQuestion(temp);
                    question.setText(temp);
                    result.setText("");
                }else{
                    if (temp.substring(0,5).equals("error")==false){
                        cal.setQuestion(temp);
                        question.setText(temp);
                        result.setText("");
                    }else{
                        result.setText(temp);
                    }
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("del");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });

        del.setOnLongClickListener(new View.OnLongClickListener(){
            public boolean onLongClick(View v){
                cal.append("clr");
                question.setText("");
                result.setText("");
                return true;
            }
        });

        sin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("sin(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        cos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("cos(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        tan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("tan(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        e.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("e");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        pi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("π");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("√(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        pb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        pe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append(")");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        asin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("asin(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        acos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("acos(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        atan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("atan(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        ln.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("ln(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        log.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("log(");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        factorial.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("!");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });
        power.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cal.append("^");
                question.setText(cal.getQuestion());
                result.setText(cal.getResult(false));
            }
        });

    }
}



class Cal{
    private StringBuilder question;
    Cal(){
        question= new StringBuilder();
    }
    Cal(String s){
        question= new StringBuilder(s);
    }

    void append(String s){
        switch(s){
            case "+":
            case "*":
            case "/":
            case "^":
                if (question.length()>=1){
                    char pc = question.charAt(question.length()-1);
                    if (pc == '+' || pc == '*' || pc == '/' || pc == '^'){
                        question.replace(question.length()-1,question.length(),s);
                    }else if(pc == '-'){
                        if (question.length()>=2) {
                            char ppc = question.charAt(question.length()-2);
                            if ( ppc == '*' || ppc == '/' || ppc == '^'){
                                question.replace(question.length()-2,question.length(),s);
                            }else{
                                question.replace(question.length()-1,question.length(),s);
                            }
                        }
                    }else if(pc != '('){
                        question.append(s);
                    }
                }
                break;
            case "-":
                if (question.length()>=1){
                    char pc = question.charAt(question.length()-1);
                    if (pc == '+'){
                        question.replace(question.length()-1,question.length(),s);
                    }else if(pc == '-'){
                        if (question.length()>=2) {
                            char ppc = question.charAt(question.length()-2);
                            if ( ppc == '*' || ppc == '/' || ppc == '^'){
                                question.replace(question.length()-2,question.length(),s);
                            }
                        }
                    }else if(pc != '-'){
                        question.append(s);
                    }
                }else{
                    question.append(s);
                }
                break;
            case "!":
                if (question.length()>=1){
                    char pc = question.charAt(question.length()-1);
                    if (pc != '+' && pc != '*' && pc != '/' && pc != '^' && pc != '-' && pc != '('){
                        question.append(s);
                    }
                }
                break;
            case ".":
                for (int i = question.length()-1; i>=0;i--){
                    if (question.charAt(i)=='.'){
                        return;
                    }else if (question.charAt(i) <'0' || question.charAt(i) > '9'){
                        break;
                    }
                }
                question.append(s);
                break;
            case "del":
                if (question.length()>0){
                    if (question.charAt(question.length()-1)=='('){
                        String temp = Cal.getOpBeforeP(new StringBuilder(question),question.length()-1);
                        question.delete(question.length() - 1 - temp.length(),question.length());
                    }else{
                        question.deleteCharAt(question.length()-1);
                    }
                }else{
                    question.setLength(0);
                }
                break;
            case "clr":
                question.setLength(0);
                break;
            default:
                question.append(s);

        }
    }

    String getQuestion(){
        return question.toString();
    }

    String getResult(boolean showError){
        if (showError == true){
            return calculateE(question.toString());
        }else{
            return calculate(question.toString());
        }
    }

    static String calculate(String ss){
        StringBuilder s = new StringBuilder(ss);
        if (s.length()>0 &&(isMainOp (s.charAt(s.length()-1)) == true || s.charAt(s.length()-1) == '^')){
            s.deleteCharAt(s.length()-1);
        }
        try{
            search(s);
        }catch (ArithmeticException ar){
            return "";
        }catch (Exception e){
            return "";
        }
        return s.toString();
    }
    static String calculateE(String ss){
        StringBuilder s = new StringBuilder(ss);
        if (s.length()>0 &&(isMainOp (s.charAt(s.length()-1)) == true || s.charAt(s.length()-1) == '^')){
            s.deleteCharAt(s.length()-1);
        }
        try{
            search(s);
        }catch (ArithmeticException ar){
            return "error:Cannot Divide by Zero";
        }catch (Exception e){
            return "error:" + e.getMessage();
        }
        return s.toString();
    }
    private static void search (StringBuilder s)throws ArithmeticException,Exception{
        ArrayList<Integer> begs = new ArrayList<Integer>();
        int i;
        for (i = 0; i < s.length();i++){
            if (s.charAt(i) == '('){
                begs.add(i);
            }else if (s.charAt(i)==')'){
                if (begs.size()==0 || i == 0){
                    throw new Exception("Check the Parentheses!");
                }
                if (s.charAt(i-1)=='(') throw new Exception("Empty Parentheses!");
                int begP = begs.get(begs.size()-1);
                String insideP= s.substring(begP +1,i);
                String resultInsideP = calcSimple(new StringBuilder(insideP));
                String opBeforeP= getOpBeforeP(s,begP);
                int begOfReplace= begP-opBeforeP.length();
                String resultP= calOne(resultInsideP,opBeforeP);
                replace(s,begOfReplace,i+1,resultP);
                System.out.println(s);
                i = begP - opBeforeP.length() + resultP.length() - 1  ;
                begs.remove(begs.size()-1);
            }
        }

        // this loop to take care of leftover
        i=0;
        for (i=begs.size()-1;i>=0;i--){
            int begP = begs.get(i);
            String insideP= s.substring(begP +1);
            String resultInsideP = calcSimple(new StringBuilder(insideP));
            String opBeforeP= getOpBeforeP(s,begP);
            int begOfReplace= begP-opBeforeP.length();
            String resultP= calOne(resultInsideP,opBeforeP);
            replace(s,begOfReplace,s.length(),resultP);
            System.out.println(s);
            begs.remove(i);
        }

        s.replace(0,s.length(),calcSimple(new StringBuilder( s)));

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(13);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        BigDecimal rslt = new BigDecimal(s.toString());
        rslt = rslt.setScale(12,RoundingMode.HALF_UP);

        s.setLength(0);
        s.append(df.format(rslt));
    }

    private static String getOpBeforeP(StringBuilder s, int ii){
        if (ii == 0) return "";
        String opss[] = {"√","sin","cos","log","tan","ln","asin","acos","atan"};
        ArrayList<String> ops= new ArrayList<>(Arrays.asList(opss));
        int lengthOfLongestOp=4;
        /*
        for(String element:ops){
        if (lengthOfLongestOp<element.length()) lengthOfLongestOp=element.length();
        }
        */
        String op="";

        StringBuilder compare = new StringBuilder();
        for(int i = ii-1; i> ii-lengthOfLongestOp-1;i--){
            if (i<0) break;
            compare.insert(0,s.charAt(i));

            for (int r=0;r<ops.size();r++){
                String opElement=ops.get(r);
                if (compare.length()>opElement.length()){
                    ops.remove(r--);

                }else {
                    String toCompare= opElement.substring(opElement.length()-compare.length());
                    if (toCompare.equals(compare.toString())==false){
                        ops.remove(r--);
                    }else{
                        op=toCompare;
                    }
                }
            }
            if (ops.size()==1){
                op=ops.get(0);
                break;
            }
        }

        return op;
    }

    private static String calcSimple(StringBuilder s){
        ArrayList<String> elements= new ArrayList<>();
        StringBuilder priorities =new StringBuilder("@@@@"); // "!^*+"
        //This function read s and adds the elements into an array
        addToArrayList(elements,s,priorities);

        if (priorities.charAt(0)== '!') {

            for (int i = 0;i<elements.size();i++){
                if (elements.get(i).equals("!")){
                    String negative= "";
                    int temp;
                    if (elements.get(i-1).charAt(0)=='-'){
                        negative = "-";
                        temp = Integer.parseInt(elements.get(i-1).substring(1));
                    }else{
                        temp = Integer.parseInt(elements.get(i-1));
                    }
                    BigDecimal factorial = new BigDecimal(temp);
                    while (temp>1){
                        factorial=factorial.multiply(new BigDecimal(--temp));
                    }
                    elements.set(i-1, negative + String.valueOf(factorial));
                    elements.remove(i--);
                }
            }
        }
        if (priorities.charAt(1)== '^') {

            for (int i = elements.size()-1;i>=0;i--){
                if (elements.get(i).equals("^")){
                    String result=calTwo(elements.get(i-1),elements.get(i+1),'^');
                    elements.set(i-1,result);
                    elements.remove(i+1);
                    elements.remove(i);
                    i--;
                }
            }
        }
        if (priorities.charAt(2)== '*') {

            for (int i = 0;i<elements.size();i++){
                if (elements.get(i).equals("*")){
                    String result=calTwo(elements.get(i-1),elements.get(i+1),'*');
                    elements.set(i-1,result);
                    elements.remove(i+1);
                    elements.remove(i);
                    i--;
                }else if (elements.get(i).equals("/")){
                    String result=calTwo(elements.get(i-1),elements.get(i+1),'/');
                    elements.set(i-1,result);
                    elements.remove(i+1);
                    elements.remove(i);
                    i--;
                }
            }
        }
        if (priorities.charAt(3)== '+') {

            for (int i = elements.size()-1;i>=0;i--){
                if (elements.get(i).equals("+")){
                    String result=calTwo(elements.get(i-1),elements.get(i+1),'+');
                    elements.set(i-1,result);
                    elements.remove(i+1);
                    elements.remove(i);
                    i--;
                }else if (elements.get(i).equals("-")){
                    String result=calTwo(elements.get(i-1),elements.get(i+1),'-');
                    elements.set(i-1,result);
                    elements.remove(i+1);
                    elements.remove(i);
                    i--;
                }
            }
        }
        s.setLength(0);
        return elements.get(0);
    }

    private static void addToArrayList(ArrayList<String> elements,StringBuilder s, StringBuilder priorities){
        int i=0;
        StringBuilder num = new StringBuilder();
        char pc = '@';
        for(i = i;i<s.length();i++){
            char c =s.charAt(i);
            if (isNum(c)==true){
                num.append(c);
                pc=c;
            }else if(c=='-' && (isMainOp(pc) ==true || pc =='@') ){
                num.append(c);
                pc=c;
            }else {
                if (num.length() > 0) {
                    elements.add(num.toString());
                    num.setLength(0);
                }
                if (c == 'e') {
                    if (isNum(pc) == true) {
                        elements.add("*");

                        if (priorities.charAt(2) != '*') priorities.replace(2,3,"*");
                    }

                    elements.add(String.valueOf(Math.E));
                    if (i < s.length() - 1 && isNum(s.charAt(i + 1)) == true){
                        elements.add("*");
                        if (priorities.charAt(2) != '*') priorities.replace(2,3,"*");
                    }
                } else if (c == 'π') {
                    if (isNum(pc) == true){
                        elements.add("*");
                        if (priorities.charAt(2) != '*') priorities.replace(2,3,"*");
                    }
                    elements.add(String.valueOf(Math.PI));
                    if (i < s.length() - 1 && isNum(s.charAt(i + 1)) == true){
                        elements.add("*");
                        if (priorities.charAt(2) != '*') priorities.replace(2,3,"*");
                    }
                } else if (c == '!') {
                    elements.add("!");
                    if (priorities.charAt(0) != '!') priorities.replace(0,1,"!");
                    if (i < s.length() - 1 && isNum(s.charAt(i + 1)) == true){
                        elements.add("*");
                        if (priorities.charAt(2) != '*') priorities.replace(2,3,"*");
                    }
                } else {
                    elements.add(String.valueOf(c));
                    if (c == '^'){
                        if (priorities.charAt(1) != '^') priorities.replace(1,2,"^");
                    }else if (c == '*' || c == '/'){
                        if (priorities.charAt(2) != '*') priorities.replace(2,3,"*");
                    }else if (c == '+' || c == '-'){
                        if (priorities.charAt(3) != '+') priorities.replace(3,4,"+");
                    }
                }
                if (elements.size()>0) {
                    String temp=elements.get(elements.size()-1);
                    pc = temp.charAt(temp.length()-1);
                }
            }
        }
        if (num.length()>0){
            elements.add(num.toString());
            num.setLength(0);
        }
    }
    private static boolean isNum(char c){
        if (c>='0' && c<='9' || c == '.') return true;
        return false;
    }

    private static boolean isMainOp(char c){
        char e[] = {'-','+','*','/'};
        for(char x:e){
            if (x==c) return true;
        }
        return false;
    }
    private static String calTwo(String n1, String n2, char op) throws ArithmeticException{
        Double value1 = Double.parseDouble(n1);
        Double value2 = Double.parseDouble(n2);
        Double result = 0.0;

        switch (op) {
            case '+':
                result = value1+value2;
                break;
            case '-':
                result = value1-value2;
                break;
            case '*':
                result = value1*value2;
                break;
            case '/':
                result = value1/value2;
                break;
            case '^':
                result = Math.pow(value1,value2);
        }
        return String.valueOf(result);
    }
    private static String calOne(String n1, String op) throws ArithmeticException{
        Double n1d= Double.parseDouble(n1);
        Double result =0.0;
        switch (op) {
            case "sin":
                result = Math.sin(Math.toRadians(n1d));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(n1d));
                break;
            case "tan":
                result = Math.tan(Math.toRadians(n1d));
                break;
            case "asin":
                result = Math.toDegrees(Math.asin(n1d));
                break;
            case "acos":
                result = Math.toDegrees(Math.acos(n1d));
                break;
            case "atan":
                result = Math.toDegrees(Math.atan(n1d));
                break;
            case "√":
                result = Math.sqrt(n1d);
                break;
            case "log":
                result = Math.log10(n1d);
                break;
            case "ln":
                result = Math.log(n1d);
                break;
            default:
                return n1;
        }

        return String.valueOf(result);
    }

    static void replace(StringBuilder s,int beg, int end, String replacement){
        String before = "";
        String after = "";
        if (beg > 0 && isNum(s.charAt(beg-1))== true ) before ="*";
        if (end < s.length() && (isNum(s.charAt(end)) == true || s.charAt(end)=='(')) after ="*";
        s.replace(beg,end,before+ replacement +after);
    }

    public void setQuestion(String temp) {
        question.replace(0,question.length(),temp);
    }
}
