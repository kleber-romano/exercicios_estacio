import javax.swing.*;

public class Frm01 {
	public void criaTela() 
	{ 
		//Criando o frame principal
		JFrame f= new JFrame(); 
		f.setSize(600,100); 
		f.setTitle("Cadastro de Categorias"); 
		f.setLocation(150,200);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true); 
		
		//Criando o painel
		JPanel pl = new JPanel();
		pl.setLayout(null); //gerenciador de layout
		
		JLabel myLabel = new JLabel("Código");
		myLabel.setBounds(10, 10, 60, 20);
		
		//Campo de texto
		JTextField myTextField = new JTextField(" ");
		myTextField.setBounds(80, 10, 60, 20);
		
		//Botão
		JButton myButton = new JButton("Cadastrar");
		myButton.setBounds(150, 10, 100, 20);
		
		//Campo de senha
		JPasswordField myPassword = new JPasswordField("Texto Oculto");
		myPassword.setBounds(300, 10, 100, 20);
		
		//Botão
		JButton myButton2 = new JButton("Confirmar");
		myButton2.setBounds(410, 10, 100, 20);
		
		//adicionando componentes no painel
		pl.add(myLabel);
		pl.add(myTextField);
		pl.add(myButton);
		pl.add(myPassword);
		pl.add(myButton2);
		
		//colando o painel no frame
		f.add(pl);
		f.setVisible(true);
		
	} 
}
