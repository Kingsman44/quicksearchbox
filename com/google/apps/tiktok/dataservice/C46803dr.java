package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.dr */
/* compiled from: PG */
public final /* synthetic */ class C46803dr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46815ec f122171a;

    /* renamed from: b */
    public final /* synthetic */ C46790dg f122172b;

    /* renamed from: c */
    public final /* synthetic */ C46768cl f122173c;

    public /* synthetic */ C46803dr(C46815ec ecVar, C46790dg dgVar, C46768cl clVar) {
        this.f122171a = ecVar;
        this.f122172b = dgVar;
        this.f122173c = clVar;
    }

    public final void run() {
        C46815ec ecVar = this.f122171a;
        ecVar.f122192c.execute(new C46806du(ecVar, this.f122172b, this.f122173c));
    }
}
