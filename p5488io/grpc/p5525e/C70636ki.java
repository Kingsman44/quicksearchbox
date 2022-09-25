package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70908w;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ki */
/* compiled from: PG */
final class C70636ki extends C70704ei {

    /* renamed from: d */
    private static final Logger f188292d = Logger.getLogger(C70636ki.class.getName());

    /* renamed from: a */
    public final C70338di f188293a;

    /* renamed from: b */
    public final C70141ae f188294b;

    /* renamed from: c */
    public volatile boolean f188295c;

    /* renamed from: e */
    private final C70658ld f188296e;

    /* renamed from: f */
    private final byte[] f188297f;

    /* renamed from: g */
    private final C70156at f188298g;

    /* renamed from: h */
    private final C70359ab f188299h;

    /* renamed from: i */
    private boolean f188300i;

    /* renamed from: j */
    private boolean f188301j;

    /* renamed from: k */
    private C70910y f188302k;

    /* renamed from: l */
    private boolean f188303l;

    public C70636ki(C70658ld ldVar, C70338di diVar, C70334de deVar, C70141ae aeVar, C70156at atVar, C70359ab abVar) {
        this.f188296e = ldVar;
        this.f188293a = diVar;
        this.f188294b = aeVar;
        this.f188297f = (byte[]) deVar.mo62027b(C70460dv.f187785d);
        this.f188298g = atVar;
        this.f188299h = abVar;
        abVar.mo62075b();
    }

    /* renamed from: d */
    private final void m103240d(Status status) {
        f188292d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "internalClose", "Cancelling the stream with status {0}", new Object[]{status});
        this.f188296e.mo61773c(status);
        this.f188299h.mo62074a(status.mo61679g());
    }

    /* renamed from: j */
    private final void m103241j(Object obj) {
        C58838bb.m90884s(this.f188300i, "sendHeaders has not been called");
        C58838bb.m90884s(!this.f188301j, "call is closed");
        C70338di diVar = this.f188293a;
        if (!diVar.f187496a.mo62042b() || !this.f188303l) {
            this.f188303l = true;
            try {
                this.f188296e.mo61768n(diVar.f187500e.mo23738a(obj));
                if (!this.f188293a.f187496a.mo62042b()) {
                    this.f188296e.mo61758d();
                }
            } catch (RuntimeException e) {
                mo39476a(Status.m102100d(e), new C70334de());
            } catch (Error e2) {
                mo39476a(Status.f186904b.withDescription("Server sendMessage() failed with Error"), new C70334de());
                throw e2;
            }
        } else {
            m103240d(Status.f186915m.withDescription("Too many responses"));
        }
    }

    /* renamed from: a */
    public final void mo39476a(Status status, C70334de deVar) {
        int i = C69792b.f186180a;
        C58838bb.m90884s(!this.f188301j, "call already closed");
        try {
            this.f188301j = true;
            if (!status.mo61679g() || !this.f188293a.f187496a.mo62042b() || this.f188303l) {
                this.f188296e.mo61774e(status, deVar);
                this.f188299h.mo62074a(status.mo61679g());
                return;
            }
            m103240d(Status.f186915m.withDescription("Completed without a response"));
        } finally {
            this.f188299h.mo62074a(status.mo61679g());
        }
    }

    /* renamed from: b */
    public final void mo58113b(C70334de deVar) {
        int i = C69792b.f186180a;
        C58838bb.m90884s(!this.f188300i, "sendHeaders has already been called");
        C58838bb.m90884s(!this.f188301j, "call is closed");
        deVar.mo62031f(C70460dv.f187788g);
        deVar.mo62031f(C70460dv.f187784c);
        if (this.f188302k == null) {
            this.f188302k = C70908w.f189099a;
        } else {
            byte[] bArr = this.f188297f;
            if (bArr == null) {
                this.f188302k = C70908w.f189099a;
            } else if (!C70460dv.m102886n(C70460dv.f187792k.mo56153g(new String(bArr, C70460dv.f187782a)))) {
                this.f188302k = C70908w.f189099a;
            }
        }
        deVar.mo62033h(C70460dv.f187784c, "identity");
        this.f188296e.mo61762h(this.f188302k);
        deVar.mo62031f(C70460dv.f187785d);
        byte[] bArr2 = this.f188298g.f187008c;
        if (bArr2.length != 0) {
            deVar.mo62033h(C70460dv.f187785d, bArr2);
        }
        this.f188300i = true;
        this.f188296e.mo61776j(deVar);
    }

    /* renamed from: c */
    public final C70338di mo61741c() {
        return this.f188293a;
    }

    /* renamed from: e */
    public final void mo61743e(Object obj) {
        int i = C69792b.f186180a;
        m103241j(obj);
    }

    /* renamed from: f */
    public final C70256c mo62061f() {
        return this.f188296e.mo61771a();
    }

    /* renamed from: g */
    public final void mo62062g(int i) {
        int i2 = C69792b.f186180a;
        this.f188296e.mo61761g(i);
    }

    /* renamed from: h */
    public final boolean mo62063h() {
        return this.f188295c;
    }

    /* renamed from: i */
    public final boolean mo62064i() {
        if (this.f188301j) {
            return false;
        }
        return this.f188296e.mo61769o();
    }
}
