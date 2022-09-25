package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.av */
/* compiled from: PG */
final class C30724av extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C30727ay f82940a;

    public C30724av(C30727ay ayVar) {
        this.f82940a = ayVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f82940a.f82930b.setVisibility(0);
    }
}
