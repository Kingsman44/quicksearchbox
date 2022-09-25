package com.google.android.apps.gsa.shared.util.p7187ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.b */
/* compiled from: PG */
public final class C91103b extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f254397a;

    /* renamed from: b */
    private final int f254398b = 4;

    /* renamed from: c */
    private boolean f254399c;

    public C91103b(View view) {
        this.f254397a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        Interpolator interpolator = C91104c.f254400a;
        this.f254399c = true;
    }

    public final void onAnimationEnd(Animator animator) {
        Interpolator interpolator = C91104c.f254400a;
        if (!this.f254399c) {
            this.f254397a.setVisibility(this.f254398b);
        }
    }
}
