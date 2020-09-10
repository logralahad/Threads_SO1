/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class main {
        public static void main(String[] args) {

        Thread t_1 = new numero();
        Thread t_2 = new letra();
        t_1.start();
        t_2.start();


        }

}
class numero extends Thread  {

    public void run(){
        for(int i = 0; i<10000;i++){
            System.out.println(i);
        }
    }
}
class letra extends Thread {

    public void run(){
        for(int i = 0; i<100000000;i++){

            System.out.println("a");
        }
    }
}
