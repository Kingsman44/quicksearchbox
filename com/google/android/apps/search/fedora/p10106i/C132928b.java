package com.google.android.apps.search.fedora.p10106i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.fedora.i.b */
/* compiled from: PG */
public final /* synthetic */ class C132928b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132934h f362598a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f362599b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f362600c;

    public /* synthetic */ C132928b(C132934h hVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f362598a = hVar;
        this.f362599b = cxVar;
        this.f362600c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C132934h hVar = this.f362598a;
        C60870cx cxVar = this.f362599b;
        C60870cx cxVar2 = this.f362600c;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        if (booleanValue == ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            return C60866ct.f164955a;
        }
        C60870cx cxVar3 = C60866ct.f164955a;
        if (!booleanValue) {
            ((C59052c) ((C59052c) C132934h.f362607a.mo56224b()).mo56372aa(39930)).mo56386p("Account became ineligible for FL.");
            C132930d dVar = new C132930d(hVar);
            cxVar3 = C60922j.m93045h(cxVar3, C47810es.m84966f(dVar), hVar.f362612f);
        }
        C132931e eVar = new C132931e(hVar, booleanValue);
        return C60922j.m93045h(cxVar3, C47810es.m84966f(eVar), hVar.f362612f);
    }
}
