package com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34052bo;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34055br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.j.a.c */
/* compiled from: PG */
public final class C34708c {
    /* renamed from: a */
    public static final C34053bp m63442a(String str) {
        C69664n.m101061g(str, "clientName");
        C34052bo boVar = (C34052bo) C34053bp.f90753a.createBuilder();
        C69664n.m101060f(boVar, "newBuilder()");
        C34055br a = C69664n.m101061g(boVar, "builder");
        C62940bt btVar = C34707b.f92126d;
        C69664n.m101060f(btVar, "invocationUnawareToken");
        C34706a aVar = (C34706a) C34707b.f92125c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(str, "value");
        aVar.copyOnWrite();
        C34707b bVar = (C34707b) aVar.instance;
        str.getClass();
        bVar.f92128a |= 1;
        bVar.f92129b = str;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        a.mo39198b(btVar, (C34707b) build);
        return a.mo39197a();
    }

    /* renamed from: b */
    public static final boolean m63443b(C34053bp bpVar) {
        C69664n.m101061g(bpVar, "invocationToken");
        C62940bt r0 = C62942bv.checkIsLite(C34707b.f92126d);
        bpVar.mo58887l(r0);
        return bpVar.f169962ag.mo58857o(r0.f169971d);
    }
}
