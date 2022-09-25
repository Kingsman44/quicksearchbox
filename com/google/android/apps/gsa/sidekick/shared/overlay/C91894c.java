package com.google.android.apps.gsa.sidekick.shared.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.overlay.c */
/* compiled from: PG */
final class C91894c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C91896e f256227a;

    public C91894c(C91896e eVar) {
        this.f256227a = eVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C91896e eVar = this.f256227a;
        if (eVar.f256234f == 0) {
            eVar.mo86476d();
            eVar.f256240l = 1;
            C90714z zVar = eVar.f256238j;
            if (zVar != null) {
                zVar.mo85044h(true, true);
                C90714z zVar2 = eVar.f256238j;
                if (zVar2 != null && zVar2.f253746a == 0) {
                    zVar2.mo85047k(0, 2);
                }
            } else {
                eVar.mo86479g(false);
            }
            eVar.mo86480h();
            return;
        }
        eVar.mo86478f();
    }
}
