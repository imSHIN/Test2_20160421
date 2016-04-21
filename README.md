# Test2_20160421

//4.此处为多行代码，用以判断字符串中大小写个数，并存入变量
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='a' && c<='z'){
				numberOfLowercase++;
			}
			if(c>='A' && c<='Z'){
				numberOfUppercase++;
			}
		}
notice: charAt()
