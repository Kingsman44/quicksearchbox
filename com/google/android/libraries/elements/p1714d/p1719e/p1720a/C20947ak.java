package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import android.animation.ObjectAnimator;

/* renamed from: com.google.android.libraries.elements.d.e.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C20947ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20951ao f58733a;

    public /* synthetic */ C20947ak(C20951ao aoVar) {
        this.f58733a = aoVar;
    }

    public final void run() {
        ObjectAnimator objectAnimator = this.f58733a.f58739a;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }
}
