package com.google.android.libraries.onegoogle.accountmenu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.ac */
/* compiled from: PG */
final class C30291ac extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C30314ad f81924a;

    public C30291ac(C30314ad adVar) {
        this.f81924a = adVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f81924a.f81977a.f81984b.setEnabled(true);
    }
}
