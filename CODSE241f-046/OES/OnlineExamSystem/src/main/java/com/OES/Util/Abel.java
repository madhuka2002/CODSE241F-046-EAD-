package com.OES.Util;

import java.awt.Font;
import java.io.InputStream;

public class Abel {
    public static Font getFont(int size) {
        Font abelFont;
        try (InputStream is = Abel.class.getResourceAsStream("/fonts/Abel-Regular.ttf")) {
            // Load the Cinzel font from the resource
            abelFont = Font.createFont(Font.TRUETYPE_FONT, is);
            // Derive the font with the specified size
            abelFont = abelFont.deriveFont((float) size);
        } catch (Exception e) {
            // Fallback to a default font in case of an error
            abelFont = new Font("Serif", Font.PLAIN, size);
            e.printStackTrace();
        }
        return abelFont;
    }
}
