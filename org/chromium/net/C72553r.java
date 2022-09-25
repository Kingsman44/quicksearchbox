package org.chromium.net;

/* renamed from: org.chromium.net.r */
/* compiled from: PG */
final class C72553r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f193072a;

    /* renamed from: b */
    final /* synthetic */ C72554s f193073b;

    public C72553r(C72554s sVar, int i) {
        this.f193073b = sVar;
        this.f193072a = i;
    }

    public final void run() {
        this.f193073b.f193075b.mObserver.onConnectionTypeChanged(this.f193072a);
    }
}
