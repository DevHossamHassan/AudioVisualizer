package com.letsgotoperfection.audiovisualizer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author hossam.
 */

public class VotekAudioVisualizerView extends View {
    Rect rect;
    Paint paint;
    private final static int SQUARE_SIZE = 200;

    public VotekAudioVisualizerView(Context context) {
        super(context);
        init(null);
    }

    public VotekAudioVisualizerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public VotekAudioVisualizerView(Context context, @Nullable AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);

    }

    public VotekAudioVisualizerView(Context context, @Nullable AttributeSet attrs, int
            defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {
        rect = new Rect();
        rect.top = 10;
        rect.left = 10;
        rect.right = rect.left + SQUARE_SIZE;
        rect.bottom = rect.top + SQUARE_SIZE;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(rect,paint);
    }
}
