package GUI;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
    public BottomPanel() {
        super();
        setBackground(Color.GRAY);
        initPanel();
    }

    private void initPanel() {
        setPreferredSize(GuiControls.setPanelSize("bottom"));
    }
}
