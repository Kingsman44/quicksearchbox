package p5488io.grpc.p5533i;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: io.grpc.i.ac */
/* compiled from: PG */
final class C70855ac extends C70703eh {

    /* renamed from: a */
    private final C70862aj f189025a;

    /* renamed from: b */
    private final C70887z f189026b;

    /* renamed from: c */
    private final C70704ei f189027c;

    /* renamed from: d */
    private boolean f189028d = false;

    public C70855ac(C70862aj ajVar, C70887z zVar, C70704ei eiVar) {
        this.f189025a = ajVar;
        this.f189026b = zVar;
        this.f189027c = eiVar;
    }

    /* renamed from: a */
    public final void mo51551a() {
        C70887z zVar = this.f189026b;
        Runnable runnable = zVar.f189073d;
        if (runnable != null) {
            runnable.run();
        } else {
            zVar.f189071b = true;
        }
        if (!this.f189028d) {
            this.f189025a.mo20122b(new C70761fa(Status.f186904b.withDescription("client cancelled"), (C70334de) null, true));
        }
    }

    /* renamed from: b */
    public final void mo51552b() {
    }

    /* renamed from: c */
    public final void mo51553c() {
        this.f189028d = true;
        this.f189025a.mo20121a();
    }

    /* renamed from: d */
    public final void mo51554d(Object obj) {
        this.f189025a.mo20123c(obj);
        this.f189027c.mo62062g(1);
    }

    /* renamed from: e */
    public final void mo51555e() {
    }
}
