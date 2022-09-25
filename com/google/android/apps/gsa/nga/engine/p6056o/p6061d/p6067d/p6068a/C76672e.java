package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.C76691b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C76672e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76687t f211939a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211940b;

    /* renamed from: c */
    public final /* synthetic */ C122461p f211941c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f211942d;

    /* renamed from: e */
    public final /* synthetic */ int f211943e;

    public /* synthetic */ C76672e(C76687t tVar, C74965n nVar, C122461p pVar, C58485gu guVar, int i) {
        this.f211939a = tVar;
        this.f211940b = nVar;
        this.f211941c = pVar;
        this.f211942d = guVar;
        this.f211943e = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76687t tVar = this.f211939a;
        C74965n nVar = this.f211940b;
        C122461p pVar = this.f211941c;
        C58485gu guVar = this.f211942d;
        int i = this.f211943e;
        C52091ex exVar = (C52091ex) obj;
        C60870cx cxVar = tVar.f211979g;
        if (cxVar == null) {
            return C60856cj.m92899h(new C76691b());
        }
        return tVar.f211978f.mo28210j(C60856cj.m92901j(cxVar), "[NGA] FulfillmentGrpcServiceImpl fulfill", new C76681n(tVar, nVar, pVar, exVar, guVar, i));
    }
}
