package p5488io.grpc;

/* renamed from: io.grpc.StatusException */
/* compiled from: PG */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* renamed from: a */
    public final Status f186943a;

    /* renamed from: b */
    public final C70334de f186944b;

    /* renamed from: c */
    private final boolean f186945c = true;

    public StatusException(Status status, C70334de deVar) {
        super(Status.m102101f(status), status.f186920q);
        this.f186943a = status;
        this.f186944b = deVar;
        fillInStackTrace();
    }

    public final synchronized Throwable fillInStackTrace() {
        if (!this.f186945c) {
            return this;
        }
        return super.fillInStackTrace();
    }
}
