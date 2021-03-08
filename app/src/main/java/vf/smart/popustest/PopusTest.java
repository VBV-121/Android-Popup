package vf.smart.popustest;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;


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

        dialog.findViewById(R.id.btn_Contact_US).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.projectquadsolutions.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        dialog.findViewById(R.id.btn_Tutorial).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://docs.google.com/document/d/1gQKFjwAT6_iHpDCUfmtIxPN6AnvWqwZB5zzTFg1gIUg/edit?usp=sharing");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }


}