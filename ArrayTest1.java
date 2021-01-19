package array01;

//2021.1.19
/*数组元素的默认初始化值
 * 1、数组元素是整型，默认为0
 * 2、数组元素是浮点型，默认为0.0
 * 3、数组元素是char类型，默认为：0或者'\u0000'，而非'0'
 * 4、数组元素是boolean类型：false
 * 5、数组元素是引用，默认为null，不是'null' 
 * */

public class ArrayTest1 {
	public static void main(String[] args)
	{
		//数组元素的默认初始化值
		int[] arr = new int[4];
		for(int i=0;i < arr.length;i++)
		{
			System.out.println(arr[i]);  //默认值为0
		}
		
		System.out.println("***********************");
		
		float[] arr2 = new float[4];
		for(int i=0;i < arr2.length;i++)
		{
			System.out.println(arr2[i]);  //默认值为0.0
		}
		
		System.out.println("***********************");
		
		char[] arr3 = new char[4];
		for(int i=0;i < arr3.length;i++)
		{
			System.out.println("-------" +arr3[i]+"*****");  
		}
	}

}
