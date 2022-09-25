package p5488io.grpc.p5524d;

import p5488io.grpc.C70132a;
import p5488io.grpc.C70172bg;
import p5488io.grpc.C70256c;

/* renamed from: io.grpc.d.l */
/* compiled from: PG */
final class C70315l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70304ae f187440a;

    public C70315l(C70304ae aeVar) {
        this.f187440a = aeVar;
    }

    public final void run() {
        synchronized (this.f187440a) {
            C70132a a = C70256c.m102407a();
            a.mo61688b(C70172bg.f187019a, this.f187440a.f187397b);
            a.mo61688b(C70172bg.f187020b, this.f187440a.f187397b);
            C70256c a2 = a.mo61687a();
            C70304ae aeVar = this.f187440a;
            aeVar.f187400e.mo62393c();
            aeVar.f187401f = a2;
            this.f187440a.f187402g.mo62206b();
        }
    }
}
