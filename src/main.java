import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
}

class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Simple Image Finder Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JMenuBar mb = new JMenuBar();
        JMenu options = new JMenu("MENU");
        JMenu actions = new JMenu("Actions");
        mb.add(options);
        mb.add(actions);
        JMenuItem actions1 = new JMenuItem("Scan");
        actions.add(actions1);
        //JButton button = new JButton("Center");
        //JButton button2 = new JButton("PAGE END");
        //JButton button3 = new JButton("Top Button");

        frame.getContentPane().add(BorderLayout.NORTH, mb);
        //frame.add(button2, BorderLayout.PAGE_END);
        //frame.add(button3, BorderLayout.PAGE_START);
        frame.setVisible(true);

        actions1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FindFileByExtension1 ffbe = new FindFileByExtension1();
                ffbe.main();
            }
        });
    }
}

