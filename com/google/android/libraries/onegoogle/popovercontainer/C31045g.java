package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.g */
/* compiled from: PG */
final class C31045g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ExpandableDialogView f83632a;

    public C31045g(ExpandableDialogView expandableDialogView) {
        this.f83632a = expandableDialogView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f83632a.mo36693c(0.0f);
    }
}
