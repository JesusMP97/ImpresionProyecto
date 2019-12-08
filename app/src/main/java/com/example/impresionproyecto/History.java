package com.example.impresionproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.impresionproyecto.data.Factura;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {

    RecyclerView rvItems;
    HistoryAdapter adapter;
    List<Factura> facturas;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        initComponents();
    }

    private void initComponents() {
        rvItems = findViewById(R.id.rvHistory);
        date = getIntent().getStringExtra("date");
        testFacturas();
        initRecyclerView();
    }

    private void testFacturas() {
        facturas = new ArrayList<>();
        facturas.add(new Factura("3", "12:00 12/3/2019", "12:30 12/3/2019", 1, 1, 1, 3.50f));
        facturas.add(new Factura("4", "12:00 12/3/2019", "12:30 12/3/2019", 2, 1, 1, 5.50f));
        facturas.add(new Factura("2", "12:00 12/3/2019", "12:30 12/3/2019", 3, 1, 1, 6.50f));
    }

    private void initRecyclerView() {
        LinearLayoutManager lim = new LinearLayoutManager(this);
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        rvItems.setLayoutManager(lim);
        adapter = new HistoryAdapter(facturas);
        rvItems.setAdapter(adapter);
    }
}
