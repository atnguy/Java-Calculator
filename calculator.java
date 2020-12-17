import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

@SuppressWarnings("serial")
public class calculator extends JFrame implements ActionListener
{
	
	public static final int wbox = 400;
    public static final int hbox = 250;
	public static final int row = 20;
    public static final int cpl = 40;
	
	private JTextField iof; 
    private double sum = 0;
    String place;
    String second;
    String finn;
    int opera=0;
    int feeney=0;
    char tom;
    private String memo;
    int pie=0;
    int c=0;
    int d=0;
    double plum=0;
    double gum=0;
	JPanel buttonPanel = new JPanel( );
	JPanel blah = new JPanel();
	JPanel textPanel = new JPanel();
	public static void main(String[] args)
	{
		calculator tor= new calculator();
		tor.setVisible(true);
	}
	
	public calculator()
	{
		setSize(wbox, hbox);
        addWindowListener(new WindowDestroyer( ));
        setTitle("Calculator");
        setSize(wbox,hbox);
        Container contentPane = getContentPane( );
        contentPane.setLayout(new BorderLayout( ));
        blah.setBackground(Color.BLUE);
        
        
        
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new GridLayout(5,5));
        
        JButton number1 = new JButton("1");
        number1.addActionListener(this);
        buttonPanel.add(number1);
        
        JButton number2 = new JButton("2");
        number2.addActionListener(this);
        buttonPanel.add(number2);
        
        JButton number3 = new JButton("3");
        number3.addActionListener(this);
        buttonPanel.add(number3);
        
        JButton number4 = new JButton("4");
        number4.addActionListener(this);
        buttonPanel.add(number4);
        
        JButton number5 = new JButton("5");
        number5.addActionListener(this);
        buttonPanel.add(number5);
        
        JButton number6 = new JButton("6");
        number6.addActionListener(this);
        buttonPanel.add(number6);
        
        JButton number7 = new JButton("7");
        number7.addActionListener(this);
        buttonPanel.add(number7);
        
        JButton number8 = new JButton("8");
        number8.addActionListener(this);
        buttonPanel.add(number8);
        
        JButton number9 = new JButton("9");
        number9.addActionListener(this);
        buttonPanel.add(number9);
        
        JButton number0 = new JButton("0");
        number0.addActionListener(this);
        buttonPanel.add(number0);
		
		JButton plus = new JButton("+");
        plus.addActionListener(this);
        buttonPanel.add(plus);
        
        JButton vide = new JButton("/");
        vide.addActionListener(this);
        buttonPanel.add(vide);
        
        JButton minus = new JButton("-");
        minus.addActionListener(this);
        buttonPanel.add(minus);
        
        JButton mult = new JButton("*");
        mult.addActionListener(this);
        buttonPanel.add(mult);
        
        JButton dot = new JButton(".");
        dot.addActionListener(this);
        buttonPanel.add(dot);
        
        JButton equal = new JButton("=");
        equal.addActionListener(this);
        buttonPanel.add(equal);
        
        JButton blank= new JButton("Color");
        blank.addActionListener(this);
        buttonPanel.add(blank);
        
        JButton clear= new JButton("CLR");
        clear.addActionListener(this);
        buttonPanel.add(clear);
        
        JButton memoload= new JButton("Memo 1");
        memoload.addActionListener(this);
        buttonPanel.add(memoload);
        
        JButton savememo= new JButton("Save Memo 1");
        savememo.addActionListener(this);
        buttonPanel.add(savememo);
        
        JButton square= new JButton("x^2");
        square.addActionListener(this);
        buttonPanel.add(square);
        
        JButton root= new JButton("x^1/2");
        root.addActionListener(this);
        buttonPanel.add(root);
        
        JButton story=new JButton("negate");
        story.addActionListener(this);
        buttonPanel.add(story);
        
        JButton troll=new JButton("meme");
        troll.addActionListener(this);
        buttonPanel.add(troll);
        
        JButton secret=new JButton("royal promise");
        secret.addActionListener(this);
        secret.setBackground(Color.pink);
        buttonPanel.add(secret);
        
;
        
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        
        textPanel.setBackground(Color.BLUE);
        textPanel.setLayout(new FlowLayout());
        
        iof= new JTextField("", 30);
        iof.setBackground(Color.white);
        textPanel.add(iof);
        contentPane.add(textPanel, BorderLayout.NORTH);
        contentPane.add(blah, BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand( );
		if (actionCommand.equals("1"))
		{
			
			iof.setText(iof.getText()+"1");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("CLR"))
		{
			
			opera=0;
			place=" ";
			second=" ";
			iof.setText(place);
			if(feeney==16)
			{
				feeney=1;
			}
		}
		else if(actionCommand.equals("2"))
		{
			iof.setText(iof.getText()+"2");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("3"))
		{
			iof.setText(iof.getText()+"3");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("4"))
		{
			iof.setText(iof.getText()+"4");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("5"))
		{
			iof.setText(iof.getText()+"5");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("6"))
		{
			iof.setText(iof.getText()+"6");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("7"))
		{
			iof.setText(iof.getText()+"7");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("8"))
		{
			iof.setText(iof.getText()+"8");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("9"))
		{
			iof.setText(iof.getText()+"9");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("0"))
		{
			iof.setText(iof.getText()+"0");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("+"))
		{
			try		
			{	
				if(opera==0)
				{
					place=iof.getText();
					iof.setText("");
					opera=1;
				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=1;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=1;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=1;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=1;
					place=Double.toString(sum);
					iof.setText("");
				}
				plum=Double.parseDouble(place);
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
		}	
		else if(actionCommand.equals("*"))
		{
			try	
			{	
				if(opera==0)
				{
					place=iof.getText();
					iof.setText("");
					opera=2;
				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=2;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=2;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=2;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=2;
					place=Double.toString(sum);
					iof.setText("");
				}
				plum=Double.parseDouble(place);
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}	
		}
		else if(actionCommand.equals("/"))
		{
			try
			{
				
				if(opera==0)
				{
					place=iof.getText();
					iof.setText("");
					opera=3;
				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=3;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=3;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=3;
					place=Double.toString(sum);
					iof.setText("");
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=3;
					place=Double.toString(sum);
					iof.setText("");
				}
				plum=Double.parseDouble(place);
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
		}
		else if(actionCommand.equals("-"))
		{
			try
			{
				
				if(opera==0)
				{
					place=iof.getText();
					iof.setText("");
					opera=4;

				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=4;
					place=Double.toString(sum);
					iof.setText("");
					plum=Double.parseDouble(place);
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=4;
					place=Double.toString(sum);
					iof.setText("");
					plum=Double.parseDouble(place);
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=4;
					place=Double.toString(sum);
					iof.setText("");
					plum=Double.parseDouble(place);
					
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=4;
					place=Double.toString(sum);
					iof.setText("");
					plum=Double.parseDouble(place);
				}
				
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
		}
		else if(actionCommand.equals("."))
		{
			iof.setText(iof.getText()+".");
			if(opera==0)
			{
				place=iof.getText();
			}
			else
			{
				second=iof.getText();
			}	
		}
		else if(actionCommand.equals("="))
		{
			try
			{	if(opera==0)
				{
					sum=Double.parseDouble(iof.getText());
					iof.setText(Double.toString(sum));
				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					iof.setText(place);
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					iof.setText(place);
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					iof.setText(place);
					
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					iof.setText(place);
				}
			}
			catch(NullPointerException g )
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}		
		}
		else if(actionCommand.equals("Color"))
		{
			
			c=(int)(Math.random()*6);
			if(c==0)
			{
				buttonPanel.setBackground(Color.WHITE);
				blah.setBackground(Color.WHITE);textPanel.setBackground(Color.WHITE);	
			}
			else if(c==1)
			{
				buttonPanel.setBackground(Color.CYAN);
				blah.setBackground(Color.CYAN);textPanel.setBackground(Color.CYAN);
			}
			else if(c==2)
			{
				buttonPanel.setBackground(Color.RED);
				blah.setBackground(Color.RED);textPanel.setBackground(Color.RED);
			}
			else if(c==3)
			{
				buttonPanel.setBackground(Color.GREEN);
				blah.setBackground(Color.GREEN);textPanel.setBackground(Color.GREEN);
			}
			else if(c==4)
			{
				buttonPanel.setBackground(Color.MAGENTA);
				blah.setBackground(Color.MAGENTA);textPanel.setBackground(Color.MAGENTA);
			}
			else if(c==5)
			{
				buttonPanel.setBackground(Color.YELLOW);
				blah.setBackground(Color.YELLOW);textPanel.setBackground(Color.YELLOW);
			}
			else
			{
				System.out.println("Error!!!");
			}
		}
		else if(actionCommand.equals("Memo 1"))
		{
			
				iof.setText(memo);
				if(opera==0)
				{
					place=iof.getText();
				}
				else
				{
					second=iof.getText();
				}
			
			
		}
		else if(actionCommand.equals("Save Memo 1"))
		{
			memo=iof.getText();
			pie++;
			
		}
		else if(actionCommand.equals("x^2"))
		{
			try
			{
				if(opera==0)
				{
					sum=Double.parseDouble(iof.getText());
					
				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
					
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
				}
				sum=sum*sum;
				place=Double.toString(sum);
				iof.setText(place);
				plum=Double.parseDouble(place);
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}	
		}
		else if(actionCommand.equals("x^1/2"))
		{
			try
			{
				if(opera==0)
				{
					sum=Double.parseDouble(iof.getText());
					
				}
				else if(opera==1)
				{
					sum=Double.parseDouble(place)+Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
				}
				else if(opera==2)
				{
					sum=Double.parseDouble(place)*Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
				}
				else if(opera==3)
				{
					sum=Double.parseDouble(place)/Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
					
				}
				else if(opera==4)
				{
					sum=Double.parseDouble(place)-Double.parseDouble(second);
					opera=0;
					place=Double.toString(sum);
					
				}
				sum=Math.sqrt(sum);
				place=Double.toString(sum);
				iof.setText(place);
				plum=Double.parseDouble(place);
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}	 	
		}
		else if(actionCommand.equals("negate"))
		{
			try
			{
				place=iof.getText();
				plum=Double.parseDouble(place);
				plum=plum*-1;
				place=Double.toString(plum);
				iof.setText(place);
			}
			catch(NullPointerException g)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
			catch(NumberFormatException h)
			{
				System.out.println("Error Invalid terms used. No letters or your own +,-,/,*,^");
				System.out.println("Press Clr and try again");
				iof.setText("Look at other window");
				opera=0;
			}
		}	
		else if(actionCommand.equals("meme"))
		{
			iof.setText("Look at the system window");
			System.out.println("                                                                                            ..                         ..                                     ");                                                         
            System.out.println("                                                                                .........             ......                                                  ");                                                  
            System.out.println("                                                                             . .  ..... .     ..   . .  ... . ...                                             ");                                                  
            System.out.println("                                                                            .   ... .=?8nmmmmmmmmmmmnz=,....   ...                                            ");                                                  
            System.out.println("                                                                       .......,=nmd7:   . .  .     . . .=omnz:   ..                                           ");                                                  
            System.out.println("                                                              .    ..    ..~dm+.....     .  .         .....  ,$mo,  ,  ...  ....                              ");                                                  
            System.out.println("                                                               ....  .  Zm+... .....     .  .         .... . ..  =zm+ .    .....                              ");                                                  
            System.out.println("                                                               ...., zm7 . .. .          .  .               .. .... ,d8~ . .....                              ");                                                  
            System.out.println("                                                            .. .  Dz. ......  .  .   .  .....   .   .          ..... .~m+.    .                               ");                                                 
            System.out.println("                                                             .. .:m?  ......... .. .     ..   .......           .... ... Do . .                               ");                                                  
            System.out.println("                                                             ..+ni.. .    ..  .:ommnozzzonmm8=..  ...           ....       Ni...                              ");                                                  
            System.out.println("                                                      .  ...  M+. .... . . .omi    ...   .  . ?mz=   .    .  ... . .,+??+.  ~dz. ...                          ");                                                  
            System.out.println("                                                      .  ..,=m..... .... Zn?...   ............  .=m. .     . .. ?mm$=:::~+$mdz=m ...                          ");                                                  
            System.out.println("                                                      .  ..87  ..   ....m.....:+7$dmmnnmmmmmmmnmnmnm,       . =m.. .. . . . . :nm,. .                         ");                                                  
            System.out.println("                                                      ...+n+ ..... . .,mnd7i=,.    . $nm7 .. ..  . =d    . ..immmmmmi++=,  . .. .mm..  ..                     ");                                                  
            System.out.println("                                                       ..m, .       ..d?   ....  .  $mmmmi. .  ....:n.   .  .m=,,::==izznmmno$+:  $n ..                       ");                                                  
            System.out.println("                                                       .m.... .. .. .7m,...     ... Mmnmmn... . ..~$z.   . .~m. . . .... Ommo~.,~iomd.                        ");                                                  
            System.out.println("                                                  . .. M..         ...onnnnmmmnd88dddmmmmnmnnd7+~: M .    .. 8iommm7~.  Ommmmm?     Od                        ");                                                  
            System.out.println("                                                 . .  N~           ..  M:.. . ....  ...    ... ..+m.      ..  M. .. .~7z8mmmmmi=,..  D?.                      ");                                                  
            System.out.println("                                                 ... 77.            ... Zd ...  ...  . .   .  ,do=         ....m..   . ..      .,==+7om                       ");                                                  
            System.out.println("                                                    zm  ..          ... . 7dn=..  . ... ..:omn~ .          .... Zd+.. . .    ..  .  .m~n,                     ");                                                  
            System.out.println("                                                 ..,m?....          ... . . ,$nmdoi??$z8mn8~.. ..          ..... ?88,.. .   .    .  8z mo                     ");                                                  
            System.out.println("                                                  .z+.                              .....                       ... =nno+. . .. ,$n8 . :n... .                ");                                                  
            System.out.println("                                                  .m.                           .........                       .... .. .:$mmmm7... . . ~o.  .                ");                                                  
            System.out.println("                                                  ?i .                              .....                       .... .   .. ..      ..  .m. .                 ");                                                  
            System.out.println("                                                  M.                                                                        .  .       ..7+ .                 ");                                                  
            System.out.println("                                                 .m. .                                                                                .. :d. .                ");                                                  
            System.out.println("                                                 8o..                                                                        .=+.....    .m .                 ");                                                  
            System.out.println("                                             ... D?                                                   .... ..      .  .. .. . .m7 ...     M. .                ");                                                  
            System.out.println("                                             .  .m:.                                              ........   ..  ....,~~. .   . M~..     .d,.                 ");                                                  
            System.out.println("                                               . M,                                               ..........~$mmmmn8$i+im~.   . N=.       O: .                ");                                                  
            System.out.println("                                             .  .m.. .                             . .  .    . . .  . ~?nmnz? .  ... ..=m. .. ..n ...     O:..                ");                                                  
            System.out.println("                                             . ..m.                             . .:d.. ......   .=8mmi~. .. .........mm. .. .           .o:.                 ");                                                  
            System.out.println("                                             .   M, .                            ..$z .. ....  +nmm$, .. .. . .  ..  N8:, . ..    ...    .8,.                 ");                                                  
            System.out.println("                                               . N+ .                            . +=   .,.$dmd+  .  .          . .im~. .                .m. .                ");                                                  
            System.out.println("                                              .. Dz ..                          .. . .  .  ,..  ...  .      ....,nm7.   .  .              M..                 ");                                                  
            System.out.println("                                                 .m. .                                   .........           .. 7,....               .  .:8...                ");                                                  
            System.out.println("                                                 .m..                                    .........           ........                 . .7+..                 ");                                                  
            System.out.println("                                                 .$+..                                       .....           ... ..                   .  M.. .                ");                                                  
            System.out.println("                                                  .n.  .                                                                             . .,n ..                 ");                                                  
            System.out.println("                                                 ..d:....                                                                            ..,8:.. .                ");                                                  
            System.out.println("                                                  .,n~....                                                                           . Dd..  .                ");                                                  
            System.out.println("                                                  . Zm...                                                                             ~8,                     ");                                                  
            System.out.println("                                                 . . +o ..                                                                            M .                     ");                                                  
            System.out.println("                                                 .  . N,..                                                                           7i .                     ");                                                  
            System.out.println("                                                    .. M ...                                                                    ... =8 .                      ");                                                  
            System.out.println("                                                    ...:n .. .                                                                   ..:m  ..                     ");                                                  
            System.out.println("                                                    ... :n, .                                                                   . :m.   ,                     ");                                                  
            System.out.println("                                                      .  :mi,.....                                                          . .. Nm .                         ");                                                
            System.out.println("                                                         . $8 ....                                                           ..,m...                          ");                                                
            System.out.println("                                                      . ... O7....                                                          . .m~ . .                         ");                                                
            System.out.println("                                                        .. . =m.. ....                                                   .. .?n.                              ");                                                  
            System.out.println("                                                        .. . . 8m, ...                                                  .. 7n?                                ");                                                  
            System.out.println("                                                             . . Zn   .  .                    . .  ..               . .  +m,.. .                              ");                                                  
            System.out.println("                                                             ..  . Om... ..                   .  .. .               ..,=n: ... .                              ");                                                  
            System.out.println("                                                             ..   . .id8....                 ...++ .           .... =mi,,.  .. .                              ");                                                  
            System.out.println("                                                                    ...=m$. ... .. ..           Om~ .. .  .   ... ~n8,. .  .                                  ");                                                  
            System.out.println("                                                                    ....  ?8mi. ....    .     . .,m......     .zmi, . ...  .                                  ");                                                  
            System.out.println("                                                                   .    ......?dmd+..  ..     .  .=m..  .:$mm8: ... .    ..                                   ");                                                  
            System.out.println("                                                                       ......... . :$8nmmdz7777777zmmmdoi.. .......   ..                                      ");                                                  
            System.out.println("                                                                                ..   ....  .. . .~n$nz8dmmmn87:.  ... ......                                  ");                                                  
            System.out.println("                                                                                  ....  . .  ..8mo, ,m.  ...,=$dmmn7~.  ....                                  ");                                                  
            System.out.println("                                                                                         . . :m8: .  8$. ... ...,+7dmm$+,  .   .                              ");                                                  
            System.out.println("                                                                                    ...... +8m:. ..  .mz.    ..  .. ..+$nmz. ...                              ");                                                  
            System.out.println("                                                                                    .....,n8?. . . ...om.   ..  .  .  ....+nno..                              ");                                                  
            System.out.println("                                                                                 ..  .  Im=  .....   ..o8......     ...... .,+mi  ...                         ");                                                  
            System.out.println("                                                                                ..... .d8., ......   . .m....       ..  .=$7o88m,  .                          ");                                                  
            System.out.println("                                                                                  .. $m7.               Ni. . . .   =zmmn$dmmmm$mz: .                         ");                                                  
            System.out.println("                                                                                . . ?mo .             ..id .   .:izmmo$7ommmozm,=nd                           ");                                                  
            System.out.println("                                                                                .  7m,.               ...m :+zmmmnmmm8i+, .?o:7n..=                           ");                                                  
            System.out.println("                                                                             .... $m... . .   ... .~+78dmmmmno7=,.         =d=.m....                          ");                                                  
            System.out.println("                                                                             ... +m....,+=?zonmmmnmmmnz?,7o.   ..         .,i,. ....                          ");                                                  
            System.out.println("                                                                             ...im+ ?mmmm7===7dmno?. .  .~m..   ...      ..  . .....                          ");                                                  
            System.out.println("                                                                              ..8m.=d8n=mmmd$~....     ...m. ..                                               ");                                                  
            System.out.println("                                                                              ..7modmmmmmn,  ...       ...m: ..                                               ");                                                  
            System.out.println("                                                                              ..  Z?.m7.+oz   ....    .   N= .                                                ");                                                  
            System.out.println("                                                                                . N.:d:  .m,          . ..8i.      .............                              ");                                                  
            System.out.println("                                                                                 :$. .  .  ..         . . Z$,      .............                              ");                                                  
            System.out.println("                                                                                ... . ....               .7o: .    .............                              ");                                                  
            System.out.println("                                                                                                          78= .                                               ");                                                  
            System.out.println("                                                                                                          ~=,..                                               ");                                                  
            System.out.println("                                                                                                          . ...                                               ");
            System.out.println("");
            System.out.println("                                                                                               Yeah it happened");
		}
		else if(actionCommand.equals("royal promise"))
		{
			if(d==0)
			{
				iof.setText("You've Broken a Royal Promise");
				d++;	
			}
			else if(d==1)
			{
				iof.setText("you must now answer math questions");
				d++;
			}
			else if(d==2)
			{
				iof.setText("Solve this. Solve it or die ");
				d++;
			}
			else if(d==3)
			{
				iof.setText("(86x/(3m(pix)^(1/2))>x>y");
				
				iof.setText("");
				d++;
			}
			else if(d==4)
			{
				try
				{	finn=iof.getText();
					gum=Double.parseDouble(finn);
					if(gum==4.0)
					{
						iof.setText("Mathmatical!!! (good job!)");
						d=0;
					}
					else
					{
						iof.setText("hahahahah (you're dead)");
					}
				}
				catch(NumberFormatException f)
				{
					iof.setText("Press clr first before answering");
				}	
					
				}
			else
			{
				System.out.println("error");
			}
		}
		else
		{
			System.out.println("ERROR");
		}

	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
