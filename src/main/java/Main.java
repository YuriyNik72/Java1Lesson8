
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    // Главный метод

    public static void main(String[] args) throws InterruptedException,
            InvocationTargetException, ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            UnsupportedLookAndFeelException {


        // запуск приложения
        EventQueue.invokeAndWait(new Runnable() {
            public void run() {
                // создание главного окна
                GameFrame wnd = new GameFrame();
                wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                wnd.setTitle("Крестики-нолики");
                wnd.setLocation(100, 100);
                wnd.setVisible(true);
            }
        });

    }

}
