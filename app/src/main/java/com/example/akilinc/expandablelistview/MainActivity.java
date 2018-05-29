package com.example.akilinc.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //listviewadapter variables

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listview
        listView = findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {

        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Dell XPS 15");
        listDataHeader.add("Dell Alienware 15");


        List<String> pc = new ArrayList<>();
        pc.add("15");
        pc.add("i7 7700HQ İşlemci");
        pc.add("16 GB DDR4 Ram");
        pc.add("GTX1050 Ekran Kartı");
        pc.add("512 GB SSD");
        pc.add("10.319 TL");

        List<String> pc1 = new ArrayList<>();
        pc1.add("15");
        pc1.add("i7 7700HQ İşlemci");
        pc1.add("16 GB DDR4 Ram");
        pc1.add("GTX1060 Ekran Kartı");
        pc1.add("1TB HDD + 512 GB SSD");


        listHash.put(listDataHeader.get(0), pc);
        listHash.put(listDataHeader.get(1), pc1);
    }
}
