package Menu;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icon_Ayuda implements Icon{
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {        
        Image ayuda = new ImageIcon(getClass().getResource("/Imagenes/Menu/Ayuda_Icon.jpeg")).getImage();
        g.drawImage(ayuda, x, y, c);        
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