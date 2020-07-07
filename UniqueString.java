import java.util.*;
public class UniqueString {
//O(NlogN)
public boolean isUniqueSort(String str) {
	char[] strArr = str.toCharArray();
	Arrays.sort(strArr);
	for (int i=0; i<strArr.length-1; i++) {
		if(strArr[i] == strArr[i+1]) return false;
	}
	return true;
}
// O(N)
public boolean isUniqueHashSet(String str) {
	Set<Character> set= new HashSet<Character>();
	for (int i=0; i<str.length(); i++) {
		if(set.contains(str.charAt(i))== true) return false;
		set.add(str.charAt(i));
	}
	return true;
}
}
