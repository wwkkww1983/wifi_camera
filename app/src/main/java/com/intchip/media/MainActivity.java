package com.intchip.media;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

public class MainActivity extends Activity {

    public StreamMadiaPlayer mStreamMadiaPlayer;
    public SurfaceView mVideoSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.layout);
        mStreamMadiaPlayer = (StreamMadiaPlayer)findViewById(R.id.main_surface);
//        mStreamMadiaPlayer = new StreamMadiaPlayer(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
//        Log.d("TIEJIANG", "mStreamMadiaPlayer= "+mStreamMadiaPlayer);
        mStreamMadiaPlayer.onNetworkConnected();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mStreamMadiaPlayer.onDestory();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mStreamMadiaPlayer.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mStreamMadiaPlayer.onResume();
    }
}
