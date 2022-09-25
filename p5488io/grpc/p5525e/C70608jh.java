package p5488io.grpc.p5525e;

import java.util.concurrent.Future;

/* renamed from: io.grpc.e.jh */
/* compiled from: PG */
final class C70608jh {

    /* renamed from: a */
    final Object f188197a;

    /* renamed from: b */
    Future f188198b;

    /* renamed from: c */
    boolean f188199c;

    public C70608jh(Object obj) {
        this.f188197a = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Future mo62347a() {
        this.f188199c = true;
        return this.f188198b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62348b(Future future) {
        synchronized (this.f188197a) {
            if (!this.f188199c) {
                this.f188198b = future;
            }
        }
    }
}
