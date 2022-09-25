package p5488io.grpc.p5525e;

import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60826bg;
import java.io.InputStream;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70253bx;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.kh */
/* compiled from: PG */
final class C70635kh implements C70659le {

    /* renamed from: a */
    public final C70636ki f188289a;

    /* renamed from: b */
    private final C70703eh f188290b;

    /* renamed from: c */
    private final C70141ae f188291c;

    public C70635kh(C70636ki kiVar, C70703eh ehVar, C70141ae aeVar) {
        this.f188289a = kiVar;
        this.f188290b = ehVar;
        this.f188291c = aeVar;
        aeVar.mo61700d(new C70634kg(this), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo62381a(Status status) {
        int i = C69792b.f186180a;
        C70761fa faVar = null;
        try {
            if (status.mo61679g()) {
                this.f188290b.mo51552b();
            } else {
                this.f188289a.f188295c = true;
                this.f188290b.mo51551a();
                faVar = C70253bx.m102405a(Status.f186904b.withDescription("RPC cancelled"));
            }
            this.f188291c.mo61706j(faVar);
        } catch (Throwable th) {
            this.f188291c.mo61706j((Throwable) null);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo62382b() {
        int i = C69792b.f186180a;
        if (!this.f188289a.f188295c) {
            this.f188290b.mo51553c();
        }
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        InputStream g;
        int i = C69792b.f186180a;
        if (!this.f188289a.f188295c) {
            while (true) {
                try {
                    g = lrVar.mo61868g();
                    if (g != null) {
                        this.f188290b.mo51554d(this.f188289a.f188293a.f187499d.mo23739b(g));
                        g.close();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C70460dv.m102880h(lrVar);
                    C58887cx.m90980g(th);
                    throw new RuntimeException(th);
                }
            }
        } else {
            C70460dv.m102880h(lrVar);
        }
    }

    /* renamed from: e */
    public final void mo62084e() {
        int i = C69792b.f186180a;
        if (!this.f188289a.f188295c) {
            this.f188290b.mo51555e();
        }
    }
}
