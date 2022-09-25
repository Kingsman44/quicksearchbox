package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p374ah.C7507i;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57893d;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57895f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.o.l */
/* compiled from: PG */
final class C37050l {

    /* renamed from: a */
    public final String f96528a;

    /* renamed from: b */
    public final C57895f f96529b;

    public C37050l(String str, C57895f fVar) {
        this.f96528a = str;
        this.f96529b = fVar;
    }

    /* renamed from: a */
    public final C58485gu mo40591a(C57893d dVar) {
        C58480gp e = C58485gu.m89837e();
        for (C57893d dVar2 : this.f96529b.f154865a) {
            if (C37054p.m65781c(dVar2, dVar)) {
                e.mo55395g(dVar2);
            }
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final C58485gu mo40592b(String str, String str2) {
        C58480gp e = C58485gu.m89837e();
        for (C57893d dVar : this.f96529b.f154865a) {
            if ((dVar.f154855a & 4) != 0 && dVar.f154857c.equals(str)) {
                Optional b = C37054p.m65780b(dVar);
                if (b.isPresent()) {
                    e.mo55395g(C37054p.m65779a(str2, C58485gu.m89846n((C7507i) b.get())));
                }
            }
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public final boolean mo40593c(C57893d dVar) {
        for (C57893d c : this.f96529b.f154865a) {
            if (C37054p.m65781c(c, dVar)) {
                return true;
            }
        }
        return false;
    }
}
