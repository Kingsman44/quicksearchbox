package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.location.Location;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28723ba;
import com.google.android.libraries.mdi.download.C28724bb;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.p2248h.C29495ae;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59226t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4273bs.p4277b.p4278a.C56484x;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.b.au */
/* compiled from: PG */
public final class C29540au implements C29495ae {

    /* renamed from: a */
    private final C58881cr f80070a;

    public C29540au(C29539at atVar) {
        this.f80070a = atVar.f80069a;
    }

    /* renamed from: b */
    private static C59226t m54524b(C28725bc bcVar) {
        C28724bb bbVar = bcVar.f78037b;
        if (bbVar == null) {
            bbVar = C28724bb.f78028e;
        }
        C28723ba baVar = bbVar.f78033d;
        if (baVar == null) {
            baVar = C28723ba.f78024b;
        }
        return new C59226t(baVar.f78026a);
    }

    /* renamed from: a */
    public final C60870cx mo19281a(C28728bf bfVar) {
        C58485gu guVar;
        C28725bc bcVar = (C28725bc) bfVar.f78046b.get(0);
        C62971cq cqVar = bfVar.f78046b;
        List<C28725bc> subList = cqVar.subList(1, cqVar.size());
        C58480gp e = C58485gu.m89837e();
        ArrayList<C28725bc> arrayList = new ArrayList<>();
        for (C28725bc bcVar2 : subList) {
            C28724bb bbVar = bcVar2.f78037b;
            if (bbVar == null) {
                bbVar = C28724bb.f78028e;
            }
            if ((bbVar.f78030a & 2) != 0) {
                arrayList.add(bcVar2);
            } else {
                e.mo55395g(bcVar2);
            }
        }
        if (!arrayList.isEmpty()) {
            C58833ax axVar = (C58833ax) this.f80070a.mo6453a();
            if (!axVar.mo56113h()) {
                guVar = C58485gu.m89845m();
            } else {
                C58480gp e2 = C58485gu.m89837e();
                for (C28725bc b : arrayList) {
                    e2.mo55395g(m54524b(b));
                }
                Location location = (Location) axVar.mo56107c();
                HashSet hashSet = new HashSet(C56484x.m88201a(e2.mo55394f(), C59127at.m91610b(location.getLatitude(), location.getLongitude())));
                C58480gp e3 = C58485gu.m89837e();
                for (C28725bc bcVar3 : arrayList) {
                    if (hashSet.contains(m54524b(bcVar3))) {
                        e3.mo55395g(bcVar3);
                    }
                }
                guVar = e3.mo55394f();
            }
            e.mo55396h(guVar);
        }
        C58485gu f = e.mo55394f();
        C28708an anVar = bcVar.f78038c;
        if (anVar == null) {
            anVar = C28708an.f77994l;
        }
        C28707am amVar = (C28707am) anVar.toBuilder();
        C58801sm G = f.listIterator(0);
        while (G.hasNext()) {
            C28708an anVar2 = ((C28725bc) G.next()).f78038c;
            if (anVar2 == null) {
                anVar2 = C28708an.f77994l;
            }
            amVar.mo34327a(anVar2.f78003h);
        }
        return C60856cj.m92900i(C58485gu.m89846n((C28708an) amVar.build()));
    }
}
