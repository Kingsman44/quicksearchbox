package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14255cl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14260cq;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.h */
/* compiled from: PG */
final class C15354h implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f46067a;

    /* renamed from: b */
    final /* synthetic */ C14260cq f46068b;

    /* renamed from: c */
    final /* synthetic */ ContextThemeWrapper f46069c;

    /* renamed from: d */
    final /* synthetic */ C15355i f46070d;

    public C15354h(C15355i iVar, ViewGroup viewGroup, C14260cq cqVar, ContextThemeWrapper contextThemeWrapper) {
        this.f46070d = iVar;
        this.f46067a = viewGroup;
        this.f46068b = cqVar;
        this.f46069c = contextThemeWrapper;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f46067a.removeAllViews();
        C14260cq cqVar = this.f46068b;
        if (C14255cl.m30585a(cqVar.f43139a) == 8) {
            this.f46067a.setVisibility(4);
            return;
        }
        this.f46070d.mo22237b(cqVar, this.f46067a, this.f46069c, true);
        this.f46067a.startAnimation(AnimationUtils.loadAnimation(this.f46069c, R.anim.fab_in));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
