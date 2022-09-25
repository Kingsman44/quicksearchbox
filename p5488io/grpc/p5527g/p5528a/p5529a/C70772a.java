package p5488io.grpc.p5527g.p5528a.p5529a;

/* renamed from: io.grpc.g.a.a.a */
/* compiled from: PG */
public enum C70772a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INVALID_STREAM(1),
    UNSUPPORTED_VERSION(1),
    STREAM_IN_USE(1),
    STREAM_ALREADY_CLOSED(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_CLOSED(5),
    FRAME_TOO_LARGE(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13),
    INVALID_CREDENTIALS(-1);
    

    /* renamed from: s */
    public final int f188718s;

    private C70772a(int i) {
        this.f188718s = i;
    }

    /* renamed from: a */
    public static C70772a m103487a(int i) {
        for (C70772a aVar : values()) {
            if (aVar.f188718s == i) {
                return aVar;
            }
        }
        return null;
    }
}
