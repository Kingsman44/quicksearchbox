package com.google.android.libraries.material.opensearchbar;

import android.animation.AnimatorSet;

/* renamed from: com.google.android.libraries.material.opensearchbar.o */
/* compiled from: PG */
public final /* synthetic */ class C28560o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28571z f77639a;

    public /* synthetic */ C28560o(C28571z zVar) {
        this.f77639a = zVar;
    }

    public final void run() {
        C28571z zVar = this.f77639a;
        AnimatorSet a = zVar.mo34148a(true);
        a.addListener(new C28566u(zVar));
        a.start();
    }
}
