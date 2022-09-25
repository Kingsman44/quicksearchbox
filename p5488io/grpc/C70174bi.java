package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: io.grpc.bi */
/* compiled from: PG */
public final class C70174bi {

    /* renamed from: a */
    public String f187022a;

    /* renamed from: b */
    public String f187023b;

    /* renamed from: c */
    private SocketAddress f187024c;

    /* renamed from: d */
    private InetSocketAddress f187025d;

    /* renamed from: a */
    public final C70239bj mo61745a() {
        return new C70239bj(this.f187024c, this.f187025d, this.f187022a, this.f187023b);
    }

    /* renamed from: b */
    public final void mo61746b(SocketAddress socketAddress) {
        C58838bb.m90866a(socketAddress, "proxyAddress");
        this.f187024c = socketAddress;
    }

    /* renamed from: c */
    public final void mo61747c(InetSocketAddress inetSocketAddress) {
        C58838bb.m90866a(inetSocketAddress, "targetAddress");
        this.f187025d = inetSocketAddress;
    }
}
