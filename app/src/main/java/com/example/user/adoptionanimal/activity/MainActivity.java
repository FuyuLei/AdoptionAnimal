package com.example.user.adoptionanimal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.user.adoptionanimal.R;
import com.example.user.adoptionanimal.adapter.AdoptionAnimalRVAdapter;
import com.example.user.adoptionanimal.adapter.SPAdapter;
import com.example.user.adoptionanimal.model.Adoption;
import com.example.user.adoptionanimal.model.Animal;
import com.example.user.adoptionanimal.model.Result;
import com.example.user.adoptionanimal.retrofit.AdoptionAnimalService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rv;
    private Spinner sp_sex;
    private Spinner sp_type;
    private Spinner sp_build;
    private Spinner sp_age;
    private Button btn_search;
    private ArrayList<Animal> list_animal;
    private ArrayList<Animal> list_animal_show;
    private AdoptionAnimalRVAdapter adapter;
    private Adoption adoption;
    private String[] sexs, types, builds, ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv_main);
        sp_sex = (Spinner) findViewById(R.id.sp_main_sex);
        sp_type = (Spinner) findViewById(R.id.sp_main_type);
        sp_build = (Spinner) findViewById(R.id.sp_main_build);
        sp_age = (Spinner) findViewById(R.id.sp_main_age);
        btn_search = (Button) findViewById(R.id.btn_main_search);

        //init Spinner
        sexs = getResources().getStringArray(R.array.sex);
        types = getResources().getStringArray(R.array.type);
        builds = getResources().getStringArray(R.array.build);
        ages = getResources().getStringArray(R.array.age);
        sp_sex.setAdapter(new SPAdapter(this, sexs));
        sp_type.setAdapter(new SPAdapter(this, types));
        sp_build.setAdapter(new SPAdapter(this, builds));
        sp_age.setAdapter(new SPAdapter(this, ages));

        //init RecyclerView
        list_animal = new ArrayList<>();
        list_animal_show = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdoptionAnimalRVAdapter(this, list_animal_show);
        rv.setAdapter(adapter);

        getAdoptionAnimal();

        btn_search.setOnClickListener(this);
    }

    private void getAdoptionAnimal() {
        Call<Adoption> call = AdoptionAnimalService.service.getData();
        call.enqueue(new Callback<Adoption>() {
            @Override
            public void onResponse(Call<Adoption> call, Response<Adoption> response) {
                adoption = response.body();
                list_animal.clear();
                list_animal.addAll(adoption.getResult().getResults());
                list_animal_show.clear();
                list_animal_show.addAll(list_animal);
                updateAdapter();
            }

            @Override
            public void onFailure(Call<Adoption> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateAdapter() {
        rv.getAdapter().notifyDataSetChanged();
    }


    @Override
    public void onClick(View v) {
        String sex = sexs[sp_sex.getSelectedItemPosition()];
        String type = types[sp_type.getSelectedItemPosition()];
        String build = builds[sp_build.getSelectedItemPosition()];
        String age = ages[sp_age.getSelectedItemPosition()];
        list_animal_show.clear();
        for (Animal animal : list_animal) {
            if (animal.getSex().equals(sex)
                && animal.getType().equals(type)
                && animal.getBuild().equals(build)
                && animal.getAge().equals(age)) {
                list_animal_show.add(animal);
                list_animal_show.add(animal);
                list_animal_show.add(animal);
                list_animal_show.add(animal);
            }
        }
        updateAdapter();
    }
}
