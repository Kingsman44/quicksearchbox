package p5488io.grpc.p5524d;

import p5488io.grpc.Status;

/* renamed from: io.grpc.d.k */
/* compiled from: PG */
final class C70314k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187438a;

    /* renamed from: b */
    final /* synthetic */ C70304ae f187439b;

    public C70314k(C70304ae aeVar, Status status) {
        this.f187439b = aeVar;
        this.f187438a = status;
    }

    public final void run() {
        synchronized (this.f187439b) {
            this.f187439b.mo61993d(this.f187438a);
            this.f187439b.mo61994g();
        }
    }
}
