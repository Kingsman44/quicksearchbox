package p5488io.grpc.p5525e;

import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ek */
/* compiled from: PG */
final class C70476ek implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70477el f187825a;

    public C70476ek(C70477el elVar) {
        this.f187825a = elVar;
    }

    public final void run() {
        C70493fa faVar = this.f187825a.f187827b;
        C70556hj hjVar = faVar.f187863k;
        faVar.f187862j = null;
        faVar.f187863k = null;
        hjVar.mo61831l(Status.f186916n.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
