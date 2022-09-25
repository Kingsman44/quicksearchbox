package p5488io.grpc.p5527g;

import java.io.IOException;

/* renamed from: io.grpc.g.e */
/* compiled from: PG */
abstract class C70824e implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C70825f f188881b;

    public C70824e(C70825f fVar) {
        this.f188881b = fVar;
    }

    /* renamed from: a */
    public abstract void mo62449a();

    public final void run() {
        try {
            if (this.f188881b.f188887f != null) {
                mo62449a();
                return;
            }
            throw new IOException("Unable to perform write due to unavailable sink.");
        } catch (Exception e) {
            this.f188881b.f188884c.mo62539a(e);
        }
    }
}
