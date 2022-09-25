package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p5488io.grpc.p5527g.p5528a.C70787b;
import p5488io.grpc.p5527g.p5528a.C70790c;
import p5488io.grpc.p5527g.p5528a.C70794g;
import p5488io.grpc.p5527g.p5528a.C70804q;
import p5488io.grpc.p5527g.p5528a.C70806s;

/* renamed from: io.grpc.g.af */
/* compiled from: PG */
final class C70812af {

    /* renamed from: a */
    static final List f188862a = Collections.unmodifiableList(Arrays.asList(new C70804q[]{C70804q.HTTP_2}));

    /* renamed from: a */
    public static SSLSocket m103596a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, C70790c cVar) {
        C70804q qVar;
        C58838bb.m90866a(socket, "socket");
        C58838bb.m90866a(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        List list = null;
        String[] strArr = cVar.f188783c != null ? (String[]) C70806s.m103574b(String.class, cVar.f188783c, sSLSocket.getEnabledCipherSuites()) : null;
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C70787b bVar = new C70787b(cVar);
        bVar.mo62483b(strArr);
        bVar.mo62485d((String[]) C70806s.m103574b(String.class, cVar.f188784d, enabledProtocols));
        C70790c cVar2 = new C70790c(bVar);
        sSLSocket.setEnabledProtocols(cVar2.f188784d);
        String[] strArr2 = cVar2.f188783c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        C70810ad adVar = C70810ad.f188858b;
        if (cVar.f188785e) {
            list = f188862a;
        }
        String b = adVar.mo62519b(sSLSocket, str, list);
        List list2 = f188862a;
        if (b.equals(C70804q.HTTP_1_0.f188824e)) {
            qVar = C70804q.HTTP_1_0;
        } else if (b.equals(C70804q.HTTP_1_1.f188824e)) {
            qVar = C70804q.HTTP_1_1;
        } else if (b.equals(C70804q.HTTP_2.f188824e)) {
            qVar = C70804q.HTTP_2;
        } else if (b.equals(C70804q.SPDY_3.f188824e)) {
            qVar = C70804q.SPDY_3;
        } else {
            throw new IOException("Unexpected protocol: ".concat(String.valueOf(b)));
        }
        boolean contains = list2.contains(qVar);
        String valueOf = String.valueOf(list2);
        C58838bb.m90887v(contains, "Only " + valueOf + " are supported, but negotiated protocol is %s", b);
        if (hostnameVerifier == null) {
            hostnameVerifier = C70794g.f188794a;
        }
        if (hostnameVerifier.verify((!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(String.valueOf(str)));
    }
}
