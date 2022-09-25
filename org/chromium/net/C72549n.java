package org.chromium.net;

/* renamed from: org.chromium.net.n */
/* compiled from: PG */
final class C72549n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f193061a;

    /* renamed from: b */
    final /* synthetic */ int f193062b;

    /* renamed from: c */
    final /* synthetic */ boolean f193063c;

    /* renamed from: d */
    final /* synthetic */ C72554s f193064d;

    public C72549n(C72554s sVar, long j, int i, boolean z) {
        this.f193064d = sVar;
        this.f193061a = j;
        this.f193062b = i;
        this.f193063c = z;
    }

    public final void run() {
        this.f193064d.f193075b.mObserver.onNetworkConnect(this.f193061a, this.f193062b);
        if (this.f193063c) {
            this.f193064d.f193075b.mObserver.onConnectionTypeChanged(this.f193062b);
            this.f193064d.f193075b.mObserver.purgeActiveNetworkList(new long[]{this.f193061a});
        }
    }
}
