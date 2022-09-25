package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.r */
/* compiled from: PG */
final class C44955r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44956s f117420a;

    public C44955r(C44956s sVar) {
        this.f117420a = sVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f117420a.mo48610x();
        this.f117420a.f117424d.start();
    }
}
