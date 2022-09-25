package p5488io.grpc.binder.p5522a;

import java.net.SocketAddress;

/* renamed from: io.grpc.binder.a.r */
/* compiled from: PG */
public final class C70213r extends SocketAddress {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final int f187145a;

    public C70213r(int i) {
        this.f187145a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70213r) || this.f187145a != ((C70213r) obj).f187145a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f187145a;
    }

    public final String toString() {
        int i = this.f187145a;
        return "BoundClientAddress[" + i + "]";
    }
}
