package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134576bn;
import com.google.android.apps.search.googleapp.discover.p10214s.C134577bo;
import com.google.android.apps.search.googleapp.discover.p10214s.C134584bv;
import com.google.protobuf.C62934bn;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Instant;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.bx */
/* compiled from: PG */
final class C135179bx extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C135183ca f368209a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135179bx(C135183ca caVar) {
        super(1);
        this.f368209a = caVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C134577bo boVar = (C134577bo) obj;
        if (boVar == null) {
            C135183ca caVar = this.f368209a;
            C134576bn bnVar = (C134576bn) C134577bo.f366511f.createBuilder();
            C69664n.m101060f(bnVar, "newBuilder()");
            C134584bv a = C69664n.m101061g(bnVar, "builder");
            Instant a2 = caVar.f368226a.mo57444a();
            C69664n.m101060f(a2, "timeSource.now()");
            a.mo111828b(C62949a.m95467b(a2));
            return a.mo111827a();
        }
        C135183ca caVar2 = this.f368209a;
        C62934bn builder = boVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134584bv a3 = C69664n.m101061g((C134576bn) builder, "builder");
        Instant a4 = caVar2.f368226a.mo57444a();
        C69664n.m101060f(a4, "timeSource.now()");
        a3.mo111828b(C62949a.m95467b(a4));
        return a3.mo111827a();
    }
}
