package p5488io.grpc.p5526f;

import kotlinx.coroutines.p5573a.C71347aa;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: io.grpc.f.h */
/* compiled from: PG */
public final class C70742h extends C70897l {

    /* renamed from: a */
    final /* synthetic */ C71389v f188511a;

    /* renamed from: b */
    final /* synthetic */ C70756v f188512b;

    public C70742h(C71389v vVar, C70756v vVar2) {
        this.f188511a = vVar;
        this.f188512b = vVar2;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        StatusException statusException;
        C69664n.m101061g(status, "status");
        C69664n.m101061g(deVar, "trailersMetadata");
        C71389v vVar = this.f188511a;
        if (status.mo61679g()) {
            statusException = null;
        } else {
            statusException = new StatusException(status, deVar);
        }
        vVar.mo62727D(statusException);
    }

    /* renamed from: d */
    public final void mo27486d() {
        this.f188512b.mo62438b();
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        Object w = this.f188511a.mo62730w(obj);
        if (w instanceof C71347aa) {
            Throwable b = C71348ab.m103984b(w);
            if (b == null) {
                throw new AssertionError("onMessage should never be called until responses is ready");
            }
            throw b;
        }
    }
}
