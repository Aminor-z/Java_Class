package Aminor_z.lab10;

import java.awt.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

final public class DrawLoader {
    static Queue<IDrawer> queue = new LinkedList<>();
    public static void add(IDrawer d)
    {
        queue.add(d);
    }
    public static void PaintAll(Graphics g)
    {
        while(!queue.isEmpty())
        {
        queue.poll().draw(g);
        }
    }
}
