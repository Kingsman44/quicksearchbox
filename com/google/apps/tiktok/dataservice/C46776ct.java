package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.apps.tiktok.dataservice.ct */
/* compiled from: PG */
public final class C46776ct {

    /* renamed from: a */
    public final List f122130a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public final C46778cv f122131b;

    public C46776ct(C46778cv cvVar) {
        this.f122131b = cvVar;
    }

    /* renamed from: a */
    public final C60870cx mo50786a(C46771co coVar) {
        C46883w wVar = (C46883w) coVar;
        C58817ah ahVar = wVar.f122325c;
        if (ahVar != null) {
            this.f122130a.add(ahVar);
            this.f122131b.mo50787a(C60866ct.f164955a, wVar.f122324b);
        }
        C60870cx cxVar = wVar.f122323a;
        cxVar.mo4106b(C47810es.m84977q(new C46774cr(this, ahVar, coVar)), C60826bg.f164896a);
        return cxVar;
    }
}
