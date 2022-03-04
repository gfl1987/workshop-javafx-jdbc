package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;
import model.services.DepartmentService;

public class DepartmentListController implements Initializable { 
	
	private DepartmentService service;

	//Inicio das referencias para os componentes da tela
	
	@FXML
	private TableView<Department> tableViewDepartment; //referencia da tabela view

	@FXML
	private TableColumn<Department, Integer> tableColumnId; //referencia da coluna Id

	@FXML
	private TableColumn<Department, String> tableColumnName; //referencia da coluna Name

	@FXML
	private Button btNew; //referencia do botão
	
	private ObservableList<Department> obsList;

	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
		
	//Fim das referencias para os componentes da tela

	}
	
	public void setDepartmentService(DepartmentService service) {
		this.service = service;
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
	
	public void updateTableView() { //método para atualizar os dados
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Department> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewDepartment.setItems(obsList);
	}

}
