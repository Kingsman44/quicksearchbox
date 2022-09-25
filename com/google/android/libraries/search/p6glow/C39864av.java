package com.google.android.libraries.search.p6glow;

import android.view.animation.LinearInterpolator;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: com.google.android.libraries.search.p6glow.av */
/* compiled from: PG */
final class C39864av implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C39865aw f104831a;

    /* renamed from: b */
    final /* synthetic */ C69615a f104832b;

    /* renamed from: c */
    final /* synthetic */ C69615a f104833c;

    public C39864av(C39865aw awVar, C69615a aVar, C69615a aVar2) {
        this.f104831a = awVar;
        this.f104832b = aVar;
        this.f104833c = aVar2;
    }

    public final void run() {
        AssistantP6GlowView assistantP6GlowView = this.f104831a.f104836b;
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        assistantP6GlowView.mo42035l(C39845ac.f104800f);
        this.f104832b.mo5672a();
        this.f104833c.mo5672a();
    }
}
