package com.google.android.apps.search.podcasts.p10561e;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63108g;
import com.google.protos.p4757ac.p4758a.C63109h;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63112k;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.e.c */
/* compiled from: PG */
public final class C140202c {
    /* renamed from: a */
    public static final C63109h m227880a(C63109h hVar) {
        C63108g gVar = (C63108g) hVar.toBuilder();
        gVar.copyOnWrite();
        ((C63109h) gVar.instance).f170346c = C63109h.emptyProtobufList();
        C62971cq<C63111j> cqVar = hVar.f170346c;
        C69664n.m101060f(cqVar, "playerData.episodeDataList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C63111j jVar : cqVar) {
            C69664n.m101060f(jVar, "it");
            if ((jVar.f170350a & 256) != 0) {
                C63110i iVar = (C63110i) jVar.toBuilder();
                iVar.copyOnWrite();
                C63111j jVar2 = (C63111j) iVar.instance;
                jVar2.f170359j = null;
                jVar2.f170350a &= -257;
                C63113l lVar = jVar.f170359j;
                if (lVar == null) {
                    lVar = C63113l.f170365p;
                }
                C63112k kVar = (C63112k) lVar.toBuilder();
                String str = ((C63113l) kVar.instance).f170375i;
                C69664n.m101060f(str, "clusterId");
                if (str.length() == 0) {
                    String str2 = jVar.f170357h;
                    kVar.copyOnWrite();
                    C63113l lVar2 = (C63113l) kVar.instance;
                    str2.getClass();
                    lVar2.f170367a |= 512;
                    lVar2.f170375i = str2;
                }
                iVar.copyOnWrite();
                C63111j jVar3 = (C63111j) iVar.instance;
                C63113l lVar3 = (C63113l) kVar.build();
                lVar3.getClass();
                jVar3.f170360k = lVar3;
                jVar3.f170350a |= 512;
                C62942bv build = iVar.build();
                C69664n.m101060f(build, "{\n        // Repair clus…         .build()\n      }");
                jVar = (C63111j) build;
            }
            arrayList.add(jVar);
        }
        gVar.copyOnWrite();
        C63109h hVar2 = (C63109h) gVar.instance;
        hVar2.mo59181a();
        C62947c.addAll((Iterable) arrayList, (List) hVar2.f170346c);
        C62942bv build2 = gVar.build();
        C69664n.m101060f(build2, "playerData\n        .toBu…m(it) })\n        .build()");
        return (C63109h) build2;
    }
}
