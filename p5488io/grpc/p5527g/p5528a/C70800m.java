package p5488io.grpc.p5527g.p5528a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: io.grpc.g.a.m */
/* compiled from: PG */
final class C70800m extends C70803p {

    /* renamed from: d */
    private final Method f188804d;

    /* renamed from: e */
    private final Method f188805e;

    public C70800m(Provider provider, Method method, Method method2) {
        super(provider);
        this.f188804d = method;
        this.f188805e = method2;
    }

    /* renamed from: a */
    public final String mo62505a(SSLSocket sSLSocket) {
        try {
            return (String) this.f188805e.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    public final void mo62506b(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C70804q qVar = (C70804q) it.next();
            if (qVar != C70804q.HTTP_1_0) {
                arrayList.add(qVar.f188824e);
            }
        }
        try {
            this.f188804d.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public final int mo62507c() {
        return 1;
    }
}
