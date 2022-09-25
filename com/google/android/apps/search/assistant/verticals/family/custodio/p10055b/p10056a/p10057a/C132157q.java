package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C132157q implements C132160t {

    /* renamed from: a */
    public final /* synthetic */ C132159s f360714a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f360715b;

    public /* synthetic */ C132157q(C132159s sVar, C58485gu guVar) {
        this.f360714a = sVar;
        this.f360715b = guVar;
    }

    /* renamed from: a */
    public final void mo110508a(Object obj, C60870cx cxVar) {
        C132159s sVar = this.f360714a;
        if (this.f360715b.isEmpty()) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() > 1) {
                sVar.f360721e.f360728f.mo50787a(cxVar, C46786dc.m83350a((C58528ij) Collection.EL.stream(blVar.f29964b).map(C132158r.f360716a).collect(C58370cn.f155947b)));
            } else if (blVar.f29964b.size() == 1) {
                sVar.f360721e.f360728f.mo50787a(cxVar, new C46885y(((C8675e) blVar.f29964b.get(0)).f29992a));
            }
        } else {
            sVar.f360721e.f360728f.mo50787a(cxVar, new C46885y("fullFetchSingleKey"));
        }
    }
}
