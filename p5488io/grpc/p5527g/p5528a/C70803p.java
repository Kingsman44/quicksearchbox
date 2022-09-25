package p5488io.grpc.p5527g.p5528a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import p5589m.C71828e;

/* renamed from: io.grpc.g.a.p */
/* compiled from: PG */
public class C70803p {

    /* renamed from: a */
    public static final Logger f188815a = Logger.getLogger(C70803p.class.getName());

    /* renamed from: b */
    public static final C70803p f188816b = m103567f();

    /* renamed from: d */
    private static final String[] f188817d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: c */
    public final Provider f188818c;

    public C70803p(Provider provider) {
        this.f188818c = provider;
    }

    /* renamed from: e */
    public static byte[] m103566e(List list) {
        C71828e eVar = new C71828e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C70804q qVar = (C70804q) list.get(i);
            if (qVar != C70804q.HTTP_1_0) {
                eVar.mo63087v(qVar.f188824e.length());
                eVar.mo63059A(qVar.f188824e);
            }
        }
        return eVar.mo63081r(eVar.f191356b);
    }

    /* renamed from: f */
    private static C70803p m103567f() {
        Provider provider;
        int i;
        Class<C70803p> cls = C70803p.class;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                f188815a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            String[] strArr = f188817d;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    f188815a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider != null) {
            C70795h hVar = new C70795h((Class) null, "setUseSessionTickets", Boolean.TYPE);
            C70795h hVar2 = new C70795h((Class) null, "setHostname", String.class);
            Class<byte[]> cls2 = byte[].class;
            C70795h hVar3 = new C70795h(cls2, "getAlpnSelectedProtocol", new Class[0]);
            C70795h hVar4 = new C70795h((Class) null, "setAlpnProtocols", cls2);
            try {
                Class<?> cls3 = Class.forName("android.net.TrafficStats");
                cls3.getMethod("tagSocket", new Class[]{Socket.class});
                cls3.getMethod("untagSocket", new Class[]{Socket.class});
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    cls.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    f188815a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", e);
                    try {
                        cls.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e2) {
                        f188815a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", e2);
                        i = 3;
                    }
                }
            }
            i = 1;
            return new C70799l(hVar, hVar2, hVar3, hVar4, provider, i);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                SSLContext instance = SSLContext.getInstance("TLS", provider3);
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                ((Method) AccessController.doPrivileged(new C70796i())).invoke(instance.createSSLEngine(), new Object[0]);
                return new C70800m(provider3, (Method) AccessController.doPrivileged(new C70797j()), (Method) AccessController.doPrivileged(new C70798k()));
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                try {
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
                    return new C70801n(cls4.getMethod("put", new Class[]{SSLSocket.class, cls5}), cls4.getMethod("get", new Class[]{SSLSocket.class}), cls4.getMethod("remove", new Class[]{SSLSocket.class}), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider"), provider3);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new C70803p(provider3);
                }
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public String mo62505a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: b */
    public void mo62506b(SSLSocket sSLSocket, String str, List list) {
    }

    /* renamed from: c */
    public int mo62507c() {
        return 3;
    }

    /* renamed from: d */
    public void mo62508d(SSLSocket sSLSocket) {
    }
}
