package p5488io.grpc.p5527g.p5528a;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: io.grpc.g.a.l */
/* compiled from: PG */
final class C70799l extends C70803p {

    /* renamed from: d */
    private final C70795h f188799d;

    /* renamed from: e */
    private final C70795h f188800e;

    /* renamed from: f */
    private final C70795h f188801f;

    /* renamed from: g */
    private final C70795h f188802g;

    /* renamed from: h */
    private final int f188803h;

    public C70799l(C70795h hVar, C70795h hVar2, C70795h hVar3, C70795h hVar4, Provider provider, int i) {
        super(provider);
        this.f188799d = hVar;
        this.f188800e = hVar2;
        this.f188801f = hVar3;
        this.f188802g = hVar4;
        this.f188803h = i;
    }

    /* renamed from: a */
    public final String mo62505a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.f188801f.mo62500b(sSLSocket) && (bArr = (byte[]) this.f188801f.mo62499a(sSLSocket, new Object[0])) != null) {
            return new String(bArr, C70806s.f188833b);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo62506b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f188799d.mo62501c(sSLSocket, true);
            this.f188800e.mo62501c(sSLSocket, str);
        }
        if (this.f188802g.mo62500b(sSLSocket)) {
            this.f188802g.mo62499a(sSLSocket, m103566e(list));
        }
    }

    /* renamed from: c */
    public final int mo62507c() {
        return this.f188803h;
    }
}
