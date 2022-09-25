package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
public class LauncherPreviewBitmapView extends View {

    /* renamed from: a */
    public Bitmap f227397a;

    /* renamed from: b */
    private final Paint f227398b = new Paint(3);

    public LauncherPreviewBitmapView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f227397a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f227398b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f227397a;
        if (bitmap != null) {
            setMeasuredDimension(bitmap.getWidth(), this.f227397a.getHeight());
        }
    }

    public LauncherPreviewBitmapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LauncherPreviewBitmapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
