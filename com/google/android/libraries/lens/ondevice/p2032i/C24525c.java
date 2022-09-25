package com.google.android.libraries.lens.ondevice.p2032i;

import com.google.android.libraries.lens.ondevice.p2026f.C24489r;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24799j;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58817ah;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63229b;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63230c;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63231d;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63232e;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63238k;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63242o;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.ondevice.i.c */
/* compiled from: PG */
public final /* synthetic */ class C24525c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C24527e f67185a;

    public /* synthetic */ C24525c(C24527e eVar) {
        this.f67185a = eVar;
    }

    public final Object apply(Object obj) {
        C24527e eVar = this.f67185a;
        int i = C24528f.f67187f;
        C62331d b = eVar.mo29937b();
        C63229b bVar = (C63229b) C63230c.f170826f.createBuilder();
        bVar.copyOnWrite();
        C63230c cVar = (C63230c) bVar.instance;
        cVar.f170829b = b.f168273v;
        cVar.f170828a |= 1;
        bVar.copyOnWrite();
        C63230c cVar2 = (C63230c) bVar.instance;
        cVar2.f170828a |= 2;
        cVar2.f170830c = true;
        HashMap hashMap = new HashMap();
        for (C24489r rVar : (List) obj) {
            C24803n a = rVar.mo29886a();
            hashMap.putAll(Collections.unmodifiableMap(C24473a.m45546e(a).f170861a));
            if ((a.f67772a & 2) != 0) {
                C24799j jVar = a.f67773b;
                if (jVar == null) {
                    jVar = C24799j.f67763b;
                }
                if (jVar.f67765a.size() != 0) {
                    C63242o b2 = rVar.mo29887b();
                    C63231d dVar = (C63231d) C63232e.f170833g.createBuilder();
                    dVar.copyOnWrite();
                    C63232e eVar2 = (C63232e) dVar.instance;
                    eVar2.f170836b = b2.f170881r;
                    eVar2.f170835a |= 1;
                    C24799j jVar2 = a.f67773b;
                    if (jVar2 == null) {
                        jVar2 = C24799j.f67763b;
                    }
                    for (C24440ab abVar : jVar2.f67765a) {
                        C24465t tVar = abVar.f66920b;
                        if (tVar == null) {
                            tVar = C24465t.f66964f;
                        }
                        String str = tVar.f66967b;
                        dVar.copyOnWrite();
                        C63232e eVar3 = (C63232e) dVar.instance;
                        str.getClass();
                        eVar3.f170835a |= 4;
                        eVar3.f170838d = str;
                        if (tVar.f66970e.isEmpty()) {
                            int i2 = tVar.f66968c;
                            dVar.copyOnWrite();
                            C63232e eVar4 = (C63232e) dVar.instance;
                            eVar4.f170835a |= 8;
                            eVar4.f170839e = i2;
                        } else {
                            String str2 = tVar.f66970e;
                            dVar.copyOnWrite();
                            C63232e eVar5 = (C63232e) dVar.instance;
                            str2.getClass();
                            eVar5.f170835a |= 16;
                            eVar5.f170840f = str2;
                        }
                        C24446ah a2 = C24446ah.m45519a(abVar.f66922d);
                        if (a2 == null) {
                            a2 = C24446ah.STATUS_UNKNOWN;
                        }
                        boolean z = a2 == C24446ah.STATUS_DOWNLOADED;
                        dVar.copyOnWrite();
                        C63232e eVar6 = (C63232e) dVar.instance;
                        eVar6.f170835a |= 2;
                        eVar6.f170837c = z;
                        C63232e eVar7 = (C63232e) dVar.build();
                        bVar.copyOnWrite();
                        C63230c cVar3 = (C63230c) bVar.instance;
                        eVar7.getClass();
                        C62971cq cqVar = cVar3.f170831d;
                        if (!cqVar.mo58948c()) {
                            cVar3.f170831d = C62942bv.mutableCopy(cqVar);
                        }
                        cVar3.f170831d.add(eVar7);
                        if (!z) {
                            bVar.copyOnWrite();
                            C63230c cVar4 = (C63230c) bVar.instance;
                            cVar4.f170828a |= 2;
                            cVar4.f170830c = false;
                        }
                    }
                }
            }
        }
        C63238k kVar = (C63238k) C63240m.f170859b.createBuilder();
        kVar.mo59198a(hashMap);
        C63240m mVar = (C63240m) kVar.build();
        bVar.copyOnWrite();
        C63230c cVar5 = (C63230c) bVar.instance;
        mVar.getClass();
        cVar5.f170832e = mVar;
        cVar5.f170828a |= 4;
        return (C63230c) bVar.build();
    }
}
