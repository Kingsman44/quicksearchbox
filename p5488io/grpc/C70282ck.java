package p5488io.grpc;

/* renamed from: io.grpc.ck */
/* compiled from: PG */
public abstract class C70282ck {

    /* renamed from: a */
    public static final C70163b f187354a = new C70163b("internal:health-checking-config");

    /* renamed from: b */
    private int f187355b;

    /* renamed from: a */
    public abstract void mo61959a(Status status);

    /* renamed from: b */
    public void mo61960b(C70278cg cgVar) {
        throw null;
    }

    /* renamed from: c */
    public abstract void mo61961c();

    /* renamed from: d */
    public boolean mo61962d(C70278cg cgVar) {
        if (cgVar.f187351a.isEmpty()) {
            Status status = Status.f186916n;
            mo61959a(status.withDescription("NameResolver returned no usable address. addrs=" + cgVar.f187351a + ", attrs=" + cgVar.f187352b));
            return false;
        }
        int i = this.f187355b;
        this.f187355b = i + 1;
        if (i == 0) {
            mo61960b(cgVar);
        }
        this.f187355b = 0;
        return true;
    }
}
