package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import p5488io.grpc.p5527g.p5528a.C70803p;

/* renamed from: io.grpc.g.ad */
/* compiled from: PG */
class C70810ad {

    /* renamed from: a */
    public static final Logger f188857a;

    /* renamed from: b */
    public static final C70810ad f188858b;

    /* renamed from: d */
    private static final C70803p f188859d = C70803p.f188816b;

    /* renamed from: c */
    protected final C70803p f188860c;

    static {
        C70810ad adVar;
        Class<C70810ad> cls = C70810ad.class;
        f188857a = Logger.getLogger(cls.getName());
        ClassLoader classLoader = cls.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f188857a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f188857a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", e2);
                adVar = new C70810ad(f188859d);
            }
        }
        adVar = new C70809ac(f188859d);
        f188858b = adVar;
    }

    public C70810ad(C70803p pVar) {
        C58838bb.m90866a(pVar, "platform");
        this.f188860c = pVar;
    }

    /* renamed from: a */
    public String mo62518a(SSLSocket sSLSocket) {
        return this.f188860c.mo62505a(sSLSocket);
    }

    /* renamed from: b */
    public String mo62519b(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            mo62520c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String a = mo62518a(sSLSocket);
            if (a != null) {
                return a;
            }
            String valueOf = String.valueOf(list);
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + valueOf);
        } finally {
            this.f188860c.mo62508d(sSLSocket);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62520c(SSLSocket sSLSocket, String str, List list) {
        this.f188860c.mo62506b(sSLSocket, str, list);
    }
}
