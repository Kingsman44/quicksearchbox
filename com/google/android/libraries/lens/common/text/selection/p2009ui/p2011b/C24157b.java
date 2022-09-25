package com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.b.b */
/* compiled from: PG */
public final class C24157b {

    /* renamed from: a */
    public final C24161f f65980a;

    /* renamed from: b */
    public final ValueAnimator f65981b;

    /* renamed from: c */
    public boolean f65982c;

    /* renamed from: d */
    public float f65983d;

    /* renamed from: e */
    public float f65984e;

    /* renamed from: f */
    public float f65985f;

    /* renamed from: g */
    public float f65986g;

    /* renamed from: h */
    public float f65987h;

    /* renamed from: i */
    public float f65988i;

    /* renamed from: j */
    public float f65989j;

    /* renamed from: k */
    public float f65990k;

    /* renamed from: l */
    public float f65991l;

    /* renamed from: m */
    public float f65992m;

    /* renamed from: n */
    public float f65993n;

    /* renamed from: o */
    public int f65994o = 2;

    public C24157b(C24161f fVar) {
        this.f65980a = fVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f65981b = ofFloat;
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C24156a(this));
    }

    /* renamed from: a */
    public final void mo29585a(float f) {
        float f2 = this.f65983d;
        this.f65986g = f2 + ((this.f65989j - f2) * f);
        float f3 = this.f65984e;
        this.f65987h = f3 + ((this.f65990k - f3) * f);
        float f4 = this.f65985f;
        this.f65988i = f4 + ((this.f65991l - f4) * f);
    }
}
