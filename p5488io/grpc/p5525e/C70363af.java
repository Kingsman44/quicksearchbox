package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.af */
/* compiled from: PG */
final class C70363af extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70897l f187540a;

    /* renamed from: b */
    final /* synthetic */ String f187541b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70363af(C70371an anVar, C70897l lVar, String str) {
        super(anVar.f187560d);
        this.f187540a = lVar;
        this.f187541b = str;
    }

    /* renamed from: a */
    public final void mo62079a() {
        this.f187540a.mo27484b(Status.f186915m.withDescription(String.format("Unable to find compressor by name %s", new Object[]{this.f187541b})), new C70334de());
    }
}
