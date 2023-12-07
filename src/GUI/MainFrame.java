package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TopPanel topPanel;
    private BottomPanel bottomPanel;
    private ContentPanel contentPanel;
    private WestPanel westPanel;

    public MainFrame() {
        super();
        initFrame();
        initComponents();
        displayComponents();
    }

    private void initFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        GuiControls.setScreenWidth((int) toolkit.getScreenSize().getWidth());
        GuiControls.setScreenHeight((int) toolkit.getScreenSize().getHeight());
        setSize(GuiControls.getScreenWidth(), GuiControls.getScreenHeight());
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        topPanel = new TopPanel();
        bottomPanel = new BottomPanel();
        westPanel = new WestPanel();
        contentPanel = new ContentPanel();
    }

    private void displayComponents() {
        add(topPanel, BorderLayout.NORTH);
        add(westPanel, BorderLayout.WEST);
        add(bottomPanel, BorderLayout.SOUTH);
        add(contentPanel, BorderLayout.CENTER);
    }
}
