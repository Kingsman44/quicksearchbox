package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.dh */
/* compiled from: PG */
public final /* synthetic */ class C42972dh implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42981dq f112400a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112401b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f112402c;

    public /* synthetic */ C42972dh(C42981dq dqVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f112400a = dqVar;
        this.f112401b = cxVar;
        this.f112402c = cxVar2;
    }

    public final C60870cx apply(Object obj) {
        C42981dq dqVar = this.f112400a;
        C60870cx cxVar = this.f112401b;
        C60870cx cxVar2 = this.f112402c;
        if (C60856cj.m92909r(cxVar).equals(C60856cj.m92909r(cxVar2))) {
            return C60866ct.f164955a;
        }
        C60870cx h = C60922j.m93045h(cxVar2, C47810es.m84966f(new C42973di(dqVar, cxVar2)), dqVar.f112416b);
        synchronized (dqVar.f112419e) {
            C42900az azVar = dqVar.f112421g;
            if (azVar != null) {
                C60856cj.m92911t(h, new C42978dn(azVar), C60826bg.f164896a);
            }
        }
        return h;
    }
}
