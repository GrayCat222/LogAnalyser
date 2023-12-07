package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopPanel extends JPanel {
    JButton insertLogButton;
    JTextField logLinkField;

    public TopPanel() {
        super();
        initPanel();
        initComponents();
        displayComponents();
    }

    private void initPanel() {
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(GuiControls.setPanelSize("top"));
//        int width = GuiControls.calculatePanelSize(0, 100, GuiControls.getScreenWidth());
//        int height = GuiControls.calculatePanelSize(60, 10, GuiControls.getScreenHeight());
//        setPreferredSize(new Dimension(width, height));
    }

    private void initComponents() {
        insertLogButton = new JButton("Открыть лог");
        logLinkField = new JTextField(" Ссылка на лог боя ");
        //logLinkField.setPreferredSize(new Dimension((int) (GuiControls.getScreenWidth() * 0.3), insertLogButton.getHeight()));
        insertLogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * @// TODO: 12/7/23 Сюда будет заходить открытие файла собственно
                 */
            }
        });
    }

    private void displayComponents() {
        add(insertLogButton);
        add(logLinkField);
    }
}
