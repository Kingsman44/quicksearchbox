package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import com.google.android.libraries.material.p2205a.C28503p;

/* renamed from: com.google.android.libraries.material.featurehighlight.ae */
/* compiled from: PG */
final class C28514ae extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final Context f77434a;

    public C28514ae(Context context) {
        this.f77434a = context.getApplicationContext();
    }

    public final void onAnimationStart(Animator animator) {
        if (C28503p.m53282a(this.f77434a)) {
            animator.cancel();
        }
    }
}
