package p5488io.grpc.p5525e;

import p5488io.grpc.C70148al;
import p5488io.grpc.C70277cf;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.cb */
/* compiled from: PG */
final class C70413cb extends C70432cu {

    /* renamed from: a */
    public final C70277cf f187650a;

    /* renamed from: b */
    public final C70148al f187651b = C70148al.m102135m();

    /* renamed from: c */
    public final C70906u[] f187652c;

    /* renamed from: d */
    final /* synthetic */ C70414cc f187653d;

    public C70413cb(C70414cc ccVar, C70277cf cfVar, C70906u[] uVarArr) {
        this.f187653d = ccVar;
        this.f187650a = cfVar;
        this.f187652c = uVarArr;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
        if (((C70576ic) this.f187650a).f188147a.mo62572h()) {
            edVar.mo62189a("wait_for_ready");
        }
        super.mo61756b(edVar);
    }

    /* renamed from: c */
    public final void mo61757c(Status status) {
        super.mo61757c(status);
        synchronized (this.f187653d.f187654a) {
            C70414cc ccVar = this.f187653d;
            if (ccVar.f187658e != null) {
                boolean remove = ccVar.f187660g.remove(this);
                if (!this.f187653d.mo62135b() && remove) {
                    C70414cc ccVar2 = this.f187653d;
                    ccVar2.f187655b.mo62446c(ccVar2.f187657d);
                    C70414cc ccVar3 = this.f187653d;
                    if (ccVar3.f187661h != null) {
                        ccVar3.f187655b.mo62446c(ccVar3.f187658e);
                        this.f187653d.f187658e = null;
                    }
                }
            }
        }
        this.f187653d.f187655b.mo62445b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo62133p() {
        for (C70906u e : this.f187652c) {
            e.mo58103e();
        }
    }
}
