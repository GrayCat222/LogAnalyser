package GUI;

import javax.swing.*;
import java.awt.*;

public class WestPanel extends JPanel {
    public WestPanel() {
        super();
        setBackground(Color.green);
        initPanel();
    }

    private void initPanel() {
        setPreferredSize(GuiControls.setPanelSize("west"));
    }
}
