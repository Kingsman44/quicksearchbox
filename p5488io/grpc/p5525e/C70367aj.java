package p5488io.grpc.p5525e;

import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.aj */
/* compiled from: PG */
final class C70367aj extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70368ak f187549a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70367aj(C70368ak akVar) {
        super(akVar.f187552c.f187560d);
        this.f187549a = akVar;
    }

    /* renamed from: a */
    public final void mo62079a() {
        int i = C69792b.f186180a;
        C70368ak akVar = this.f187549a;
        if (akVar.f187551b == null) {
            try {
                akVar.f187550a.mo27486d();
            } catch (Throwable th) {
                this.f187549a.mo62081b(Status.f186904b.mo61678e(th).withDescription("Failed to call onReady."));
            }
        }
    }
}
