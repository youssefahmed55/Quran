package com.qurann.quran.ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.qurann.quran.R;
import com.qurann.quran.pojo.CreateNotificaion;
import com.qurann.quran.pojo.ModelListen;
import com.qurann.quran.services.OnClearFromRecentService;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListenQuran#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListenQuran extends Fragment implements Playable{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListenQuran() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListenQuran.
     */
    // TODO: Rename and change types and number of parameters
    public static ListenQuran newInstance(String param1, String param2) {
        ListenQuran fragment = new ListenQuran();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        setHasOptionsMenu(true);
    }
    private View view;
    private RecyclerView recyclerView;
    private MyRecycleAdapterListen myRecycleAdapterListen ;
    private MvvmListen mvvm;
    private static MediaPlayer player;
    private ArrayList<ModelListen> arrayListmodelListens;
    private static NotificationManager notificationManager;
    private int postionn = 0;
    private static Context context ;
    boolean isPlaying = false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_listen_quran, container, false);
        inti();
        observedata();
        onclickitem();

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createchannel();
            context.registerReceiver(broadcastReceiver,new IntentFilter("TRACKS_TRACKS"));
            context.startService(new Intent(getActivity().getBaseContext(), OnClearFromRecentService.class));
        }
        return view;
    }

    private void inti(){
        recyclerView = view.findViewById(R.id.recycle_listen);
        myRecycleAdapterListen = new MyRecycleAdapterListen();
        mvvm = new ViewModelProvider(requireActivity()).get(MvvmListen.class);
        context=getActivity();

    }

    private void createchannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CreateNotificaion.CHANNEL_ID,"KOD DEV" , NotificationManager.IMPORTANCE_LOW);

            notificationManager = context.getSystemService(NotificationManager.class);
            if(notificationManager != null){
                notificationManager.createNotificationChannel(channel);
            }
        }


    }



    private void observedata(){
        mvvm.getdataListen().observe(getViewLifecycleOwner(), new Observer<ArrayList<ModelListen>>() {
            @Override
            public void onChanged(ArrayList<ModelListen> modelMains) {
                arrayListmodelListens = modelMains;
                myRecycleAdapterListen.setArrayList(arrayListmodelListens);
                recyclerView.setAdapter(myRecycleAdapterListen);

            }
        });
    }
    private void onclickitem(){

        myRecycleAdapterListen.setOnClickListenerr(new MyRecycleAdapterListen.OnClickListenerr() {
            @Override
            public void onClick(int postion) {

                if(checkconnection() == true) {
                    postionn=postion;
                  //  if(isPlaying){
                  //
                  //      player.stop();
                  //      setonclickmyitem(postion);
                  //  }else {
                  //
                  //      playsounds(postion);
                  //}
                   if(arrayListmodelListens.get(postion).getaBoolean() == false){
                       onTrackPlay();
                       playsounds(postion);
                   }else{

                        onTrackPause();
                        player.stop();
                        setonclickmyitem(postion);

                   }

                }
                else
                    Toast.makeText(context, "Internet Not Connected", Toast.LENGTH_SHORT).show();
            }
            });
    }
    private void initializeMediaPlayer(String url) {
        player = new MediaPlayer();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            player.setAudioAttributes(new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setLegacyStreamType(AudioManager.STREAM_MUSIC)
                    .build());
        } else {
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        }
        try {
                player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                player.setDataSource(url);
                player.prepareAsync();
            } catch(Exception e){
                e.printStackTrace();
            }


    }
    private boolean checkconnection() {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        } else{
            connected = false;
    }
        return connected;
    }
    private void  playsounds(int postion){
        if(player != null) {
            player.reset();
        }

        initializeMediaPlayer(arrayListmodelListens.get(postion).getUrl());
        setonclickmyitem(postion);
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if(checkconnection() == true) {
                    if (postion != arrayListmodelListens.size() - 1) {
                        playsounds(postion + 1);
                        postionn = postion + 1;
                        onTrackPlay();
                    }
                }else
                    Toast.makeText(context, "Internet Not Connected", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_items, menu);

        MenuItem menuItem = menu.findItem(R.id.search_tool);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (!s.isEmpty()) {
                    myRecycleAdapterListen.setArrayList(getsearchitem(s, arrayListmodelListens));
                }else{
                    myRecycleAdapterListen.setArrayList(arrayListmodelListens);
                }
                myRecycleAdapterListen.notifyDataSetChanged();
                return true;
            }
        });
    }
    private ArrayList<ModelListen> getsearchitem(String s, ArrayList<ModelListen> s2) {

        ArrayList<ModelListen> arrayList1 = new ArrayList<>();
        if (!s.equals(""))
            for (ModelListen e : s2) {
                if (e.getTitle().charAt(0) == s.charAt(0))
                    if (e.getTitle().contains(s)) {
                        arrayList1.add(e);
                    }
            }
        return arrayList1;
    }
    private void setonclickmyitem(int postion){

        if(arrayListmodelListens.get(postion).getImage() == R.drawable.play) {

            for (int i = 0; i < arrayListmodelListens.size(); i++) {
                if (i != postion) {
                    arrayListmodelListens.get(i).setaBoolean(false);
                    arrayListmodelListens.get(i).setImage(R.drawable.play);
                } else {
                    arrayListmodelListens.get(i).setImage(R.drawable.pause);
                    arrayListmodelListens.get(i).setaBoolean(true);
                }
            }
        }else{
            arrayListmodelListens.get(postion).setaBoolean(false);
            arrayListmodelListens.get(postion).setImage(R.drawable.play);
        }
        myRecycleAdapterListen.notifyDataSetChanged();
    }
     BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
         @Override
         public void onReceive(Context context, Intent intent) {
             if(checkconnection() == true) {
             String action = intent.getExtras().getString("actionname");

          switch (action){
              case CreateNotificaion.ACTION_PREVIUOS:
                  if(postionn != 0) {
                      if (isPlaying) {
                          player.stop();
                          setonclickmyitem(postionn);


                      }
                      onTrackPrevious();
                  }
                  break;
              case CreateNotificaion.ACTION_PLAY:
                  if(arrayListmodelListens.get(postionn).getaBoolean() == false){
                      onTrackPlay();
                      playsounds(postionn);
                  }else{
                      onTrackPause();
                      player.stop();
                      setonclickmyitem(postionn);

                  }
                  break;
              case CreateNotificaion.ACTION_NEXT:
                  if(postionn != arrayListmodelListens.size()-1) {
                      if (isPlaying) {
                          player.stop();
                          setonclickmyitem(postionn);
                      }
                      onTrackNext();
                  }
                  break;

          }
         }else
                 Toast.makeText(context, "Internet Not Connected", Toast.LENGTH_SHORT).show();

         }
     };
    @Override
    public void onTrackPrevious() {
        if(postionn != 0) {
            postionn--;
            CreateNotificaion.createNotification(context, arrayListmodelListens, R.drawable.ic_baseline_play_arrow_24, postionn, arrayListmodelListens.size() - 1);
            isPlaying = false;
        }
    }

    @Override
    public void onTrackPlay() {

        CreateNotificaion.createNotification(context,arrayListmodelListens,R.drawable.ic_baseline_pause_24,postionn,arrayListmodelListens.size()-1);
        isPlaying=true;
    }

    @Override
    public void onTrackNext() {
        if(postionn != arrayListmodelListens.size() -1) {
            postionn++;
            CreateNotificaion.createNotification(context, arrayListmodelListens, R.drawable.ic_baseline_play_arrow_24, postionn, arrayListmodelListens.size() - 1);
            isPlaying = false;
        }
    }

    @Override
    public void onTrackPause() {
        CreateNotificaion.createNotification(context,arrayListmodelListens,R.drawable.ic_baseline_play_arrow_24,postionn,arrayListmodelListens.size()-1);
        isPlaying=false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
      //  if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
      //     notificationManager.cancelAll();
        // }
      //  context.unregisterReceiver(broadcastReceiver);
    }
}