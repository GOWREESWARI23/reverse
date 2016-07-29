import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
String s,reverse=" ";
Scanner in=new Scanner(System.in);
s=in.next();
int length=s.length();
for(int i=length-1;i>=0;i--)
reverse=reverse+s.charAt(i);
System.out.println("reverse string is:" +reverse);
}
}
