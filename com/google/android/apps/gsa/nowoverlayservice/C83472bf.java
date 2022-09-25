package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bf */
/* compiled from: PG */
final class C83472bf extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f227592a;

    /* renamed from: b */
    final /* synthetic */ C83475bi f227593b;

    public C83472bf(C83475bi biVar, boolean z) {
        this.f227593b = biVar;
        this.f227592a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        C83475bi biVar = this.f227593b;
        boolean z = this.f227592a;
        C83473bg bgVar = biVar.f227606i;
        if (bgVar != null) {
            C83468bb bbVar = (C83468bb) bgVar;
            bbVar.f227560k = true;
            bbVar.mo76798g(z);
        }
    }
}
