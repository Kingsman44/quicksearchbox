package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.ComponentName;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123722ap;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p3186j$.time.Instant;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.q */
/* compiled from: PG */
public final /* synthetic */ class C97845q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97846r f273213a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f273214b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f273215c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f273216d;

    public /* synthetic */ C97845q(C97846r rVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f273213a = rVar;
        this.f273214b = cxVar;
        this.f273215c = cxVar2;
        this.f273216d = cxVar3;
    }

    public final C60870cx apply(Object obj) {
        C97846r rVar = this.f273213a;
        C60870cx cxVar = this.f273214b;
        C60870cx cxVar2 = this.f273215c;
        C60870cx cxVar3 = this.f273216d;
        List list = (List) obj;
        try {
            Instant ofEpochMilli = Instant.ofEpochMilli(((Long) C60856cj.m92909r(cxVar)).longValue());
            Instant ofEpochMilli2 = Instant.ofEpochMilli(rVar.f273224g.mo79743a(C90051dc.f248892bu));
            if (ofEpochMilli.compareTo(ofEpochMilli2) <= 0) {
                C59104x b = C97846r.f273217a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b).mo56372aa(30227)).mo56354G("#perform(): Morris DS potter media prefetch task is skipped for non-morris users. client sync time: min %s, last %s", ofEpochMilli2, ofEpochMilli);
                return C118826c.f331423b;
            }
            Instant ofEpochMilli3 = Instant.ofEpochMilli(((Long) C60856cj.m92909r(cxVar2)).longValue());
            Instant a = rVar.f273226i.mo57444a();
            if (rVar.mo90835d(ofEpochMilli3, a)) {
                C59104x b2 = C97846r.f273217a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b2).mo56372aa(30226)).mo56386p("#perform(): Morris DS potter media prefetch task is throttled.");
                return C118826c.f331423b;
            }
            long longValue = ((Long) C60856cj.m92909r(cxVar3)).longValue();
            if (rVar.mo90834c(longValue, ofEpochMilli3, a)) {
                C59104x b3 = C97846r.f273217a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
                ((C59052c) ((C59052c) b3).mo56372aa(30225)).mo56386p("#perform(): Morris DS potter media prefetch task is degradated.");
                return C118826c.f331423b;
            }
            C59104x b4 = C97846r.f273217a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "PCP.MRBgTask");
            ((C59052c) ((C59052c) b4).mo56372aa(30224)).mo56386p("#perform(): Morris DS potter media prefetch task is scheduled");
            C118339a aVar = rVar.f273220c;
            C53306j jVar = C53306j.MORRIS_DRIVING_SCREEN;
            C58485gu n = C58485gu.m89846n(10);
            C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
            amVar.copyOnWrite();
            C123726at atVar = (C123726at) amVar.instance;
            atVar.f341750e = 2;
            atVar.f341746a |= 4;
            for (ComponentName componentName : rVar.f273221d.mo22269a()) {
                C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
                String packageName = componentName.getPackageName();
                apVar.copyOnWrite();
                C123723aq aqVar = (C123723aq) apVar.instance;
                packageName.getClass();
                aqVar.f341739a = 1 | aqVar.f341739a;
                aqVar.f341740b = packageName;
                String className = componentName.getClassName();
                apVar.copyOnWrite();
                C123723aq aqVar2 = (C123723aq) apVar.instance;
                className.getClass();
                aqVar2.f341739a |= 2;
                aqVar2.f341741c = className;
                amVar.mo106110b(apVar);
            }
            C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
            eVar.mo58885m(C123726at.f341744i, (C123726at) amVar.build());
            return C60922j.m93044g(C60856cj.m92907p(rVar.mo90833b(C53306j.MORRIS_DRIVING_SCREEN, OptionalLong.m71641of(longValue)), C60922j.m93044g(aVar.mo90818h(jVar, n, (C123777f) eVar.build()), C47810es.m84963c(C97835g.f273201a), rVar.f273219b)), C47810es.m84963c(C97836h.f273202a), rVar.f273219b);
        } catch (ExecutionException e) {
            throw q$$ExternalSyntheticBackport0.m162149m("Unhandled exception", e);
        }
    }
}
