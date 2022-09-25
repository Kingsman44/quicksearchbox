package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b.C64256a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b.C64257b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.u */
/* compiled from: PG */
public final class C40435u {
    /* renamed from: a */
    public static final C64257b m70130a(String str) {
        C69664n.m101061g(str, "key");
        C64256a aVar = (C64256a) C64257b.f173740c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(str, "value");
        aVar.copyOnWrite();
        C64257b bVar = (C64257b) aVar.instance;
        str.getClass();
        bVar.f173742a |= 1;
        bVar.f173743b = str;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C64257b) build;
    }
}
