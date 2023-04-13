package Tregulov.innerClasses.anonymousClass;

import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassExampleTest {

    @Test
    public void anonymousClassTest() {
        // Declare an anonymous inner class that extends Thread
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Thread 1 is running");
            }
        };

        System.out.println(t1.getClass());

        // Declare an anonymous inner class that implements ActionListener interface
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        };

        System.out.println(listener.getClass());

        // Start the thread
        t1.start();

        // Register the event listener
//        button.addActionListener(listener);
    }
}