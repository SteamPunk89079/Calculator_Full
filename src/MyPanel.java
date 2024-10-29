import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyPanel extends JPanel {
    private static ArrayList<String> operatii = new ArrayList<>();



    private JPanel panelSus = new JPanel();
    private JPanel panelJos = new JPanel();
    private JPanel panelJosStanga = new JPanel();
    private JPanel panelJosDreapta = new JPanel();


    private JButton butonAdunare = new JButton("+");
    private JButton butonScadere = new JButton("-");
    private JButton butonInmultire = new JButton("*");
    private JButton butonImpartire = new JButton("%");


    private JButton butonEgal = new JButton("=");
    private JButton butonClear = new JButton("C");


    private JTextArea ecranIstoric = new JTextArea();
    private JLabel titlu = new JLabel("CALCULATOR V7");
    private JTextField ecran = new JTextField();


    final private Font fontTitlu = new Font("Arial", Font.BOLD, 50);
    final private Font buttonFont = new Font("Arial", Font.BOLD, 36);


    private ArrayList<JButton> butoane = new ArrayList<>(10);
    private ArrayList<JButton> butoaneFake1 = new ArrayList<>(11);
    private ArrayList<JButton> butoaneFake2 = new ArrayList<>(9);




    public MyPanel(){
        this.setPreferredSize(new Dimension(900,700));
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        panelJos.setLayout(new BoxLayout(panelJos,BoxLayout.X_AXIS));


        panelSus.setBackground(Color.gray);
        panelJosStanga.setBackground(Color.DARK_GRAY);
        panelJosDreapta.setBackground(Color.BLACK);


        titlu.setFont(fontTitlu);
        titlu.setAlignmentX(CENTER_ALIGNMENT);
        ecran.setEditable(false);
        ecran.setBackground(Color.GRAY);
        ecran.setForeground(Color.green);
        ecran.setPreferredSize(new Dimension(700,100));
        ecran.setFont(fontTitlu);
        ecran.setHorizontalAlignment(SwingConstants.LEFT);


        ecranIstoric.setForeground(Color.RED);
        ecranIstoric.setBackground(Color.darkGray);


        panelSus.add(titlu);panelSus.add(ecran);

        for (int i = 0; i < 10; i++){
            butoane.add(new JButton(String.valueOf(i)));
        }
        for (int i = 0; i < 10; i++){
            butoane.get(i).setBackground(Color.black);
            butoane.get(i).setForeground(Color.green);
            butoane.get(i).setFont(buttonFont);
        }

        for (int i = 0; i < 10; i++){
            JButton buton = butoane.get(i);
            buton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ecran.setText(ecran.getText() + buton.getText());
                }
            });
        }



        for (int i =0; i < 11; i++){
            butoaneFake1.add(new JButton(String.valueOf(i)));
        }
        for (int i = 0; i < 11; i++){
            butoaneFake1.get(i).setVisible(false);
        }
        for (int i = 0; i < 9; i++){
            butoaneFake2.add(new JButton(String.valueOf(i)));
        }
        for (int i = 0; i < 9; i++){
            butoaneFake2.get(i).setVisible(false);
        }

        butonAdunare.setFont(buttonFont);butonScadere.setFont(buttonFont);butonInmultire.setFont(buttonFont);
        butonImpartire.setFont(buttonFont);butonClear.setFont(buttonFont);butonEgal.setFont(buttonFont);

        butonAdunare.setBackground(Color.BLACK);butonScadere.setBackground(Color.BLACK);butonInmultire.setBackground(Color.BLACK);
        butonImpartire.setBackground(Color.BLACK);butonClear.setBackground(Color.BLACK);butonEgal.setBackground(Color.BLACK);

        butonAdunare.setForeground(Color.green);butonScadere.setForeground(Color.green);butonInmultire.setForeground(Color.green);
        butonImpartire.setForeground(Color.green);butonClear.setForeground(Color.green);butonEgal.setForeground(Color.green);



        butonAdunare.addActionListener(new butonAdunareListener());
        butonScadere.addActionListener(new butonScadereListener());
        butonInmultire.addActionListener(new butonInmultireListener());
        butonImpartire.addActionListener(new butonImpartireListener());

        butonClear.addActionListener(new butonClearListener());
        butonEgal.addActionListener(new butonEgalListener());



        panelJosDreapta.setLayout(new GridLayout(6,6));

        //rand 1
        panelJosDreapta.add(butonAdunare);panelJosDreapta.add(butonScadere);panelJosDreapta.add(butonInmultire);
        panelJosDreapta.add(butonImpartire);panelJosDreapta.add(butoaneFake1.get(0));panelJosDreapta.add(butonEgal);
        //rand 2
        panelJosDreapta.add(butoaneFake1.get(1));panelJosDreapta.add(butoaneFake1.get(2));panelJosDreapta.add(butoaneFake1.get(3));
        panelJosDreapta.add(butoaneFake1.get(4));panelJosDreapta.add(butoaneFake1.get(5));panelJosDreapta.add(butoaneFake1.get(6));
        //rand 3
        panelJosDreapta.add(butoane.get(1));panelJosDreapta.add(butoane.get(2));panelJosDreapta.add(butoane.get(3));
        panelJosDreapta.add(butoaneFake1.get(7));panelJosDreapta.add(butoaneFake1.get(8));panelJosDreapta.add(butonClear);
        //rand 4
        panelJosDreapta.add(butoane.get(4));panelJosDreapta.add(butoane.get(5));panelJosDreapta.add(butoane.get(6));
        panelJosDreapta.add(butoaneFake1.get(9));panelJosDreapta.add(butoaneFake1.get(10));panelJosDreapta.add(butoaneFake2.get(0));
        //rand 5
        panelJosDreapta.add(butoane.get(7));panelJosDreapta.add(butoane.get(8));panelJosDreapta.add(butoane.get(9));
        panelJosDreapta.add(butoaneFake2.get(1));panelJosDreapta.add(butoaneFake2.get(2));panelJosDreapta.add(butoaneFake2.get(3));
        //rand 6
        panelJosDreapta.add(butoaneFake2.get(4));panelJosDreapta.add(butoane.get(0));panelJosDreapta.add(butoaneFake2.get(5));
        panelJosDreapta.add(butoaneFake2.get(6));panelJosDreapta.add(butoaneFake2.get(7));panelJosDreapta.add(butoaneFake2.get(8));

        panelJosStanga.add(ecranIstoric);






        panelJos.add(panelJosStanga);panelJos.add(panelJosDreapta);

        add(panelSus);add(panelJos);

    }

    class butonEgalListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            operatii.add(ecran.getText());
            System.out.println(operatii);


            while ( verificareInmultiriImpartiri() ){
                ecranIstoric.setText(String.valueOf(operatii));
                for (int i = 0; i < operatii.size(); i++){
                    if ( operatii.get(i).equals("*") || operatii.get(i).equals("/")){
                        calculeazaInmultireImpartire(i);
                        ecranIstoric.setText(ecranIstoric.getText() + operatii+"\n");
                        System.out.println(operatii);
                        i=0;
                    }
                }
            }


            while ( operatii.size() > 1) {
                ecranIstoric.setText(String.valueOf(operatii));
                for (int i = 0; i < operatii.size(); i++) {
                    if (operatii.get(i).equals("+") || operatii.get(i).equals("-")) {
                        calculeazaAdunareScadere(i);
                        ecranIstoric.setText(ecranIstoric.getText() + operatii + "\n");
                        i = 0;
                        System.out.println(operatii);
                    }
                }
            }










            ecran.setText(String.valueOf(operatii.get(0)));
            operatii.clear();

        }
    }


    class butonAdunareListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operatii.add(ecran.getText());
            operatii.add("+");
            ecran.setText("");

        }
    }
    class butonScadereListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operatii.add(ecran.getText());
            operatii.add("-");
            ecran.setText("");

        }
    }
    class butonInmultireListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operatii.add(ecran.getText());
            operatii.add("*");
            ecran.setText("");
        }
    }
    class butonImpartireListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operatii.add(ecran.getText());
            operatii.add("/");
            ecran.setText("");
        }
    }
    class butonClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ecran.setText("");
            operatii.clear();

        }
    }







    public static boolean verificareInmultiriImpartiri(){
        boolean inmultiriImpartiri = false;
        for ( int i = 0; i < operatii.size() ; i++){
            if ( operatii.get(i).equals("*") || operatii.get(i).equals("/") ){
                inmultiriImpartiri = true;
            }
        }
        return inmultiriImpartiri;
    }


    public static float calculeazaAdunareScadere(int i){
        Float rezultat = 0f;
        if(operatii.get(i).equals("+") || operatii.get(i) == "-"){



            Float nr1 = Float.parseFloat((String) operatii.get(i-1));
            Float nr2 = Float.parseFloat((String) operatii.get(i+1));


            if (operatii.get(i).equals("+")){
                rezultat = nr1 + nr2;
                System.out.println("Rezultat adunare :"+rezultat);
                System.out.println("------------------------------------------");
                operatii.set(i,String.valueOf(rezultat));
                operatii.remove(i - 1);
                operatii.remove(i);
            } else {
                rezultat = nr1 - nr2;
                System.out.println("Rezultat scadere :"+rezultat);
                System.out.println("------------------------------------------");
                operatii.set(i,String.valueOf(rezultat));
                operatii.remove(i - 1);
                operatii.remove(i);
            }
        }
        return rezultat;
    }

    public static float calculeazaInmultireImpartire(int i){
        float rezultat = 0f;

        float nr1 = Float.parseFloat((String) operatii.get(i - 1));
        float nr2 = Float.parseFloat((String) operatii.get(i + 1));



        if (operatii.get(i).equals("*")){
            rezultat = nr1 * nr2;
            System.out.println("Rezultat inmultire : "+rezultat);
            System.out.println("------------------------------------------");
            operatii.set(i,String.valueOf(rezultat));
            operatii.remove(i - 1);
            operatii.remove(i);
        } else {
            if ( nr2 != 0 ){
                rezultat = nr1 / nr2;
                System.out.println("Rezultat impartire :" + rezultat);
                System.out.println("------------------------------------------");
                operatii.set(i,String.valueOf(rezultat));
                operatii.remove(i - 1);
                operatii.remove(i);

            }
        }
        return rezultat;
    }






}
