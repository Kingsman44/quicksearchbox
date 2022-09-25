package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.dy */
/* compiled from: PG */
public final /* synthetic */ class C46810dy implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46815ec f122184a;

    /* renamed from: b */
    public final /* synthetic */ C46790dg f122185b;

    /* renamed from: c */
    public final /* synthetic */ C46762cf f122186c;

    public /* synthetic */ C46810dy(C46815ec ecVar, C46790dg dgVar, C46762cf cfVar) {
        this.f122184a = ecVar;
        this.f122185b = dgVar;
        this.f122186c = cfVar;
    }

    public final void run() {
        C46815ec ecVar = this.f122184a;
        ecVar.f122192c.execute(new C46805dt(ecVar, this.f122185b, this.f122186c));
    }
}
