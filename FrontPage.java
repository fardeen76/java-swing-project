import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrontPage{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1270, 650);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.lightGray);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(230, 100));
        panel3.setPreferredSize(new Dimension(100, 100));

        panel3.setLayout(new BorderLayout()); // use add border layout on panel5

        // Add image to panel1 musc logo
        ImageIcon icon1 = new ImageIcon("rsz_musc_logo.png"); // Change "path_to_your_image.jpg" to your image path
        JLabel label1 = new JLabel(icon1);
        //label1.setPreferredSize(new Dimension(620, 100));
        panel1.add(label1);

        // Add text to panel1
        JLabel textLabel = new JLabel("MU SPORTS CLUB");
        Font font = new Font("Garamond", Font.BOLD | Font.ITALIC, 46);
        textLabel.setFont(font);
        textLabel.setForeground(Color.WHITE); 
        //textLabel.setPreferredSize(new Dimension(500, 100));
        panel1.add(textLabel);

        // Add buttons to panel2
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); // Horizontal alignment with spacing
        JButton button1 = new JButton("Help");
        JButton button2 = new JButton("Manage Admin");
        JButton button3 = new JButton("Change Password");
        JButton button4 = new JButton("Security");
        JButton button5 = new JButton("Logout");
        Dimension buttonSize = new Dimension(220, 40); // Button size
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        
        // Set font for buttons
        Font buttonFont = new Font("Garamond", Font.BOLD, 18);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);
        button4.setFont(buttonFont);
        button5.setFont(buttonFont);
        
        // Set font color for buttons
        Color fontColor = Color.WHITE;
        button1.setForeground(fontColor);
        button2.setForeground(fontColor);
        button3.setForeground(fontColor);
        button4.setForeground(fontColor);
        button5.setForeground(fontColor);
        
        // Set background color for buttons
        Color buttonColor = Color.BLUE;
        button1.setBackground(buttonColor);
        button2.setBackground(buttonColor);
        button3.setBackground(buttonColor);
        button4.setBackground(buttonColor);
        button5.setBackground(buttonColor);

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);

        //pannel3
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40)); // Horizontal alignment with spacing
        JButton button6 = new JButton("NOTICE BOARD");
        JButton button7 = new JButton("NEWS/BLOG");
        JButton button8 = new JButton("USER MANAGE");
        JButton button9 = new JButton("BLOOD BANK");
        JButton button10 = new JButton("EVENT MANAGER");
        JButton button11 = new JButton("COST MANAGER");
        JButton button12 = new JButton("ALUMNI");
        JButton button13 = new JButton("CLUB PROJECTS");
        
        Dimension buttonSize1 = new Dimension(200, 200); // Button size
        button6.setPreferredSize(buttonSize1);
        button7.setPreferredSize(buttonSize1);
        button8.setPreferredSize(buttonSize1);
        button9.setPreferredSize(buttonSize1);
        button10.setPreferredSize(buttonSize1);
        button11.setPreferredSize(buttonSize1);
        button12.setPreferredSize(buttonSize1);
        button13.setPreferredSize(buttonSize1);
        
        // Set font for buttons
        Font buttonFont1 = new Font("Garamond", Font.BOLD, 18);
        button6.setFont(buttonFont1);
        button7.setFont(buttonFont1);
        button8.setFont(buttonFont1);
        button9.setFont(buttonFont1);
        button10.setFont(buttonFont1);
        button11.setFont(buttonFont1);
        button12.setFont(buttonFont1);
        button13.setFont(buttonFont1);
        
        
        // Set font color for buttons
        Color fontColor1 = Color.WHITE;
        button6.setForeground(fontColor1);
        button7.setForeground(fontColor1);
        button8.setForeground(fontColor1);
        button9.setForeground(fontColor1);
        button10.setForeground(fontColor1);
        button11.setForeground(fontColor1);
        button12.setForeground(fontColor1);
        button13.setForeground(fontColor1);
        
        // Set background color for buttons
        Color buttonColor1 = Color.ORANGE;
        Color buttonColor2 = Color.darkGray;
        Color buttonColor3 = Color.pink;
        Color buttonColor4 = Color.magenta;
        Color buttonColor5 = Color.magenta;
        Color buttonColor6 = Color.orange;
        Color buttonColor7 = Color.darkGray;
        Color buttonColor8 = Color.pink;
        button6.setBackground(buttonColor1);
        button7.setBackground(buttonColor2);
        button8.setBackground(buttonColor3);
        button9.setBackground(buttonColor4);
        button10.setBackground(buttonColor5);
        button11.setBackground(buttonColor6);
        button12.setBackground(buttonColor7);
        button13.setBackground(buttonColor8);
        
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a new window for the notice board
                NoticeBoard noticeBoard = new NoticeBoard();
                noticeBoard.setVisible(true);
            }
        });

        //a
        panel3.add(button6);
        panel3.add(button7);
        panel3.add(button8);
        panel3.add(button9);
        panel3.add(button10);
        panel3.add(button11);
        panel3.add(button12);
        panel3.add(button13);
        

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}