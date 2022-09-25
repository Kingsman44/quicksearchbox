package com.google.android.apps.search.assistant.libraries.p8966e.p8967a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124200p;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124202r;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3741aa.C48130a;
import com.google.assistant.p3741aa.C48167b;
import com.google.assistant.p3741aa.C48168c;
import com.google.assistant.p3741aa.C48169d;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.a.c */
/* compiled from: PG */
public final /* synthetic */ class C119340c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C119341d f332735a;

    /* renamed from: b */
    public final /* synthetic */ C35477d f332736b;

    public /* synthetic */ C119340c(C119341d dVar, C35477d dVar2) {
        this.f332735a = dVar;
        this.f332736b = dVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C119341d dVar = this.f332735a;
        C35477d dVar2 = this.f332736b;
        C48130a aVar = (C48130a) C48169d.f124635g.createBuilder();
        aVar.copyOnWrite();
        C48169d dVar3 = (C48169d) aVar.instance;
        dVar3.f124637a |= 1;
        dVar3.f124638b = false;
        for (C35476c cVar : dVar2.f93170b) {
            C48167b bVar = (C48167b) C48168c.f124629e.createBuilder();
            C52428rj rjVar = cVar.f93166e;
            if (rjVar == null) {
                rjVar = C52428rj.f137558m;
            }
            String str = (rjVar.f137560a & 16) != 0 ? rjVar.f137564e : rjVar.f137568i;
            bVar.copyOnWrite();
            C48168c cVar2 = (C48168c) bVar.instance;
            str.getClass();
            cVar2.f124631a |= 1;
            cVar2.f124632b = str;
            C51274bq bqVar = cVar.f93164c;
            if (bqVar == null) {
                bqVar = C51274bq.f133487i;
            }
            bVar.copyOnWrite();
            C48168c cVar3 = (C48168c) bVar.instance;
            bqVar.getClass();
            cVar3.f124634d = bqVar;
            cVar3.f124631a |= 2;
            C62971cq cqVar = cVar.f93163b;
            bVar.copyOnWrite();
            C48168c cVar4 = (C48168c) bVar.instance;
            C62971cq cqVar2 = cVar4.f124633c;
            if (!cqVar2.mo58948c()) {
                cVar4.f124633c = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) cVar4.f124633c);
            aVar.copyOnWrite();
            C48169d dVar4 = (C48169d) aVar.instance;
            C48168c cVar5 = (C48168c) bVar.build();
            cVar5.getClass();
            dVar4.mo53142a();
            dVar4.f124642f.add(cVar5);
        }
        if ((dVar2.f93169a & 1) != 0) {
            C51536li liVar = dVar2.f93171c;
            if (liVar == null) {
                liVar = C51536li.f134316k;
            }
            if (!liVar.f134320c.isEmpty()) {
                String str2 = liVar.f134320c;
                aVar.copyOnWrite();
                C48169d dVar5 = (C48169d) aVar.instance;
                str2.getClass();
                dVar5.f124637a |= 4;
                dVar5.f124640d = str2;
            } else if (!liVar.f134321d.isEmpty()) {
                String str3 = liVar.f134321d;
                aVar.copyOnWrite();
                C48169d dVar6 = (C48169d) aVar.instance;
                str3.getClass();
                dVar6.f124637a |= 4;
                dVar6.f124640d = str3;
            } else {
                ((C59052c) ((C59052c) C119341d.f332737a.mo56226d()).mo56372aa(34380)).mo56386p("Appflow event id is not set, but proceed anyway with remote execution.");
                aVar.copyOnWrite();
                C48169d dVar7 = (C48169d) aVar.instance;
                dVar7.f124637a |= 4;
                dVar7.f124640d = "unknown_app_event_id";
            }
            String str4 = liVar.f134322e;
            aVar.copyOnWrite();
            C48169d dVar8 = (C48169d) aVar.instance;
            str4.getClass();
            dVar8.f124637a |= 8;
            dVar8.f124641e = str4;
        }
        C124200p pVar = dVar.f332742f.f342937a;
        return C60922j.m93045h(C70876o.m103760a(pVar.f189039a.mo39510a(C124202r.m203650a(), pVar.f189040b), (C48169d) aVar.build()), C47810es.m84966f(C119339b.f332734a), dVar.f332740d);
    }
}
