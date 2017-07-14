package com.example.user.adoptionanimal.retrofit;


import com.example.user.adoptionanimal.model.Adoption;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface AdoptionAnimalService {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://data.taipei/opendata/datalist/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    AdoptionAnimalService service = AdoptionAnimalService.retrofit.create(AdoptionAnimalService.class);

    @GET("apiAccess?scope=resourceAquire&rid=f4a75ba9-7721-4363-884d-c3820b0b917c")
    Call<Adoption> getData();
}
