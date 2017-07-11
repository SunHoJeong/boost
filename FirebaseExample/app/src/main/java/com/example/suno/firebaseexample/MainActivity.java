package com.example.suno.firebaseexample;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.crash.FirebaseCrash;
import com.google.firebase.iid.FirebaseInstanceId;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.btn_firebase_database)
    Button btnDB;
    @BindView(R.id.btn_firebase_authentification)
    Button btnAuth;
    @BindView(R.id.btn_firebase_fcm)
    Button btnFCM;
    @BindView(R.id.btn_firebase_error)
    Button btnError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //getToken
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d("FCM_Token", token);

        FirebaseCrash.report(new Exception("My first Android non-fatal error"));
    }

    @OnClick({R.id.btn_firebase_database, R.id.btn_firebase_authentification,
        R.id.btn_firebase_fcm, R.id.btn_firebase_error})
    public void Onclick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btn_firebase_database:
                intent = new Intent(this, RealTimeDatabase.class);
                startActivity(intent);
                break;
            case R.id.btn_firebase_authentification:
                intent = new Intent(this, Authentification.class);
                startActivity(intent);
                break;
            case R.id.btn_firebase_fcm:
                break;
            case R.id.btn_firebase_error:
                break;
        }
    }

}
