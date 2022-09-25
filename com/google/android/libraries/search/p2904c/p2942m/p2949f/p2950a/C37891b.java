package com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a;

import com.google.android.libraries.search.p2904c.C37499df;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.protobuf.C62942bv;
import java.util.concurrent.atomic.AtomicInteger;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.m.f.a.b */
/* compiled from: PG */
public final class C37891b {

    /* renamed from: a */
    private final AtomicInteger f100474a = new AtomicInteger(0);

    /* renamed from: a */
    public final C37500dg mo41135a() {
        C37499df dfVar = (C37499df) C37500dg.f99557c.createBuilder();
        C69664n.m101060f(dfVar, "newBuilder()");
        C69664n.m101061g(dfVar, "builder");
        int incrementAndGet = this.f100474a.incrementAndGet();
        dfVar.copyOnWrite();
        C37500dg dgVar = (C37500dg) dfVar.instance;
        dgVar.f99559a |= 1;
        dgVar.f99560b = incrementAndGet;
        C62942bv build = dfVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C37500dg) build;
    }
}
