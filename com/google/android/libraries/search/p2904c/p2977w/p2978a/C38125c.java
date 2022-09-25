package com.google.android.libraries.search.p2904c.p2977w.p2978a;

import com.google.android.libraries.search.p2904c.p2916e.C37536b;
import com.google.android.libraries.search.p2904c.p2916e.C37539c;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.c.w.a.c */
/* compiled from: PG */
final class C38125c extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C38129g f101004a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38125c(C38129g gVar) {
        super(0);
        this.f101004a = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C38129g gVar = this.f101004a;
        C37536b bVar = (C37536b) C37539c.f99728c.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C69664n.m101061g(bVar, "builder");
        long incrementAndGet = gVar.f101018a.f100473a.incrementAndGet();
        bVar.copyOnWrite();
        C37539c cVar = (C37539c) bVar.instance;
        cVar.f99730a |= 1;
        cVar.f99731b = incrementAndGet;
        C62942bv build = bVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C37539c) build;
    }
}
