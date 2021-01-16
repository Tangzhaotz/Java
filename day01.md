## day01

在一个java源文件中可以声明多个class，但是最多只能由一个类声明为public的，而且要求声明为public的类的类名必须与源文件名相同。

```java
public class Hello
{
    public ststic void main(String[] args)
    {
        System.out.println("hello world");
    }
}

class Person
{
}

class Animal
{
    
}
```

程序的入口是main（），格式是固定的

输出语句：

```java
System.out.println();  //先输出数据，然后换行
System.out.print();  //只输出数据，不换行
```

编译的过程：javac编译，会生成多个字节码文件，文件名与类名相同

### java基本语法

java特点：

面向对象性：类和对象

特点：去除了C语言中的指针；具有垃圾回收机制，但是仍然会存在内存泄漏等。

#### 标识符

凡是可以自己起名字的地方都叫标识符，如：类名、变量名、包名。。。

标识符命名规则：

1、数字不能作为开头

2、java中严格区分大小写

3、标识符不能包含空格

```java
class IdentifierTest
{
    public static void void main(String[] args)
    {
        
    }
}
```

java中的命名规范：

1、包名：多单词组成时，所有字母都小写：xxxxxyyyyzzz

2、类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz

3、变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始的每一个单词首字母大写

4、常量名：所有字母都大写，多单词时，每个单词用下划线链接：XXX_YYY_ZZZ

### 变量

变量先声明，再赋值，定义之后才可以使用

每个变量都有一个作用域，只有在作用域内才有效，同一个作用域内不能定义同名的变量

### java中数据类型

![image-20210116104446425](C:\Users\tz\AppData\Roaming\Typora\typora-user-images\image-20210116104446425.png)

java中整型常量默认为int型，声明long型常量后面添加"l"或者"L";

byte范围：-128-127

java中浮点类型默认为double，声明float类型常量，后面要添加"f"或者"F"。

### 类型转换

1、自动类型提升

```java
class VariableTest2
{
    public static void main(String[] args)
    {
        byte b1 = 2;
        int i1=129;
        //byte b2 = b1 + i1;  //编译不通过
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2);  //131
        
        float f = b1 + i1;
        System.out.println(f);  //131.0
        
        //************************************
        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3; 
        System.out.println(i4);  //107
        
        
        short s2 = 10;
        //short s3 = c1 + s2;  //编译错误
        
    }
}
```

byte、char、short-->short -->int -->long-->float-->double

**结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据量**

此时的容量的大小表示数的范围的大小。

特别的：当short、byte、char三种类型做运算时，结果为int

2、强制类型转换

自动类型提升的逆运算

```java
class VariableTest3
{
    public static void main(String[] args)
    {
        double d1 = 12.3;
        int i1 = (int)d1;  //截断操作，强制类型转换
        System.out.println(i1);  //12
    }
}
```

强制类型转换：用（）

强制类型转换可能会导致精度损失

```java
class VariableTest4
{
	public static void main(String[] args)
    {
        //1、编码情况
        long l = 123213;
        System.out.println(l);
        //编译失败:过大的整数
        //long l1 = 2213123213213131;
        long l1 = 2213123213213131L;
        
       //*************************
        //float f1 = 12.3;  //编译失败，末尾加f
       
        //编码情况2：
        //整型常量，默认类型为int
        //浮点型常量，默认为double
        byte b = 12;
        byte b1 = b + 1;  //1是整形常量，默认为int，这里编译失败
        float f1 = b + 12.3;  //编译失败
    }
}
```



### String

String不是基本的数据类型，是引用数据类型,翻译为字符串

```java
class StringTest
{
    public static void main(String[] args)
    {
        String s1 =- "hello world";
        System.out.println(s1);
        
        String s2 = "a";
        String s3 = "";
        
        //********************
        int number = 1001;
        String numberStr = "学号";
        String info = numberStr + number;  //连接运算
    }
}
```

