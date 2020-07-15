
//【1】----------------------------------------------------	
//	Java中JDK、JRE、JVM三者之间的关系
//	1、JDK：JDK（Java Development Kit） 是 Java 语言的软件开发工具包（SDK）。它是每一个Java软件开发人员必须安装的。JDK安装之后，它会自带一个JRE，因为软件开发人员编写完代码之后总是要运行的。注意：如果只是在这台机器上运行Java程序，则不需要安装JDK，只需要安装JRE即可。
//	2、JRE：JRE（Java Runtime Environment，Java运行环境），运行JAVA程序所必须的环境的集合，包含JVM标准实现及Java核心类库。		 
//	3、JVM：JVM是Java Virtual Machine（Java虚拟机）的缩写，JVM是一种用于计算设备的规范，它是一个虚构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。
		
//【2】----------------------------------------------------	
//	字符类型
//	\n表示换行符
//	\’表示普通的单引号字符，
//	\\表示一个普通的\字符，
//	\”表示一个普通的双引号字符，

//【3】----------------------------------------------------	
// Java中public class与class的区别
// 一个java源文件中可以定义多个class，并且在编译的时候一个class会对应编译生成一个class字节码文件。还有，public的class可以没有。

//【4】----------------------------------------------------	
// Java关键字 
//1、用于数据类型。

//用于数据类型的关键字有 boolean、byte、char、 double、 false、float、int、long、new、short、true、void、instanceof。

//2、用于语句。

//用于语句的关键字有break、case、 catch、 continue、 default 、do、 else、 for、 if、return、switch、try、 while、 finally、 throw、this、 super。

//3、用于修饰

//用于修饰的关键字有 abstract、final、native、private、 protected、public、static、synchronized、transient、 volatile。

//4、用于方法、类、接口、包和异常。

//用于方法、类、接口、包和异常的关键字有 class、 extends、 implements、interface、 package、import、throws。

//还有些关键字,如cat、 future、 generic、innerr、 operator、 outer、rest、var等都是Java保留的没有意义的关键字。

//另外，Java还有3个保留字:true、false、null。它们不是关键字，而是文字。包含Java定义的值。和关键字一样,它们也不可以作为标识符使用。

//【5】----------------------------------------------------	
//Java中的数据类型包括两种，分别是：

//● 基本数据类型
//● 引用数据类型

//Java中的基本数据类型又包括四类8种：
//● 整数型（不带小数的数字）：byte,short,int,long
//● 浮点型（带小数的数字）：float,double
//● 字符型（文字，单个字符）：char
//● 布尔型（真和假）：boolean
//java中除了以上的8种基本数据类型之外，其它的数据类型均属于引用数据类型，也就是说字符串在java中不属于基本数据类型，而属于引用数据类型

//【6】----------------------------------------------------	
//Java字符类型：
// \n表示换行符，\’表示普通的单引号字符，\\表示一个普通的\字符，\”表示一个普通的双引号字符，\ u 后面的十六进制是文字的Unicode编码。

//【7】----------------------------------------------------	
// Java递归
//	
//	public static int accumulate(int n){
//		if(n == 1){
//
//			return 1;
//			
//		} 
//		System.out.println(accumulate(n - 1));
//
//		return n + accumulate(n - 1);
//	}

//【8】----------------------------------------------------	
// 	Java方法重载
//	代码满足什么条件的时候构成方法重载呢？满足以下三个条件：
// 
//	● 在同一个类当中。
// 
//	● 方法名相同。
// 
//	● 参数列表不同：个数不同算不同，顺序不同算不同，类型不同也算不同。

//【8】----------------------------------------------------	
// 	Java面向对象特征
//● 封装（Encapsulation）
// 
//● 继承（Inheritance）
// 
//● 多态（Polymorphism）

//【9】----------------------------------------------------	
// 	Java类中的定义
//	[修饰符] class 类名{
//		类体 = 属性 + 方法
//	
//	}
//【10】----------------------------------------------------	
//  Java构造方法Constructor
// [修饰符列表] 构造方法名(形式参数列表){
//    构造方法体;
//}
//
//class Date {
//	int year; //年
//	int month; //月
//	int day; //日
//	//构造方法(无参数构造方法)
//	public Date(){
//		System.out.println("Date类无参数构造方法执行");
//	}
//	//构造方法(有参数构造方法)
//	public Date(int year1){
//		year = year1;
//		System.out.println("带有参数year的构造方法");
//	}
//	//构造方法(有参数构造方法)
//	public Date(int year1 , int month1){
//		year = year1;
//		month = month1;
//		System.out.println("带有参数year,month的构造方法");
//	}
//	//构造方法(有参数构造方法)
//	public Date(int year1 , int month1 , int day1){
//		year = year1;
//		month = month1;
//		day = day1;
//		System.out.println("带有参数year,month,day的构造方法");
//	}
//}
//
//	System.out.println("main begin");
//	Date time1 = new Date();
//	System.out.println(time1);
//	Date time2 = new Date(2008);
//	System.out.println(time2);
//	Date time3 = new Date(2008 , 8);
//	System.out.println(time3);
//	Date time4 = new Date(2008 , 8 , 8);
//	System.out.println(time4.year);
//	System.out.println("main over");

//【11】----------------------------------------------------	
//Java空指针异常
//class Balloon {
//	//颜色
//	String color;
//	//气体
//	String gas;
//	//构造方法
//	public Balloon(){
//		
//	}
//	public Balloon(String _color , String _gas){
//		color = _color;
//		gas = _gas;
//	}
//}
//
//Balloon ball = new Balloon("红色" , "氢气");
//System.out.println("气球颜色是：" + ball.color);
//System.out.println("气球中的气体是：" + ball.gas);
//ball = null;
//
////空指针异常
//System.out.println("气球颜色是2：" + ball.color);

//【12】----------------------------------------------------	
//Java方法调用时参数的传递问题
//class Bird {
//	String name;
//	public Bird(){}
//	public Bird(String _name){
//		name = _name;
//	}
//}
//
// //基本数据类型
//int a = 10;
//int b = a; //a赋值给b，a把什么给了b？
//a++;
//System.out.println("a = " + a);
//System.out.println("b = " + b);
//
//
////引用数据类型
//Bird bird1 = new Bird("iioss");
////bird1赋值给bird2，bird1把什么给了bird2？
//Bird bird2 = bird1; 
//System.out.println("bird1's name = " + bird1.name);
//System.out.println("bird2's name = " + bird2.name);
//bird2.name = "级啊擦";
//System.out.println("bird1's name = " + bird1.name);
//System.out.println("bird2's name = " + bird2.name);

//【13】----------------------------------------------------	
//Java封装   与  this
//private 私有的  本类中访问

//Java this关键字的使用（在实例方法中）
//this不能使用在static的方法中，可以使用在实例方法中，代表当前对象，多数情况下this是可以省略不写的，但是在区分局部变量和实例变量的时候不能省略，在实例方法中可以直接访问当前对象实例变量以及实例方法，在static方法中无法直接访问实例变量和实例方法。
//Java this关键字的使用（在构造方法中）
//this()语法只能出现在构造方法第一行
//Java中static关键字
//static是java语言中的关键字，表示“静态的”，它可以用来修饰变量、方法、代码块等，修饰的变量叫做静态变量，修饰的方法叫做静态方法，修饰的代码块叫做静态代码块。在java语言中凡是用static修饰的都是类相关的，不需要创建对象，直接通过“类名”即可访问，即使使用“引用”去访问，在运行的时候也和堆内存当中的对象无关。
//Java中static静态变量

//【14】----------------------------------------------------	
//Java如何继承
//class 类名 extends 父类名{
//类体;
//}
//【15】----------------------------------------------------	
//Java方法覆盖  Override



public class home_basis {

	public static void main(String[] args) {
 
		
		
	}	
	

	
}   





























 