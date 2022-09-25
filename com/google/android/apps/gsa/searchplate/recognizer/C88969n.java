package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.n */
/* compiled from: PG */
final class C88969n extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Drawable f241086a;

    /* renamed from: b */
    final /* synthetic */ C88970o f241087b;

    public C88969n(C88970o oVar, Drawable drawable) {
        this.f241087b = oVar;
        this.f241086a = drawable;
    }

    public final void onAnimationStart(Animator animator) {
        Interpolator interpolator = C88970o.f241088a;
        C58976aa aaVar = C58975e.f156826a;
        this.f241087b.f241090c.setImageDrawable(this.f241086a);
    }
}
