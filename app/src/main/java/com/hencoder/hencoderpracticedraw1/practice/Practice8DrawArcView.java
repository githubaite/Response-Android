package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setAntiAlias(true);
        canvas.drawArc(50,50,500,300,90,125,true,p);
        p.setColor(Color.WHITE);
        canvas.drawArc(50,50,500,300,152,90,false,p);
        p.setColor(Color.BLUE);
        canvas.drawArc(50,50,500,300,180,50,true,p);
        p.setColor(Color.WHITE);
        canvas.drawArc(50,50,500,300,152,50,false,p);
    }
}
