package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bj */
/* compiled from: PG */
final class C93559bj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TextView f261235a;

    /* renamed from: b */
    final /* synthetic */ int f261236b;

    public C93559bj(TextView textView, int i) {
        this.f261235a = textView;
        this.f261236b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261235a.setTextColor(this.f261236b);
    }
}
