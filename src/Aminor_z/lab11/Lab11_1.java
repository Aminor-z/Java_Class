package Aminor_z.lab11;

import Aminor_z.lab10.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Lab11_1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        MainFrame frame = new MainFrame("一个默默无闻的窗口");
        Dimension size2d3 = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width * 2 / 3, Toolkit.getDefaultToolkit().getScreenSize().height * 2 / 3);
        frame.setSize(size2d3);
        frame.setIconImage(ImageIO.read(Lab11_1.class.getResource("resources/images/Icon.png")));
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setSize(frame.getSize());
        panel.add(new JButton("按钮1"));
        JButton redButton = new JButton("红色按钮");
        redButton.setBackground(Color.red);
        panel.add(redButton);
        panel.add(new JLabel("我是谁"));
        JRadioButton radio1 = new JRadioButton("单选1");
        JRadioButton radio2 = new JRadioButton("单选2");
        ButtonGroup groupRadio = new ButtonGroup();
        groupRadio.add(radio1);
        groupRadio.add(radio2);
        panel.add(radio1);
        panel.add(radio2);
        JCheckBox checkBox1 = new JCheckBox("复选1");
        JCheckBox checkBox2 = new JCheckBox("复选2");
        ButtonGroup groupCheckBox = new ButtonGroup();
        groupCheckBox.add(checkBox1);
        groupCheckBox.add(checkBox2);
        panel.add(checkBox1);
        panel.add(checkBox2);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("专科生");
        comboBox.addItem("本科生");
        comboBox.addItem("研究生");
        comboBox.addItem("博士生");
        panel.add(comboBox);
        JList list = new JList(new String[]{"中国", "美国", "巴基斯坦"});
        panel.add(list);
        JTextField jTextField = new JTextField("我是计量人");
        panel.add(jTextField);
        JPasswordField jPasswordField = new JPasswordField(20);
        panel.add(jPasswordField);
        frame.getContentPane().add(panel);
        frame.show();
    }
}
