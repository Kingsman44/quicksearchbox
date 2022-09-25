package p5488io.grpc.p5527g.p5528a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: io.grpc.g.a.n */
/* compiled from: PG */
final class C70801n extends C70803p {

    /* renamed from: d */
    private final Method f188806d;

    /* renamed from: e */
    private final Method f188807e;

    /* renamed from: f */
    private final Method f188808f;

    /* renamed from: g */
    private final Class f188809g;

    /* renamed from: h */
    private final Class f188810h;

    public C70801n(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f188806d = method;
        this.f188807e = method2;
        this.f188808f = method3;
        this.f188809g = cls;
        this.f188810h = cls2;
    }

    /* renamed from: a */
    public final String mo62505a(SSLSocket sSLSocket) {
        try {
            C70802o oVar = (C70802o) Proxy.getInvocationHandler(this.f188807e.invoke((Object) null, new Object[]{sSLSocket}));
            int i = C70802o.f188811c;
            if (oVar.f188812a) {
                return null;
            }
            String str = oVar.f188813b;
            if (str != null) {
                return str;
            }
            f188815a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (InvocationTargetException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public final void mo62506b(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C70804q qVar = (C70804q) list.get(i);
            if (qVar != C70804q.HTTP_1_0) {
                arrayList.add(qVar.f188824e);
            }
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C70803p.class.getClassLoader(), new Class[]{this.f188809g, this.f188810h}, new C70802o(arrayList));
            this.f188806d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: c */
    public final int mo62507c() {
        return 1;
    }

    /* renamed from: d */
    public final void mo62508d(SSLSocket sSLSocket) {
        try {
            this.f188808f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            f188815a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", e);
        }
    }
}
