package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.aj */
/* compiled from: PG */
final class C15402aj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f46222a;

    /* renamed from: b */
    final /* synthetic */ View f46223b;

    public C15402aj(View view, View view2) {
        this.f46222a = view;
        this.f46223b = view2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f46222a.setVisibility(8);
        this.f46223b.setVisibility(0);
    }
}
