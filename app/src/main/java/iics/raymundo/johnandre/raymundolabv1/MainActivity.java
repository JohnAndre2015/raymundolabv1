package iics.raymundo.johnandre.raymundolabv1;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view)
    {
        Toast.makeText(getApplicationContext(), "showToast", Toast.LENGTH_SHORT).show();
    }

    public void showSnackbar(View view)
    {
        Snackbar.make(findViewById(android.R.id.content), "showSnackbar", Snackbar.LENGTH_LONG).show();
    }

    public void showSnackbarv2(View view)
    {

        Snackbar.make(findViewById(android.R.id.content), "Service Enabled", Snackbar.LENGTH_LONG)
                .setAction("DISMISS", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                })
                .show();
    }

}
