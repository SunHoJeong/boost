package com.example.suno.firebaseexample;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.password;
import static android.os.Build.ID;

/**
 * Created by suno on 2017. 7. 11..
 */

public class Authentification extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    private static final String TAG = "Authentification";

    @BindView(R.id.editText_auth_email)
    EditText editTextAuthEmail;
    @BindView(R.id.editText_auth_pw)
    EditText editTextAuthPW;
    @BindView(R.id.button_auth_join)
    Button btnAuthJoin;
    @BindView(R.id.button_auth)
    Button btnAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        ButterKnife.bind(this);

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                    Toast.makeText(Authentification.this, "signed_in:" + user.getUid(),
                            Toast.LENGTH_SHORT).show();
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                    Toast.makeText(Authentification.this, "signed_out",
                            Toast.LENGTH_SHORT).show();
                }
                // ...
            }
        };
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//
//        mAuth.addAuthStateListener(mAuthListener);
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        if (mAuthListener != null) {
//            mAuth.removeAuthStateListener(mAuthListener);
//        }
//    }

    @OnClick({R.id.button_auth_join, R.id.button_auth})
    public void onBtnClicked(View v){
        switch(v.getId()){
            case R.id.button_auth_join:
                joinUserInfo();
                break;
            case R.id.button_auth:
                authUser();
                break;
        }
    }

    public void joinUserInfo(){
        mAuth = FirebaseAuth.getInstance();

        mAuth.createUserWithEmailAndPassword(editTextAuthEmail.getText().toString(), editTextAuthPW.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (!task.isSuccessful()) {
                            Log.w("failure", task.getException());
                            Toast.makeText(Authentification.this, "create user email ",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            editTextAuthEmail.setText("");
                            editTextAuthPW.setText("");
                            Toast.makeText(Authentification.this, "success auth!",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }

    public void authUser(){
        mAuth = FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword(editTextAuthEmail.getText().toString(), editTextAuthPW.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "signInWithEmail:failed", task.getException());
                            Toast.makeText(Authentification.this, "fail to auth user",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
