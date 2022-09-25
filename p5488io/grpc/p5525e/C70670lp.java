package p5488io.grpc.p5525e;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70712eq;
import p5488io.grpc.C70762fb;
import p5488io.grpc.C70906u;

/* renamed from: io.grpc.e.lp */
/* compiled from: PG */
public final class C70670lp {

    /* renamed from: a */
    public static final C70670lp f188400a = new C70670lp(new C70762fb[0]);

    /* renamed from: b */
    public final C70762fb[] f188401b;

    /* renamed from: c */
    private final AtomicBoolean f188402c = new AtomicBoolean(false);

    public C70670lp(C70762fb[] fbVarArr) {
        this.f188401b = fbVarArr;
    }

    /* renamed from: l */
    public static C70670lp m103313l(C70906u[] uVarArr, C70256c cVar) {
        C70670lp lpVar = new C70670lp(uVarArr);
        for (C70906u d : uVarArr) {
            d.mo46273d(cVar);
        }
        return lpVar;
    }

    /* renamed from: m */
    public static C70670lp m103314m(List list) {
        if (list.isEmpty()) {
            return f188400a;
        }
        int size = list.size();
        C70762fb[] fbVarArr = new C70762fb[size];
        for (int i = 0; i < size; i++) {
            fbVarArr[i] = ((C70712eq) list.get(i)).mo62432a();
        }
        return new C70670lp(fbVarArr);
    }

    /* renamed from: a */
    public final void mo62412a() {
        for (C70762fb fbVar : this.f188401b) {
            ((C70906u) fbVar).mo46270a();
        }
    }

    /* renamed from: b */
    public final void mo62413b() {
        for (C70762fb fbVar : this.f188401b) {
            C70906u uVar = (C70906u) fbVar;
        }
    }

    /* renamed from: c */
    public final void mo62414c(long j) {
        for (C70762fb b : this.f188401b) {
            b.mo46271b(j);
        }
    }

    /* renamed from: d */
    public final void mo62415d(long j) {
        for (C70762fb c : this.f188401b) {
            c.mo46272c(j);
        }
    }

    /* renamed from: e */
    public final void mo62416e() {
        for (C70762fb fbVar : this.f188401b) {
            C70906u uVar = (C70906u) fbVar;
        }
    }

    /* renamed from: f */
    public final void mo62417f() {
        for (C70762fb fbVar : this.f188401b) {
        }
    }

    /* renamed from: g */
    public final void mo62418g() {
        for (C70762fb fbVar : this.f188401b) {
        }
    }

    /* renamed from: h */
    public final void mo62419h() {
        for (C70762fb fbVar : this.f188401b) {
        }
    }

    /* renamed from: i */
    public final void mo62420i() {
        for (C70762fb fbVar : this.f188401b) {
        }
    }

    /* renamed from: j */
    public final void mo62421j() {
        for (C70762fb fbVar : this.f188401b) {
        }
    }

    /* renamed from: k */
    public final void mo62422k() {
        for (C70762fb fbVar : this.f188401b) {
        }
    }

    /* renamed from: n */
    public final void mo62423n() {
        if (this.f188402c.compareAndSet(false, true)) {
            for (C70762fb e : this.f188401b) {
                e.mo58103e();
            }
        }
    }
}
