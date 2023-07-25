import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Mein Fenster");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout( new BorderLayout() );
        add( new JLabel("Das ist langweiliger Text"), BorderLayout.NORTH );
        add( new JButton("Button"), BorderLayout.SOUTH );

        setVisible(true);
    }
}
