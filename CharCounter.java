import java.util.*;

public class CharCounter{
public static void main(String[] args){
	String s1 = "aaabcdeaa";
	System.out.println(characterCounter(s1));
}
public static String characterCounter(String inp){
	String out="";
	HashMap<Character,Integer> result= new HashMap<>();
	
	for(int i=0;i<inp.length();i++){
		char tempKey = inp.charAt(i);
		if(result.containsKey(tempKey))
			result.put(tempKey,result.get(tempKey)+1);
		else
			result.put(tempKey,1);
			
}
	for(Map.Entry<Character,Integer> i: result.entrySet()){
	//for(Map.Entry i: result.entrySet()){
		//System.out.println("Key: "+i.getKey()+" Value: " + i.getValue());
		out+=String.valueOf(i.getKey())+String.valueOf(i.getValue());
	}
	return out;	
}

}