package com.google.android.apps.search.podcasts.widgets.playbutton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class PlayProgressButton extends View {

    /* renamed from: a */
    public final ValueAnimator f383525a;

    /* renamed from: b */
    public int f383526b;

    /* renamed from: c */
    public boolean f383527c;

    /* renamed from: d */
    private final Paint f383528d;

    /* renamed from: e */
    private final Paint f383529e;

    /* renamed from: f */
    private final RectF f383530f = new RectF();

    /* renamed from: g */
    private final Path f383531g = new Path();

    /* renamed from: h */
    private int f383532h;

    /* renamed from: i */
    private final int f383533i = getResources().getDimensionPixelSize(R.dimen.podcasts_play_circle_radius);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C69664n.m101060f(ofFloat, "ofFloat(0f, 1f)");
        this.f383525a = ofFloat;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.podcasts_play_circle_stroke_width);
        Paint paint = new Paint();
        paint.setStrokeWidth((float) dimensionPixelSize);
        paint.setFlags(1);
        Paint paint2 = new Paint(paint);
        this.f383528d = paint2;
        paint2.setColor(C141264b.m229297a(context, 16843827));
        Paint paint3 = new Paint(paint);
        this.f383529e = paint3;
        paint3.setColor(context.getColor(R.color.google_grey400));
        ofFloat.addUpdateListener(new C141267a(this));
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f383527c) {
            this.f383525a.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f383525a.cancel();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        this.f383532h = i5;
        RectF rectF = this.f383530f;
        int i6 = this.f383533i;
        float f = (float) (i5 - i6);
        float f2 = (float) (i5 + i6);
        rectF.set(f, f, f2, f2);
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(R.dimen.podcasts_play_button_unit_length);
        float f3 = 4.05f * dimensionPixelSize;
        float f4 = dimensionPixelSize * 1.8f;
        this.f383531g.reset();
        Path path = this.f383531g;
        float f5 = (float) this.f383532h;
        path.moveTo(f5 - f4, f5 - f3);
        Path path2 = this.f383531g;
        float f6 = (float) this.f383532h;
        path2.lineTo(f4 + f4 + f6, f6);
        Path path3 = this.f383531g;
        float f7 = (float) this.f383532h;
        path3.lineTo(f7 - f4, f7 + f3);
        Path path4 = this.f383531g;
        float f8 = (float) this.f383532h;
        path4.lineTo(f8 - f4, f8 - f3);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C69664n.m101061g(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 4 || i == 8) {
            this.f383525a.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C69664n.m101061g(canvas, "canvas");
        if (this.f383527c) {
            int i = this.f383532h;
            int i2 = this.f383533i;
            float f = (float) (i - i2);
            int i3 = i2 + i2;
            float f2 = (float) i;
            float animatedFraction = ((float) (i3 + i3)) * this.f383525a.getAnimatedFraction();
            float f3 = (float) i3;
            if (animatedFraction > f3) {
                float f4 = (animatedFraction + f) - f3;
                Canvas canvas2 = canvas;
                float f5 = f2;
                float f6 = f2;
                canvas2.drawLine(f, f5, f4, f6, this.f383529e);
                canvas2.drawLine(f4, f5, f + f3, f6, this.f383528d);
                return;
            }
            float f7 = f + animatedFraction;
            Canvas canvas3 = canvas;
            float f8 = f2;
            float f9 = f2;
            canvas3.drawLine(f, f8, f7, f9, this.f383528d);
            canvas3.drawLine(f7, f8, f + f3, f9, this.f383529e);
            return;
        }
        int i4 = this.f383526b;
        if (i4 == 0) {
            this.f383528d.setStyle(Paint.Style.STROKE);
            canvas.drawOval(this.f383530f, this.f383528d);
            this.f383528d.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f383531g, this.f383528d);
        } else if (i4 != 360) {
            this.f383529e.setStyle(Paint.Style.STROKE);
            canvas.drawArc(this.f383530f, 278.0f, ((float) this.f383526b) - 0.25f, false, this.f383529e);
            this.f383528d.setStyle(Paint.Style.STROKE);
            RectF rectF = this.f383530f;
            float f10 = (float) this.f383526b;
            canvas.drawArc(rectF, f10 + 278.0f, (360.0f - f10) - 0.25f, false, this.f383528d);
            this.f383528d.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f383531g, this.f383528d);
        } else {
            this.f383529e.setStyle(Paint.Style.STROKE);
            canvas.drawOval(this.f383530f, this.f383529e);
            this.f383529e.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f383531g, this.f383529e);
        }
    }
}
