/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate.spreadsheet;

/**
 *
 * @author RUWAN
 */
public class Float {
    private String FloatText=null;
    private float MyFloat;
    
    public void setFloatText(String newString){
        FloatText=newString;
    }
    
    public String getFloatText(){
        return FloatText;
    }
    
    public void setMyFloat(float newFloat){
        MyFloat=newFloat;
    }
    
    public float getMyFloat(){
        return MyFloat;
    }
    
    public boolean isFloat(String MyString){
        int DecimalPointCount=0;
        if(MyString==null){
            return false;
        }
        
        int length=MyString.length();
        int i=0;
        while(i<length){
            char temp=MyString.charAt(i);
            if(temp=='+' || temp=='-'){
                if(i==length-1){
                    return false;
                }
                return isFloat(MyString.substring(i+1));
            }
            if(temp=='.'){
                DecimalPointCount++;
                if(DecimalPointCount==2){
                    return false;
                }
                i++;
                continue;
            }
            if(temp<'0' || temp >'9'){
                return false;
            }
            i++;
        }
        return true;
    }
}
