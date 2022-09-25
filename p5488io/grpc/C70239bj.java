package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* renamed from: io.grpc.bj */
/* compiled from: PG */
public final class C70239bj extends C70698ec {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final SocketAddress f187221a;

    /* renamed from: b */
    public final InetSocketAddress f187222b;

    /* renamed from: c */
    public final String f187223c;

    /* renamed from: d */
    public final String f187224d;

    public C70239bj(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        C58838bb.m90866a(socketAddress, "proxyAddress");
        C58838bb.m90866a(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            C58838bb.m90887v(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f187221a = socketAddress;
        this.f187222b = inetSocketAddress;
        this.f187223c = str;
        this.f187224d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70239bj)) {
            return false;
        }
        C70239bj bjVar = (C70239bj) obj;
        if (!C58832aw.m90831a(this.f187221a, bjVar.f187221a) || !C58832aw.m90831a(this.f187222b, bjVar.f187222b) || !C58832aw.m90831a(this.f187223c, bjVar.f187223c) || !C58832aw.m90831a(this.f187224d, bjVar.f187224d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187221a, this.f187222b, this.f187223c, this.f187224d});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("proxyAddr", this.f187221a);
        b.mo56102b("targetAddr", this.f187222b);
        b.mo56102b("username", this.f187223c);
        b.mo56103c("hasPassword", String.valueOf(this.f187224d != null));
        return b.toString();
    }
}
