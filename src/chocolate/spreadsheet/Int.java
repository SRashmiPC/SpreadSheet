/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate.spreadsheet;

/**
 *
 * @author RUWAN
 */
public class Int {
    private String IntText =null;
    private int MyInt;
    
    public Int(String value){
        IntText=value;
        if(isInt(IntText)){
        
        }
        
    }
    public void setIntText(String newString){
        IntText=newString;
    }
    
    public String getIntText(){
        return IntText;
    }
    
    public void setMyInt(int newInt){
        MyInt=newInt;
    }
    
    public int getMyInt(){
        return MyInt;
    }
    
    public static boolean isInt(String MyString){
        if(MyString==null){
            return false;
        }
        int IntTextLength= MyString.length();
        int i=0;
        while(i<IntTextLength){
            char temp=MyString.charAt(i);
            if(temp=='+' || temp=='-'){
                if(i==IntTextLength-1){
                    return false;
                }
                return isInt(MyString.substring(i+1));
            }
            if(MyString.charAt(i)<'0' || MyString.charAt(i)>'9'){
                return false;
            }
            i++;
        }
        
        
        return true;
    }
}
