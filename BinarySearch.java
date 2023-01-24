import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch
{
public static void main(String[] args)
{
int[] arr=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements: ");
for(int i=0;i<arr.length-1;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter the number to search: ");
int n=sc.nextInt();
int low=0;
int high=arr.length-1;
int count=0;

while(low<=high)
{
int mid=(low+high)/2;
if(arr[mid]==n)
{
System.out.println("Element found at index: "+mid);
count++;
break;
}
else if(arr[mid]>n)
{
high=mid-1;
}
else if(arr[mid]<n)
{
low=mid+1;
}
}
if(count==0)
{
System.out.println("Not found");
}
}
}