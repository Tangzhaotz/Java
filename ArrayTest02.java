package array02;

/*二维数组默认初始化：
 * 二维数组分为外层元素和内层元素，int arr[][]=new int [4][3];arr[0]称为内层元素，arr[2][2]称为外层元素
 * 
 * */

public class ArrayTest02 {
	public static void main(String[] args)
	{
		//数组元素默认初始化
		int arr[][] = new int[4][3];
		System.out.println(arr[0]);  //打印出第一行的地址[I@15db9742
		System.out.println(arr[0][0]);  //0
		System.out.println(arr);  //[[I@6d06d69c,地址值
		
		System.out.println("*********************");
		String str[][] = new String[4][2];
		System.out.println(str[1]);  //[Ljava.lang.String;@7852e922,地址值
		System.out.println(str[2][1]); //null
		
		System.out.println("*********************");
		String str2[][] = new String[4][];
		System.out.println(str2[1]);  //null
	}

}
