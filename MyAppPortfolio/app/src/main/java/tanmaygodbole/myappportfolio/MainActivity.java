package tanmaygodbole.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private int duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        duration = Toast.LENGTH_SHORT;
    }

    public void button1Toast(View view){
        Toast.makeText(context, "This will launch my 'Popular Movies' app!", duration).show();
    }

    public void button2Toast(View view){
        Toast.makeText(context, "This will launch my 'Stock Hawk' app!", duration).show();
    }

    public void button3Toast(View view){
        Toast.makeText(context, "This will launch my 'Build it Bigger' app!", duration).show();
    }

    public void button4Toast(View view){
        Toast.makeText(context, "This will launch my 'Make Your App Material' app!", duration).show();
    }

    public void button5Toast(View view){
        Toast.makeText(context, "This will launch my 'Go Ubiquitous' app!", duration).show();
    }

    public void button6Toast(View view){
        Toast.makeText(context, "This will launch my Capstone project!", duration).show();
    }
}
