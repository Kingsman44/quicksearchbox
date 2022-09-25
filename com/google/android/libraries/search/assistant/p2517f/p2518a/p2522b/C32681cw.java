package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32851cs;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cw */
/* compiled from: PG */
public final class C32681cw {
    /* renamed from: a */
    public static final C32851cs m60576a(C32849cq cqVar) {
        C69664n.m101061g(cqVar, "<this>");
        try {
            C32851cs csVar = (C32851cs) C62942bv.parseFrom((C62942bv) C32851cs.f88063c, cqVar.f88062b);
            C69664n.m101060f(csVar, "{\n      SessionTokenInte….parseFrom(payload)\n    }");
            return csVar;
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Invalid SessionToken.", e);
        }
    }
}
