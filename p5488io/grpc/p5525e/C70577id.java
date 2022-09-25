package p5488io.grpc.p5525e;

import com.evernote.android.state.BuildConfig;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: io.grpc.e.id */
/* compiled from: PG */
final class C70577id {
    /* renamed from: a */
    public static final PasswordAuthentication m103129a(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, BuildConfig.FLAVOR);
        } catch (MalformedURLException unused) {
            C70579if.f188150a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", BuildConfig.FLAVOR, (String) null, url, Authenticator.RequestorType.PROXY);
    }
}
