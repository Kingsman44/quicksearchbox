package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.m */
/* compiled from: PG */
final class C15359m implements Animation.AnimationListener {

    /* renamed from: c */
    public static final /* synthetic */ int f46100c = 0;

    /* renamed from: a */
    final /* synthetic */ ViewGroup f46101a;

    /* renamed from: b */
    final /* synthetic */ View f46102b;

    public C15359m(ViewGroup viewGroup, View view) {
        this.f46101a = viewGroup;
        this.f46102b = view;
    }

    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.f46101a;
        viewGroup.post(new C15358l(viewGroup, this.f46102b));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
