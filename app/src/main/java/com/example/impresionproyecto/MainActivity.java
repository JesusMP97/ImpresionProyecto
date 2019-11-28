package com.example.impresionproyecto;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintManager;
import android.view.View;
import android.widget.Button;

import com.example.impresionproyecto.data.Comanda;
import com.example.impresionproyecto.data.Contenedor;
import com.example.impresionproyecto.data.Producto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btPrint;
    List<Comanda> comandas;
    List<Producto> productos;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        initEvents();

        fillProducts();
        fillCommands();

        // Para ahorrar tiempo de clickar el boton en testeos, directamente lanzo printDocument
        printDocument();
    }

    private void fillCommands() {
        comandas.add(new Comanda(1, 1, 1, 3.60f));
        comandas.add(new Comanda(2, 2, 2, 2.20f));
        comandas.add(new Comanda(3, 3, 3, 8f));
        comandas.add(new Comanda(4, 4, 4, 14f));
        comandas.add(new Comanda(5, 5, 5, 4.5f));
        comandas.add(new Comanda(6, 6, 6, 6f));
        comandas.add(new Comanda(1, 1, 7, 3.60f));
        comandas.add(new Comanda(2, 2, 8, 2.20f));
        comandas.add(new Comanda(3, 3, 9, 8f));
        comandas.add(new Comanda(4, 4, 10, 14f));
        comandas.add(new Comanda(5, 5, 11, 4.5f));
        comandas.add(new Comanda(6, 6, 12, 6f));
        comandas.add(new Comanda(1, 1, 13, 3.60f));
        comandas.add(new Comanda(2, 2, 14, 2.20f));
        comandas.add(new Comanda(3, 3, 15, 8f));
        comandas.add(new Comanda(4, 4, 16, 14f));
        comandas.add(new Comanda(5, 5, 17, 4.5f));
        comandas.add(new Comanda(6, 6, 18, 6f));
        comandas.add(new Comanda(1, 1, 19, 3.60f));
        comandas.add(new Comanda(2, 2, 20, 2.20f));
        comandas.add(new Comanda(3, 3, 21, 8f));
        comandas.add(new Comanda(4, 4, 22, 14f));
        comandas.add(new Comanda(5, 5, 23, 4.5f));
        comandas.add(new Comanda(6, 6, 24, 6f));
        comandas.add(new Comanda(1, 1, 25, 3.60f));
        comandas.add(new Comanda(1, 1, 26, 3.60f));
        comandas.add(new Comanda(2, 2, 27, 2.20f));
        comandas.add(new Comanda(3, 3, 28, 8f));
        comandas.add(new Comanda(4, 4, 29, 14f));
        comandas.add(new Comanda(5, 5, 30, 4.5f));
        comandas.add(new Comanda(6, 6, 31, 6f));
        comandas.add(new Comanda(1, 1, 32, 3.60f));
    }

    private void fillProducts() {
        productos.add(new Producto(1,"Coca cola", 1.20f));
        productos.add(new Producto(2,"Fanta", 1.10f));
        productos.add(new Producto(3,"Calamares", 8f));
        productos.add(new Producto(4,"Angulas", 14f));
        productos.add(new Producto(5,"Bocadillo sin pan", 4.5f));
        productos.add(new Producto(6,"Crema cataluña", 3f));
        productos.add(new Producto(1,"Coca cola", 1.20f));
        productos.add(new Producto(2,"Fanta", 1.10f));
        productos.add(new Producto(3,"Calamares", 8f));
        productos.add(new Producto(4,"Angulas", 14f));
        productos.add(new Producto(5,"Bocadillo sin pan", 4.5f));
        productos.add(new Producto(6,"Crema cataluña", 3f));
        productos.add(new Producto(1,"Coca cola", 1.20f));
        productos.add(new Producto(2,"Fanta", 1.10f));
        productos.add(new Producto(3,"Calamares", 8f));
        productos.add(new Producto(4,"Angulas", 14f));
        productos.add(new Producto(5,"Bocadillo sin pan", 4.5f));
        productos.add(new Producto(6,"Crema cataluña", 3f));
        productos.add(new Producto(1,"Coca cola", 1.20f));
        productos.add(new Producto(2,"Fanta", 1.10f));
        productos.add(new Producto(3,"Calamares", 8f));
        productos.add(new Producto(4,"Angulas", 14f));
        productos.add(new Producto(5,"Bocadillo sin pan", 4.5f));
        productos.add(new Producto(6,"Crema cataluña", 3f));
        productos.add(new Producto(1,"Coca cola", 1.20f));
        productos.add(new Producto(1,"Coca cola", 1.20f));
        productos.add(new Producto(2,"Fanta", 1.10f));
        productos.add(new Producto(3,"Calamares", 8f));
        productos.add(new Producto(4,"Angulas", 14f));
        productos.add(new Producto(5,"Bocadillo sin pan", 4.5f));
        productos.add(new Producto(6,"Crema cataluña", 3f));
        productos.add(new Producto(1,"Coca cola", 1.20f));
    }

    private void initEvents() {
        btPrint.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                printDocument();
            }
        });
    }

    private void initComponents() {
        btPrint = findViewById(R.id.btPrint);

        comandas = new ArrayList<>();
        productos = new ArrayList<>();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void printDocument()
    {
        PrintManager printManager = (PrintManager) this.getSystemService(Context.PRINT_SERVICE);

        String jobName = this.getString(R.string.app_name) + " Document";

        printManager.print(jobName, new MyPrintDocumentAdapter(this, productos, comandas), null);
    }
}
