package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.aw */
/* compiled from: PG */
final class C30725aw extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ List f82941a;

    /* renamed from: b */
    final /* synthetic */ C30727ay f82942b;

    public C30725aw(C30727ay ayVar, List list) {
        this.f82942b = ayVar;
        this.f82941a = list;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f82942b.f82930b.setVisibility(8);
        for (View translationY : this.f82941a) {
            translationY.setTranslationY(0.0f);
        }
    }
}
