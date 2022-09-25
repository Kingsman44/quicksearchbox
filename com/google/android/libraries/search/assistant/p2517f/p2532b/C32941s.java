package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32851cs;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.common.p4537i.C59294s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62972cr;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70920e;

/* renamed from: com.google.android.libraries.search.assistant.f.b.s */
/* compiled from: PG */
public final class C32941s {

    /* renamed from: a */
    public static final C32935m f88258a = new C32935m();

    /* renamed from: a */
    public static String m60950a(C32858d dVar) {
        return C59294s.m92132b().mo56760b(dVar.f88084b.mo59170I(C62972cr.f170009a)).toString();
    }

    /* renamed from: b */
    public static String m60951b(C32849cq cqVar) {
        String str;
        try {
            str = ((C32851cs) C62942bv.parseFrom((C62942bv) C32851cs.f88063c, cqVar.f88062b, C62921ba.m95368a())).f88066b;
        } catch (Exception unused) {
            str = "UNKNOWN";
        }
        String valueOf = String.valueOf(C59294s.m92132b().mo56760b(cqVar.f88062b.mo59170I(C62972cr.f170009a)));
        return str + "@" + valueOf;
    }

    /* renamed from: c */
    public static C70920e m60952c(C32820bo boVar) {
        return (C70920e) C32939q.f88257a.mo56070hd(boVar);
    }
}
