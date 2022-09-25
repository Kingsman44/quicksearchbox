package com.google.android.gms.people.accountswitcherview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.gms.people.accountswitcherview.c */
/* compiled from: PG */
final class C145633c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ SelectedAccountNavigationView f393842a;

    public C145633c(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f393842a = selectedAccountNavigationView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f393842a.mo121668b();
        this.f393842a.f393816c = null;
    }
}
