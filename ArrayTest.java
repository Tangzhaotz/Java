package array01;

//2021.1.19
//数组
/*
 * 数组的特点：
 * 1）数组是有序排列的
 * 2）、数组属于引用数据类型的变量，数组的元素，既可以是基本的数据类型，也可以是引用数据类型
 * 3）、创建数组会在内存中开辟一段连续的空间
 * 4）、数组的长度一旦确定，就不能修改
 *
 * */


//一维数组的使用
public class ArrayTest {
	public static void main(String[] args)
	{
		int[] ids;//声明
		
		//静态初始化:数组的初始化和数组元素的赋值同时进行
		ids = new int[]{1001,1002,1003,1004};
		
		//动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		//错误的写法
		/*
		int[] arr1 = new int[];
		int[5] arr2 = new int [5];
		int [] arr3 = new int[3]{1,2,3};*/
		
		//总结：数组一旦初始化，长度就确定了
		
		
		//2、调用数组中指定位置的元素:通过角标的方式调用
		names[0] = "小王";
		names[1]="王鹤";
		names[2] = "张学良";
		names[3] = "孙巨龙";
		names[4] = "王志宏";
		
		//3、获取数组的长度
		System.out.println(names.length);  //5
		System.out.println(ids.length);  //4
		
		//4、遍历数组
		for(int i = 0;i < names.length;i++)
		{
			System.out.println(names[i]);
		}
		
	}

}
