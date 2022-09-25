package com.google.android.libraries.search.p6glow;

import android.view.animation.LinearInterpolator;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: com.google.android.libraries.search.p6glow.ai */
/* compiled from: PG */
final class C39851ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C39854al f104806a;

    /* renamed from: b */
    final /* synthetic */ C69615a f104807b;

    public C39851ai(C39854al alVar, C69615a aVar) {
        this.f104806a = alVar;
        this.f104807b = aVar;
    }

    public final void run() {
        AssistantP6GlowView assistantP6GlowView = this.f104806a.f104813a;
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        assistantP6GlowView.mo42035l(C39845ac.f104800f);
        this.f104807b.mo5672a();
    }
}
