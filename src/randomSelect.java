import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class randomSelect extends JFrame {
    public static void main(String[] args){
        System.out.println("Random Select: ");

        ArrayList<String> allDataStruc = new ArrayList<>();
        allDataStruc.add("binary search tree");
        allDataStruc.add("binary tree");
        allDataStruc.add("graph");
        allDataStruc.add("hash map");
        allDataStruc.add("hash table");
        allDataStruc.add("heap");
        allDataStruc.add("linked list");
        allDataStruc.add("queue");
        allDataStruc.add("stack");
        allDataStruc.add("trie");

        dataStructures dataList = new dataStructures();
        dataList.setData(allDataStruc);

        //int number = dataList.getDataSize();
        //Math.random(number);
        HashMap<Integer, String> strucCode = new HashMap<Integer, String>();

        Random rand = new Random();
        int number = rand.nextInt(dataList.getDataSize());
        System.out.println(dataList.getStruc(number));

        JFrame myFrame = new JFrame();
        myFrame.setSize(600, 500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Random DataStructure");
        JPanel myPanel = new JPanel();
        JLabel myLabel = new JLabel();

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //System.out.println(dataList.getStruc( rand.nextInt(dataList.getDataSize()) ));
                myLabel.setText(dataList.getStruc( rand.nextInt(dataList.getDataSize()) ));
                //myFrame.setVisible(true);
            }
        });

        myPanel.add(button, BorderLayout.CENTER);
        myPanel.add(myLabel, BorderLayout.CENTER);

        myFrame.add(myPanel, BorderLayout.CENTER);
        myFrame.setVisible(true);
    }
}
class dataStructures{
    ArrayList<String> dataStrucList = new ArrayList<>();

    ArrayList getData(){
        return dataStrucList;
    }

    void setData(ArrayList temp){
        dataStrucList = temp;
    }

    int getDataSize(){
        return dataStrucList.size();
    }

    String getStruc(int temp){
        return dataStrucList.get(temp);
    }
}