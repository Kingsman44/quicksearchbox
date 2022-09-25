package p5488io.grpc.binder.p5522a;

import com.google.common.base.C58838bb;
import java.io.InputStream;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5525e.C70658ld;
import p5488io.grpc.p5525e.C70659le;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.binder.a.as */
/* compiled from: PG */
final class C70195as implements C70658ld {

    /* renamed from: a */
    private final C70216u f187085a;

    /* renamed from: b */
    private final C70186aj f187086b;

    /* renamed from: c */
    private final C70256c f187087c;

    /* renamed from: d */
    private C70334de f187088d;

    /* renamed from: e */
    private InputStream f187089e;

    public C70195as(C70216u uVar, C70186aj ajVar, C70256c cVar) {
        this.f187085a = uVar;
        this.f187086b = ajVar;
        this.f187087c = cVar;
    }

    /* renamed from: a */
    public final C70256c mo61771a() {
        return this.f187087c;
    }

    /* renamed from: b */
    public final C70670lp mo61772b() {
        return this.f187086b.f187055f;
    }

    /* renamed from: c */
    public final void mo61773c(Status status) {
        synchronized (this.f187085a) {
            this.f187085a.mo61870i(status);
        }
    }

    /* renamed from: d */
    public final void mo61758d() {
    }

    /* renamed from: f */
    public final void mo61760f() {
    }

    /* renamed from: g */
    public final void mo61761g(int i) {
        synchronized (this.f187085a) {
            this.f187085a.mo61875n(i);
        }
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
    }

    /* renamed from: i */
    public final void mo61775i(C70659le leVar) {
        synchronized (this.f187085a) {
            this.f187085a.mo61873l(this.f187086b, leVar);
        }
    }

    /* renamed from: j */
    public final void mo61776j(C70334de deVar) {
        this.f187088d = deVar;
    }

    /* renamed from: k */
    public final void mo61777k() {
    }

    /* renamed from: l */
    public final void mo61778l() {
    }

    /* renamed from: m */
    public final void mo61779m() {
        C70256c cVar = this.f187087c;
        String str = (String) cVar.f187256b.get(C70206k.f187118g);
    }

    /* renamed from: n */
    public final void mo61768n(InputStream inputStream) {
        if (this.f187089e != null) {
            synchronized (this.f187085a) {
                C70216u uVar = this.f187085a;
                Status withDescription = Status.f186915m.withDescription("too many messages");
                uVar.mo61869h(withDescription, withDescription, false);
            }
            return;
        }
        this.f187089e = inputStream;
    }

    /* renamed from: o */
    public final boolean mo61769o() {
        return this.f187086b.f187053d.mo61847u();
    }

    public final String toString() {
        String obj = this.f187085a.toString();
        String obj2 = this.f187086b.toString();
        return "SingleMessageServerStream[" + obj + "/" + obj2 + "]";
    }

    /* renamed from: e */
    public final void mo61774e(Status status, C70334de deVar) {
        try {
            synchronized (this.f187086b) {
                C70186aj ajVar = this.f187086b;
                C70334de deVar2 = this.f187088d;
                InputStream inputStream = this.f187089e;
                if (ajVar.f187048b == null) {
                    if (deVar2 != null) {
                        ajVar.f187047a = deVar2;
                    }
                    ajVar.f187056g = true;
                    if (inputStream != null) {
                        ajVar.mo61787d(inputStream);
                    }
                    C58838bb.m90883r(ajVar.f187049c == null);
                    ajVar.f187048b = status;
                    ajVar.f187049c = deVar;
                    ajVar.f187057h = true;
                    ajVar.mo61788e();
                }
            }
            synchronized (this.f187085a) {
                this.f187085a.mo61866f();
            }
        } catch (StatusException e) {
            synchronized (this.f187085a) {
                C70216u uVar = this.f187085a;
                Status status2 = e.f186943a;
                uVar.mo61869h(status2, status2, false);
            }
        }
    }
}
