import java.util.*;

public class CharacterCounter{
public static void main(String[] args){
	String s1 = "aaabbcdddaa";
	String out =charCounter(s1);
	System.out.print(out);		//.replace("[","").replace("]","").replace(",","").replace(" ",""));	//Remove "[" and "," and "<space>" from the String
}

public static String charCounter(String inp){
	String merge = "";
	int charCount = 1;	
	boolean globalCount=true;		//If abcd is passed then output should be abcd and not a1b1c1d1 so its a flag to check if multiple same character 
						//is passed in the string or every character in the string is unique.
	if(inp.length()>0){
	char prev = inp.charAt(0);
	char last = inp.charAt(inp.length()-1);
	for(int i=1; i<inp.length();i++){
		if(prev == inp.charAt(i)){
			globalCount=false;
			charCount++;
}
		//if(prev != chArray[i] && charCount>1){
		if(prev != inp.charAt(i)){
			merge+= String.valueOf(prev);
			if(!globalCount){
			merge+=String.valueOf((char)(charCount+'0'));
			}
			prev = inp.charAt(i);
			charCount=1;
}
		if(i==inp.length()-1 && prev==last){
		merge+= String.valueOf(prev);
		if(!globalCount){
			merge+=String.valueOf((char)(charCount+'0'));
		}
}
}
}
	return merge;
}
}
