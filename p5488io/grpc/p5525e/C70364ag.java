package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ag */
/* compiled from: PG */
final class C70364ag extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70334de f187542a;

    /* renamed from: b */
    final /* synthetic */ C70368ak f187543b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70364ag(C70368ak akVar, C70334de deVar) {
        super(akVar.f187552c.f187560d);
        this.f187543b = akVar;
        this.f187542a = deVar;
    }

    /* renamed from: a */
    public final void mo62079a() {
        int i = C69792b.f186180a;
        C70368ak akVar = this.f187543b;
        if (akVar.f187551b == null) {
            try {
                akVar.f187550a.mo27485c(this.f187542a);
            } catch (Throwable th) {
                this.f187543b.mo62081b(Status.f186904b.mo61678e(th).withDescription("Failed to read headers"));
            }
        }
    }
}
