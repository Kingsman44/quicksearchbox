package com.google.android.gms.people.accountswitcherview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* renamed from: com.google.android.gms.people.accountswitcherview.a */
/* compiled from: PG */
final class C145631a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ SelectedAccountNavigationView f393840a;

    public C145631a(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f393840a = selectedAccountNavigationView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f393840a.f393814a.f393864q.setVisibility(8);
        this.f393840a.f393814a.f393861n.setVisibility(8);
        ImageView imageView = this.f393840a.f393814a.f393865r;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f393840a.mo121668b();
        this.f393840a.f393816c = null;
    }
}
