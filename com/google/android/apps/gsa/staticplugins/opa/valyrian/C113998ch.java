package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ch */
/* compiled from: PG */
final class C113998ch extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315638a;

    public C113998ch(C114071eg egVar) {
        this.f315638a = egVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Animator animator;
        LinearLayoutManager aS = this.f315638a.mo100993aS();
        int findFirstVisibleItemPosition = aS.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0 && findFirstVisibleItemPosition <= this.f315638a.mo100989aL()) {
            if (findFirstVisibleItemPosition > 0 || aS.findViewByPosition(0).getTop() != 0) {
                C114071eg egVar = this.f315638a;
                if (egVar.f315818aB != null && egVar.f315868az != null && (animator = egVar.f315817aA) != null) {
                    animator.cancel();
                    if (!egVar.f315868az.isStarted() && egVar.f315818aB.isShown()) {
                        egVar.f315868az.start();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f315638a.mo100999bI();
        }
    }
}
