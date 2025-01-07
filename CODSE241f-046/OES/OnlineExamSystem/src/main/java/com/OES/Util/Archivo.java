package com.OES.Util;

import java.awt.Font;
import java.io.InputStream;

public class Archivo {
    public static Font getFont(int size) {
        Font archivoFont;
        try (InputStream is = Archivo.class.getResourceAsStream("/fonts/ArchivoBlack-Regular.ttf")) {
            // Load the Cinzel font from the resource
            archivoFont = Font.createFont(Font.TRUETYPE_FONT, is);
            // Derive the font with the specified size
            archivoFont = archivoFont.deriveFont((float) size);
        } catch (Exception e) {
            // Fallback to a default font in case of an error
            archivoFont = new Font("Serif", Font.PLAIN, size);
            e.printStackTrace();
        }
        return archivoFont;
    }
}
