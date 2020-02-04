package controller;

import java.io.File;
import model.Image;
import model.FileImageLoader;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\lj116\\OneDrive\\Escritorio\\Texture2D");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
    
}