import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ip=new Scanner(System.in);
  int arr_size=ip.nextInt();
  int arr[]=new int[arr_size];
  for(int i=0;i<arr_size;i++)
  {
    arr[i]=ip.nextInt();
  }
    int max=arr[0];
    int index=0;
    for(int i=0;i<arr_size;i++)
    {
     if(max<arr[i])
     {
       max=arr[i];
       index=i;
     }
    }
    System.out.println(index);
  }
}