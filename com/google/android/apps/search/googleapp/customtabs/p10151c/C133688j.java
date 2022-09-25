package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.j */
/* compiled from: PG */
public final /* synthetic */ class C133688j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133691m f364142a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364143b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f364144c;

    /* renamed from: d */
    public final /* synthetic */ Duration f364145d;

    public /* synthetic */ C133688j(C133691m mVar, C60870cx cxVar, C60870cx cxVar2, Duration duration) {
        this.f364142a = mVar;
        this.f364143b = cxVar;
        this.f364144c = cxVar2;
        this.f364145d = duration;
    }

    public final Object call() {
        C133691m mVar = this.f364142a;
        C60870cx cxVar = this.f364143b;
        C60870cx cxVar2 = this.f364144c;
        Duration duration = this.f364145d;
        C133693o oVar = (C133693o) C60856cj.m92909r(cxVar);
        if (mVar.mo111337e((String) C60856cj.m92909r(cxVar2), oVar, duration)) {
            C133698t tVar = (C133698t) C133699u.f364172d.createBuilder();
            C133697s sVar = C133697s.UNKNOWN;
            tVar.copyOnWrite();
            C133699u uVar = (C133699u) tVar.instance;
            uVar.f364175b = sVar.f364171e;
            uVar.f364174a |= 1;
            return (C133699u) tVar.build();
        }
        C133698t tVar2 = (C133698t) C133699u.f364172d.createBuilder();
        C133697s a = C133691m.m216922a(oVar);
        tVar2.copyOnWrite();
        C133699u uVar2 = (C133699u) tVar2.instance;
        uVar2.f364175b = a.f364171e;
        uVar2.f364174a |= 1;
        tVar2.copyOnWrite();
        C133699u uVar3 = (C133699u) tVar2.instance;
        oVar.getClass();
        uVar3.f364176c = oVar;
        uVar3.f364174a |= 2;
        return (C133699u) tVar2.build();
    }
}
