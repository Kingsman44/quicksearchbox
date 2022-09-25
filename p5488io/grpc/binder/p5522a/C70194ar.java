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

/* renamed from: io.grpc.binder.a.ar */
/* compiled from: PG */
final class C70194ar implements C70372ao {

    /* renamed from: a */
    private final C70215t f187080a;

    /* renamed from: b */
    private final C70185ai f187081b;

    /* renamed from: c */
    private final C70256c f187082c;

    /* renamed from: d */
    private InputStream f187083d;

    /* renamed from: e */
    private C70153aq f187084e;

    public C70194ar(C70215t tVar, C70185ai aiVar, C70256c cVar) {
        this.f187080a = tVar;
        this.f187081b = aiVar;
        this.f187082c = cVar;
    }

    /* renamed from: a */
    public final C70256c mo61755a() {
        return this.f187082c;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
    }

    /* renamed from: c */
    public final void mo61757c(Status status) {
        synchronized (this.f187080a) {
            this.f187080a.mo61870i(status);
        }
    }

    /* renamed from: d */
    public final void mo61758d() {
    }

    /* renamed from: e */
    public final void mo61759e() {
        try {
            synchronized (this.f187081b) {
                C70153aq aqVar = this.f187084e;
                if (aqVar != null) {
                    this.f187081b.mo61786c(aqVar);
                }
                C70185ai aiVar = this.f187081b;
                aiVar.f187056g = true;
                InputStream inputStream = this.f187083d;
                if (inputStream != null) {
                    aiVar.mo61787d(inputStream);
                }
                aiVar.f187057h = true;
                aiVar.mo61788e();
            }
        } catch (StatusException e) {
            synchronized (this.f187080a) {
                C70215t tVar = this.f187080a;
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
        synchronized (this.f187080a) {
            this.f187080a.mo61875n(i);
        }
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
    }

    /* renamed from: i */
    public final void mo61763i(C70153aq aqVar) {
        this.f187084e = aqVar;
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
        synchronized (this.f187080a) {
            this.f187080a.mo61873l(this.f187081b, aqVar);
        }
        if (this.f187081b.f187053d.mo61847u()) {
            aqVar.mo62084e();
        }
    }

    /* renamed from: n */
    public final void mo61768n(InputStream inputStream) {
        if (this.f187083d != null) {
            synchronized (this.f187080a) {
                C70215t tVar = this.f187080a;
                Status withDescription = Status.f186915m.withDescription("too many messages");
                tVar.mo61869h(withDescription, withDescription, false);
            }
            return;
        }
        this.f187083d = inputStream;
    }

    /* renamed from: o */
    public final boolean mo61769o() {
        return this.f187081b.f187053d.mo61847u();
    }

    public final String toString() {
        String obj = this.f187080a.toString();
        String obj2 = this.f187081b.toString();
        return "SingleMessageClientStream[" + obj + "/" + obj2 + "]";
    }
}
