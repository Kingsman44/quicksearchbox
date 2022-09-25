package com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34712c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34707b;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.j.b.b */
/* compiled from: PG */
public final class C34711b {
    /* renamed from: a */
    public static final C61301b m63445a(C34053bp bpVar) {
        C69664n.m101061g(bpVar, "<this>");
        return new C61301b(C61284a.NO_USER_DATA, m63446b(bpVar));
    }

    /* renamed from: b */
    public static final String m63446b(C34053bp bpVar) {
        Object obj;
        Object obj2;
        C69664n.m101061g(bpVar, "<this>");
        C62940bt r0 = C62942bv.checkIsLite(C34712c.f92131d);
        bpVar.mo58887l(r0);
        if (bpVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C34712c.f92131d);
            bpVar.mo58887l(r02);
            Object l = bpVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l);
            }
            String str = ((C34712c) obj2).f92134b;
            C69664n.m101060f(str, "token.getExtension(Trigg…eringApiPrivate).rawToken");
            return m63447c("apa", str);
        }
        C62940bt r03 = C62942bv.checkIsLite(C34707b.f92126d);
        bpVar.mo58887l(r03);
        if (bpVar.f169962ag.mo58857o(r03.f169971d)) {
            C62940bt r04 = C62942bv.checkIsLite(C34707b.f92126d);
            bpVar.mo58887l(r04);
            Object l2 = bpVar.f169962ag.mo58854l(r04.f169971d);
            if (l2 == null) {
                obj = r04.f169969b;
            } else {
                obj = r04.mo58889c(l2);
            }
            String str2 = ((C34707b) obj).f92129b;
            C69664n.m101060f(str2, "token.getExtension(Invoc…nUnawareToken).clientName");
            return m63447c("unaware", str2);
        }
        throw new IllegalStateException("Unsupported invocation token type: " + bpVar + ".");
    }

    /* renamed from: c */
    private static final String m63447c(String str, String str2) {
        return str + ":" + str2;
    }
}
