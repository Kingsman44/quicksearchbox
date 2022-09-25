package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.aa */
/* compiled from: PG */
public final class C128469aa extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C128483ao f353328a;

    /* renamed from: b */
    final /* synthetic */ C69626l f353329b;

    /* renamed from: c */
    final /* synthetic */ View f353330c;

    public C128469aa(C128483ao aoVar, C69626l lVar, View view) {
        this.f353328a = aoVar;
        this.f353329b = lVar;
        this.f353330c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animator");
        if (this.f353328a.f353352e.getView() != null) {
            this.f353329b.mo5761a(animator);
            C128483ao aoVar = this.f353328a;
            aoVar.mo108473l(aoVar.mo108466e());
            this.f353328a.mo108472k(this.f353330c);
        }
    }
}
