package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ba */
/* compiled from: PG */
final class C30200ba extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C58833ax f81646a;

    /* renamed from: b */
    final /* synthetic */ Drawable f81647b;

    /* renamed from: c */
    final /* synthetic */ C30202bc f81648c;

    public C30200ba(C30202bc bcVar, C58833ax axVar, Drawable drawable) {
        this.f81648c = bcVar;
        this.f81646a = axVar;
        this.f81647b = drawable;
    }

    public final void onAnimationStart(Animator animator) {
        C30202bc bcVar = this.f81648c;
        bcVar.f81657h = this.f81646a;
        if (bcVar.f81657h.mo56113h()) {
            C30192at atVar = (C30192at) this.f81648c.f81657h.mo56107c();
            if (atVar.mo35645a() != null) {
                atVar.mo35645a().mo35650b();
            }
        }
        this.f81648c.f81650a.setImageDrawable(this.f81647b);
        Drawable drawable = this.f81647b;
        int i = this.f81648c.f81652c;
        drawable.setBounds(0, 0, i, i);
    }
}
