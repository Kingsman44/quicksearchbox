package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cw */
/* compiled from: PG */
final class C93599cw extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ModularActionCardUnlabeledFooter f261315a;

    public C93599cw(ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter) {
        this.f261315a = modularActionCardUnlabeledFooter;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261315a.f261085d.removeListener(this);
        ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter = this.f261315a;
        modularActionCardUnlabeledFooter.f261086e = false;
        modularActionCardUnlabeledFooter.f261083b.setVisibility(4);
        C93602cz czVar = this.f261315a.f261084c;
        czVar.getClass();
        czVar.mo82057t();
    }
}
