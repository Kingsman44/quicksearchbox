package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ay */
/* compiled from: PG */
final class C83450ay extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C83468bb f227481a;

    public C83450ay(C83468bb bbVar) {
        this.f227481a = bbVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C58976aa aaVar = C58975e.f156826a;
        C83468bb bbVar = this.f227481a;
        bbVar.f227562m = false;
        bbVar.f227559j = true;
        bbVar.mo76798g(true);
        this.f227481a.f227542H = false;
    }
}
