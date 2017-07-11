package com.example.suno.firebaseexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by suno on 2017. 7. 11..
 */

public class RealTimeDatabase extends AppCompatActivity {
    @BindView(R.id.editText_name)
    EditText editTextName;
    @BindView(R.id.editText_email)
    EditText editTextEmail;
    @BindView(R.id.button_send)
    Button btnSend;

    private DatabaseReference dbRef;
    private FirebaseDatabase db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_db);
        ButterKnife.bind(this);
    }

    public User getUserInfo(){
        User user = new User();
        user.setName(editTextName.getText().toString());
        user.setEmail(editTextEmail.getText().toString());

        return user;
    }

    @OnClick(R.id.button_send)
    public void OnSendBtnClicked(View v){
        db = FirebaseDatabase.getInstance();
        dbRef = db.getReference("Users");
        dbRef.push().setValue(getUserInfo());
        Toast.makeText(this, "저장버튼 클릭! 정보 저장 완료!", Toast.LENGTH_SHORT).show();
    }

}
