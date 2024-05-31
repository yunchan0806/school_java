import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DesktopGoose {
    private JWindow window;
    private JLabel gooseLabel;
    private Timer timer;
    private Timer get_mouse_timer;
    private Random random;
    private int x = 0;
    private int y = 0;
    private int new_x = 0;
    private int new_y = 0;
    private ImageIcon rightIcon;
    private ImageIcon leftIcon;
    private Robot robot;
    public DesktopGoose() {
        Point initialPoint = MouseInfo.getPointerInfo().getLocation();
        x = initialPoint.x;
        y = initialPoint.y;
        random = new Random(); 

        window = new JWindow();
        try{
            robot = new Robot();
        }catch(Exception e){
            e.getStackTrace();
        }
        window.setSize(120, 120);
        window.setBackground(new Color(0, 0, 0, 0)); // 투명 배경 설정
         window.setAlwaysOnTop(true);

        // 거위 이미지 아이콘 생성
        rightIcon = new ImageIcon("gg-unscreen.gif"); // 오른쪽 이동 이미지
        leftIcon = new ImageIcon("gg-unscreen-ezgif.com-effects.gif"); // 왼쪽 이동 이미지

        // JLabel을 생성하고 초기 거위 이미지를 설정합니다.
        gooseLabel = new JLabel(rightIcon);
        window.getContentPane().add(gooseLabel);

        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set_point();
                moveGoose();
            }
        });

        get_mouse_timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveGoose();
                moveMouse();
            }
        });

        window.setVisible(true);
        timer.start();
    }

    private void set_point() {
        
        
        Point p = MouseInfo.getPointerInfo().getLocation();
        new_x = p.x;
        new_y = p.y;
        System.out.println("new_x: " + new_x + " new_y: " + new_y + " x: " + x + " y: " + y);
    }
    private void get_mouse(){
        new_x = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width - window.getWidth());
        new_y = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - window.getHeight());
        System.out.println("new_x: " + new_x + " new_y: " + new_y + " x: " + x + " y: " + y);
    }
    private void moveGoose() {
        if (x != new_x || y != new_y) {
            if (x > new_x) {
                gooseLabel.setIcon(leftIcon);
                x -= 1; // 이동 속도 조절
            } else if (x < new_x) {
                gooseLabel.setIcon(rightIcon);
                x += 1;
            }

            if (y > new_y) {
                y -= 1;
            } else if (y < new_y) {
                y += 1;
            }
            window.setLocation(x, y);

        }else{
            if(timer.isRunning()){
                timer.stop();
                get_mouse();
                get_mouse_timer.start();
            }else{
                timer.start();
                get_mouse_timer.stop();
            }
            


        }
        
    }
    private void moveMouse(){
        try{
            robot.mouseMove(x,y);
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopGoose();
            }
        });
    }
}
