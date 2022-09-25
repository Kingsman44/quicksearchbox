package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.o */
/* compiled from: PG */
public final /* synthetic */ class C76682o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C76687t f211969a;

    public /* synthetic */ C76682o(C76687t tVar) {
        this.f211969a = tVar;
    }

    public final void run() {
        C60870cx cxVar;
        C76687t tVar = this.f211969a;
        if (tVar.f211980h == null) {
            C60870cx cxVar2 = tVar.f211979g;
            if (cxVar2 == null) {
                cxVar = C60866ct.f164955a;
            } else {
                tVar.f211979g = null;
                cxVar = tVar.f211978f.mo28209i(cxVar2, "[NGA] FulfillmentGrpcServiceImpl buildDestroyFuture", C76680m.f211962a);
            }
            tVar.f211980h = C60846c.m92878g(cxVar, Throwable.class, C76671d.f211938a, C60826bg.f164896a);
        }
    }
}
