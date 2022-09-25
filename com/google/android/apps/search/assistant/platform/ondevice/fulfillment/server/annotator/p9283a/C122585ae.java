package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63773b;
import com.google.protos.p4883as.p4884a.C63774c;
import com.google.protos.p4883as.p4884a.C63775d;
import com.google.protos.p4985f.p5047y.C65380a;
import com.google.protos.p4985f.p5047y.C65381b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.ae */
/* compiled from: PG */
public final class C122585ae {
    /* renamed from: a */
    public static C63775d m201997a(C63775d dVar, float f, boolean z) {
        C63772a aVar = (C63772a) dVar.toBuilder();
        aVar.copyOnWrite();
        ((C63775d) aVar.instance).f172525f = C63775d.emptyProtobufList();
        C63773b bVar = (C63773b) C63774c.f172513d.createBuilder();
        C65380a aVar2 = (C65380a) C65381b.f177785d.createBuilder();
        int i = f > 0.5f ? 3 : 4;
        aVar2.copyOnWrite();
        ((C65381b) aVar2.instance).f177787a = i - 2;
        boolean z2 = false;
        if (z && f <= 0.5f) {
            z2 = true;
        }
        aVar2.copyOnWrite();
        ((C65381b) aVar2.instance).f177788b = z2;
        bVar.copyOnWrite();
        C63774c cVar = (C63774c) bVar.instance;
        C65381b bVar2 = (C65381b) aVar2.build();
        bVar2.getClass();
        cVar.f172517c = bVar2;
        cVar.f172515a |= 16;
        aVar.copyOnWrite();
        C63775d dVar2 = (C63775d) aVar.instance;
        C63774c cVar2 = (C63774c) bVar.build();
        cVar2.getClass();
        C62971cq cqVar = dVar2.f172525f;
        if (!cqVar.mo58948c()) {
            dVar2.f172525f = C62942bv.mutableCopy(cqVar);
        }
        dVar2.f172525f.add(cVar2);
        return (C63775d) aVar.build();
    }
}
