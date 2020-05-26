package Aminor_z.lab11;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.IOException;

public class MainFrame extends JFrame {
    private Dimension size = new Dimension(600, 400);
    public MainFrame(String title){
        super(title);
        setSize(size);
        setDefaultCloseOperation(3);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

            }
        });
    }
}
