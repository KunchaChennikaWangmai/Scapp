package com.chennikawangmai.scient;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

public class Specificproject extends AppCompatActivity {
    String m;
    TextView txt1;
    TextView txt2;
    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specificproject);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        img=(ImageButton)findViewById(R.id.img);
        Intent inteny=getIntent();
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {m= bundle.get("id").toString();}
        if(m.equals("Dual Power Washing machine"))
        {
            txt1.setText("Dual Power Washing machine");
            txt2.setText( "The project aims at designing a portable washing machine. This washing machine can work under both mechanical as well as electric power, thereby making it a highly useful commercial product; especially in rural areas where we don’t have electricity all the time. It works by converting the linear force which is supplied mechanically, into rotational force in order to make the clothes inside move whilst simultaneously forcing dust particles out. The mechanical principle of its working is like that of a sewing machine. It can also work on electrical energy like that of a normal washing machine but the major point in favor of our dual power machine is that it being smaller can also be easily portable. In the presence of electricity, the rotor which is attached externally to the washing machine rotates and hence causes the clothes (which are either directly in contact with the main rotor or due to the swirling movement of water) to rotate. Due to centrifugal force in that rotating frame of reference, the dirt molecules from the clothes get detached, completing the cleansing action.");
            img.setBackgroundResource(R.drawable.wm);
        }
        if(m.equals("Vrex -80"))
        {
            txt1.setText("Vrex -80");
            txt2.setText("One of the most common activities that take place in any industry, especially in railway stations, is the lifting and transporting of crates and parcels over short distances. Large- scale industries utilize cranes and forklifts for this purpose. But it is not feasible to use such equipment in railways due to financial and space constraints. The objective of V-Rex is to provide a low-cost and sturdy alternative to the existing devices. It consists of a simple balancing mechanism that enables the user to lift heavy weights (up to 150 kg) with minimal human effort.");
            Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
                    R.drawable.ex);
            img.setImageBitmap(icon);
        }
if(m.equals("Exhaust Filter"))
{
    txt1.setText("Exhaust Filter");
    txt2.setText("The project aimed to create a positive impact in the environment by reducing the air pollution by an integrated exhaust filter fitted in automobiles. The filter consists of two components, Triboelectric Nanogenerator (TENG) and bioremediation through the Moss Culture. The exhaust gas is made to pass through the Triboelectric nanogenerator which absorbs the particulate matter. The TENG is fixed onto the tailpipe of the vehicle. As the tailpipe vibrates the TENG also vibrates. This causes the pellets to vibrate between the Aluminum electrodes thus acquiring charge. The negatively charged PTFE pellets adsorb the particulate matter present in the gas. Then the gas is made to pass through the moss culture through a series of pipes and blowers made up of Stainless Steel. The moss purifies the air out of carbon dioxide through the process of active photosynthesis and cation exchange. Along with the exhaust emission the moss is involved in the Carbon Dioxide removal present in the atmosphere");
    Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
            R.drawable.exe);
    img.setImageBitmap(icon);
}
if(m.equals("PSI Mirage"))
{ txt1.setText("PSI Mirage");
   // txt2.setText("The project aimed to create a positive impact in the environment by reducing the air pollution by an integrated exhaust filter fitted in automobiles. The filter consists of two components, Triboelectric Nanogenerator (TENG) and bioremediation through the Moss Culture. The exhaust gas is made to pass through the Triboelectric nanogenerator which absorbs the particulate matter. The TENG is fixed onto the tailpipe of the vehicle. As the tailpipe vibrates the TENG also vibrates. This causes the pellets to vibrate between the Aluminum electrodes thus acquiring charge. The negatively charged PTFE pellets adsorb the particulate matter present in the gas. Then the gas is made to pass through the moss culture through a series of pipes and blowers made up of Stainless Steel. The moss purifies the air out of carbon dioxide through the process of active photosynthesis and cation exchange. Along with the exhaust emission the moss is involved in the Carbon Dioxide removal present in the atmosphere");
   txt2.setText("The PSI Racing Team are involved every year in building an all-terrain vehicle and participate in the BAJA SAE India and the Enduro Student India. The team constantly looks at building better vehicles as the years roll by, to push the performance and durability of the vehicle to the limit. Last year, they've come up with one of their best creations so far, the PSI Mirage. This vehicle has involved a lot of advanced fabrication techniques, to ensure no compromise on the quality. A lot of credit is due to Scient, where quality fabrication facilities were present, 24 cross 7 throughout the year. The Mirage brought us glory by bagging the first place in Acceleration at the Enduro Student India, while also putting us at a respectable 16th in the event. The team also bagged 6th overall in the Sales Presentation event at the BAJA SAE India, Indore. This year, the team is working even harder to build a much better creation, keen to make a larger mark at both the events.");
    Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
            R.drawable.psi);
    img.setImageBitmap(icon);

}
    }
}
