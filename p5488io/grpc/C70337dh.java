package p5488io.grpc;

/* renamed from: io.grpc.dh */
/* compiled from: PG */
public enum C70337dh {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    /* renamed from: a */
    public final boolean mo62041a() {
        return this == UNARY || this == SERVER_STREAMING;
    }

    /* renamed from: b */
    public final boolean mo62042b() {
        return this == UNARY || this == CLIENT_STREAMING;
    }
}
