package com.google.android.libraries.animation;

import android.animation.TypeEvaluator;

/* renamed from: com.google.android.libraries.animation.p */
/* compiled from: PG */
public final class C147790p implements C147788n {

    /* renamed from: a */
    final /* synthetic */ float f398753a;

    /* renamed from: b */
    final /* synthetic */ float f398754b;

    /* renamed from: c */
    private final TypeEvaluator f398755c = C147789o.f398752a;

    public C147790p(float f, float f2) {
        this.f398753a = f;
        this.f398754b = f2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42061a(float f) {
        return (Float) this.f398755c.evaluate(f, Float.valueOf(this.f398753a), Float.valueOf(this.f398754b));
    }
}
