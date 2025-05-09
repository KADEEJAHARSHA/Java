class student
{
String name;
int rolno;
double mark;
}
public class Arrayofobj
{
public static void main(String args[])
{
student s1= new student();
s1.name="anu";
s1.rolno=1;
s1.mark=90;
student s2= new student();
s1.name="arun";
s1.rolno=2;
s1.mark=80;
student[] students=new student[2];
students[0]=s1;
students[1]=s2;
for(int i=0;i<students.length;i++)
{
System.out.println(students[i].name+":"+students[i].mark);
}
}
}
