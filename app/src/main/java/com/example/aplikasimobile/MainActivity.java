package com.example.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Novel> arrayModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new Adapter(arrayModel, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData()
    {
        arrayModel = new ArrayList<>();
        arrayModel.add(new Novel("Fey Evolution Merchant ", "\n" +
                "Author : Amber Button\n",getString(R.string.desk01), "chapter : 2937",R.drawable.novel01));
        arrayModel.add(new Novel("Global Game: AFK In The Zombie Apocalypse Game ", "\n" +
                "Author : \n" +
                "Empire Black Knight\n\n",getString(R.string.desk02), "chapter : 2084",R.drawable.novel02));
        arrayModel.add(new Novel("Super Gene ", "\n" +
                "Author : \n" +
                "Twelve Winged Dark Burning Angel\n",getString(R.string.desk03), "chapter : 3462",R.drawable.novel03));
        arrayModel.add(new Novel("Top Tier Providence, Secretly Cultivate for a Thousand Years ", "\n" +
                "Author : \n" +
                "Let me laugh\n\n",getString(R.string.desk04), "chapter : 2937",R.drawable.novel04));
        arrayModel.add(new Novel("Complete Martial Arts Attributes ", "\n" +
                "Author : \n" +
                "Don't Enter The Jianghu\n\n",getString(R.string.desk05), "chapter : 2137",R.drawable.novel05));
        arrayModel.add(new Novel("Astral Pet Store ", "\n" +
                "Author : \n" +
                "Ancient Xi\n",getString(R.string.desk06), "chapter : 1581",R.drawable.novel06));
        arrayModel.add(new Novel("Lord of the Mysteries ", "\n" +
                "Author : \n" +
                "Cuttlefish That Loves Diving\n",getString(R.string.desk07), "chapter : 1432",R.drawable.novel07));
        arrayModel.add(new Novel("The Legendary Mechanic ", "\n" +
                "Author : \n" +
                "Chocolion\n",getString(R.string.desk08), "chapter : 1463",R.drawable.novel08));
        arrayModel.add(new Novel("Reverend Insanity", "\n" +
                "Author : Daoist Gu\n",getString(R.string.desk09), "chapter : 2334",R.drawable.novel09));
        arrayModel.add(new Novel("My Disciples Are All Villains", "\n" +
                "Author : \n" +
                "Mou Sheng Ren Zhuan Peng\n",getString(R.string.desk10), "chapter : 1834",R.drawable.novel10));
        arrayModel.add(new Novel("Pocket Hunting Dimension", "\n" +
                "Author : \n" +
                "Blue Sky Washing Rain\n\n",getString(R.string.desk11), "chapter : 1331",R.drawable.novel11));
        arrayModel.add(new Novel("Rebirth of the Strongest Empress ", "\n" +
                "Author : North Night\n",getString(R.string.desk12), "chapter : 2761",R.drawable.novel12));
        arrayModel.add(new Novel("Monster Paradise", "\n" +
                "Author : \n" +
                "Nuclear Warhead Cooked in Wine\n",getString(R.string.desk13), "chapter : 1935",R.drawable.novel13));
        arrayModel.add(new Novel("Library of Heaven’s Path", "\n" +
                "Author : \n" +
                "Heng Sao Tian Ya\n",getString(R.string.desk14), "chapter : 2270",R.drawable.novel14));
        arrayModel.add(new Novel("I’m Actually a Cultivation Bigshot ", "\n" +
                "Author : Rugao Under The Bridge,\n",getString(R.string.desk15), "chapter : 995",R.drawable.novel15));
    }

}