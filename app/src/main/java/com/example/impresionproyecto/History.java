package com.example.impresionproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
        getBundle();
        initRecyclerView();
    }

    private void getBundle() {
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        facturas = (List<Factura>)bundle.getSerializable("facturas");
    }


    private void initRecyclerView() {
        LinearLayoutManager lim = new LinearLayoutManager(this);
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        rvItems.setLayoutManager(lim);
        adapter = new HistoryAdapter(facturas);
        rvItems.setAdapter(adapter);
    }
}
