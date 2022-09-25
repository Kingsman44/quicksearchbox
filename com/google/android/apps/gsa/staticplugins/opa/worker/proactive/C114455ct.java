package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3803ag.p3809c.C49065fd;
import com.google.assistant.p3803ag.p3809c.C49067ff;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p5036r.C65324j;
import com.google.protos.p4985f.p5036r.C65325k;
import com.google.protos.p4985f.p5036r.C65326l;
import com.google.protos.p4985f.p5036r.C65327m;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ct */
/* compiled from: PG */
public final /* synthetic */ class C114455ct implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317352a;

    /* renamed from: b */
    public final /* synthetic */ String f317353b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f317354c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f317355d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f317356e;

    public /* synthetic */ C114455ct(C114464db dbVar, String str, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f317352a = dbVar;
        this.f317353b = str;
        this.f317354c = cxVar;
        this.f317355d = cxVar2;
        this.f317356e = cxVar3;
    }

    public final Object call() {
        C114464db dbVar = this.f317352a;
        String str = this.f317353b;
        C60870cx cxVar = this.f317354c;
        C60870cx cxVar2 = this.f317355d;
        C60870cx cxVar3 = this.f317356e;
        C65324j jVar = (C65324j) C65327m.f176666i.createBuilder();
        C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
        riVar.copyOnWrite();
        C52428rj rjVar = (C52428rj) riVar.instance;
        str.getClass();
        rjVar.f137560a |= 8;
        rjVar.f137563d = str;
        jVar.copyOnWrite();
        C65327m mVar = (C65327m) jVar.instance;
        C52428rj rjVar2 = (C52428rj) riVar.build();
        rjVar2.getClass();
        mVar.f176670c = rjVar2;
        mVar.f176668a |= 2;
        String str2 = (String) dbVar.f317377C.mo27525b();
        jVar.copyOnWrite();
        C65327m mVar2 = (C65327m) jVar.instance;
        str2.getClass();
        mVar2.f176668a |= 128;
        mVar2.f176675h = str2;
        C65325k kVar = (C65325k) C65326l.f176660e.createBuilder();
        try {
            String str3 = ((C49067ff) C60856cj.m92909r(cxVar)).f126920b;
            jVar.copyOnWrite();
            C65327m mVar3 = (C65327m) jVar.instance;
            str3.getClass();
            mVar3.f176668a |= 8;
            mVar3.f176672e = str3;
            kVar.copyOnWrite();
            C65326l lVar = (C65326l) kVar.instance;
            lVar.f176662a |= 2;
            lVar.f176664c = true;
        } catch (ExecutionException e) {
            C59104x d = C114464db.f317374a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29053)).mo56386p("Failed to get category config.");
        }
        try {
            C49065fd fdVar = (C49065fd) C60856cj.m92909r(cxVar2);
            jVar.copyOnWrite();
            C65327m mVar4 = (C65327m) jVar.instance;
            fdVar.getClass();
            mVar4.f176669b = fdVar;
            mVar4.f176668a |= 1;
            kVar.copyOnWrite();
            C65326l lVar2 = (C65326l) kVar.instance;
            lVar2.f176662a |= 1;
            lVar2.f176663b = true;
        } catch (ExecutionException e2) {
            C59104x d2 = C114464db.f317374a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(29052)).mo56386p("Failed to get notification actions.");
        }
        try {
            C49078fq fqVar = (C49078fq) C60856cj.m92909r(cxVar3);
            long j = fqVar.f126942d;
            jVar.copyOnWrite();
            C65327m mVar5 = (C65327m) jVar.instance;
            mVar5.f176668a |= 32;
            mVar5.f176673f = j;
            long j2 = fqVar.f126943e;
            jVar.copyOnWrite();
            C65327m mVar6 = (C65327m) jVar.instance;
            mVar6.f176668a |= 64;
            mVar6.f176674g = j2;
            kVar.copyOnWrite();
            C65326l lVar3 = (C65326l) kVar.instance;
            lVar3.f176662a |= 4;
            lVar3.f176665d = true;
        } catch (ExecutionException e3) {
            C59104x d3 = C114464db.f317374a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(29051)).mo56386p("Failed to get notification client config.");
        }
        C65326l lVar4 = (C65326l) kVar.instance;
        if (lVar4.f176663b || lVar4.f176664c || lVar4.f176665d) {
            jVar.copyOnWrite();
            C65327m mVar7 = (C65327m) jVar.instance;
            C65326l lVar5 = (C65326l) kVar.build();
            lVar5.getClass();
            mVar7.f176671d = lVar5;
            mVar7.f176668a |= 4;
            C65327m mVar8 = (C65327m) jVar.build();
            C58976aa aaVar = C58975e.f156826a;
            return mVar8;
        }
        throw new IllegalStateException("Failed to build sync request.");
    }
}
