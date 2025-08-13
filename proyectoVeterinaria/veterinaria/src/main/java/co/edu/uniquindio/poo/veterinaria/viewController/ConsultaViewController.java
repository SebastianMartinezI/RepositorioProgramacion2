package co.edu.uniquindio.poo.veterinaria.viewController;

import co.edu.uniquindio.poo.veterinaria.App;
import co.edu.uniquindio.poo.veterinaria.controller.ConsultaController;
import co.edu.uniquindio.poo.veterinaria.model.Consulta;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConsultaViewController {

    private ConsultaController consultaController;
    private ObservableList<Consulta> listaConsultas = FXCollections.observableArrayList();
    private Consulta consultaSeleccionada;
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtMotivo;

    @FXML
    private TextField txtDiagnostico;

    @FXML
    private TextField txtMascota;

    @FXML
    private TextField txtVeterinario;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableView<Consulta> tblListaConsultas;

    @FXML
    private TableColumn<Consulta, String> tbcFecha;

    @FXML
    private TableColumn<Consulta, String> tbcHora;

    @FXML
    private TableColumn<Consulta, String> tbcMascota;

    @FXML
    private TableColumn<Consulta, String> tbcVeterinario;

    @FXML
    private TableColumn<Consulta, String> tbcMotivo;

    @FXML
    void onAgregarConsulta() {
        System.out.println("Lógica de agregar consulta no implementada.");
    }

    @FXML
    void onActualizarConsulta() {
        System.out.println("Lógica de actualizar consulta no implementada.");
    }

    @FXML
    void onEliminarConsulta() {
        System.out.println("Lógica de eliminar consulta no implementada.");
    }

    @FXML
    void initialize() {
        this.app = App.getInstance(); // Obtiene la instancia única de App
        this.consultaController = new ConsultaController(app.veterinaria);
        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerConsultas();
        tblListaConsultas.setItems(listaConsultas);
        listenerSelection();
    }

    private void initDataBinding() {
        tbcFecha.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFecha()));
        tbcHora.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getHora()));
        tbcMascota.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMascota().getNombre()));
        tbcVeterinario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVeterinario().getNombre()));
        tbcMotivo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMotivoConsulta()));
    }

    private void obtenerConsultas() {
        listaConsultas.addAll(consultaController.obtenerListConsulta());
    }

    private void listenerSelection() {
        tblListaConsultas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            consultaSeleccionada = newSelection;
            mostrarInformacionConsulta(consultaSeleccionada);
        });
    }

    private void mostrarInformacionConsulta(Consulta consulta) {
        if (consulta != null) {
            txtFecha.setText(consulta.getFecha());
            txtHora.setText(consulta.getHora());
            txtMascota.setText(consulta.getMascota().getNombre());
            txtVeterinario.setText(consulta.getVeterinario().getNombre());
            txtMotivo.setText(consulta.getMotivoConsulta());
            txtDiagnostico.setText(consulta.getDiagnostico());
        }
    }

    public void setApp(App app) {
        this.app = app;
    }
}