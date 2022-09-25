package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cp */
/* compiled from: PG */
public final /* synthetic */ class C106935cp implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297862a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297863b;

    /* renamed from: c */
    public final /* synthetic */ C106596h f297864c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f297865d;

    public /* synthetic */ C106935cp(C106941cv cvVar, C60870cx cxVar, C106596h hVar, C60870cx cxVar2) {
        this.f297862a = cvVar;
        this.f297863b = cxVar;
        this.f297864c = hVar;
        this.f297865d = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106941cv cvVar = this.f297862a;
        C60870cx cxVar = this.f297863b;
        C106596h hVar = this.f297864c;
        C60870cx cxVar2 = this.f297865d;
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            return cvVar.mo95717g((Optional) C60856cj.m92909r(cxVar2));
        }
        ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23409)).mo56386p("Quota reached. Sending default chip");
        return cvVar.mo95717g(Optional.m71637of(cvVar.mo95716f(hVar)));
    }
}
