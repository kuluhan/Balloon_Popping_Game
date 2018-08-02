/**
 * test class with a main method that runs the balloon game
@author Kuluhan Binici
@date 23.03.2016
*/
import shapes.*;
import java.awt.*;
import javax.swing.*;

public class Lab04b
{
 static JFrame mainFrame = new JFrame();
 public static void main(String args[])
 {
    BalloonsGamePanel gamePanel = BalloonsGamePanel.getPanel();
    mainFrame.add(gamePanel);
    mainFrame.setVisible(true);
    mainFrame.setSize(800,600);
    mainFrame.repaint();
 }
}