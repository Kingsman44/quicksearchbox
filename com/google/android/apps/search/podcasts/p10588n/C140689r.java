package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54299ac;
import com.google.p4017at.p4082j.p4083a.C54392cr;
import com.google.p4017at.p4082j.p4083a.C54398cx;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.p4017at.p4082j.p4083a.C54453r;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.r */
/* compiled from: PG */
final class C140689r extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140690s f382095a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140689r(C140690s sVar) {
        super(1);
        this.f382095a = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C54297aa aaVar = (C54297aa) obj;
        C69664n.m101061g(aaVar, "it");
        C139997j jVar = this.f382095a.f382096a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C54299ac acVar : aaVar.f142652a) {
            int i = acVar.f142655a;
            if (i == 1) {
                C62971cq<C63111j> cqVar = ((C54453r) acVar.f142656b).f142987c;
                C69664n.m101060f(cqVar, "feedItem.episodeGroup.episodesList");
                for (C63111j jVar2 : cqVar) {
                    C63113l lVar = jVar2.f170360k;
                    if (lVar == null) {
                        lVar = C63113l.f170365p;
                    }
                    C69664n.m101060f(lVar, "it.showMetadata");
                    C140690s.m228473f(linkedHashMap, lVar);
                    C63113l lVar2 = jVar2.f170360k;
                    if (lVar2 == null) {
                        lVar2 = C63113l.f170365p;
                    }
                    Object obj2 = linkedHashMap.get(lVar2.f170373g);
                    C69664n.m101058d(obj2);
                    String str = jVar2.f170356g;
                    C63110i iVar = (C63110i) jVar2.toBuilder();
                    iVar.copyOnWrite();
                    C63111j jVar3 = (C63111j) iVar.instance;
                    jVar3.f170360k = null;
                    jVar3.f170350a &= -513;
                    ((C54398cx) obj2).mo54114a(str, (C63111j) iVar.build());
                }
            } else if (i == 4) {
                C62971cq<C63113l> cqVar2 = ((C54392cr) acVar.f142656b).f142865e;
                C69664n.m101060f(cqVar2, "feedItem.showGroup.showsList");
                for (C63113l lVar3 : cqVar2) {
                    C69664n.m101060f(lVar3, "it");
                    C140690s.m228473f(linkedHashMap, lVar3);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C69505av.m100860b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (C54402da) ((C54398cx) entry.getValue()).build());
        }
        return jVar.mo115378c(linkedHashMap2);
    }
}
