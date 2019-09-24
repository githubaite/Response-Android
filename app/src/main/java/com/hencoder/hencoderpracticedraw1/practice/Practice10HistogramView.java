package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1);

        canvas.drawLine(60,40,60,400,paint);
        canvas.drawLine(60,400,600,400,paint);
        paint.setColor(Color.GREEN);

        canvas.drawRect(80,300,140,400,paint);
        canvas.drawRect(160,200,220,400,paint);
        canvas.drawRect(240,350,300,400,paint);
        canvas.drawRect(320,100,380,400,paint);
        canvas.drawRect(400,200,460,400,paint);
        canvas.drawRect(480,200,540,400,paint);

        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(Color.WHITE);
        paint.setTextSize(16);
        canvas.drawText("Froyo",110,420,paint);
        canvas.drawText("Erfyo",190,420,paint);
        canvas.drawText("Geoko",270,420,paint);
        canvas.drawText("Hokll",350,420,paint);
        canvas.drawText("Roouo",430,420,paint);
        canvas.drawText("Jomen",510,420,paint);

        paint.setTextSize(24);
        canvas.drawText("直方图",310,450,paint);
    }
}
