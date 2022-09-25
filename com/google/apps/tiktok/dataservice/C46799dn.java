package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.dn */
/* compiled from: PG */
public final /* synthetic */ class C46799dn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SubscriptionFuturesMixinImpl f122167a;

    /* renamed from: b */
    public final /* synthetic */ C46689ag f122168b;

    /* renamed from: c */
    public final /* synthetic */ C46788de f122169c;

    /* renamed from: d */
    public final /* synthetic */ C46792di f122170d;

    public /* synthetic */ C46799dn(SubscriptionFuturesMixinImpl subscriptionFuturesMixinImpl, C46689ag agVar, C46788de deVar, C46792di diVar) {
        this.f122167a = subscriptionFuturesMixinImpl;
        this.f122168b = agVar;
        this.f122169c = deVar;
        this.f122170d = diVar;
    }

    public final void run() {
        SubscriptionFuturesMixinImpl subscriptionFuturesMixinImpl = this.f122167a;
        C46689ag agVar = this.f122168b;
        C46788de deVar = this.f122169c;
        subscriptionFuturesMixinImpl.f121944a.mo50710a(agVar, new C46692aj(deVar), this.f122170d);
    }
}
