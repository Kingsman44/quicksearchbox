package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.az */
/* compiled from: PG */
final class C30198az extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C30202bc f81644a;

    public C30198az(C30202bc bcVar) {
        this.f81644a = bcVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f81644a.f81657h.mo56113h()) {
            C30192at atVar = (C30192at) this.f81644a.f81657h.mo56107c();
            if (atVar.mo35645a() != null) {
                atVar.mo35645a().mo35651c();
            }
        }
        this.f81644a.f81650a.setImageDrawable((Drawable) null);
    }
}
