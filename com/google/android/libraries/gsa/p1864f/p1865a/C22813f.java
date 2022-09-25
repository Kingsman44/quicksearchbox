package com.google.android.libraries.gsa.p1864f.p1865a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.C59687cb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.gsa.f.a.f */
/* compiled from: PG */
public final class C22813f {
    /* renamed from: a */
    public static C22811d m42628a(C22804a aVar) {
        C22809b bVar = (C22809b) C22811d.f62806j.createBuilder();
        int i = aVar.f62786a.f245884YW;
        bVar.copyOnWrite();
        C22811d dVar = (C22811d) bVar.instance;
        dVar.f62808a |= 1;
        dVar.f62809b = i;
        long j = aVar.f62787b;
        bVar.copyOnWrite();
        C22811d dVar2 = (C22811d) bVar.instance;
        dVar2.f62808a |= 2;
        dVar2.f62810c = j;
        long j2 = aVar.f62788c;
        bVar.copyOnWrite();
        C22811d dVar3 = (C22811d) bVar.instance;
        dVar3.f62808a |= 4;
        dVar3.f62811d = j2;
        C59687cb cbVar = aVar.f62792g;
        if (cbVar != null) {
            bVar.copyOnWrite();
            C22811d dVar4 = (C22811d) bVar.instance;
            dVar4.f62814g = cbVar;
            dVar4.f62808a |= 8;
        }
        C58528ij ijVar = aVar.f62791f;
        if (ijVar != null) {
            C58800sl lA = ijVar.iterator();
            while (lA.hasNext()) {
                int i2 = ((C89849ae) lA.next()).f245884YW;
                bVar.copyOnWrite();
                C22811d dVar5 = (C22811d) bVar.instance;
                C62961ch chVar = dVar5.f62812e;
                if (!chVar.mo58948c()) {
                    dVar5.f62812e = C62942bv.mutableCopy(chVar);
                }
                dVar5.f62812e.mo58916g(i2);
            }
        }
        Map.EL.forEach(aVar.f62789d, new C22812e(bVar));
        return (C22811d) bVar.build();
    }
}
