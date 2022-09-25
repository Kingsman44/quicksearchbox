package com.google.android.libraries.onegoogle.accountmenu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.af */
/* compiled from: PG */
final class C30316af extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AccountParticleDisc f81981a;

    /* renamed from: b */
    final /* synthetic */ C30317ag f81982b;

    public C30316af(C30317ag agVar, AccountParticleDisc accountParticleDisc) {
        this.f81982b = agVar;
        this.f81981a = accountParticleDisc;
    }

    public final void onAnimationStart(Animator animator) {
        this.f81981a.setTranslationY(0.0f);
        this.f81981a.setTranslationX(0.0f);
        this.f81981a.setPivotX((float) (this.f81982b.f81984b.getHeight() >> 1));
        this.f81981a.setPivotY((float) (this.f81982b.f81984b.getHeight() >> 1));
    }
}
