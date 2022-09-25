package com.google.android.libraries.material.progress;

import android.animation.Animator;
import com.google.android.libraries.material.p2205a.C28489b;

/* renamed from: com.google.android.libraries.material.progress.n */
/* compiled from: PG */
final class C28588n extends C28489b {

    /* renamed from: a */
    final /* synthetic */ C28589o f77768a;

    public C28588n(C28589o oVar) {
        this.f77768a = oVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo33944a(animator)) {
            this.f77768a.f77771c = null;
            return;
        }
        C28589o oVar = this.f77768a;
        C28588n.super.setVisible(oVar.f77770b, false);
        this.f77768a.f77769a.cancel();
        this.f77768a.mo34246c();
        Runnable runnable = this.f77768a.f77771c;
        if (runnable != null) {
            ((C28590p) runnable).f77790a.mo34160c();
            this.f77768a.f77771c = null;
        }
    }
}
