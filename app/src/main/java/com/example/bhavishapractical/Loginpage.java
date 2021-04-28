package com.example.bhavishapractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Loginpage extends AppCompatActivity implements View.OnClickListener {
    Button login;
    EditText edtemail,edtpassword;
    String stremmail,strpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        login=findViewById(R.id.login);
        edtpassword=findViewById(R.id.edtpassword);
        edtemail=findViewById(R.id.edtemail);

        login.setOnClickListener(this);


    }

    private void logincall() {
        stremmail=edtemail.getText().toString();
        strpass=edtpassword.getText().toString();


        if (stremmail.isEmpty() || stremmail.trim().length() == 0) {
            edtemail.setError("Enter Email");
        }   else if (strpass.isEmpty() || strpass.trim().length() == 0) {
                     edtpassword.setError("Enter Password");
        } else  {


            APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
            Call<Loginmodel> logincall = apiInterface.login(stremmail, strpass,"123","IOS");

            logincall.enqueue(new Callback<Loginmodel>() {
                @Override
                public void onResponse(Call<Loginmodel> call, Response<Loginmodel> response) {

                    if (response.body().getStatus().equals(1)) {

                        Intent i = new Intent(Loginpage.this, MainActivity.class);
                        startActivity(i);

                    } else {
                        Toast.makeText(Loginpage.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }

                @Override
                public void onFailure(Call<Loginmodel> call, Throwable t) {
                    Toast.makeText(Loginpage.this,t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.login:
                logincall();
                break;
            default:
                break;

        }
    }
}