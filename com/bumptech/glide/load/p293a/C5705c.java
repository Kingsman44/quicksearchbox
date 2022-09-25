package com.bumptech.glide.load.p293a;

/* renamed from: com.bumptech.glide.load.a.c */
/* compiled from: PG */
final class C5705c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5713f f17188a;

    public C5705c(C5713f fVar) {
        this.f17188a = fVar;
    }

    public final void run() {
        C5713f fVar = this.f17188a;
        while (true) {
            boolean z = fVar.f17206c;
            try {
                fVar.mo12223c((C5712e) fVar.f17205b.remove());
                C5711d dVar = fVar.f17207d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
