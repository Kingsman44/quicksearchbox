package com.google.apps.tiktok.dataservice;

import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.apps.tiktok.dataservice.an */
/* compiled from: PG */
public final /* synthetic */ class C46696an implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C46788de f121982a;

    /* renamed from: b */
    public final /* synthetic */ long f121983b;

    public /* synthetic */ C46696an(C46788de deVar, long j) {
        this.f121982a = deVar;
        this.f121983b = j;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C46688af afVar = (C46688af) obj;
        if (C46723bg.m83266d(afVar, this.f121982a, this.f121983b)) {
            return afVar.mo50739f();
        }
        throw new IllegalStateException("fetchAndStore() did not produce a cache hit");
    }
}
