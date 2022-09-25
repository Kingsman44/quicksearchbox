package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2791a.C36469c;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.o */
/* compiled from: PG */
public final class C36491o implements C36477a {

    /* renamed from: a */
    final C36469c f95244a;

    public C36491o(C36469c cVar) {
        this.f95244a = cVar;
    }

    /* renamed from: b */
    private static C58485gu m65041b(C58485gu guVar, Predicate predicate) {
        if (guVar.isEmpty()) {
            return guVar;
        }
        return (C58485gu) Collection.EL.stream(guVar).filter(predicate).collect(Collectors.collectingAndThen(Collectors.toCollection(C36488l.f95241a), C36489m.f95242a));
    }

    /* renamed from: a */
    public final C58485gu mo40191a(C58485gu guVar, C36485i iVar) {
        if ((iVar.f95234a & 1) != 0) {
            C36482f fVar = iVar.f95235b;
            if (fVar == null) {
                fVar = C36482f.f95223d;
            }
            Predicate kVar = new C36487k(fVar);
            if ((fVar.f95225a & 1) != 0) {
                kVar = Predicate.CC.not(kVar);
            }
            guVar = m65041b(guVar, kVar);
        }
        if ((iVar.f95234a & 2) != 0) {
            C36480d dVar = iVar.f95236c;
            if (dVar == null) {
                dVar = C36480d.f95218d;
            }
            Predicate nVar = new C36490n(dVar);
            if ((dVar.f95220a & 1) != 0) {
                nVar = Predicate.CC.not(nVar);
            }
            guVar = m65041b(guVar, nVar);
        }
        if ((iVar.f95234a & 4) == 0) {
            return guVar;
        }
        C36484h hVar = iVar.f95237d;
        if (hVar == null) {
            hVar = C36484h.f95228b;
        }
        return m65041b(guVar, new C36486j(this, hVar));
    }
}
