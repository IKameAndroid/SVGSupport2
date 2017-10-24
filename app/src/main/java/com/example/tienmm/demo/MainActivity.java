package com.example.tienmm.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.example.svgsupporter.richpath.RichPath;
import com.example.svgsupporter.richpath.SVGImageView;
import com.example.svgsupporter.richpathanimator.RichPathAnimator;

public class MainActivity extends AppCompatActivity {
    private SVGImageView loveFaceSVGImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loveFaceSVGImageView = (SVGImageView) findViewById(R.id.love_face);


    }


    public void animateLoveFace(View view) {
        final RichPath rEye = loveFaceSVGImageView.findRichPathByName("r_eye");
        final RichPath lEye = loveFaceSVGImageView.findRichPathByName("l_eye");

        rEye.setPivotToCenter(true);
        lEye.setPivotToCenter(true);

        RichPathAnimator
                .animate(rEye, lEye)
                .interpolator(new LinearInterpolator())
                .duration(800)
                .repeatMode(RichPathAnimator.RESTART)
                .repeatCount(RichPathAnimator.INFINITE)
                .scale(1, 0.9f, 1.07f, 1)
                .fillColor(0XFFF52C5B, 0xFFF24976, 0XFFD61A4C, 0XFFF52C5B)
                .start();
    }
}
