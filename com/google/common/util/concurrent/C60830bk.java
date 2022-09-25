package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.bk */
/* compiled from: PG */
public final /* synthetic */ class C60830bk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60915eb f164904a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f164905b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f164906c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f164907d;

    /* renamed from: e */
    public final /* synthetic */ C60834bo f164908e;

    public /* synthetic */ C60830bk(C60915eb ebVar, SettableFuture settableFuture, C60870cx cxVar, C60870cx cxVar2, C60834bo boVar) {
        this.f164904a = ebVar;
        this.f164905b = settableFuture;
        this.f164906c = cxVar;
        this.f164907d = cxVar2;
        this.f164908e = boVar;
    }

    public final void run() {
        C60915eb ebVar = this.f164904a;
        SettableFuture settableFuture = this.f164905b;
        C60870cx cxVar = this.f164906c;
        C60870cx cxVar2 = this.f164907d;
        C60834bo boVar = this.f164908e;
        if (ebVar.isDone()) {
            settableFuture.mo57358p(cxVar);
        } else if (cxVar2.isCancelled() && boVar.compareAndSet(C60833bn.NOT_RUN, C60833bn.CANCELLED)) {
            ebVar.cancel(false);
        }
    }
}
