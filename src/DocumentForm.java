import javax.swing.*;
import java.awt.*;

public class DocumentForm extends JPanel{
    private final CatalogFrame frame; //o sa-l luam din CatalogFrame
    JLabel titleLabel = new JLabel("Title of the document");

    JLabel pathLabel = new JLabel("Path in the local file system");
    JLabel yearLabel = new JLabel("Publication Year");

    JButton button = new JButton("Add to repository");
    //...
    JSpinner yearField = new JSpinner(
            new SpinnerNumberModel(1950, 1900, 2017, 1));

    public DocumentForm(CatalogFrame frame) {
        this.frame = frame;
        titleLabel.add(new TextField());
        pathLabel.add(new TextField());
        //button.setBounds(2,2,2,2);

    }

    //...
    private void init() {
        //...
        //listener = new
        //button.addActionListener(...);
    }
    private void addDocument() {
        //frame.list.addDocument(...);
    }

    public CatalogFrame getFrame() {
        return frame;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public JLabel getPathLabel() {
        return pathLabel;
    }

    public void setPathLabel(JLabel pathLabel) {
        this.pathLabel = pathLabel;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JSpinner getYearField() {
        return yearField;
    }

    public void setYearField(JSpinner yearField) {
        this.yearField = yearField;
    }
}
