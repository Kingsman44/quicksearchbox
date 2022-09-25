package com.google.android.libraries.search.assistant.invocation.p2655o.p2692j;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34052bo;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34055br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.j.a */
/* compiled from: PG */
public final class C34705a {
    /* renamed from: a */
    public static final C34053bp m63440a(String str) {
        C69664n.m101061g(str, "rawToken");
        C34052bo boVar = (C34052bo) C34053bp.f90753a.createBuilder();
        C69664n.m101060f(boVar, "newBuilder()");
        C34055br a = C69664n.m101061g(boVar, "builder");
        C62940bt btVar = C34712c.f92131d;
        C69664n.m101060f(btVar, "triggeringApiPrivate");
        C34709b bVar = (C34709b) C34712c.f92130c.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C69664n.m101061g(bVar, "builder");
        C69664n.m101061g(str, "value");
        bVar.copyOnWrite();
        C34712c cVar = (C34712c) bVar.instance;
        str.getClass();
        cVar.f92133a |= 1;
        cVar.f92134b = str;
        C62942bv build = bVar.build();
        C69664n.m101060f(build, "_builder.build()");
        a.mo39198b(btVar, (C34712c) build);
        return a.mo39197a();
    }

    /* renamed from: b */
    public static final String m63441b(C34053bp bpVar) {
        Object obj;
        C69664n.m101061g(bpVar, "token");
        C62940bt r0 = C62942bv.checkIsLite(C34712c.f92131d);
        bpVar.mo58887l(r0);
        if (bpVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C34712c.f92131d);
            bpVar.mo58887l(r02);
            Object l = bpVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            String str = ((C34712c) obj).f92134b;
            C69664n.m101060f(str, "token.getExtension(Trigg…eringApiPrivate).rawToken");
            return str;
        }
        throw new IllegalStateException("Unsupported invocation token type: " + bpVar + ".");
    }
}
