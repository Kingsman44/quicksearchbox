package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17317m;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17319o;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63126b;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.f.a.f */
/* compiled from: PG */
final class C17281f implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C17291p f50081a;

    public C17281f(C17291p pVar) {
        this.f50081a = pVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f50081a.f50109j.mo62909P(C69788q.f186170a);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, "error");
        this.f50081a.f50109j.mo63050j(C17293r.m34513a(th, C63126b.CONNECTION_TO_OPA_FAILED));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C17319o oVar;
        C17317m mVar = (C17317m) obj;
        C69664n.m101061g(mVar, "value");
        int i = mVar.f50149a;
        if (i == 1) {
            if (i == 1) {
                oVar = (C17319o) mVar.f50150b;
            } else {
                oVar = C17319o.f50151c;
            }
            C69664n.m101060f(oVar, "value.handoverStatus");
            this.f50081a.f50105f.mo38137d(oVar);
        }
    }
}
