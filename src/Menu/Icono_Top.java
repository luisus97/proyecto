package Menu;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icono_Top implements Icon{
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {        
        Image trofeo = new ImageIcon(getClass().getResource("/Imagenes/Menu/Top_Icon.png")).getImage();
        g.drawImage(trofeo, x, y, c);        
    }
    @Override
    public int getIconWidth() {        
        return 50;        
    }
    @Override
    public int getIconHeight() {        
        return 50;        
    }   
}