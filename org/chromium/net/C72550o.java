package org.chromium.net;

/* renamed from: org.chromium.net.o */
/* compiled from: PG */
final class C72550o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f193065a;

    /* renamed from: b */
    final /* synthetic */ int f193066b;

    /* renamed from: c */
    final /* synthetic */ C72554s f193067c;

    public C72550o(C72554s sVar, long j, int i) {
        this.f193067c = sVar;
        this.f193065a = j;
        this.f193066b = i;
    }

    public final void run() {
        this.f193067c.f193075b.mObserver.onNetworkConnect(this.f193065a, this.f193066b);
    }
}
