package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.ao */
/* compiled from: PG */
public final /* synthetic */ class C96822ao implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96828au f270765a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f270766b;

    public /* synthetic */ C96822ao(C96828au auVar, C65753ak akVar) {
        this.f270765a = auVar;
        this.f270766b = akVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C60870cx cxVar;
        C96828au auVar = this.f270765a;
        C65753ak akVar = this.f270766b;
        synchronized (auVar.f270780g) {
            if (auVar.f270782i.isEmpty()) {
                auVar.f270782i = Optional.m71637of(auVar.f270785l.mo28203c("GddBackgroundTaskScheduler#schedule refresh", C96828au.f270776c.toMillis(), new C96815ah(auVar)));
                ((C59052c) ((C59052c) C96828au.f270774a.mo56224b()).mo56372aa(20909)).mo56349B("Starting new batch; batchId=%d corpus=%d", auVar.f270783j, akVar.f178757bE);
            } else {
                ((C59052c) ((C59052c) C96828au.f270774a.mo56224b()).mo56372aa(20908)).mo56349B("Joining existing batch; batchId=%d corpus=%d", auVar.f270783j, akVar.f178757bE);
            }
            auVar.f270781h.add(akVar);
            cxVar = (C60870cx) auVar.f270782i.get();
        }
        return cxVar;
    }
}
