package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a;

import com.google.assistant.p4008y.p4009a.C53554an;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a.e */
/* compiled from: PG */
public final class C109370e {

    /* renamed from: a */
    public final C58495hd f304655a;

    /* renamed from: b */
    private final C58485gu f304656b;

    public C109370e(C109369d dVar) {
        this.f304655a = C58495hd.m89898l(dVar.f304653a);
        this.f304656b = C58485gu.m89842j(dVar.f304654b);
    }

    /* renamed from: a */
    public final List mo97811a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C53593bz bzVar = (C53593bz) it.next();
            C53554an anVar = bzVar.f140666g;
            if (anVar == null) {
                anVar = C53554an.f140545b;
            }
            C62971cq cqVar = anVar.f140547a;
            if (Collection.EL.stream(this.f304656b).allMatch(new C109367b(cqVar)) && Collection.EL.stream(cqVar).allMatch(new C109368c(this))) {
                arrayList.add(bzVar);
            }
        }
        return arrayList;
    }
}
