package com.google.android.apps.gsa.settingsui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.settingsui.j */
/* compiled from: PG */
public final /* synthetic */ class C88995j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f241170a;

    public /* synthetic */ C88995j(View view) {
        this.f241170a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f241170a;
        int i = SettingsPreferenceFragment.f241148l;
        view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
