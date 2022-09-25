package com.google.android.libraries.search.assistant.p2486aa.p2492c;

import com.google.android.libraries.search.assistant.p2486aa.p2490b.C32260b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.h */
/* compiled from: PG */
final class C32355h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C32849cq f86722a;

    /* renamed from: b */
    final /* synthetic */ int f86723b;

    /* renamed from: c */
    final /* synthetic */ C32357j f86724c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32355h(C32849cq cqVar, int i, C32357j jVar) {
        super(1);
        this.f86722a = cqVar;
        this.f86723b = i;
        this.f86724c = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            C59052c cVar = (C59052c) C32357j.f86730a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar2 = (C59052c) cVar.mo56382g(th);
            String b = C32941s.m60951b(this.f86722a);
            int i = this.f86723b;
            cVar2.mo56379ah(new C59094n(52532));
            cVar2.mo56352E("Error during SODA update on register. SessionToken: %s; RequestId: %s", b, i);
        } else {
            C59052c cVar3 = (C59052c) C32357j.f86730a.mo56224b();
            cVar3.mo56378ag(C58975e.f156826a, "Sbcp");
            String b2 = C32941s.m60951b(this.f86722a);
            int i2 = this.f86723b;
            cVar3.mo56379ah(new C59094n(52531));
            cVar3.mo56352E("registerSpeechBiasingContextSession finished successfully. SessionToken: %s; RequestId: %s", b2, i2);
        }
        C32260b bVar = this.f86724c.f86733d;
        C32849cq cqVar = this.f86722a;
        int i3 = this.f86723b;
        C69664n.m101061g(cqVar, "sessionToken");
        bVar.mo38023d(C37176a.f97136fp.mo40806d(), cqVar, i3, th);
        return C69788q.f186170a;
    }
}
