package p5488io.grpc.p5525e;

import com.google.common.base.C58881cr;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70174bi;
import p5488io.grpc.C70698ec;
import p5488io.grpc.C70699ed;

/* renamed from: io.grpc.e.if */
/* compiled from: PG */
final class C70579if implements C70699ed {

    /* renamed from: a */
    public static final Logger f188150a = Logger.getLogger(C70579if.class.getName());

    /* renamed from: c */
    private static final C58881cr f188151c = new C70578ie();

    /* renamed from: d */
    private static final C70577id f188152d = new C70577id();

    /* renamed from: b */
    public final InetSocketAddress f188153b;

    public C70579if() {
        C58881cr crVar = f188151c;
        C70577id idVar = f188152d;
        String str = System.getenv("GRPC_PROXY_EXP");
        crVar.getClass();
        idVar.getClass();
        if (str != null) {
            String[] split = str.split(":", 2);
            int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
            f188150a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.f188153b = new InetSocketAddress(split[0], parseInt);
            return;
        }
        this.f188153b = null;
    }

    /* renamed from: a */
    public static final C70698ec m103131a(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", (String) null, C70460dv.m102878f(inetSocketAddress), inetSocketAddress.getPort(), (String) null, (String) null, (String) null);
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    f188150a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f188150a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = C70577id.m103129a(C70460dv.m102878f(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C70174bi biVar = new C70174bi();
                biVar.mo61747c(inetSocketAddress);
                biVar.mo61746b(inetSocketAddress2);
                if (a == null) {
                    return biVar.mo61745a();
                }
                biVar.f187022a = a.getUserName();
                if (a.getPassword() != null) {
                    str = new String(a.getPassword());
                }
                biVar.f187023b = str;
                return biVar.mo61745a();
            } catch (URISyntaxException e) {
                f188150a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", e);
                return null;
            }
        } catch (Throwable th) {
            f188150a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
