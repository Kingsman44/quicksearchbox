package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.dm */
/* compiled from: PG */
public final /* synthetic */ class C46798dm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SubscriptionFuturesMixinImpl f122164a;

    /* renamed from: b */
    public final /* synthetic */ C46689ag f122165b;

    /* renamed from: c */
    public final /* synthetic */ C46792di f122166c;

    public /* synthetic */ C46798dm(SubscriptionFuturesMixinImpl subscriptionFuturesMixinImpl, C46689ag agVar, C46792di diVar) {
        this.f122164a = subscriptionFuturesMixinImpl;
        this.f122165b = agVar;
        this.f122166c = diVar;
    }

    public final void run() {
        SubscriptionFuturesMixinImpl subscriptionFuturesMixinImpl = this.f122164a;
        subscriptionFuturesMixinImpl.f121944a.mo50710a(this.f122165b, C46693ak.f121980a, this.f122166c);
    }
}
