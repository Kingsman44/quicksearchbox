package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4284a.p4286b.C56608b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.ao */
/* compiled from: PG */
public final /* synthetic */ class C138945ao implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377895a;

    public /* synthetic */ C138945ao(C138963bf bfVar) {
        this.f377895a = bfVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C138963bf bfVar = this.f377895a;
        C56608b bVar = (C56608b) obj;
        C62971cq cqVar = bVar.f151139c;
        if ((bVar.f151137a & 1) != 0) {
            C138970bm bmVar = bfVar.f377922d;
            C63042fg i = C62953e.m95484i(bVar.f151138b);
            C62910ar j = C62948a.m95459j(bmVar.f377947c.mo26871c());
            C63042fg i2 = C62953e.m95484i(bmVar.f377947c.mo26870b());
            if (C138970bm.m225783c(i, i2).compareTo(Duration.ofDays(1)) >= 0) {
                cxVar2 = C60866ct.f164955a;
            } else {
                cxVar2 = bmVar.f377945a.mo46039a(new C138968bk(C62953e.m95487l(i, j), C62953e.m95487l(i2, j)), bmVar.f377946b);
            }
            C60931s f = C47810es.m84966f(new C138943am(bfVar, cqVar));
            cxVar = C60922j.m93045h(cxVar2, C47810es.m84966f(f), bfVar.f377925g);
        } else {
            cxVar = bfVar.mo114643b(cqVar);
        }
        C60931s f2 = C47810es.m84966f(new C138944an(bfVar));
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(f2), bfVar.f377925g);
        C58817ah c = C47810es.m84963c(new C138954ax(bfVar));
        return C60922j.m93044g(h, C47810es.m84963c(c), bfVar.f377926h);
    }
}
