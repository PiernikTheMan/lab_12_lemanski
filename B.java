import java.util.*;
public class B{
private TreeSet<A> hmcoll = new TreeSet<A>();
//2
void fill(){
    String temp ="abc 110 1001.10 def 120 1002.20 abc 120 1003.30 ghh 110   1004.40 man 130 1005.50 kal 140 1006.60 man 130 1007.70";
    String name=null;
    Long id=null;
    Double val=null;
    Scanner sc = new Scanner(temp);
    int supertemp=0;
    while(sc.hasNext()){
        if(supertemp%3==0){
            name=sc.next();
            supertemp++;
        }
        if(supertemp%3==1){
            id=sc.nextLong();
            supertemp++;
        }
        if(supertemp%3==2){
            val=sc.nextDouble();
            supertemp++;
            hmcoll.add(new A(name,id,val));
        }
    }
}
//3
HashMap<Long,A> toHashMap(){
    HashMap<Long,A> moje =new HashMap<Long,A>();
    Iterator<A> itr =hmcoll.iterator();
    A temp;
    while(itr.hasNext()){
        temp=itr.next();
        moje.put(temp.getid(),temp);
    }
    return moje;
}
//4
TreeSet rSet(HashMap<Long,A> arg){
    A temp=null;
    Iterator<A> lol= hmcoll.iterator();
    while(lol.hasNext()){
        temp=lol.next();
        if(arg.containsKey(temp.getid())){
            if(arg.get(temp.getid()).compareTo(temp)==0){
            continue;
            }
        hmcoll.add(temp);
        }
    }
return hmcoll;
}
}
