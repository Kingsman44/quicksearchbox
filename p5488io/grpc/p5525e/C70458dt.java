package p5488io.grpc.p5525e;

import p5488io.grpc.Status;

/* renamed from: io.grpc.e.dt */
/* compiled from: PG */
public enum C70458dt {
    NO_ERROR(0, Status.f186916n),
    PROTOCOL_ERROR(1, Status.f186915m),
    INTERNAL_ERROR(2, Status.f186915m),
    FLOW_CONTROL_ERROR(3, Status.f186915m),
    SETTINGS_TIMEOUT(4, Status.f186915m),
    STREAM_CLOSED(5, Status.f186915m),
    FRAME_SIZE_ERROR(6, Status.f186915m),
    REFUSED_STREAM(7, Status.f186916n),
    CANCEL(8, Status.f186904b),
    COMPRESSION_ERROR(9, Status.f186915m),
    CONNECT_ERROR(10, Status.f186915m),
    ENHANCE_YOUR_CALM(11, Status.f186911i.withDescription("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, Status.f186909g.withDescription("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, Status.f186905c);
    

    /* renamed from: o */
    public static final C70458dt[] f187778o = null;

    /* renamed from: p */
    public final Status f187780p;

    /* renamed from: r */
    private final int f187781r;

    static {
        C70458dt[] values = values();
        C70458dt[] dtVarArr = new C70458dt[(((int) ((long) values[r1 - 1].f187781r)) + 1)];
        for (C70458dt dtVar : values) {
            dtVarArr[(int) ((long) dtVar.f187781r)] = dtVar;
        }
        f187778o = dtVarArr;
    }

    private C70458dt(int i, Status status) {
        this.f187781r = i;
        String concat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (status.getDescription() != null) {
            concat = concat + " (" + status.getDescription() + ")";
        }
        this.f187780p = status.withDescription(concat);
    }
}
