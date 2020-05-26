package Aminor_z.lab10;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Lab10 {

    public static void main(String[] args) throws IOException, InterruptedException {
        MainFrame frame = new MainFrame("一个默默无闻的窗口");
        Dimension size2d3 = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width*2/3,Toolkit.getDefaultToolkit().getScreenSize().height*2/3);
        frame.setSize(size2d3);
        frame.setIconImage(ImageIO.read(Lab10.class.getResource("resources/images/Icon.png")) );
        DrawLoader.add(new IDrawer(){
            @Override
            public void draw(Graphics g) {
                Graphics2D g2 = (Graphics2D)g;
                Color c = g2.getColor();//将原来的颜色进行保存    获取原来的颜色
                Font f = g2.getFont();
                g2.setColor(Color.RED);
                g2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16)); //顺序一次是字体，风格，大小
                g2.drawString("This is my first graphic:", 200, 75);
                g2.setColor(Color.black);
                g2.setStroke(new BasicStroke(3.0f));
                g2.drawOval(100, 100, 400, 300);
                g2.setColor(Color.blue);
                g2.fillRect(125, 225, 100, 50);
                g2.setColor(Color.red);
                g2.drawLine(225,250,375,250);
                g2.drawLine(350,225,375,250);
                g2.drawLine(350,275,375,250);
                g2.setColor(Color.green);
                g2.drawOval(375, 225, 100, 50);
                g2.setColor(c);
                g2.setFont(f);
            }
        });
        DrawLoader.PaintAll(frame.getGraphics());
    }
}
