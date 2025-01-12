package aa.as;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SystemTrayDemo {

    public static void main(String[] args) {
        // Check if SystemTray is supported
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            System.exit(1);
        }

        // Create a TrayIcon
        Image image = null;
        try {
            image = ImageIO.read(SystemTrayDemo.class.getResourceAsStream("/path/to/your/icon.png")); 
        } catch (IOException e) {
            System.out.println("Image could not be loaded");
            System.exit(1);
        }
        TrayIcon trayIcon = new TrayIcon(image, "Your Application Name");
        trayIcon.setImageAutoSize(true); 

        // Create a PopupMenu
        PopupMenu popup = new PopupMenu();
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        MenuItem exitItem = new MenuItem("Exit");

        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle item1 action
            }
        });

        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle item2 action
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        popup.add(item1);
        popup.add(item2);
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);

        try {
            SystemTray.getSystemTray().add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            System.exit(1);
        }

        System.out.println("Tray icon added.");
    }
}