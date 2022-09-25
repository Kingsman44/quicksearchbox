package p5488io.grpc.p5527g;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p5488io.grpc.C70287cp;
import p5488io.grpc.C70768fh;
import p5488io.grpc.p5525e.C70446dh;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70465e;
import p5488io.grpc.p5525e.C70543gx;
import p5488io.grpc.p5525e.C70544gy;
import p5488io.grpc.p5525e.C70549hc;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70667lm;
import p5488io.grpc.p5525e.C70669lo;
import p5488io.grpc.p5525e.C70678lx;
import p5488io.grpc.p5525e.C70679ly;
import p5488io.grpc.p5527g.p5528a.C70771a;
import p5488io.grpc.p5527g.p5528a.C70787b;
import p5488io.grpc.p5527g.p5528a.C70790c;
import p5488io.grpc.p5527g.p5528a.C70803p;
import p5488io.grpc.p5527g.p5528a.C70805r;

/* renamed from: io.grpc.g.p */
/* compiled from: PG */
public final class C70835p extends C70465e {

    /* renamed from: a */
    static final C70790c f188918a;

    /* renamed from: b */
    static final C70567hu f188919b;

    /* renamed from: l */
    private static final C70667lm f188920l;

    /* renamed from: c */
    public final C70549hc f188921c;

    /* renamed from: d */
    public final C70678lx f188922d = C70679ly.f188407a;

    /* renamed from: e */
    public C70567hu f188923e = f188919b;

    /* renamed from: f */
    public final C70567hu f188924f = new C70669lo(C70460dv.f187798q);

    /* renamed from: g */
    public SSLSocketFactory f188925g;

    /* renamed from: h */
    public HostnameVerifier f188926h;

    /* renamed from: i */
    public final C70790c f188927i = f188918a;

    /* renamed from: j */
    public final long f188928j = C70460dv.f187793l;

    /* renamed from: k */
    public int f188929k = 1;

    static {
        Logger.getLogger(C70835p.class.getName());
        C70787b bVar = new C70787b(C70790c.f188780a);
        bVar.mo62482a(C70771a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C70771a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C70771a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, C70771a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, C70771a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, C70771a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar.mo62484c(C70805r.TLS_1_2);
        bVar.f188773c = true;
        f188918a = new C70790c(bVar);
        TimeUnit.DAYS.toNanos(1000);
        C70830k kVar = new C70830k();
        f188920l = kVar;
        f188919b = new C70669lo(kVar);
        EnumSet.of(C70768fh.MTLS, C70768fh.CUSTOM_MANAGERS);
    }

    public C70835p(String str) {
        this.f188921c = new C70549hc(str, (C70544gy) new C70832m(this), (C70543gx) new C70831l(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C70287cp mo61905a() {
        return this.f188921c;
    }

    /* renamed from: d */
    public final void mo62544d(Executor executor) {
        this.f188923e = new C70446dh(executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SSLSocketFactory mo62543b() {
        int i = this.f188929k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            try {
                if (this.f188925g == null) {
                    this.f188925g = SSLContext.getInstance("Default", C70803p.f188816b.f188818c).getSocketFactory();
                }
                return this.f188925g;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            throw new RuntimeException("Unknown negotiation type: TLS");
        }
    }
}
