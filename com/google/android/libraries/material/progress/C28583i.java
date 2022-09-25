package com.google.android.libraries.material.progress;

import android.animation.Animator;
import com.google.android.libraries.material.p2205a.C28489b;

/* renamed from: com.google.android.libraries.material.progress.i */
/* compiled from: PG */
final class C28583i extends C28489b {

    /* renamed from: a */
    final /* synthetic */ C28585k f77748a;

    public C28583i(C28585k kVar) {
        this.f77748a = kVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo33944a(animator)) {
            this.f77748a.f77751b = null;
            return;
        }
        C28585k kVar = this.f77748a;
        C28583i.super.setVisible(kVar.f77750a, false);
        this.f77748a.mo34227c();
        Runnable runnable = this.f77748a.f77751b;
        if (runnable != null) {
            ((C28590p) runnable).f77790a.mo34160c();
            this.f77748a.f77751b = null;
        }
    }
}
