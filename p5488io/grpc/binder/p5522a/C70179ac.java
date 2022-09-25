package p5488io.grpc.binder.p5522a;

import java.io.InputStream;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70374aq;
import p5488io.grpc.p5525e.C70469ed;

/* renamed from: io.grpc.binder.a.ac */
/* compiled from: PG */
final class C70179ac implements C70372ao {

    /* renamed from: a */
    private final C70215t f187032a;

    /* renamed from: b */
    private final C70185ai f187033b;

    /* renamed from: c */
    private final C70256c f187034c;

    public C70179ac(C70215t tVar, C70185ai aiVar, C70256c cVar) {
        this.f187032a = tVar;
        this.f187033b = aiVar;
        this.f187034c = cVar;
    }

    /* renamed from: a */
    public final C70256c mo61755a() {
        return this.f187034c;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
    }

    /* renamed from: c */
    public final void mo61757c(Status status) {
        synchronized (this.f187032a) {
            this.f187032a.mo61870i(status);
        }
    }

    /* renamed from: d */
    public final void mo61758d() {
    }

    /* renamed from: e */
    public final void mo61759e() {
        try {
            synchronized (this.f187033b) {
                C70185ai aiVar = this.f187033b;
                aiVar.f187057h = true;
                aiVar.mo61788e();
            }
        } catch (StatusException e) {
            synchronized (this.f187032a) {
                C70215t tVar = this.f187032a;
                Status status = e.f186943a;
                tVar.mo61869h(status, status, false);
            }
        }
    }

    /* renamed from: f */
    public final void mo61760f() {
    }

    /* renamed from: g */
    public final void mo61761g(int i) {
        synchronized (this.f187032a) {
            this.f187032a.mo61875n(i);
        }
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
    }

    /* renamed from: i */
    public final void mo61763i(C70153aq aqVar) {
        synchronized (this.f187033b) {
            this.f187033b.mo61786c(aqVar);
        }
    }

    /* renamed from: j */
    public final void mo61764j(C70156at atVar) {
    }

    /* renamed from: k */
    public final void mo61765k(int i) {
    }

    /* renamed from: l */
    public final void mo61766l(int i) {
    }

    /* renamed from: m */
    public final void mo61767m(C70374aq aqVar) {
        synchronized (this.f187032a) {
            this.f187032a.mo61873l(this.f187033b, aqVar);
        }
        if (this.f187033b.f187053d.mo61847u()) {
            aqVar.mo62084e();
        }
        try {
            synchronized (this.f187033b) {
                C70185ai aiVar = this.f187033b;
                aiVar.f187056g = true;
                aiVar.mo61788e();
            }
        } catch (StatusException e) {
            synchronized (this.f187032a) {
                C70215t tVar = this.f187032a;
                Status status = e.f186943a;
                tVar.mo61869h(status, status, false);
            }
        }
    }

    /* renamed from: n */
    public final void mo61768n(InputStream inputStream) {
        try {
            synchronized (this.f187033b) {
                this.f187033b.mo61787d(inputStream);
                this.f187033b.mo61788e();
            }
        } catch (StatusException e) {
            synchronized (this.f187032a) {
                C70215t tVar = this.f187032a;
                Status status = e.f186943a;
                tVar.mo61869h(status, status, false);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo61769o() {
        return this.f187033b.f187053d.mo61847u();
    }

    public final String toString() {
        String obj = this.f187032a.toString();
        String obj2 = this.f187033b.toString();
        return "MultiMessageClientStream[" + obj + "/" + obj2 + "]";
    }
}
