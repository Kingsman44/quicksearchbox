package com.google.android.apps.gsa.search.shared.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87643q;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.h */
/* compiled from: PG */
final class C87659h extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C87643q f236921a;

    public C87659h(C87643q qVar) {
        this.f236921a = qVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C87643q qVar = this.f236921a;
        if (qVar != null && !qVar.f236902a.f236778H.f240689I.mo82766k()) {
            qVar.f236902a.mo81801ah();
        }
    }
}
