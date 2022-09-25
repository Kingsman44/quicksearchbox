package com.google.android.apps.search.podcasts.autodownload;

import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54299ac;
import com.google.p4017at.p4082j.p4083a.C54311ao;
import com.google.p4017at.p4082j.p4083a.C54453r;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63111j;
import java.util.ArrayList;
import java.util.List;
import p5462h.C69685i;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.g */
/* compiled from: PG */
final class C139971g extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139977m f380458a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139971g(C139977m mVar) {
        super(1);
        this.f380458a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C54453r rVar;
        C58833ax axVar = (C58833ax) obj;
        C69664n.m101061g(axVar, "it");
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C69496am.f185918a);
        }
        C139958c cVar = this.f380458a.f380470f;
        C54297aa aaVar = ((C54311ao) ((C46370ah) axVar.mo56107c()).f121384a).f142681a;
        if (aaVar == null) {
            aaVar = C54297aa.f142650b;
        }
        C69664n.m101060f(aaVar, "it.get().value().feed");
        C62971cq cqVar = aaVar.f142652a;
        C69664n.m101060f(cqVar, "feed\n      .feedItemsList");
        ArrayList<C54299ac> arrayList = new ArrayList<>();
        for (Object next : cqVar) {
            if (((C54299ac) next).f142655a == 1) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C54299ac acVar : arrayList) {
            if (acVar.f142655a == 1) {
                rVar = (C54453r) acVar.f142656b;
            } else {
                rVar = C54453r.f142983d;
            }
            C62971cq cqVar2 = rVar.f142987c;
            C69664n.m101060f(cqVar2, "it.episodeGroup.episodesList");
            C69540x.m100811r(arrayList2, cqVar2);
        }
        List<C63111j> P = C69540x.m100834P(arrayList2);
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(P, 10));
        for (C63111j jVar : P) {
            arrayList3.add(new C69685i(jVar.f170354e, jVar));
        }
        return cVar.mo115362b(C69540x.m100840V(C69540x.m100837S(C69505av.m100874p(arrayList3).values(), new C139974j())));
    }
}
