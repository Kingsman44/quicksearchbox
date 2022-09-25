package com.google.android.gms.people.accountswitcherview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.gms.people.accountswitcherview.b */
/* compiled from: PG */
final class C145632b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ SelectedAccountNavigationView f393841a;

    public C145632b(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f393841a = selectedAccountNavigationView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f393841a.mo121668b();
        this.f393841a.f393816c = null;
    }
}
