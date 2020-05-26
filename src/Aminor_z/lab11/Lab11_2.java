package Aminor_z.lab11;

import Aminor_z.lab11.MainFrame;
import javafx.scene.control.CheckBox;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Lab11_2 {
    final public static int offsetX = 15, offsetY = 7, spanY = 40;

    final public static int getoffsetXPosRelativeTo(JComponent jc) {
        return jc.getLocation().x + jc.getWidth() + offsetX;
    }

    final static JPanel panel = new JPanel();
    final static JTextField num1TF = new JTextField(), num2TF = new JTextField(), resTF = new JTextField();
    final static JComboBox funComboBox = new JComboBox();
    final static JLabel equalLabel = new JLabel("=");
    final static JButton calcButton = new JButton("计算"), clearButton = new JButton("清空结果");
    final static JCheckBox fixCheckBox = new JCheckBox();
    final static JLabel fixLabel = new JLabel("结果取整");
    final static Aminor_z.lab11.MainFrame frame = new MainFrame("一个默默无闻的窗口");

    final public static void calc() {
        if (num1TF.getText().trim().length() == 0) num1TF.setText("0");
        if (num2TF.getText().trim().length() == 0) num2TF.setText("0");
        if(funComboBox.getSelectedIndex()==3)
        {
            if("0".trim().equals(num2TF.getText().trim()))
            {
                resTF.setText("除数不能为0");
                return;
            }
        }
        BigDecimal n1 = new BigDecimal(num1TF.getText().trim()), n2 = new BigDecimal(num2TF.getText().trim());
            if (fixCheckBox.isSelected()) {
                switch (funComboBox.getSelectedIndex()) {
                    case 0:
                        resTF.setText(String.valueOf(n1.add(n2).intValue()));
                        break;
                    case 1:
                        resTF.setText(String.valueOf(n1.subtract(n2).intValue()));
                        break;
                    case 2:
                        resTF.setText(String.valueOf(n1.multiply(n2).intValue()));
                        break;
                    case 3:
                        resTF.setText(String.valueOf(n1.divide(n2).intValue()));
                        break;
                    default:
                        break;
                }
            } else {
                switch (funComboBox.getSelectedIndex()) {
                    case 0:
                        resTF.setText(String.valueOf(n1.add(n2).doubleValue()));
                        break;
                    case 1:
                        resTF.setText(String.valueOf(n1.subtract(n2).doubleValue()));
                        break;
                    case 2:
                        resTF.setText(String.valueOf(n1.multiply(n2).doubleValue()));
                        break;
                    case 3:
                        resTF.setText(String.valueOf(n1.divide(n2).doubleValue()));
                        break;
                    default:
                        break;
                }
            }
    }

    final public static void init() throws IOException {
        frame.setLocationRelativeTo(null);
        Dimension size2d3 = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width * 2 / 3, Toolkit.getDefaultToolkit().getScreenSize().height * 2 / 3);
        frame.setSize(size2d3);
        frame.setIconImage(ImageIO.read(Lab11_1.class.getResource("resources/images/Icon.png")));
        frame.setLayout(null);
        panel.setLayout(null);
        panel.setLocation(0, 0);
        funComboBox.addItem("+");
        funComboBox.addItem("-");
        funComboBox.addItem("×");
        funComboBox.addItem("÷");
        panel.setSize(frame.getSize());
        num1TF.setSize(80, 30);
        num2TF.setSize(80, 30);
        resTF.setSize(120, 30);
        equalLabel.setSize(20, 30);
        funComboBox.setSize(40, 30);
        calcButton.setSize(100, 30);
        clearButton.setSize(100, 30);
        fixCheckBox.setSize(25, 30);
        fixLabel.setSize(50, 30);
        num1TF.setLocation(offsetX, spanY);
        funComboBox.setLocation(getoffsetXPosRelativeTo(num1TF), spanY);
        num2TF.setLocation(getoffsetXPosRelativeTo(funComboBox), spanY);
        equalLabel.setLocation(getoffsetXPosRelativeTo(num2TF) - 5, spanY);
        resTF.setLocation(getoffsetXPosRelativeTo(equalLabel) - 10, spanY);
        calcButton.setLocation(getoffsetXPosRelativeTo(resTF), spanY);
        clearButton.setLocation(getoffsetXPosRelativeTo(resTF), spanY + 30 + offsetY + 5);
        fixCheckBox.setLocation(getoffsetXPosRelativeTo(resTF), spanY + 60 + (offsetY << 1));
        fixLabel.setLocation(getoffsetXPosRelativeTo(fixCheckBox) - offsetX + 5, spanY + 60 + (offsetY << 1));
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calc();
            }
        });
        panel.add(num1TF);
        panel.add(num2TF);
        panel.add(funComboBox);
        panel.add(resTF);
        panel.add(equalLabel);
        panel.add(calcButton);
        panel.add(clearButton);
        panel.add(fixCheckBox);
        panel.add(fixLabel);
        frame.add(panel);
        frame.show();
    }


    public static void main(String[] args) throws IOException {
        init();
    }
}
