import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Timer timer = new Timer();
            Thread.sleep(5000);
            while (true) {
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(1000);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_W);
                Thread.sleep(1000);
                robot.keyRelease(KeyEvent.VK_W);
                robot.keyPress(KeyEvent.VK_S);
                Thread.sleep(1000);
                robot.keyRelease(KeyEvent.VK_S);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                Thread.sleep(5000);
            }

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
