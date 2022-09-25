package p5488io.grpc.p5533i;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.Status;

/* renamed from: io.grpc.i.ag */
/* compiled from: PG */
final class C70859ag extends C70703eh {

    /* renamed from: a */
    final /* synthetic */ C70860ah f189031a;

    /* renamed from: b */
    private final C70704ei f189032b;

    /* renamed from: c */
    private final C70887z f189033c;

    /* renamed from: d */
    private boolean f189034d = true;

    /* renamed from: e */
    private boolean f189035e;

    /* renamed from: f */
    private Object f189036f;

    public C70859ag(C70860ah ahVar, C70887z zVar, C70704ei eiVar) {
        this.f189031a = ahVar;
        this.f189032b = eiVar;
        this.f189033c = zVar;
    }

    /* renamed from: a */
    public final void mo51551a() {
        C70887z zVar = this.f189033c;
        Runnable runnable = zVar.f189073d;
        if (runnable != null) {
            runnable.run();
        } else {
            zVar.f189071b = true;
        }
    }

    /* renamed from: b */
    public final void mo51552b() {
    }

    /* renamed from: c */
    public final void mo51553c() {
        if (this.f189034d) {
            Object obj = this.f189036f;
            if (obj == null) {
                this.f189032b.mo39476a(Status.f186915m.withDescription("Half-closed without a request"), new C70334de());
                return;
            }
            this.f189031a.f189037a.mo20119b(obj, this.f189033c);
            this.f189036f = null;
            this.f189033c.f189072c = true;
            if (this.f189035e) {
                this.f189035e = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo51554d(Object obj) {
        if (this.f189036f != null) {
            this.f189032b.mo39476a(Status.f186915m.withDescription("Too many requests"), new C70334de());
            this.f189034d = false;
            return;
        }
        this.f189036f = obj;
    }

    /* renamed from: e */
    public final void mo51555e() {
        this.f189035e = true;
    }
}
