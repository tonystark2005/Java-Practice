
public class StringCompression {

public String compressedString(String str) {
	StringBuilder build = new StringBuilder();
	int count=1;
	build.append(str.charAt(0));
	for(int i=0; i<str.length()-1; i++) {
		if(str.charAt(i)!= str.charAt(i+1)) {
			build.append(count).append(str.charAt(i+1));
			count=0;
		}
		count++;
	}
	build.append(count);
	if(build.length()<str.length()) return build.toString();
	return str;
}
}
