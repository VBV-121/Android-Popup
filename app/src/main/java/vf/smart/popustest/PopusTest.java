package vf.smart.popustest;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class PopusTest extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showContact();
    }


    public void showContact() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.infor_alert);
        dialog.setCancelable(true);
        dialog.show();

        EditText email = dialog.findViewById(R.id.email);

            dialog.findViewById(R.id.btn_Contact_US).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText email = dialog.findViewById(R.id.email);
                    if(email.getText().toString().trim().equals("")){
                        Toast.makeText(getApplicationContext(), "Enter email id", Toast.LENGTH_SHORT).show();
                    }else {
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("message");

                        myRef.setValue(email.getText().toString().trim());
                        Uri uri = Uri.parse("http://www.projectquadsolutions.com/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                }
            });

            dialog.findViewById(R.id.btn_Tutorial).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText email = dialog.findViewById(R.id.email);
                    String e = email.getText().toString();
                    if(TextUtils.isEmpty(e)){
                        Toast.makeText(getApplicationContext(), "Enter email id", Toast.LENGTH_SHORT).show();
                    }else {
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("message");

                        myRef.setValue(email.getText().toString().trim());
                        Uri uri = Uri.parse("https://docs.google.com/document/d/1gQKFjwAT6_iHpDCUfmtIxPN6AnvWqwZB5zzTFg1gIUg/edit?usp=sharing");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                }
            });



    }


}