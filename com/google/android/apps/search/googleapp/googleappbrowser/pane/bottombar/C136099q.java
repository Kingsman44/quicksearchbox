package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.q */
/* compiled from: PG */
final class C136099q extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f370652a;

    /* renamed from: b */
    final /* synthetic */ C136100r f370653b;

    public C136099q(C136100r rVar, boolean z) {
        this.f370653b = rVar;
        this.f370652a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f370652a) {
            this.f370653b.f370655b.setVisibility(8);
        } else {
            this.f370653b.f370654a.setVisibility(8);
        }
        C136100r rVar = this.f370653b;
        rVar.f370657d = 1;
        rVar.f370656c = null;
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f370652a) {
            this.f370653b.f370654a.setVisibility(0);
        } else {
            this.f370653b.f370655b.setVisibility(0);
        }
    }
}
