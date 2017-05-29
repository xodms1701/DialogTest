package org.techtown.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr = {"박소진","김아영","방민아","이혜리","오승현"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog = (Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.drawable.ultraball);
        /* dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                butDialog.setText(itemArr[which]);
            }
        });*/
        //라디오 버튼 목록
        dialog.setSingleChoiceItems(itemArr, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                butDialog.setText(itemArr[which]);
            }
        });
        dialog.setPositiveButton("Okay", null);
        dialog.show();
    }
}
