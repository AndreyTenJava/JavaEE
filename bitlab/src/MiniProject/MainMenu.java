package MiniProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    private MainFrame parent;

    private JButton addPageButton;
    private JButton listPageButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        addPageButton = new JButton("ADD_STUDENT");
        addPageButton.setSize(300,30);
        addPageButton.setLocation(100,100);
        add(addPageButton);
        addPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenuPage().setVisible(false);
                parent.getAddPage().setVisible(true);
            }
        });
        listPageButton = new JButton("LIST_STUDENTS");
        listPageButton.setSize(300,30);
        listPageButton.setLocation(100,150);
        add(listPageButton);
        listPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getListPage().generateTable(parent.students());
                parent.getMainMenuPage().setVisible(false);
                parent.getListPage().setVisible(true);
            }
        });
        exitButton = new JButton("EXIT");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
