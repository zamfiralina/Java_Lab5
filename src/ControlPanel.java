import javax.swing.*;

//import static com.sun.tools.internal.xjc.reader.Ring.add;

public class ControlPanel extends JPanel{
    private final CatalogFrame frame;
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
	//...
    public ControlPanel(CatalogFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        add(loadBtn);
        add(saveBtn);
     //   ...
    }
}
