/**
 * @author: blkcor
 * @DATE: 2022/9/29  10:35
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Singleton_Hungry {
    /**
     * 饿汉式单例 线程安全  一开始就new出来
     */
    private static Singleton_Hungry singleton = new Singleton_Hungry();

    private Singleton_Hungry() {
    }

    public static Singleton_Hungry getInstance() {
        return singleton;
    }
}
