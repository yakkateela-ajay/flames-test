package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		StringBuilder str1 = new StringBuilder(name1);
        StringBuilder str2 = new StringBuilder(name2);
        int l1=str1.length();
        int l2=str2.length();
        for(int i=0;i<l1;i++) {
        	for(int j=0;j<l2;j++) {
        		if(str1.charAt(i)==str2.charAt(j)) {
        			str1.replace(i, i+1, "0");
        			str2.replace(j, j+1, "0");
        		}
        	}
        }
        int x=0;
        int y=0;
        String s1="";
        String s2="";
        s1 = str1.toString();
        s2 = str2.toString();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!='0'){
                x++;
             }
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='0'){
                y++;
             }
        }

        int total=x+y;
        String flames = "flames";
        StringBuilder str3 = new StringBuilder(flames);
        //char result=0;

        while(str3.length()!=1)
        {
            int value = total%str3.length(); 
            String temp;

            if(value!=0)
            {
                temp = str3.substring(value)+str3.substring(0, value-1); 

            }
            else
            {
                temp = str3.substring(0, str3.length()-1); 

            }
            str3 = new StringBuilder(temp);

        }

		return str3.charAt(0);

	}
}