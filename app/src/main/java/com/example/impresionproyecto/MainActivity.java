package com.example.impresionproyecto;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.print.PrintManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.impresionproyecto.data.Comanda;
import com.example.impresionproyecto.data.Contenedor;
import com.example.impresionproyecto.data.Producto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btPrint, btEnviar, btHistorial;
    List<Comanda> comandas;
    List<Producto> productos;
    private String NIF = "10511415N";
    private String NOMBRE = "Jones Garcia, Francisco";
    private String DIRECCION = "C/ Alameda, 8   Granada";
    private String TELEFONO = "658012345";

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
        //printDocument();
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

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("application/pdf");

                Uri uri = Uri.parse("file://" + createPdf().getAbsolutePath());
                intent.putExtra(Intent.EXTRA_STREAM, uri);

                try {
                    startActivity(Intent.createChooser(intent, "Share PDF file"));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Error: Cannot open or share created PDF report.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
    }

    private void sendToHistory(String date) {
        Intent intent = new Intent(this, History.class);
        intent.putExtra("date", date);
        startActivity(intent);
    }

    private void showDatePickerDialog() { // Enviar al historial seleccionando fecha + clase DatePickerFragment
        DatePickerFragment newFragment = DatePickerFragment.newInstance(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                final String selectedDate = day + "-" + (month+1) + "-" + year;
                sendToHistory(selectedDate);
            }
        });

        newFragment.show(this.getSupportFragmentManager(), "datePicker");
    }

    private void initComponents() {
        btPrint = findViewById(R.id.btPrint);
        btEnviar = findViewById(R.id.btEnviar);
        btHistorial = findViewById(R.id.btDatePicker);

        comandas = new ArrayList<>();
        productos = new ArrayList<>();
    }

    public void printDocument()
    {
        PrintManager printManager = (PrintManager) this.getSystemService(Context.PRINT_SERVICE);

        String jobName = this.getString(R.string.app_name) + " Document";

        printManager.print(jobName, new MyPrintDocumentAdapter(this, productos, comandas), null);
    }

    private File createPdf(){ // METODO PARA CREAR Y ENVIAR PDF DE LA FACTURA
        int totalpages = 1 + (comandas.size() + 24 - 1) / 24;
        int rest = comandas.size()%24;
        int pageWidth = 600;
        int pageHeight = 900;
        int startingFrom = 0;
        double precioTotal = 0;
        boolean end = false;

        if(rest == 0){ // Una pagina extra si las paginas quedan justas a la cantidad de comandas
            totalpages++;
        }

        // Create a new document
        PdfDocument document = new PdfDocument();

        // Create a page description
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(pageWidth, pageHeight, 1).create();

        // Start a page
        PdfDocument.Page page = document.startPage(pageInfo);
        Canvas canvas = page.getCanvas();
        Paint paint = new Paint();
        // aaaa
        Date currentTime = Calendar.getInstance().getTime();

        int topMargin = 35;
        int leftMargin = 35;
        int rightMaximun = 575;

            // MARCO TITULO
            paint.setColor(Color.BLACK);
            canvas.drawRect(leftMargin, topMargin, rightMaximun, topMargin + 150, paint);

            paint.setColor(Color.WHITE);
            canvas.drawRect(leftMargin + 2, topMargin + 2, rightMaximun - 2, topMargin + 148, paint);

            paint.setColor(Color.BLACK);
            canvas.drawRect(leftMargin + 4, topMargin + 4, rightMaximun - 4, topMargin + 146, paint);

            paint.setColor(Color.WHITE);

            // TITULO 'Android bar'
            paint.setTextSize(80);
            canvas.drawText(
                    "A",
                    leftMargin + 120,
                    topMargin + 80,
                    paint);

            paint.setTextSize(50);
            canvas.drawText(
                    "ndroid",
                    leftMargin + 170,
                    topMargin + 80,
                    paint);

            paint.setTextSize(70);
            canvas.drawText(
                    "B",
                    leftMargin + 210,
                    topMargin + 135,
                    paint);

            paint.setTextSize(40);
            canvas.drawText(
                    "ar",
                    leftMargin + 250,
                    topMargin + 115,
                    paint);

            paint.setColor(Color.BLACK);

            Drawable icon = getApplicationContext().getResources().getDrawable(R.drawable.androidlogo);
            icon.setBounds(leftMargin + 340, topMargin + 20, leftMargin + 470, topMargin + 140);
            icon.draw(canvas);

            // NIF
            paint.setTextSize(24);
            canvas.drawText(
                    "NIF " + NIF,
                    leftMargin + 180,
                    topMargin + 200,
                    paint);

            // Nombre
            paint.setTextSize(24);
            canvas.drawText(
                    NOMBRE,
                    leftMargin + 140,
                    topMargin + 250,
                    paint);

            // Direccion
            paint.setTextSize(24);
            canvas.drawText(
                    DIRECCION,
                    leftMargin + 140,
                    topMargin + 300,
                    paint);

            // Telefono
            paint.setTextSize(24);
            canvas.drawText(
                    "I.V.A. INCLUIDO - Tlf: " + TELEFONO,
                    leftMargin + 100,
                    topMargin + 350,
                    paint);

            // Fecha
            paint.setTextSize(24);
            canvas.drawText(
                    currentTime.toString(),
                    leftMargin + 70,
                    topMargin + 400,
                    paint);

            // Linea final divisora
            canvas.drawRect(leftMargin, topMargin + 440, rightMaximun, topMargin + 454, paint);

            paint.setColor(Color.WHITE);
            canvas.drawRect(leftMargin + 2, topMargin + 442, rightMaximun - 2, topMargin + 452, paint);

            paint.setColor(Color.BLACK);
            canvas.drawRect(leftMargin + 4, topMargin + 444, rightMaximun - 4, topMargin + 450, paint);
            // aaa

        // Finish the page
        document.finishPage(page);

        // Create other pages
        for (int i = 1; i < totalpages; i++) {

            pageInfo = new PdfDocument.PageInfo.Builder(pageWidth, pageHeight, i+1).create();
            page = document.startPage(pageInfo);
            canvas = page.getCanvas();
            paint = new Paint();

            // Donde termina el bucle de imprimir comanda
            int endAt = startingFrom + 24;

            // Casos en los que PRECIO TOTAL aparecera en la pagina
            if(endAt > comandas.size()){    // Si el bucle termina antes del numero total de comandas
                endAt = startingFrom + rest;
                end = true;
            }
            if(endAt == startingFrom){ // Si las comandas ocupan la pagina entera
                end = true;
            }

            for(int j = startingFrom; j < endAt; j++){ // Bucle de imprimir comanda

                // Numero de veces pedido el producto en la comanda
                paint.setTextSize(24);
                canvas.drawText(
                        comandas.get(j).getUnidades() + "",
                        leftMargin,
                        topMargin,
                        paint);

                // Nombre producto
                paint.setTextSize(24);
                canvas.drawText(
                        productos.get(j).getNombre(),
                        leftMargin + 100,
                        topMargin,
                        paint);

                // Precio comanda
                paint.setTextSize(24);
                canvas.drawText(
                        comandas.get(j).getPrecio() + "€",
                        rightMaximun - 100,
                        topMargin,
                        paint);
                precioTotal += comandas.get(j).getPrecio();

                topMargin += 32; // La siguiente linea de comanda empieza x mas abajo
            }
            startingFrom += 24; // La siguiente pagina empieza por la x siguiente comanda

            if(end){
                precioTotal = Math.ceil(precioTotal * 100)/100;
                paint.setTextSize(24);
                canvas.drawText(
                        "TOTAL: " + precioTotal + "€",
                        rightMaximun - 200,
                        topMargin,
                        paint);
            }

            document.finishPage(page);
            topMargin = 35;
            leftMargin = 35;
        }
        // Write the document content
        File filePath = new File(getExternalFilesDir(null), "Factura.pdf");
        try {
            document.writeTo(new FileOutputStream(filePath));
        } catch (IOException e) {
            Log.e("main", "error "+e.toString());
            Toast.makeText(this, "Error: " + e.toString(),  Toast.LENGTH_LONG).show();
        }
        // Close the document
        document.close();
        return filePath;
    }
}
