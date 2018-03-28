import javax.swing.*;
import java.awt.*;

public final class CatalogFrame extends JFrame {
    DocumentForm form;
    CatalogList list;
    ControlPanel control;

    public CatalogFrame() {
        super("Visual Document Manager");
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DocumentForm form = new DocumentForm(this);

        list = new CatalogList();

        control = new ControlPanel(this);

        this.setLayout(new GridLayout(9, 1));


        this.add(form.titleLabel);

        this.add(new TextField());

        this.add(form.pathLabel);

        this.add(new TextField());

        this.add(form.yearLabel);

        this.add(form.yearField);

        this.add(form.button);

        this.add(list,BorderLayout.CENTER);

        this.add(control, BorderLayout.CENTER);
        this.pack();

        //...
    }
    //...


    public DocumentForm getForm() {
        return form;
    }

    public void setForm(DocumentForm form) {
        this.form = form;
    }

    public CatalogList getList() {
        return list;
    }

    public void setList(CatalogList list) {
        this.list = list;
    }

    public ControlPanel getControl() {
        return control;
    }

    public void setControl(ControlPanel control) {
        this.control = control;
    }
}
