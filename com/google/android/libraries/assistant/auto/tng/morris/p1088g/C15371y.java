package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.y */
/* compiled from: PG */
final class C15371y implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f46140a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f46141b;

    /* renamed from: c */
    final /* synthetic */ boolean f46142c;

    /* renamed from: d */
    final /* synthetic */ int f46143d;

    /* renamed from: e */
    final /* synthetic */ C15109ac f46144e;

    public C15371y(C15109ac acVar, ViewGroup viewGroup, ViewGroup viewGroup2, boolean z, int i) {
        this.f46144e = acVar;
        this.f46140a = viewGroup;
        this.f46141b = viewGroup2;
        this.f46142c = z;
        this.f46143d = i;
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.f46144e.f45342e) {
            this.f46140a.removeAllViews();
            this.f46141b.setVisibility(8);
            C15370x xVar = new C15370x(this, this.f46142c, this.f46143d);
            C60856cj.m92903l(C47810es.m84977q(xVar), this.f46144e.f45339b);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
