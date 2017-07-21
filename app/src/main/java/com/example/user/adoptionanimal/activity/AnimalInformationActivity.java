package com.example.user.adoptionanimal.activity;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.adoptionanimal.R;
import com.example.user.adoptionanimal.model.Animal;
import com.squareup.picasso.Picasso;


public class AnimalInformationActivity extends AppCompatActivity {

    private Context context;
    private ImageView iv_img;
    private TextView tv_name;
    private TextView tv_sex;
    private TextView tv_type;
    private TextView tv_build;
    private TextView tv_age;
    private TextView tv_variety;
    private TextView tv_reason;
    private TextView tv_acceptNum;
    private TextView tv_hairtype;
    private TextView tv_resettlement;
    private TextView tv_isSterilization;
    private TextView tv_note;
    private Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_information);

        iv_img = (ImageView) findViewById(R.id.iv_animal_information_img);
        tv_name = (TextView) findViewById(R.id.tv_animal_information_name);
        tv_sex = (TextView) findViewById(R.id.tv_animal_information_sex);
        tv_type = (TextView) findViewById(R.id.tv_animal_information_type);
        tv_build = (TextView) findViewById(R.id.tv_animal_information_build);
        tv_age = (TextView) findViewById(R.id.tv_animal_information_age);
        tv_variety = (TextView) findViewById(R.id.tv_animal_information_variety);
        tv_reason = (TextView) findViewById(R.id.tv_animal_information_reason);
        tv_acceptNum = (TextView) findViewById(R.id.tv_animal_information_acceptNum);
        tv_hairtype = (TextView) findViewById(R.id.tv_animal_information_hairType);
        tv_resettlement = (TextView) findViewById(R.id.tv_animal_information_resettlement);
        tv_isSterilization = (TextView) findViewById(R.id.tv_animal_information_isSterilization);
        tv_note = (TextView) findViewById(R.id.tv_animal_information_note);

        animal = getIntent().getParcelableExtra("Animal");

        String img = animal.getImageName();
        String name = animal.getName();
        String sex = animal.getSex();
        String type = animal.getType();
        String build = animal.getBuild();
        String age = animal.getAge();
        String variety = animal.getVariety();
        String reason = animal.getReason();
        String acceptNum = animal.getAcceptNum();
        String hairtype = animal.getHairType();
        String resettlement = animal.getResettlement();
        String isSterilization = animal.getIsSterilization();
        String note = animal.getNote();

        int w = (int) getResources().getDimension(R.dimen.animal_big);
        Picasso.with(context)
                .load(img)
                .resize(w, w)
                .centerCrop().into(iv_img);

        if (name.equals("")) {
            tv_name.setText("尚未取名字");
            tv_name.setTextColor(Color.parseColor("#bcaaa4"));
        } else {
            tv_name.setText(name);
        }

        tv_sex.setText(sex);
        tv_type.setText(type);
        tv_build.setText(build);
        tv_age.setText(age);
        tv_variety.setText(variety);

        if (reason.equals("")) {
            tv_reason.setText("未提供");
            tv_reason.setTextColor(Color.parseColor("#bcaaa4"));
        } else {
            tv_reason.setText(reason);
        }

        tv_acceptNum.setText(acceptNum);
        tv_hairtype.setText(hairtype);

        if (resettlement.equals("")) {
            tv_resettlement.setText("未提供");
            tv_resettlement.setTextColor(Color.parseColor("#bcaaa4"));
        } else {
            tv_resettlement.setText(resettlement);
        }

        tv_isSterilization.setText(isSterilization);

        if (note.equals("")) {
            tv_note.setText("未提供");
            tv_note.setTextColor(Color.parseColor("#bcaaa4"));
        } else {
            tv_note.setText(note);
        }
    }
}
