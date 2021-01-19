package array02;

/*二维数组
 * 二维数组的声明和初始化
 * 如何调用数组的指定位置的元素
 * 获取数组长度
 * 遍历数组
 * 数组元素的默认初始值
 * 数组的内存解析
 * */

public class ArrayTest01 {
	public static void main(String[] args)
	{
		//二维数组
		//静态初始化
		int [][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化
		String [][] arr2 = new String[3][2];
		String [][] arr3 = new String[3][];
		
		//错误情况
		//String [][] arr = new String[][4];
		
		//数组元素的调用
		System.out.println(arr[0][1]);  //2
		System.out.println(arr2[1][1]);  //null
		//System.out.println(arr3[1][0]);   //报错
		
		//获取数组长度
		System.out.println(arr.length);  //3
		System.out.println(arr[0].length);  //3
		System.out.println(arr[1].length);  //2
		
		
		//遍历二维数组
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = 0;j <arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
