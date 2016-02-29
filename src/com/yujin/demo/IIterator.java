package com.yujin.demo;
/**
 * 演示接口声明中可以有方法声明和方法实现
 * 之前总以为接口中只可以有方法声明，不可以有方法实现
 * 
 * 接口中可以有方法实现，还可以在接口中定义实体类。
 * 
 * @author yujin
 *
 * @param <E>
 */
public interface IIterator<E> {

    public boolean hasNext();
    
    E remove(E e);
    
    default void contain(Person p) {
        System.out.println("接口中可以有方法的实现");
    }
    /**
     * 在接口中定义实体类
     * @author yujin
     *
     */
    class Person {
        String firstName;
        String middleName;
        String lastName;
        long id;
        int age;
    }
}

class Imp<E> implements IIterator<E> {

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E remove(E e) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static void main(String[] args) {
        Imp imp = new Imp();
        imp.contain(new Person());
    }
    
}
