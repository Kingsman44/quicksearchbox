package p5488io.grpc;

/* renamed from: io.grpc.fa */
/* compiled from: PG */
public final class C70761fa extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* renamed from: a */
    public final Status f188571a;

    /* renamed from: b */
    public final C70334de f188572b;

    /* renamed from: c */
    private final boolean f188573c;

    public C70761fa(Status status, C70334de deVar, boolean z) {
        super(Status.m102101f(status), status.f186920q);
        this.f188571a = status;
        this.f188572b = deVar;
        this.f188573c = z;
        fillInStackTrace();
    }

    public final synchronized Throwable fillInStackTrace() {
        if (!this.f188573c) {
            return this;
        }
        return super.fillInStackTrace();
    }
}
