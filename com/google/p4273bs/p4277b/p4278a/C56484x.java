package com.google.p4273bs.p4277b.p4278a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59218l;
import com.google.common.p4535g.C59224r;
import com.google.common.p4535g.C59225s;
import com.google.common.p4535g.C59226t;
import com.google.common.p4543n.p4551g.C59443c;
import java.util.ArrayList;

/* renamed from: com.google.bs.b.a.x */
/* compiled from: PG */
public final class C56484x {
    /* renamed from: a */
    public static C58485gu m88201a(C58485gu guVar, C59127at atVar) {
        if (!atVar.mo56454e()) {
            return C58485gu.m89845m();
        }
        C59224r c = C59224r.m91905c(atVar.mo56453d(), new C59218l(new C59443c(100000.0d).mo56958a() / 6371010.0d));
        ArrayList arrayList = new ArrayList();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C59226t tVar = (C59226t) guVar.get(i2);
            if (c.mo56467g(new C59225s(tVar))) {
                arrayList.add(tVar);
            }
        }
        return C58485gu.m89842j(arrayList);
    }
}
