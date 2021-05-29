package Threads;/*
* before start we have to understand the inheritance
*
*  java.lang.Object
*       ^
*       |
*   Thread  (class implements Runnable interface)
*
*   Runnable is a interface have a method called run so we have to Override this method in any class
*   extends Tread or implements Runnable directly
*
* */


public class Main {
    public static void main(String[] args){
        System.out.println("hello from main");
        start();

    }
    public static void start(){
        /*
        * for start thread from class extends Thread directly we have to make an object
        * from this class then run start method
        *
        * */

        ThreadsExt th = new ThreadsExt() ;
        th.start();


        /*
         * for start thread from class implements Runnable  we have to make an object ex ob1
         * from this class then make object from Thread class and pass ob1 to it as a parameter to access start method
         * then call start() method this method calls obj1.run()
         *
         * */

        ThreadsImp task = new ThreadsImp();
        Thread objFromThreadClass = new Thread(task);
        objFromThreadClass.start();
    }
}
class ThreadsExt extends Thread {
    @Override
    public void run (){
        System.out.println("hello From class extends Tread");
    }
}
class ThreadsImp implements Runnable {

    @Override
    public void run() {
        System.out.println("hello From class implements Runnable");
    }
}