package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125042h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cn */
/* compiled from: PG */
public final /* synthetic */ class C126076cn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347451a;

    /* renamed from: b */
    public final /* synthetic */ C125042h f347452b;

    public /* synthetic */ C126076cn(C126081cs csVar, C125042h hVar) {
        this.f347451a = csVar;
        this.f347452b = hVar;
    }

    public final void run() {
        C126081cs csVar = this.f347451a;
        C125042h hVar = this.f347452b;
        C126088cz czVar = csVar.f347469g.mo107337b().f347483d;
        if (csVar.f347469g.mo107337b().f347481b && czVar.f347503d == h.b && !czVar.f347501b.isEmpty() && hVar.f344986b.equals(czVar.f347501b)) {
            csVar.f347476n.mo107410i();
            C46459k.m82829b(csVar.f347475m.mo107222d(czVar.f347501b, hVar.f344985a), "Failed to set emoji preference %s for concept %s. [SD]", hVar.f344985a, czVar.f347501b);
        }
        C126106dq dqVar = csVar.f347469g;
        String str = hVar.f344985a;
        String str2 = hVar.f344986b;
        C62971cq cqVar = hVar.f344987c;
        h a = h.a(hVar.f344988d);
        if (a == null) {
            a = h.f;
        }
        dqVar.mo107340e(new C126103dn(new C126088cz(str, str2, cqVar, a, hVar.f344989e, hVar.f344990f), dqVar));
    }
}
