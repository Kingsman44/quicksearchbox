package com.google.android.material.p3516m;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;

/* renamed from: com.google.android.material.m.g */
/* compiled from: PG */
public final class C44811g implements C44813i {

    /* renamed from: a */
    public float f116852a;

    /* renamed from: b */
    public boolean f116853b;

    /* renamed from: c */
    private float f116854c;

    /* renamed from: d */
    private float f116855d;

    /* renamed from: e */
    private float f116856e;

    /* renamed from: f */
    private boolean f116857f;

    public C44811g() {
        this((byte[]) null);
    }

    public C44811g(byte[] bArr) {
        this.f116854c = 1.0f;
        this.f116855d = 1.1f;
        this.f116852a = 0.8f;
        this.f116856e = 1.0f;
        this.f116853b = true;
        this.f116857f = true;
    }

    /* renamed from: c */
    private static Animator m79478c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C44810f(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public final Animator mo48173a(View view) {
        if (this.f116857f) {
            return m79478c(view, this.f116852a, this.f116856e);
        }
        return m79478c(view, this.f116855d, this.f116854c);
    }

    /* renamed from: b */
    public final Animator mo48174b(View view) {
        if (!this.f116853b) {
            return null;
        }
        if (this.f116857f) {
            return m79478c(view, this.f116854c, this.f116855d);
        }
        return m79478c(view, this.f116856e, this.f116852a);
    }
}
