package p5488io.grpc.p5533i;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: io.grpc.i.k */
/* compiled from: PG */
final class C70872k extends C70871j {

    /* renamed from: a */
    private final C70862aj f189048a;

    /* renamed from: b */
    private final C70869h f189049b;

    /* renamed from: c */
    private boolean f189050c;

    public C70872k(C70862aj ajVar, C70869h hVar) {
        this.f189048a = ajVar;
        this.f189049b = hVar;
        if (ajVar instanceof C70877p) {
            ((C70877p) ajVar).mo22390d(hVar);
        }
        hVar.f189041a = true;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        if (status.mo61679g()) {
            this.f189048a.mo20121a();
        } else {
            this.f189048a.mo20122b(new C70761fa(status, deVar, true));
        }
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
    }

    /* renamed from: d */
    public final void mo27486d() {
        Runnable runnable = this.f189049b.f189044d;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public final void mo62581e() {
        this.f189049b.mo62580f();
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        if (!this.f189050c || this.f189049b.f189043c) {
            this.f189050c = true;
            this.f189048a.mo20123c(obj);
            C70869h hVar = this.f189049b;
            if (hVar.f189043c) {
                hVar.mo62580f();
                return;
            }
            return;
        }
        throw new C70761fa(Status.f186915m.withDescription("More than one responses received for unary or client-streaming call"), (C70334de) null, true);
    }
}
