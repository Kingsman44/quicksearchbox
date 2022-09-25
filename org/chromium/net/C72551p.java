package org.chromium.net;

/* renamed from: org.chromium.net.p */
/* compiled from: PG */
final class C72551p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f193068a;

    /* renamed from: b */
    final /* synthetic */ C72554s f193069b;

    public C72551p(C72554s sVar, long j) {
        this.f193069b = sVar;
        this.f193068a = j;
    }

    public final void run() {
        this.f193069b.f193075b.mObserver.onNetworkSoonToDisconnect(this.f193068a);
    }
}
