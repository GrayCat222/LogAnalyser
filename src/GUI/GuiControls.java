package GUI;

import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public abstract class GuiControls {
    public static int screenWidth;
    public static int screenHeight;
    private static Properties guiProperty;

    /**
     * Метод обсчитывает актуальный размер фрейма
     *
     * @param minSize    Минимальный размер фрейма
     * @param percentage Процентаж в зависимости от размера окна
     * @param value      Само значение, от которого надо посчитать процентаж
     * @return Подходящий размер
     */
    private static int calculatePanelSize(int minSize, int percentage, double value) {
        if (percentage == 100) {
            return (int) value;
        }
        double cSize = value * percentage / 100;
        return minSize > cSize ? minSize : (int) cSize;
    }

    public static Dimension setPanelSize(String panelName) {
        String widthPercentageParameterName = panelName + "PanelWidthPercentage";
        String heightPercentageParameterName = panelName + "PanelHeightPercentage";
        String minWidth = panelName + "MinWidth";
        String minHeight = panelName + "MinHeight";
        double widthPercentage = Double.parseDouble(guiProperty.getProperty(widthPercentageParameterName, "100")) / 100;
        double heightPercentage = Double.parseDouble(guiProperty.getProperty(heightPercentageParameterName, "100")) / 100;
        int widthMin = Integer.parseInt((guiProperty.getProperty(minWidth, "0")));
        int heightMin = Integer.parseInt((guiProperty.getProperty(minHeight, "0")));
        int width = widthPercentage == 1 ? screenWidth : (int) Math.max(widthMin, screenWidth * widthPercentage);
        int height = heightPercentage == 1 ? screenHeight : (int) Math.max(heightMin, screenHeight * heightPercentage);
        System.out.println(panelName + " " + width + "  " + height);
        return new Dimension(width, height);
    }

    /**
     * читаем файл пропертей для графики.
     */
    public static void readGUIProperties() {
        guiProperty = new Properties();
        try (InputStream input = new FileInputStream("properties/gui.properties")) {
            guiProperty.load(input);
            System.out.println("GUI properties loaded");
        } catch (Exception e) {
            System.out.println("File properties/gui.properties not Found");
            e.printStackTrace();
        }
    }

    /**
     * Сеттеры и геттеры
     */
    public static int getScreenWidth() {
        return screenWidth;
    }

    public static void setScreenWidth(int screenWidth) {
        GuiControls.screenWidth = screenWidth;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

    public static void setScreenHeight(int screenHeight) {
        GuiControls.screenHeight = screenHeight;
    }
}
