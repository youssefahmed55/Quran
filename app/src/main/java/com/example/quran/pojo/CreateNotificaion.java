package com.example.quran.pojo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.quran.R;
import com.example.quran.services.NotificationActionService;

import java.util.ArrayList;

public class CreateNotificaion {
    public static final String CHANNEL_ID = "channel1";
    public static final String ACTION_PREVIUOS ="actionpreviuos";
    public static final String ACTION_PLAY ="channelplay";
    public static final String ACTION_NEXT = "channelnext";
    public static Notification notification;

    public static void createNotification(Context context , ArrayList<ModelListen> arrayList , int playbutton, int pos , int size){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context,"tag");

            Bitmap icon = BitmapFactory.decodeResource(context.getResources(),R.mipmap.quranicon);

            PendingIntent pendingIntentPrevious;
            int drw_previous;
            if(pos == 0){
                pendingIntentPrevious = null;
                drw_previous=0;
            }else{
                Intent intentPrevious = new Intent(context, NotificationActionService.class).setAction(ACTION_PREVIUOS);
                pendingIntentPrevious= PendingIntent.getBroadcast(context,0,intentPrevious,PendingIntent.FLAG_UPDATE_CURRENT);
                drw_previous = R.drawable.ic_baseline_skip_previous_24;

            }
            Intent intentPlay = new Intent(context, NotificationActionService.class).setAction(ACTION_PLAY);
          PendingIntent pendingIntentPlay= PendingIntent.getBroadcast(context,0,intentPlay,PendingIntent.FLAG_UPDATE_CURRENT);

            PendingIntent pendingIntentNext ;
            int drw_Next;
            if(pos == size){
                pendingIntentNext = null;
                drw_Next=0;
            }else{
                Intent intentNext = new Intent(context, NotificationActionService.class).setAction(ACTION_NEXT);
                pendingIntentNext= PendingIntent.getBroadcast(context,0,intentNext,PendingIntent.FLAG_UPDATE_CURRENT);
                drw_Next = R.drawable.ic_baseline_skip_next_24;

            }


            //create Notification
                notification = new NotificationCompat.Builder(context, CHANNEL_ID)
                        .setSmallIcon(R.mipmap.quranicon)
                        .setContentTitle("Track " + (pos + 1))
                        .setContentText(arrayList.get(pos).getTitle())
                        .setLargeIcon(icon)
                        .setOnlyAlertOnce(true)
                        .setShowWhen(false)
                        .addAction(drw_previous, "Previous", pendingIntentPrevious)
                        .addAction(playbutton, "Play", pendingIntentPlay)
                        .addAction(drw_Next, "Next", pendingIntentNext)
                        .setStyle(new androidx.media.app.NotificationCompat.MediaStyle().setShowActionsInCompactView(0, 1, 2))
                        .setPriority(NotificationCompat.PRIORITY_LOW)
                        .build();
                notificationManagerCompat.notify(1, notification);

        }

    }

}
