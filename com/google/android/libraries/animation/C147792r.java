package com.google.android.libraries.animation;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.libraries.animation.r */
/* compiled from: PG */
public final /* synthetic */ class C147792r implements C147788n {

    /* renamed from: a */
    public final /* synthetic */ C147794t f398756a;

    /* renamed from: b */
    public final /* synthetic */ Interpolator f398757b;

    /* renamed from: c */
    public final /* synthetic */ C147788n f398758c;

    public /* synthetic */ C147792r(C147794t tVar, Interpolator interpolator, C147788n nVar) {
        this.f398756a = tVar;
        this.f398757b = interpolator;
        this.f398758c = nVar;
    }

    /* renamed from: a */
    public final Object mo42061a(float f) {
        C147794t tVar = this.f398756a;
        Interpolator interpolator = this.f398757b;
        C147788n nVar = this.f398758c;
        float interpolation = interpolator.getInterpolation(f);
        Interpolator interpolator2 = tVar.f398762b;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        return nVar.mo42061a(interpolation);
    }
}
