package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63126b;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.assistant.c.f.a.h */
/* compiled from: PG */
final class C17283h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C17291p f50083a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17283h(C17291p pVar) {
        super(1);
        this.f50083a = pVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            this.f50083a.f50105f.mo38135c((Throwable) null);
        } else {
            C59052c cVar = (C59052c) ((C59052c) C17291p.f50100a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(42653));
            cVar.mo56386p("Handover to OPA failed");
            this.f50083a.f50105f.mo38135c(C17293r.m34513a(th, C63126b.HANDOVER_FAILED));
        }
        return C69788q.f186170a;
    }
}
