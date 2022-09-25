package com.google.android.libraries.lens.view.gleam;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.lens.view.utils.C28134w;

/* renamed from: com.google.android.libraries.lens.view.gleam.av */
/* compiled from: PG */
final class C26463av {

    /* renamed from: a */
    public final Paint f72078a;

    /* renamed from: b */
    public final float f72079b;

    /* renamed from: c */
    public final float f72080c;

    /* renamed from: d */
    public final float f72081d;

    /* renamed from: e */
    public final RectF f72082e = new RectF();

    /* renamed from: f */
    public final RectF f72083f = new RectF();

    /* renamed from: g */
    float f72084g;

    /* renamed from: h */
    public boolean f72085h = false;

    /* renamed from: i */
    public boolean f72086i = false;

    /* renamed from: j */
    private final float f72087j;

    /* renamed from: k */
    private final AnimatorSet f72088k = new AnimatorSet();

    /* renamed from: l */
    private int f72089l = 1;

    public C26463av(Context context) {
        Paint paint = new Paint();
        this.f72078a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C28134w.m52424a(2.0f, context));
        this.f72079b = C28134w.m52424a(30.0f, context);
        this.f72080c = C28134w.m52424a(46.0f, context);
        this.f72081d = C28134w.m52424a(8.0f, context);
        this.f72087j = C28134w.m52424a(12.0f, context);
    }

    /* renamed from: b */
    private final void m48851b(float f) {
        if (this.f72088k.isRunning()) {
            this.f72088k.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f72084g, f});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(250);
        ofFloat.addUpdateListener(new C26462au(this));
        this.f72088k.play(ofFloat);
        this.f72088k.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31716a(int i) {
        if (this.f72089l != i && this.f72085h) {
            this.f72089l = i;
            if (i - 1 != 1) {
                m48851b(0.0f);
            } else {
                m48851b(this.f72087j);
            }
        }
    }
}
