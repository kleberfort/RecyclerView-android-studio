package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.AdapterFilmes;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaDeFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de Filmes
        this.criarFilmes();

        //Configurar o adapter
        AdapterFilmes adapterFilmes = new AdapterFilmes(listaDeFilmes);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterFilmes);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha - De volta ao lar","2017" , "Aventura");
        listaDeFilmes.add(filme);

        filme = new Filme("Mulher Maravilha","2017" , "Fantasia");
        listaDeFilmes.add(filme);

        filme = new Filme("Liga da Justiça","2017" , "Ficção");
        listaDeFilmes.add(filme);

        filme = new Filme("It: A coisa","2017" , "Drama/Terror");
        listaDeFilmes.add(filme);

        filme = new Filme("Pica-Pau: o Filme","2017" , "Comédia/Animação");
        listaDeFilmes.add(filme);

        filme = new Filme("A Múmia","2017" , "Terror");
        listaDeFilmes.add(filme);

        filme = new Filme("A Bela e a Fera","2017" , "Romance/Animação");
        listaDeFilmes.add(filme);

        filme = new Filme("Meu Malvado favorito 3","2017" , "Comédia");
        listaDeFilmes.add(filme);

        filme = new Filme("Carros 3","2017" , "Comédia");
        listaDeFilmes.add(filme);



    }
}