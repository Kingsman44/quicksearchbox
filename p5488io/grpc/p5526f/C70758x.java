package p5488io.grpc.p5526f;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.p5573a.C71347aa;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71389v;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.Status;

/* renamed from: io.grpc.f.x */
/* compiled from: PG */
public final class C70758x extends C70703eh {

    /* renamed from: a */
    final /* synthetic */ C71643cp f188559a;

    /* renamed from: b */
    final /* synthetic */ C71389v f188560b;

    /* renamed from: c */
    final /* synthetic */ C70704ei f188561c;

    /* renamed from: d */
    final /* synthetic */ C70756v f188562d;

    /* renamed from: e */
    private boolean f188563e = true;

    public C70758x(C71643cp cpVar, C71389v vVar, C70704ei eiVar, C70756v vVar2) {
        this.f188559a = cpVar;
        this.f188560b = vVar;
        this.f188561c = eiVar;
        this.f188562d = vVar2;
    }

    /* renamed from: a */
    public final void mo51551a() {
        C71647ct.m104640d(this.f188559a, "Cancellation received from client", (Throwable) null);
    }

    /* renamed from: c */
    public final void mo51553c() {
        this.f188560b.mo62727D((Throwable) null);
    }

    /* renamed from: d */
    public final void mo51554d(Object obj) {
        if (this.f188563e) {
            Object w = this.f188560b.mo62730w(obj);
            this.f188563e = C71348ab.m103985c(w);
            if (w instanceof C71347aa) {
                Throwable b = C71348ab.m103984b(w);
                if (!(b instanceof CancellationException)) {
                    throw Status.f186915m.withDescription("onMessage should never be called when requestsChannel is unready").mo61678e(b).asException();
                }
            }
        }
        if (!this.f188563e) {
            this.f188561c.mo62062g(1);
        }
    }

    /* renamed from: e */
    public final void mo51555e() {
        this.f188562d.mo62438b();
    }
}
