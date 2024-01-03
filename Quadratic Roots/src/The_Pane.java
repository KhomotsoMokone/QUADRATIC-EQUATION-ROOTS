import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * 
 */

/**
 * @author khomo
 * 	The_Pane for setting the Gui elements of this project and algorithms of solving a Quadratic equation
 @see ManageGui() method
 @see SOLUTION() method
 @see NegativeSOLUTION() methods
 */
public class The_Pane extends GridPane{
	//Variables Declarations
	private Label A ;
	private Label B ;
	private Label C;
	private Label EQUATION;
	private TextField TextA;
	private TextField TextB;
	private TextField TextC;
	private TextArea TSolutions;
	private Button btnCalculate ;
	
	
	//The Constructor
	public The_Pane()
	{
		ManageGui();
		//Setting the download Button on Action
		btnCalculate.setOnAction(e->{
			String getA = TextA.getText();
		    String getB = TextB.getText();
		    String getC =TextC.getText();
			
		Double AA = Double.parseDouble(getA)	;
		Double BB = Double.parseDouble(getB);
		Double CC = Double.parseDouble(getC);
		
			double X1 = SOLUTION( AA,BB,CC);
			double X2 = NegativeSOLUTION(AA,BB,CC);
			if(X1 == 0.0 && X2 == 0.0)
			{
				TSolutions.setText(" X = NO SOLUTION      OR         X =  NO SOLUTION");
			}else{
				TSolutions.setText(" X = " + X1 + "      OR         X = "+ X2);
			}
			
		});
	}
	
	private void ManageGui()
	{
		//Instantiating the variables
		
		A = new Label("a          =");
		B = new Label("b          =");
		C = new Label("c          =");
		TextA = new TextField();
		TextB = new TextField();
		TextC = new TextField();
		btnCalculate = new Button("CALCULATE");
		TSolutions = new TextArea();
		EQUATION = new Label("Solve an equation of the form  ax*x + bx + c = 0 ");
		
		//Manipulating the nodes
		
		TSolutions.setMaxWidth(200);
		
		//Adding The Nodes to the GridPane Layout
		add(EQUATION,0,0);
		add(A,0,1);
		add(B,0,2);
		add(C,0,3);
		add(TextA,1,1);
		add(TextB,1,2);
		add(TextC,1,3);
		add(btnCalculate,0,4);
		add(TSolutions,0,5);
		
	}
     private double SOLUTION(double A,double B,double C)
     {
    	 double sum_inside_sqrt = B*B - 4*A*C;
    	 if(sum_inside_sqrt <0 )
    	 {
    		 return 0.0;
			 
    	 }else
    	 {
    		 return (( -B+ Math.sqrt(sum_inside_sqrt))/2*A); 
    	 }
    	 
     }
     private double NegativeSOLUTION(double A,double B,double C)
     {
    	 double sum_inside_sqrt = B*B - 4*A*C;
    	 if(sum_inside_sqrt <0 )
    	 {
    		 return 0.0;
    	 }else
    	 {
    		 return (( -B- Math.sqrt(sum_inside_sqrt))/2*A); 
    	 }
     }
}
