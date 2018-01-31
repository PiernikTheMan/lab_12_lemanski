//1
class A implements Comparable<A>{
private String nazwa;
private Long id;
private Double val;
A(String name,Long id,Double val){
    nazwa=name;
    this.id=id;
    this.val=val;
}
String getname(){
    return nazwa;
}
void setname(String value){
     nazwa=value;
}

public int compareTo(A a){
    return nazwa.compareTo(a.getname());
}
public Long getid(){
    return id;
}
public void setid(Long value){
    id=value;
}
public Double getval(){
return val;
}
public void setval(Double value){
    val=value;
}
}
