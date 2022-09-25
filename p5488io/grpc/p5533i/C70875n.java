package p5488io.grpc.p5533i;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: io.grpc.i.n */
/* compiled from: PG */
final class C70875n extends C70871j {

    /* renamed from: a */
    private final C70870i f189058a;

    /* renamed from: b */
    private Object f189059b;

    /* renamed from: c */
    private boolean f189060c = false;

    public C70875n(C70870i iVar) {
        this.f189058a = iVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        if (status.mo61679g()) {
            if (!this.f189060c) {
                this.f189058a.mo57357o(new C70761fa(Status.f186915m.withDescription("No value received for unary call"), deVar, true));
            }
            this.f189058a.mo57356n(this.f189059b);
            return;
        }
        this.f189058a.mo57357o(new C70761fa(status, deVar, true));
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
    }

    /* renamed from: e */
    public final void mo62581e() {
        this.f189058a.f189047a.mo27482g(2);
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        if (!this.f189060c) {
            this.f189059b = obj;
            this.f189060c = true;
            return;
        }
        throw new C70761fa(Status.f186915m.withDescription("More than one value received for unary call"), (C70334de) null, true);
    }
}
