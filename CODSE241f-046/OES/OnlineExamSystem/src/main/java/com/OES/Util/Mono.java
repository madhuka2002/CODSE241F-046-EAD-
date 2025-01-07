package com.OES.Util;

import java.awt.Font;
import java.io.InputStream;

public class Mono {
    public static Font getFont(int size) {
        Font monoFont;
        try (InputStream is = Mono.class.getResourceAsStream("/fonts/JetBrainsMono-Regular.ttf")) {
            // Load the Cinzel font from the resource
            monoFont = Font.createFont(Font.TRUETYPE_FONT, is);
            // Derive the font with the specified size
            monoFont = monoFont.deriveFont((float) size);
        } catch (Exception e) {
            // Fallback to a default font in case of an error
            monoFont = new Font("Serif", Font.PLAIN, size);
            e.printStackTrace();
        }
        return monoFont;
    }
}
