package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.aj */
/* compiled from: PG */
public final /* synthetic */ class C46692aj implements C46816ed {

    /* renamed from: a */
    public final /* synthetic */ C46788de f121979a;

    public /* synthetic */ C46692aj(C46788de deVar) {
        this.f121979a = deVar;
    }

    /* renamed from: a */
    public final int mo50743a(long j, C46688af afVar, boolean z) {
        C46788de deVar = this.f121979a;
        if (afVar.f121977b.f121974b && afVar.mo50740g() && !deVar.mo50797a(afVar.mo50736a(), j)) {
            return 2;
        }
        if (z || !afVar.f121977b.f121974b) {
            return afVar.f121977b.f121974b ? 3 : 1;
        }
        return 2;
    }
}
