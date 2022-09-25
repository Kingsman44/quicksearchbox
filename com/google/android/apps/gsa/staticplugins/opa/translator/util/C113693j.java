package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.j */
/* compiled from: PG */
public final class C113693j {

    /* renamed from: a */
    public final Animation f314891a;

    /* renamed from: b */
    public boolean f314892b;

    /* renamed from: c */
    public boolean f314893c;

    public C113693j(Animation animation) {
        this.f314891a = animation;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo100523a() {
        this.f314892b = false;
        this.f314893c = true;
        this.f314891a.cancel();
        this.f314891a.reset();
    }

    /* renamed from: b */
    public final void mo100524b(View view) {
        this.f314892b = true;
        this.f314893c = false;
        view.startAnimation(this.f314891a);
    }

    /* renamed from: c */
    public final void mo100525c(Animation.AnimationListener animationListener) {
        this.f314891a.setAnimationListener(new C113692i(this, animationListener));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo100526d() {
        if (this.f314893c) {
            return false;
        }
        if (!this.f314892b) {
            return this.f314891a.hasStarted() && !this.f314891a.hasEnded();
        }
        return true;
    }
}
