java 初始化类的顺序 先初始基类和类的静态代码块、方法，再初始化基类的成员变量，在初始化基类的构造方法，再初始化该类的成员变量，再初始化类的构造方法
instance of和isinstance的逻辑是判断是否是该类或者是该类的基类，==直接判断类地址
反射的意思是.class文件不是由编译器编译生成的
类的方法都是动态生成的，所以才造成了多态 Object o=new integer(0); List<Map> 可以得到hashMap,linkHashMap
泛型例如List<T>编译器是能识别的，T表示类型参数
抛出Exception throw new Exception()
linkedlist是一个双向链表

适配器 现有的接口跟目标接口有点差异，用一个类实现目标接口，就称之为适配器 比如inputstream只读进来字节，但是我需要读入字符，则创建一个
inputstramreader适配器
装饰器 功能跟加完善 bufferreader 使用缓存读取数据
迭代器 通常用于容器，在不需要了解类的细节就可以得到数据
二叉树遍历 有前中后序三种遍历，表示根节点的访问次序
进程是运行在自己地址空间的程序
操作系统实现并发 是使用进程
java实现并发 是使用单一的进程的线程
一个线程是进程中单一顺序控制流，任务有执行线程驱动
线程同步方面可以使用原子类、可见、加锁、使用线程安全类   volatile、synchronized 和 final 实现性
　当对非 volatile 变量进行读写的时候，每个线程先从内存拷贝变量到CPU缓存中。如果计算机有多个CPU，每个线程可能在不同的CPU上被处理，这意味着每个线程可以拷贝到不同的 CPU cache 
Vector/Hashtable类StringBuffer是线程安全


io nio   从线程方面去分析他们的不同，单线程，io是阻塞的


Java thread interrupt 只是一个标示，并不会中断
