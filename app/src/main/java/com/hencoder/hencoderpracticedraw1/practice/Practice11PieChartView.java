package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paintRed = new Paint();
        paintRed.setColor(Color.RED);
        paintRed.setAntiAlias(true);
        paintRed.setStyle(Paint.Style.FILL);

        Paint paintGreen = new Paint();
        paintGreen.setColor(Color.GREEN);
        paintGreen.setAntiAlias(true);
        paintGreen.setStyle(Paint.Style.FILL);

        Paint paintBlue = new Paint();
        paintBlue.setColor(Color.BLUE);
        paintBlue.setAntiAlias(true);
        paintBlue.setStyle(Paint.Style.FILL);

        Paint paintYellow = new Paint();
        paintYellow.setColor(Color.YELLOW);
        paintYellow.setAntiAlias(true);
        paintYellow.setStyle(Paint.Style.FILL);

        Paint paintWhite = new Paint();
        paintWhite.setColor(Color.WHITE);
        paintWhite.setAntiAlias(true);
        paintWhite.setStyle(Paint.Style.FILL);

        canvas.drawArc(50,10,370,330,0,90,true,paintRed);
        canvas.drawArc(50,10,350,310,90,60,true,paintGreen);
        canvas.drawArc(50,10,350,310,150,80,true,paintBlue);
        canvas.drawArc(50,10,350,310,230,70,true,paintYellow);
        canvas.drawArc(50,10,350,310,300,60,true,paintWhite);
//        Path p = new Path();
//        p.moveTo(360,290);
//        p.lineTo(450,350);
//        p.lineTo(480,380);
//        p.close();
        float[] f = new float[]{
                360,270,450,270,
                450,270,480,300
        };
        paintWhite.setTextAlign(Paint.Align.CENTER);
        paintWhite.setTextSize(16);
        canvas.drawLines(f,paintWhite);
        canvas.drawText("Flyo",480,320,paintWhite);
    }
}
