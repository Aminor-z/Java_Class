package Aminor_z.lab12;

import Aminor_z.lab10.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;

import static java.awt.event.ActionEvent.CTRL_MASK;
import static java.awt.event.KeyEvent.*;

public class Lab12 {
    public static void main(String[] args) throws IOException, InterruptedException {
        MainFrame frame = new MainFrame("一个默默无闻的窗口");
        frame.setLocationRelativeTo(null);
        frame.setSize(600,400);
        frame.setIconImage(ImageIO.read(Lab12.class.getResource("resources/images/Icon.png")));
        JMenuBar jMenuBar= new JMenuBar();
        frame.setJMenuBar(jMenuBar);
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("new..");
        newItem.setMnemonic('N');
        newItem.setAccelerator(KeyStroke.getKeyStroke(VK_N,CTRL_MASK));
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd=new JDialog();
                jd.setLocationRelativeTo(null);
                jd.setSize(300,200);
                jd.add(new JLabel("您点击了New菜单",JLabel.CENTER),BorderLayout.CENTER);
                jd.show();
                return;
            }
        });
        JMenuItem openItem = new JMenuItem("open..");
        openItem.setMnemonic('N');
        openItem.setAccelerator(KeyStroke.getKeyStroke(VK_O,CTRL_MASK));
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd=new JDialog();
                jd.setLocationRelativeTo(null);
                jd.setSize(300,200);
                jd.add(new JLabel("您点击了Open菜单",JLabel.CENTER),BorderLayout.CENTER);
                jd.show();
            }
        });
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        JToolBar jToolBar = new JToolBar();
        JButton newButton = new JButton("new"),openButton = new JButton("open");
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd=new JDialog();
                jd.setLocationRelativeTo(null);
                jd.setSize(300,200);
                jd.add(new JLabel("您点击了New菜单",JLabel.CENTER),BorderLayout.CENTER);
                jd.show();
                return;
            }
        });
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd=new JDialog();
                jd.setLocationRelativeTo(null);
                jd.setSize(300,200);
                jd.add(new JLabel("您点击了open菜单",JLabel.CENTER),BorderLayout.CENTER);
                jd.show();
                return;
            }
        });
        jToolBar.add(newButton);
        jToolBar.add(openButton);
        JMenu editMenu = new JMenu("edit");
        JMenuItem searchItem = new JMenuItem("search"),showItem= new JMenuItem("show");
        editMenu.add(searchItem);
        editMenu.add(showItem);
        searchItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd=new JDialog(frame,"search",false);
                jd.setLocationRelativeTo(null);
                jd.setSize(300,200);
                jd.add(new JLabel("您点击了search菜单",JLabel.CENTER),BorderLayout.CENTER);
                jd.show();
            }
        });
        showItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd=new JDialog(frame,"show",true);
                jd.setLocationRelativeTo(null);
                jd.setSize(300,200);
                jd.add(new JLabel("您点击了show菜单",JLabel.CENTER),BorderLayout.CENTER);
                jd.show();
            }
        });
        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);
        frame.add(jToolBar,BorderLayout.NORTH);
        String[] dataTitle = {"编号","内容"};
        String[][] data ={{"15h001","张三"},{"15h002","李四"}};
        JTable jTable=new JTable(data,dataTitle);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        frame.add(jScrollPane,BorderLayout.CENTER);
        frame.show();
    }
}
