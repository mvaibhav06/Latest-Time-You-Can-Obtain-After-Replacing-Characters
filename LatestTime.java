class LatestTime {
    public String findLatestTime(String s) {
        char[] temp = s.toCharArray();

        if(temp[0]=='?' && temp[1]=='?'){
            temp[0]='1';
            temp[1]='1';
        }else if(temp[0]=='?' && temp[1]!='?'){
            if(temp[1]=='0' || temp[1]=='1'){
                temp[0]='1';
            }else{
                temp[0]='0';
            }
        }else if(temp[0]!='?' && temp[1]=='?'){
            if(temp[0]=='1'){
                temp[1]='1';
            }else{
                temp[1]='9';
            }
        }

        if(temp[3]=='?' && temp[4]=='?'){
            temp[3]='5';
            temp[4]='9';
        }else if(temp[3]=='?' && temp[4]!='?'){
            temp[3] = '5';
        }else if(temp[3]!='?' && temp[4]=='?'){
            temp[4] = '9';
        }
        return new String(temp);
    }
}
