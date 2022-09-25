package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ck */
/* compiled from: PG */
final class C108494ck extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ String f301884a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f301885b;

    public C108494ck(C109040fj fjVar, String str) {
        this.f301885b = fjVar;
        this.f301884a = str;
    }

    public final void onAnimationEnd(Animator animator) {
        ((C113989h) ((C113988g) this.f301885b.f303450o).mo100833bf().mo56107c()).mo100900dA();
    }

    public final void onAnimationStart(Animator animator) {
        this.f301885b.mo97477am(this.f301884a);
    }
}
