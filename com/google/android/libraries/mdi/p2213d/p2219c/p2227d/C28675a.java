package com.google.android.libraries.mdi.p2213d.p2219c.p2227d;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45634an;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45642av;
import com.google.p4017at.p4078i.p4079a.C54290d;
import com.google.p4017at.p4078i.p4079a.C54292f;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.mdi.d.c.d.a */
/* compiled from: PG */
public final class C28675a {
    /* renamed from: a */
    public static C45642av m53558a(C54290d dVar) {
        if (dVar.f142640a.isEmpty()) {
            return null;
        }
        C45632al alVar = ((C54292f) dVar.f142640a.get(0)).f142644a;
        if (alVar == null) {
            alVar = C45632al.f120021r;
        }
        C62971cq<C45642av> cqVar = alVar.f120027e;
        if (cqVar.isEmpty()) {
            return null;
        }
        for (C45642av avVar : cqVar) {
            if ((avVar.f120075a & 1) != 0) {
                C45634an anVar = avVar.f120076b;
                if (anVar == null) {
                    anVar = C45634an.f120041e;
                }
                if (anVar.f120046d) {
                    return avVar;
                }
            }
        }
        return (C45642av) cqVar.get(0);
    }
}
