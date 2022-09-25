package com.google.android.apps.gsa.searchplate.widget;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.apps.gsa.shared.util.C90742az;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.NetError;

/* compiled from: PG */
public class AudioProgressRenderer extends View {

    /* renamed from: a */
    public C90740ax f241116a;

    /* renamed from: b */
    private final Drawable f241117b;

    /* renamed from: c */
    private final TimeAnimator f241118c;

    /* renamed from: d */
    private final int f241119d;

    /* renamed from: e */
    private final int f241120e;

    /* renamed from: f */
    private final int f241121f;

    /* renamed from: g */
    private final int f241122g;

    /* renamed from: h */
    private int f241123h;

    /* renamed from: i */
    private long f241124i;

    /* renamed from: j */
    private int[] f241125j;

    /* renamed from: k */
    private int[] f241126k;

    /* renamed from: l */
    private int f241127l;

    /* renamed from: m */
    private boolean f241128m;

    public AudioProgressRenderer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo82911a() {
        if (this.f241124i == 0) {
            this.f241124i = SystemClock.uptimeMillis();
        }
        if (!this.f241118c.isStarted()) {
            this.f241118c.start();
        }
        this.f241128m = true;
    }

    /* renamed from: b */
    public final void mo82912b() {
        if (this.f241128m) {
            this.f241118c.cancel();
            this.f241128m = false;
            this.f241123h = 0;
            this.f241124i = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f241118c.setTimeListener(new C88980a(this));
        if (this.f241128m && !this.f241118c.isStarted()) {
            mo82911a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f241118c.cancel();
        this.f241118c.setTimeListener((TimeAnimator.TimeListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.f241128m) {
            if (this.f241123h == 0) {
                int width = canvas.getWidth();
                canvas.getHeight();
                double d = (double) width;
                double d2 = (double) (this.f241119d + this.f241120e);
                Double.isNaN(d);
                Double.isNaN(d2);
                int round = (int) Math.round(d / d2);
                this.f241123h = round;
                if (round != 0) {
                    this.f241125j = new int[round];
                    if (round == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            int i3 = 15000 / this.f241123h;
            int i4 = (int) (uptimeMillis - this.f241124i);
            int min = Math.min(this.f241126k.length - 1, i4 / 50);
            C90740ax axVar = this.f241116a;
            if (axVar == null) {
                i = 0;
            } else {
                i = ((C90742az) axVar).f253817a.f253832a.get() * 100;
            }
            for (int i5 = this.f241127l; i5 <= min; i5++) {
                this.f241126k[i5] = i;
            }
            this.f241127l = min + 1;
            int min2 = Math.min(i4 / i3, this.f241123h - 1);
            int[] iArr = this.f241125j;
            int length = this.f241126k.length / this.f241123h;
            int max = Math.max((min2 - 1) * length, 0);
            int min3 = Math.min(this.f241126k.length, length * min2);
            int i6 = 0;
            for (int i7 = max; i7 < min3; i7++) {
                if (i7 < this.f241127l) {
                    i6 += this.f241126k[i7];
                }
            }
            int i8 = min3 - max;
            if (i8 == 0) {
                i2 = 0;
            } else {
                i2 = i6 / i8;
            }
            iArr[min2] = i2;
            for (int i9 = 0; i9 < this.f241123h; i9++) {
                int i10 = this.f241125j[i9];
                int i11 = (int) (uptimeMillis - (this.f241124i + ((long) (i9 * i3))));
                if (i11 < 300) {
                    i10 = (i10 * i11) / 300;
                } else if (i11 < 5300) {
                    double d3 = (double) (i11 + NetError.ERR_INVALID_URL);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    double d4 = d3 + d3;
                    Double.isNaN(d3);
                    i10 += (int) Math.round((Math.cos(((d4 + d4) * 3.141592653589793d) / 1000.0d) * 1000.0d) / Math.exp((d3 * 0.7d) / 1000.0d));
                }
                int height = getHeight();
                int i12 = this.f241122g;
                Drawable drawable = this.f241117b;
                int i13 = this.f241121f * i9;
                drawable.setBounds(i13, height - (i12 + (((height - i12) * i10) / 10000)), this.f241119d + i13, height);
                this.f241117b.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
        }
        Bundle bundle = (Bundle) parcelable;
        this.f241124i = bundle.getLong("AudioProgressRenderer.animationStartTimeMs");
        this.f241126k = bundle.getIntArray("AudioProgressRenderer.micReadingsArray");
        this.f241127l = bundle.getInt("AudioProgressRenderer.currentMicReading");
        super.onRestoreInstanceState(bundle.getParcelable("parentState"));
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putLong("AudioProgressRenderer.animationStartTimeMs", this.f241124i);
        bundle.putIntArray("AudioProgressRenderer.micReadingsArray", this.f241126k);
        bundle.putInt("AudioProgressRenderer.currentMicReading", this.f241127l);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo82912b();
        }
    }

    public AudioProgressRenderer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioProgressRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f241128m = false;
        this.f241117b = getResources().getDrawable(R.drawable.bg_audio_progress_vertical_bar);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.audio_progress_bar_width);
        this.f241119d = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.audio_progress_bar_margin);
        this.f241120e = dimensionPixelSize2;
        this.f241121f = dimensionPixelSize + dimensionPixelSize2;
        this.f241122g = getResources().getDimensionPixelSize(R.dimen.audio_progress_bar_height_empty);
        this.f241126k = new int[300];
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f241118c = timeAnimator;
        timeAnimator.setRepeatCount(-1);
        timeAnimator.setDuration(1000);
    }
}
