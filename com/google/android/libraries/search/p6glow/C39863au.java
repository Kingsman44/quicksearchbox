package com.google.android.libraries.search.p6glow;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.animation.C147785k;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: com.google.android.libraries.search.p6glow.au */
/* compiled from: PG */
final class C39863au implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C39865aw f104828a;

    /* renamed from: b */
    final /* synthetic */ C147785k f104829b;

    /* renamed from: c */
    final /* synthetic */ C69615a f104830c;

    public C39863au(C39865aw awVar, C147785k kVar, C69615a aVar) {
        this.f104828a = awVar;
        this.f104829b = kVar;
        this.f104830c = aVar;
    }

    public final void run() {
        if (this.f104828a.f104836b.getAlpha() > 0.0f) {
            this.f104829b.mo124460b(1.0f, C39865aw.f104834a);
            return;
        }
        AssistantP6GlowView assistantP6GlowView = this.f104828a.f104836b;
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        assistantP6GlowView.mo42035l(C39845ac.f104800f);
        this.f104830c.mo5672a();
    }
}
