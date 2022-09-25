package com.google.android.gms.droidguard.internal;

import java.util.HashMap;

/* renamed from: com.google.android.gms.droidguard.internal.e */
/* compiled from: PG */
public final /* synthetic */ class C144125e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C144127g f390412a;

    /* renamed from: b */
    public final /* synthetic */ long f390413b;

    /* renamed from: c */
    public final /* synthetic */ C144127g f390414c;

    public /* synthetic */ C144125e(C144127g gVar, long j, C144127g gVar2) {
        this.f390412a = gVar;
        this.f390413b = j;
        this.f390414c = gVar2;
    }

    public final void run() {
        C144127g gVar = this.f390412a;
        long j = this.f390413b;
        C144127g gVar2 = this.f390414c;
        C144135o oVar = gVar.f390422f;
        C144132l lVar = new C144132l(oVar, "getResults snapshot timeout: " + j + " ms", gVar.f390421e);
        String a = lVar.mo119658a(new HashMap());
        lVar.close();
        gVar2.mo119677a(a);
    }
}
