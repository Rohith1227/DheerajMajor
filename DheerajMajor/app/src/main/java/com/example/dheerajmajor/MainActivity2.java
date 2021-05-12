package com.example.dheerajmajor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
        TextView disease=findViewById(R.id.disease);
        String title= getIntent().getStringExtra("title");
        float conf=getIntent().getFloatExtra("conf",0.0f);
         Bitmap bitmap=(Bitmap)getIntent().getParcelableExtra("image");
         disease.setText(title);
        TextView textView=findViewById(R.id.treatment);
        textView.setText("The spores and mycelia of the pathogen survive in infested plant debris and soil, in infected tubers and in overwintering host crops and weeds. Spores are produced when temperatures are between 41-86 F. (5-30 C.) with alternating periods of wetness and dryness. These spores are then spread through wind, splashing rain, and irrigation water. They gain entry via wounds caused by mechanical injury or insect feeding. Lesions begin to appear 2-3 days after the initial infection. Treatment of early blight includes prevention by planting potato varieties that are resistant to the disease; late maturing are more resistant than early maturing varieties. Avoid overhead irrigation and allow for sufficient aeration between plants to allow the foliage to dry as quickly as possible. Practice a 2-year crop rotation. That is, do not replant potatoes or other crops in this family for 2 years after a potato crop has been harvested. Keep the potato plants healthy and stress free by providing adequate nutrition and sufficient irrigation, especially later in the growing season after flowering when plants are most susceptible to the disease. Only dig the tubers up when they are completely mature to prevent from damaging them. Any damage done at harvest can additionally facilitate the disease. Remove plant debris and weed hosts at the end of the season to mitigate areas where the disease may overwinter.Read more at Gardening Know How: Potato Early Blight Treatment – Managing Potatoes With Early Blight"+"\n"+"https://www.gardeningknowhow.com/edible/vegetables/potato/potato-early-blight-treatment.htm");
        CircleImageView imageView=findViewById(R.id.plantimg);
        imageView.setImageBitmap(bitmap);

    }
}