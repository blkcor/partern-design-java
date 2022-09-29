/**
 * @author: blkcor
 * @DATE: 2022/9/29  10:37
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Singleton_Lazy {
    /**
     * 懒汉式单例 线程不安全
     * 为什么线程不安全？
     * 因为在多线程的情况下，可能会有多个线程同时进入if判断，然后同时new出来多个实例
     * 如何解决？
     * 1.加锁 synchronized
     * 2.双重检查锁
     * 3.静态内部类
     * 4.枚举
     * 5.容器
     * 6.线程池
     * 7.线程本地变量
     * 8.线程安全的集合
     * 9.线程安全的工具类
     * 10.线程安全的数据结构
     * 11.线程安全的算法
     * 12.线程安全的对象
     * 13.线程安全的类
     * 14.线程安全的方法
     * 15.线程安全的代码块
     * 16.线程安全的变量
     */
    private volatile static Singleton_Lazy singleton;

    private Singleton_Lazy() {
    }

    public static  Singleton_Lazy getInstance() {
        if (singleton == null) {
            synchronized (Singleton_Lazy.class) {
                if (singleton == null) {
                    singleton = new Singleton_Lazy();
                }
            }
        }
        return singleton;
    }
}
