package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class View {
	
	double firstNumber;
	double secondNumber;
	double result;
	String operation;
	String answer;
	//el formato de los decimales es con .
	NumberFormat nf = NumberFormat.getNumberInstance(Locale.UK);// get instance
	
	//to save data in memory
	String memory;
	
	//Infinity
	Double posInf = Double.POSITIVE_INFINITY;
	Double negInf = Double.NEGATIVE_INFINITY;


	private JFrame frame;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		frame.setBounds(100, 100, 326, 420);
		//close the program 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		//number at right
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 290, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Numbers
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn7.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 12));
		btn7.setBounds(10, 120, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String enterNumber = textField.getText()+btn8.getText();
					textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 12));
		btn8.setBounds(70, 120, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String enterNumber = textField.getText()+btn9.getText();
					textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 12));
		btn9.setBounds(130, 120, 50, 50);
		frame.getContentPane().add(btn9);


		//Grabado de memoria de una variable (Botón “MS”)
		JButton btnMs = new JButton("MS");
		btnMs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					 memory = textField.getText();
			}
			}
		});
		btnMs.setFont(new Font("Arial", Font.BOLD, 10));
		btnMs.setBounds(10, 90, 50, 20);
		frame.getContentPane().add(btnMs);
		
		//Invocación de variable registrada(Botón “MR”)
		JButton btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (memory!=null) {
					textField.setText(memory);}
			}
		});
		btnMr.setFont(new Font("Arial", Font.BOLD, 10));
		btnMr.setBounds(70, 90, 50, 20);
		frame.getContentPane().add(btnMr);
		
		//Borrado de variable registrada(Botón “MC”)
		JButton btnMc = new JButton("MC");
		btnMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory = null;
			}
		});
		btnMc.setFont(new Font("Arial", Font.BOLD, 10));
		btnMc.setBounds(130, 90, 50, 20);
		frame.getContentPane().add(btnMc);
		//numbers
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 12));
		btn4.setBounds(10, 180, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 12));
		btn5.setBounds(70, 180, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 12));
		btn6.setBounds(130, 180, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 12));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 12));
		btn2.setBounds(70, 240, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 12));
		btn3.setBounds(130, 240, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 12));
		btn0.setBounds(10, 300, 50, 50);
		frame.getContentPane().add(btn0);
		
		//dot
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText()+btnDot.getText();
				textField.setText(enterNumber);
				
			}
		});
		btnDot.setFont(new Font("Arial", Font.BOLD, 12));
		btnDot.setBounds(70, 300, 50, 50);
		frame.getContentPane().add(btnDot);
		
		//DIVIDE
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
					}
			}
		});
		btnDivide.setFont(new Font("Arial", Font.BOLD, 14));
		btnDivide.setBounds(190, 120, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		//Rest
		JButton btnRest = new JButton("-");
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "-";
					}
			}
		});
		btnRest.setFont(new Font("Arial", Font.BOLD, 14));
		btnRest.setBounds(190, 180, 50, 50);
		frame.getContentPane().add(btnRest);
		
		//multiply
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
					}
			}
		});
		btnMultiply.setFont(new Font("Arial", Font.BOLD, 14));
		btnMultiply.setBounds(190, 240, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		
		//sum
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				}
			}
		});
		
		//Modul
		JButton btnModul = new JButton("%");
		btnModul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "%";
					}
			}
		});
		btnModul.setFont(new Font("Arial", Font.BOLD, 12));
		btnModul.setBounds(130, 300, 50, 50);
		frame.getContentPane().add(btnModul);
		
		btnPlus.setFont(new Font("Arial", Font.BOLD, 14));
		btnPlus.setBounds(190, 300, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//C delete one character
		JButton btnC = new JButton("C");
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					textField.setText(str.toString());
				}
			}
		});
		btnC.setFont(new Font("Arial", Font.BOLD, 10));
		btnC.setBounds(190, 90, 50, 20);
		frame.getContentPane().add(btnC);
		
		//delete All
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			}
		});
		btnAc.setFont(new Font("Arial", Font.BOLD, 10));
		btnAc.setBounds(250, 90, 50, 20);
		frame.getContentPane().add(btnAc);
		
		//Potencia x n
		JButton btnX =  new JButton("x\u207F");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					firstNumber = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "x";
					}
			}
		});
		btnX.setFont(new Font("Arial", Font.BOLD, 10));
		btnX.setBounds(250, 180, 50, 20);
		frame.getContentPane().add(btnX);
		
		//logaritmo base 10
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					secondNumber= Double.parseDouble(textField.getText());
					answer = String.valueOf(Math.log10(secondNumber));
					answer = String.valueOf(nf.format(result)).replaceAll(",", "");
					textField.setText(answer);	
				}
			}
		});
		btnLog.setFont(new Font("Arial", Font.BOLD, 10));
		btnLog.setBounds(250, 210, 50, 20);
		frame.getContentPane().add(btnLog);
		
		
		// + -
		JButton btnPlusMenos = new JButton("\u00B1");
		btnPlusMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
				Double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops *-1;
				textField.setText(String.valueOf(nf.format(ops)).replaceAll(",", ""));}
			}
		});
		btnPlusMenos.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlusMenos.setBounds(250, 270, 50, 20);
		frame.getContentPane().add(btnPlusMenos);
		
		//sqrt
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().isEmpty()) {
					secondNumber= Double.parseDouble(textField.getText());
					answer = String.valueOf(Math.sqrt(secondNumber));
					answer = String.valueOf(nf.format(result)).replaceAll(",", "");
					textField.setText(answer);	
				}
				
			}
		});
		
		btnSqrt.setFont(new Font("Arial", Font.BOLD, 8));
		btnSqrt.setBounds(250, 240, 50, 20);
		frame.getContentPane().add(btnSqrt);
		
		//EQUAL
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nf.setMaximumFractionDigits(2);
				if(!textField.getText().isEmpty()) {
				secondNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				//plus
				if(operation == "+") {
					result = firstNumber+secondNumber;
					answer = String.valueOf(nf.format(result)).replaceAll(",", "");
					textField.setText(answer);	
				}
				//minus
				 else if (operation == "-"){
					result = firstNumber-secondNumber;
					answer = String.valueOf(nf.format(result)).replaceAll(",", "");
					textField.setText(answer);	
					
				}
				//multiply
				 else if (operation == "*"){
						
					result = firstNumber*secondNumber;
					answer = String.valueOf(nf.format(result)).replaceAll(",", "");
					textField.setText(answer);	
					}
				
				//
				 else if (operation == "/"){
					 	if(secondNumber!=0) {
					 	result = firstNumber/secondNumber;
					 	answer = String.valueOf(nf.format(result)).replaceAll(",", "");
						textField.setText(answer);}else { textField.setText("");
						}
					 	
					}
				//
				 else if (operation == "%"){
					 
					 if(secondNumber!=0) {
						 	result = firstNumber%secondNumber;
						 	// format to use the dot instead the comma to show decimals, and delete the comma in numbers above thousand 
							answer = String.valueOf(nf.format(result)).replaceAll(",", "");
							textField.setText(answer);}else {textField.setText("");
								
							}
				 }
					 else if (operation == "x"){
						 
							 	result = Math.pow(firstNumber, secondNumber);
							 	// format to use the dot instead the comma to show decimals, and delete the comma in numbers above thousand 
								answer = String.valueOf(nf.format(result)).replaceAll(",", "");
								textField.setText(answer);
					 
						
					}
				
				
				}
				//in case the result is infinity
				if (Double.parseDouble(textField.getText())==posInf ||Double.parseDouble(textField.getText())==negInf ) {
					textField.setText("");
				}
			}
			
		});
		btnEqual.setFont(new Font("Arial", Font.BOLD, 12));
		btnEqual.setBounds(250, 300, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnE = new JButton("e");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(nf.format(Math.E));
			}
		});
		btnE.setFont(new Font("Arial", Font.BOLD, 10));
		btnE.setBounds(250, 150, 50, 20);
		frame.getContentPane().add(btnE);
		
		JButton btnPi = new JButton("\u03C0");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(nf.format(Math.PI));
			}
		});
		btnPi.setFont(new Font("Arial", Font.BOLD, 10));
		btnPi.setBounds(250, 120, 50, 20);
		frame.getContentPane().add(btnPi);
		
		
		
	}
}
