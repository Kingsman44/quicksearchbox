package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Map;
import p3186j$.time.Duration;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5470d.C69595d;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.Wiggle */
/* compiled from: PG */
public final class Wiggle extends View {

    /* renamed from: b */
    private static final Duration f357187b = Duration.ofMillis(0);

    /* renamed from: c */
    private static final int f357188c = -16711936;

    /* renamed from: a */
    public final C130322h f357189a;

    /* renamed from: d */
    private final Paint f357190d;

    /* renamed from: e */
    private final Path f357191e;

    /* renamed from: f */
    private ValueAnimator f357192f;

    /* renamed from: g */
    private final float f357193g;

    /* renamed from: h */
    private int f357194h;

    /* renamed from: i */
    private final float f357195i;

    /* renamed from: j */
    private final int f357196j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Wiggle(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Wiggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Wiggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(this.f357194h);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f357190d = paint;
        this.f357191e = new Path();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C130315a.f357197a, 0, 0);
        try {
            this.f357193g = obtainStyledAttributes.getDimension(0, 50.0f);
            this.f357194h = obtainStyledAttributes.getColor(2, f357188c);
            this.f357195i = obtainStyledAttributes.getDimension(3, 20.0f);
            this.f357196j = obtainStyledAttributes.getDimensionPixelSize(4, 1);
            Duration ofMillis = Duration.ofMillis((long) obtainStyledAttributes.getInteger(1, (int) f357187b.toMillis()));
            Map i2 = C69505av.m100867i(new C69685i(C130323i.IDLE, Float.valueOf(obtainStyledAttributes.getFloat(5, 2.0f))), new C69685i(C130323i.RECOGNITION, Float.valueOf(obtainStyledAttributes.getFloat(6, 4.0f))));
            float dimension = obtainStyledAttributes.getDimension(7, 5.0f);
            C130323i iVar = C130323i.IDLE;
            Float valueOf = Float.valueOf(dimension);
            Map i3 = C69505av.m100867i(new C69685i(iVar, valueOf), new C69685i(C130323i.RECOGNITION, valueOf));
            C69664n.m101060f(ofMillis, "animationDuration");
            this.f357189a = new C130322h(ofMillis, i2, i3, new C130316b(this));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private final float m212752d(float f, float f2) {
        float f3 = this.f357193g;
        C130322h hVar = this.f357189a;
        float f4 = f3 - hVar.f357214g;
        return f4 + (((float) Math.sin((double) ((f * hVar.f357213f) + (f2 / this.f357195i)))) * f4);
    }

    /* renamed from: a */
    public final void mo109654a() {
        C130322h hVar = this.f357189a;
        ValueAnimator valueAnimator = hVar.f357215h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = hVar.f357216i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.f357192f;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    /* renamed from: b */
    public final void mo109655b(float f) {
        int width = getWidth();
        float f2 = this.f357189a.f357214g;
        float f3 = ((float) width) - (f2 + f2);
        this.f357191e.reset();
        this.f357191e.moveTo(0.0f, m212752d(f, 0.0f));
        int i = this.f357196j;
        int i2 = (int) f3;
        if (i > 0) {
            int a = C69595d.m101009a(i, i2, i);
            if (i <= a) {
                int i3 = i;
                while (true) {
                    float f4 = (float) i3;
                    this.f357191e.lineTo(f4, m212752d(f, f4));
                    if (i3 == a) {
                        break;
                    }
                    i3 += i;
                }
            }
            this.f357191e.lineTo(f3, m212752d(f, f3));
            Path path = this.f357191e;
            float f5 = this.f357189a.f357214g;
            path.offset(f5, f5);
            invalidate();
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + i + ".");
    }

    /* renamed from: c */
    public final void mo109656c() {
        ValueAnimator valueAnimator = this.f357192f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f357189a.f357208a.isZero() || this.f357189a.f357212e == C130323i.HIDDEN) {
            mo109655b(0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 6.2831855f});
        ofFloat.setDuration(this.f357189a.f357208a.toMillis());
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C130317c(this, ofFloat));
        ofFloat.start();
        this.f357192f = ofFloat;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        mo109654a();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C69664n.m101061g(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f357191e;
        Paint paint = this.f357190d;
        paint.setStrokeWidth(this.f357189a.f357214g);
        paint.setColor(this.f357194h);
        canvas.drawPath(path, paint);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo109656c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wiggle(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
