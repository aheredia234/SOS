package com.two.mad.sos;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SOS extends AppCompatActivity
{

    EditText info, num;
    String inf, pnum;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);


        Button btn = findViewById(R.id.btn);




        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                notificationCall();
            }
        });
    }



    public void notificationCall() {
        info = findViewById(R.id.editText);
        num = findViewById(R.id.editText2);

        inf = info.getText().toString();
        pnum = num.getText().toString();
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_background))
                .setContentTitle(inf)
                .setContentText(pnum);

        NotificationManager notManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notManager.notify(1, notification.build());
    }
}