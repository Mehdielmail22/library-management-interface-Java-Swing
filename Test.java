package exam_final2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class Test {

	public static void main(String[] args)  throws IOException {
		PrintWriter sortie = new PrintWriter (new FileWriter ("utilisateur2.txt")) ;
		fenetre F=new fenetre();
		
		for(int i=0;i<10;i++) {
			sortie.println("le nom est : "+F.A.getNom()+" ;le niveau est : "+F.A.getNiveau()+" ;le livre est : "+F.A.getNom_livre());
		}
		sortie.close();


	}

}

class fenetre extends JFrame implements ActionListener {
	Panel p=new Panel();
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p11=new Panel();
	Panel p22=new Panel();
	Panel p33=new Panel();
	
	JLabel jl1=new JLabel("Nom");
	JLabel jl2=new JLabel("Niveau");
	JLabel jl3=new JLabel("Nom de livre");
	 public Utilisateur A=new Utilisateur();
	
	JTextField jt1=new JTextField(12);
	JTextField jt2=new JTextField(12);
	JTextField jt3=new JTextField(12);
	JButton b1=new JButton("Envoyer");
	JButton b2=new JButton("Effacer");
	 fenetre(){
		 this.setTitle("ma fenetre");
		 this.setSize(300,400);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 p1.add(jt1);p2.add(jt2);p3.add(jt3);p4.add(b1);p4.add(b2);
		 p11.add(jl1);p22.add(jl2);p33.add(jl3);
		 p1.setPreferredSize(new Dimension(300,50));
		 p2.setPreferredSize(new Dimension(300,50));
		 p3.setPreferredSize(new Dimension(300,50));
		 p4.setPreferredSize(new Dimension(300,50));
		 p.add(p11);p.add(p1);p.add(p22);p.add(p2);p.add(p33);p.add(p3);p.add(p4);
		 this.setContentPane(p);
		 this.setLocationRelativeTo(null);
		 this.setVisible(true);
		 
		 
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
     
		
		if(e.getSource()==b1) {
			this.A.setNom(jt1.getText());
			this.A.setNiveau(jt2.getText());
			this.A.setNom_livre(jt3.getText());
			
		}
		else if(e.getSource()==b2) {
			jt1.setText("");
			jt2.setText("");
			jt3.setText("");
		}
		

		
	}
	
}
class Utilisateur{
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getNom_livre() {
		return nom_livre;
	}
	public void setNom_livre(String nom_livre) {
		this.nom_livre = nom_livre;
	}
	private	String nom;
	private	String niveau;
	private String nom_livre;
	
}