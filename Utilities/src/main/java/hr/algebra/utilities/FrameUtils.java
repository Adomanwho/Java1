/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.utilities;

import javax.swing.JFrame;

/**
 *
 * @author Andrej
 */
public class FrameUtils {
    public static void openFrame(JFrame newFrame, JFrame currentFrame) {
        if(currentFrame != null) currentFrame.dispose();
        newFrame.setVisible(true);
    }
}
