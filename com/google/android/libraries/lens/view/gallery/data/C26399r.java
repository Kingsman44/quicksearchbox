package com.google.android.libraries.lens.view.gallery.data;

import com.google.android.libraries.lens.view.gallery.C26313an;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59931cm;
import com.google.common.p4552o.p4563i.C59932cn;
import com.google.common.p4552o.p4563i.C59968r;
import com.google.common.p4552o.p4563i.C59969s;
import com.google.common.p4552o.p4563i.C59970t;
import com.google.common.p4552o.p4563i.C59971u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.r */
/* compiled from: PG */
public final /* synthetic */ class C26399r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26400s f71823a;

    /* renamed from: b */
    public final /* synthetic */ C26406y f71824b;

    /* renamed from: c */
    public final /* synthetic */ long f71825c;

    public /* synthetic */ C26399r(C26400s sVar, C26406y yVar, long j) {
        this.f71823a = sVar;
        this.f71824b = yVar;
        this.f71825c = j;
    }

    public final void run() {
        C26400s sVar = this.f71823a;
        C26406y yVar = this.f71824b;
        long j = this.f71825c;
        C59970t tVar = (C59970t) C59971u.f162080d.createBuilder();
        C26382a aVar = (C26382a) yVar;
        int i = aVar.f71783a;
        tVar.copyOnWrite();
        C59971u uVar = (C59971u) tVar.instance;
        uVar.f162083b = C26313an.m48565a((long) i) - 1;
        uVar.f162082a |= 1;
        C58800sl lA = aVar.f71784b.keySet().iterator();
        while (lA.hasNext()) {
            C26403v vVar = (C26403v) lA.next();
            C59931cm cmVar = (C59931cm) C59932cn.f161978d.createBuilder();
            int c = vVar.mo31603c();
            cmVar.copyOnWrite();
            C59932cn cnVar = (C59932cn) cmVar.instance;
            cnVar.f161981b = c - 1;
            cnVar.f161980a |= 1;
            int size = yVar.mo31606f(vVar).size();
            cmVar.copyOnWrite();
            C59932cn cnVar2 = (C59932cn) cmVar.instance;
            cnVar2.f161982c = C26313an.m48565a((long) size) - 1;
            cnVar2.f161980a |= 2;
            tVar.copyOnWrite();
            C59971u uVar2 = (C59971u) tVar.instance;
            C59932cn cnVar3 = (C59932cn) cmVar.build();
            cnVar3.getClass();
            C62971cq cqVar = uVar2.f162084c;
            if (!cqVar.mo58948c()) {
                uVar2.f162084c = C62942bv.mutableCopy(cqVar);
            }
            uVar2.f162084c.add(cnVar3);
        }
        C37215b bVar = sVar.f71826a;
        C37252a d = C37194a.f98499bI.mo40811d(j);
        C62940bt btVar = C59898bg.f161867w;
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        C59968r rVar = (C59968r) C59969s.f162075d.createBuilder();
        C59971u uVar3 = (C59971u) tVar.build();
        rVar.copyOnWrite();
        C59969s sVar2 = (C59969s) rVar.instance;
        uVar3.getClass();
        sVar2.f162079c = uVar3;
        sVar2.f162077a |= 2;
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        C59969s sVar3 = (C59969s) rVar.build();
        sVar3.getClass();
        bgVar.f161875g = sVar3;
        bgVar.f161869a |= 32;
        ((C37253b) d).mo40792p(btVar, (C59898bg) afVar.build());
        bVar.mo19974a(d);
    }
}
