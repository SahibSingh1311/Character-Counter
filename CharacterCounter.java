import java.util.*;

public class CharacterCounter{
public static void main(String[] args){
	String s1 = "abcd";
	ArrayList<String> out =charCounter(s1);
	System.out.print(out.toString().replace("[","").replace("]","").replace(",","").replace(" ",""));	//Remove "[" and "," and "<space>" from the String
}

public static ArrayList<String> charCounter(String inp){
	ArrayList <String> merge = new ArrayList<String>();
	char[] chArray = inp.toCharArray();
	Arrays.sort(chArray);
	int charCount = 1;	
	Arrays.sort(chArray);
	boolean globalCount=true;		//If abcd is passed then output should be abcd and not a1b1c1d1 so its a flag to check if multiple same character 
						//is passed in the string or every character in the string is unique.
	if(chArray.length>0){
	char prev = chArray[0];
	char last = chArray[chArray.length-1];
	for(int i=1; i<chArray.length;i++){
		if(prev == chArray[i]){
			globalCount=false;
			charCount++;
}
		//if(prev != chArray[i] && charCount>1){
		if(prev != chArray[i]){
			merge.add(String.valueOf(prev));
			if(!globalCount){
			merge.add(String.valueOf((char)(charCount+'0')));
			}
			prev = chArray[i];
			charCount=1;
}
		if(i==chArray.length-1 && prev==last){
		merge.add(String.valueOf(prev));
		if(!globalCount){
			merge.add(String.valueOf((char)(charCount+'0')));
		}
}
}
}
	return merge;
}
}