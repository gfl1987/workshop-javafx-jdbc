package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable { 

	//Inicio das referencias para os componentes da tela
	
	@FXML
	private TableView<Department> tableViewDepartment; //referencia da tabela view

	@FXML
	private TableColumn<Department, Integer> tableColumnId; //referencia da coluna Id

	@FXML
	private TableColumn<Department, String> tableColumnName; //referencia da coluna Name

	@FXML
	private Button btNew; //referencia do botão

	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
		
	//Fim das referencias para os componentes da tela

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) { //metódo de implementação do Initialize
		initializeNodes();
	}

	private void initializeNodes() { //comportamento das colunas id e name
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow(); //referencia que redimenciona a tabela de acordo com a janela
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());		
	}

}
