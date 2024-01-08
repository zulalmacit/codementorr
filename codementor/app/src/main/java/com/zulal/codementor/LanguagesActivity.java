package com.zulal.codementor;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LanguagesActivity extends AppCompatActivity {

    private TextView textLanguage;
    private TextView languagesInfo;
    private TextView method;
    private TextView language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);


        textLanguage = findViewById(R.id.text_language);
        languagesInfo = findViewById(R.id.languagesInfo);
        method = findViewById(R.id.method);
        language = findViewById(R.id.language);

        Intent intent = getIntent();
        String title = intent.getStringExtra("Language Name");
        String languagesInfoText = intent.getStringExtra("LanguagesInfo");
        String methodText = intent.getStringExtra("LanguagesMethod");
        String languageText = intent.getStringExtra("Language");

        textLanguage.setText(title);
        languagesInfo.setText(languagesInfoText);
        method.setText(methodText);
        language.setText(languageText);
    }
}
