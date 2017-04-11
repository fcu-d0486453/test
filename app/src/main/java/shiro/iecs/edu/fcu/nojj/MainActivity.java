package shiro.iecs.edu.fcu.nojj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  int aaa = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt1 = (Button) findViewById(R.id.but1);
        Button butt2 = (Button) findViewById(R.id.but2);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imagehikari);
                Toast.makeText(MainActivity.this, "on", Toast.LENGTH_SHORT).show();
                image.setImageResource(R.drawable.cover2);
            }
        });

    }

    

}
