package com.google.android.libraries.material.progress;

import android.animation.Animator;
import com.google.android.libraries.material.p2205a.C28489b;

/* renamed from: com.google.android.libraries.material.progress.g */
/* compiled from: PG */
final class C28581g extends C28489b {

    /* renamed from: a */
    final /* synthetic */ C28582h f77718a;

    public C28581g(C28582h hVar) {
        this.f77718a = hVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (mo33944a(animator)) {
            this.f77718a.f77725c = null;
            return;
        }
        C28582h hVar = this.f77718a;
        C28581g.super.setVisible(hVar.f77724b, false);
        Runnable runnable = this.f77718a.f77725c;
        if (runnable != null) {
            ((C28590p) runnable).f77790a.mo34160c();
            this.f77718a.f77725c = null;
        }
        this.f77718a.mo34199d();
    }
}
