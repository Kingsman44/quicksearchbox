package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.f */
/* compiled from: PG */
final class C31044f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ExpandableDialogView f83631a;

    public C31044f(ExpandableDialogView expandableDialogView) {
        this.f83631a = expandableDialogView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f83631a.requestLayout();
        this.f83631a.mo36693c(0.0f);
    }
}
