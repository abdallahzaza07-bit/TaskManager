package project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TaskManager {

    public static void main(String[] args) {

        // arraylist to store tasks in memory
        ArrayList<String> tasks = new ArrayList<>();

        // create the main window
        JFrame frame = new JFrame("task manager");

        // set window size
        frame.setSize(400, 300);

        // close program when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // arrange left to right
        frame.setLayout(new FlowLayout());

        // text where user types a task 
        JTextField taskField = new JTextField(20);

        // button to add a task
        JButton addButton = new JButton("add task");

        // button to remove a task
        JButton removeButton = new JButton("remove task");

        // model that stores list data
        DefaultListModel<String> listModel = new DefaultListModel<>();

        // list that displays tasks
        JList<String> taskList = new JList<>(listModel);

        // scroll pane for the list
        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setPreferredSize(new Dimension(300, 150));

        // add button 
        addButton.addActionListener(e -> {
            String task = taskField.getText();

            if (!task.isEmpty()) {
                tasks.add(task);
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        // remove button 
        removeButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();

            if (index != -1) {
                tasks.remove(index);
                listModel.remove(index);
            }
        });

        // add components to the window
        frame.add(taskField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(scrollPane);

        // show the window
        frame.setVisible(true);
    }
}
