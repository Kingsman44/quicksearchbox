package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124116cn;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124152a;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Iterator;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69255u;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69256v;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69257w;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69258x;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.n */
/* compiled from: PG */
public final /* synthetic */ class C123869n implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C123877v f342156a;

    /* renamed from: b */
    public final /* synthetic */ List f342157b;

    /* renamed from: c */
    public final /* synthetic */ List f342158c;

    public /* synthetic */ C123869n(C123877v vVar, List list, List list2) {
        this.f342156a = vVar;
        this.f342157b = list;
        this.f342158c = list2;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        Iterator it;
        C42847bf bfVar2 = bfVar;
        C123877v vVar = this.f342156a;
        List list = this.f342157b;
        List list2 = this.f342158c;
        int i = 100003;
        bfVar2.mo45929a(C123611ad.m202945d("SharedProactiveData", C58495hd.m89900n(100003, list)));
        bfVar2.mo45929a(C123611ad.m202945d("ClientProactiveData", C58495hd.m89900n(100003, list)));
        C58480gp gpVar = vVar.f342174b;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C123787p pVar = (C123787p) it2.next();
            ((C58970a) ((C58970a) vVar.f342176d.f342187i.mo56224b()).mo56372aa(35278)).mo56359L("PCP is saving calendar event with provider id: %s, event id: %s and sync id: %s", Long.valueOf(pVar.f341951b), Long.valueOf(pVar.f341952c), pVar.f341960k);
            String valueOf = String.valueOf(pVar.f341951b);
            vVar.f342176d.f342186h.mo106284c(i);
            bfVar2.mo45931c("SharedProactiveData", C123611ad.m202943b(100003, valueOf, pVar, C124116cn.m203541a(pVar), new byte[0], vVar.f342176d.f342184f.mo57444a().toEpochMilli()), 5);
            C58485gu b = C123878w.m203183b();
            int size = b.size();
            int i2 = 0;
            while (i2 < size) {
                C53306j jVar = (C53306j) b.get(i2);
                C48952az azVar = C48952az.f126657c;
                C69257w wVar = (C69257w) C69258x.f185379c.createBuilder();
                C69255u uVar = (C69255u) C69256v.f185374d.createBuilder();
                uVar.copyOnWrite();
                C69256v vVar2 = (C69256v) uVar.instance;
                vVar2.f185376a |= 1;
                vVar2.f185377b = 1800;
                uVar.copyOnWrite();
                C69256v vVar3 = (C69256v) uVar.instance;
                vVar3.f185376a |= 2;
                vVar3.f185378c = 300;
                C69256v vVar4 = (C69256v) uVar.build();
                wVar.copyOnWrite();
                C69258x xVar = (C69258x) wVar.instance;
                vVar4.getClass();
                xVar.f185382b = vVar4;
                xVar.f185381a |= 1;
                Optional of = Optional.m71637of((C69258x) wVar.build());
                if (of.isPresent()) {
                    C69258x xVar2 = (C69258x) of.get();
                    if ((xVar2.f185381a & 1) != 0) {
                        it = it2;
                        azVar = C124109ch.m203531a(Instant.ofEpochSecond(pVar.f341954e), xVar2);
                        C124169r h = C124169r.m203613h(Optional.empty(), String.valueOf(pVar.f341951b), 100003, jVar.f139793X, azVar);
                        C124152a aVar = (C124152a) h;
                        vVar.f342176d.f342186h.mo106283b(100003, aVar.f342852d);
                        bfVar2.mo45931c("ClientProactiveData", C123611ad.m202942a(C53306j.m86809a(aVar.f342852d), 100003, aVar.f342850b, false, (C53132co) null, aVar.f342853e, vVar.f342176d.f342184f.mo57444a().toEpochMilli()), 5);
                        gpVar.mo55395g(h);
                        i2++;
                        it2 = it;
                        i = 100003;
                    }
                }
                it = it2;
                C124169r h2 = C124169r.m203613h(Optional.empty(), String.valueOf(pVar.f341951b), 100003, jVar.f139793X, azVar);
                C124152a aVar2 = (C124152a) h2;
                vVar.f342176d.f342186h.mo106283b(100003, aVar2.f342852d);
                bfVar2.mo45931c("ClientProactiveData", C123611ad.m202942a(C53306j.m86809a(aVar2.f342852d), 100003, aVar2.f342850b, false, (C53132co) null, aVar2.f342853e, vVar.f342176d.f342184f.mo57444a().toEpochMilli()), 5);
                gpVar.mo55395g(h2);
                i2++;
                it2 = it;
                i = 100003;
            }
        }
    }
}
