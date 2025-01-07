package com.OES.Util;

import java.awt.Font;
import java.io.InputStream;

public class Marcellus {
    public static Font getFont(int size) {
        Font marcellusFont;
        try (InputStream is = Marcellus.class.getResourceAsStream("/fonts/Marcellus-Regular.ttf")) {
            // Load the Cinzel font from the resource
            marcellusFont = Font.createFont(Font.TRUETYPE_FONT, is);
            // Derive the font with the specified size
            marcellusFont = marcellusFont.deriveFont((float) size);
        } catch (Exception e) {
            // Fallback to a default font in case of an error
            marcellusFont = new Font("Serif", Font.PLAIN, size);
            e.printStackTrace();
        }
        return marcellusFont;
    }
}
