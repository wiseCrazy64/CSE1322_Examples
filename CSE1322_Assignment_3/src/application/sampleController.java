package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class sampleController implements Initializable {
	   public String l = "button clicked";
	@FXML
	   public Button button1 = new Button();
	public Button button2 = new Button();
	public Button button3 = new Button();
	public Button button4 = new Button();
	public Button button5 = new Button();
	public Button button6 = new Button();
	public Button button7 = new Button();
	public Button button8 = new Button();
	public Button button9 = new Button();
	public Button button0 = new Button();
	public Button buttonAdd = new Button();
	public Button buttonMinus = new Button();
	public Button buttonMultiply = new Button();
	public Button buttonDivide = new Button();
	public Button buttonEqual= new Button();
	public Button buttonClear = new Button();
	public Button buttonPower = new Button();
	public String operation= "+";
	public Label l1 = new Label();
	double result;
	int operationCounter= 0;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

	    @FXML
	    final public void click1(ActionEvent event) {
	    l1.setText(l1.getText()+ "1");

	    }

	    @FXML
	    final public void click2(ActionEvent event) {
	    	l1.setText(l1.getText()+ "2");

	    }

	    @FXML
	    final public void click3(ActionEvent event) {
	    	l1.setText(l1.getText()+ "3");

	}
	    @FXML
	    final public void click4(ActionEvent event) {
	    	l1.setText(l1.getText()+ "4");

	}
	    @FXML
	    final public void click5(ActionEvent event) {
	    	l1.setText(l1.getText()+ "5");

	}
	    @FXML
	    final public void click6(ActionEvent event) {
	    	l1.setText(l1.getText()+ "6");

	}
	    @FXML
	    final public void click7(ActionEvent event) {
	    	l1.setText(l1.getText()+ "7");

	}
	    @FXML
	    final public void click8(ActionEvent event) {
	    	l1.setText(l1.getText()+ "8");

	}
	    @FXML
	    final public void click9(ActionEvent event) {
	    	l1.setText(l1.getText()+ "9");

	}
	    @FXML
	    final public void click0(ActionEvent event) {
	    	l1.setText(l1.getText()+ "0");

	}
	    @FXML
	    final public void clickAdd(ActionEvent event) {
	    	l1.setText(l1.getText()+ " + ");
	    	operation = " + ";
	    	operationCounter++;
	}
	    @FXML
	    final public void clickMinus(ActionEvent event) {
	    	l1.setText(l1.getText()+ " - ");
	    	operation = " - ";
	    	operationCounter++;
	}
	    @FXML
	    final public void clickMultiply(ActionEvent event) {
	    	l1.setText(l1.getText()+ " * ");
	    	operation = " * ";
	    	operationCounter++;
	}
	    @FXML
	    final public void clickDivide(ActionEvent event) {
	    	l1.setText(l1.getText()+ " / ");
	    	operation = " / ";
	    	operationCounter++;
	}    @FXML
	    final public void clickClear(ActionEvent event) {
    	l1.setText("");
    	operationCounter = 0;
}
	 @FXML
	    final public void clickPower(ActionEvent event) {
 	Stage stage = (Stage) (buttonPower.getScene().getWindow());
 	stage.close();
}
	    @FXML
	    final public void clickEquals(ActionEvent event) {
	    	if(operationCounter == 1) {
	    	String input = l1.getText();
	    	
	    	String [] nums = input.split(Pattern.quote(operation));
	    	double temp1 = Double.parseDouble(nums[0]);
	    	double temp2 = Double.parseDouble(nums[1]);
	    	
	    	switch(operation) {
	    	case " / ": result = temp1/temp2; break;
	    	case " + " : result = temp1 + temp2; break;
	    	case " - ": result = temp1-temp2; break;
	    	case " * ": result = temp1 * temp2; break;
	    	
	    	}
	    	l1.setText(Double.toString(result));
	    	operationCounter = 0;
	}
	    	else {
	    		while(operationCounter != 1) {
	    		l1.setText("Hit clear and enter valid expression");
	    		operationCounter = 1;
	    	}
	    	}
}
}
