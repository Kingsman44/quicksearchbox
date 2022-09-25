package com.google.android.apps.search.googleapp.discover.p10182e.p10183a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Instant;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.discover.e.a.b */
/* compiled from: PG */
final class C134239b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Instant f365710a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134239b(Instant instant) {
        super(1);
        this.f365710a = instant;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C134248k kVar = (C134248k) obj;
        C69664n.m101061g(kVar, "data");
        Instant instant = this.f365710a;
        C62934bn builder = kVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134246i a = C69664n.m101061g((C134247j) builder, "builder");
        a.mo111661b(C62949a.m95467b(instant));
        return a.mo111660a();
    }
}
