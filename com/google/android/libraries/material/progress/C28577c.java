package com.google.android.libraries.material.progress;

import android.animation.Animator;
import com.google.android.libraries.material.p2205a.C28489b;

/* renamed from: com.google.android.libraries.material.progress.c */
/* compiled from: PG */
final class C28577c extends C28489b {

    /* renamed from: a */
    final /* synthetic */ C28578d f77698a;

    public C28577c(C28578d dVar) {
        this.f77698a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo33944a(animator)) {
            this.f77698a.f77701b = null;
            return;
        }
        C28578d dVar = this.f77698a;
        C28577c.super.setVisible(dVar.f77700a, false);
        Runnable runnable = this.f77698a.f77701b;
        if (runnable != null) {
            ((C28590p) runnable).f77790a.mo34160c();
            this.f77698a.f77701b = null;
        }
        this.f77698a.mo34178d();
    }
}
