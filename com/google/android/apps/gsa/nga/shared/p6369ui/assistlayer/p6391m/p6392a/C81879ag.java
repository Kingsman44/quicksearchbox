package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C81879ag implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223897a;

    /* renamed from: b */
    public final /* synthetic */ View f223898b;

    /* renamed from: c */
    public final /* synthetic */ AssistantP6GlowView f223899c;

    /* renamed from: d */
    public final /* synthetic */ LottieAnimationView f223900d;

    public /* synthetic */ C81879ag(C81889aq aqVar, View view, AssistantP6GlowView assistantP6GlowView, LottieAnimationView lottieAnimationView) {
        this.f223897a = aqVar;
        this.f223898b = view;
        this.f223899c = assistantP6GlowView;
        this.f223900d = lottieAnimationView;
    }

    public final void run() {
        C81889aq aqVar = this.f223897a;
        View view = this.f223898b;
        AssistantP6GlowView assistantP6GlowView = this.f223899c;
        LottieAnimationView lottieAnimationView = this.f223900d;
        aqVar.f223919d.removeAllViews();
        aqVar.f223919d.addView(view);
        aqVar.f223931p.mo75435f(assistantP6GlowView, 92671, false);
        aqVar.f223931p.mo75435f(lottieAnimationView, 125337, false);
        aqVar.f223931p.mo75431b((View) aqVar.f223919d.getParent());
    }
}
