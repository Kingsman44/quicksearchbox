package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: PG */
public class RingView extends AppCompatImageView {

    /* renamed from: a */
    public final Paint f81592a = m56100b();

    /* renamed from: b */
    public int f81593b = -1;

    /* renamed from: c */
    public int f81594c = -1;

    /* renamed from: d */
    public int f81595d = -1;

    /* renamed from: e */
    private final RectF f81596e = new RectF();

    public RingView(Context context) {
        super(context);
    }

    /* renamed from: b */
    private static Paint m56100b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: a */
    public final void mo35617a() {
        int i = this.f81595d;
        if (i != -1 && this.f81593b != -1 && this.f81594c != -1) {
            if (i != -1) {
                setLayerType(2, (Paint) null);
            }
            int i2 = this.f81594c;
            int i3 = this.f81593b;
            int i4 = this.f81595d;
            int width = getWidth();
            int height = getHeight();
            int strokeWidth = (int) this.f81592a.getStrokeWidth();
            int i5 = (i2 - i3) + i4 + 1 + strokeWidth;
            int i6 = i5 + i5;
            RectF a = C30193au.m56125a(strokeWidth, new Rect(0, 0, i6, i6));
            float f = (float) width;
            float f2 = (float) height;
            this.f81596e.set((f - a.width()) / 2.0f, (f2 - a.height()) / 2.0f, (f + a.width()) / 2.0f, (f2 + a.height()) / 2.0f);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f81596e.isEmpty() && getLayerType() == 2) {
            canvas.drawArc(this.f81596e, 0.0f, 360.0f, false, this.f81592a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo35617a();
    }

    public RingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
