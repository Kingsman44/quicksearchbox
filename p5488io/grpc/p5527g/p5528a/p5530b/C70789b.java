package p5488io.grpc.p5527g.p5528a.p5530b;

/* renamed from: io.grpc.g.a.b.b */
/* compiled from: PG */
public final class C70789b {

    /* renamed from: a */
    public final String f188777a;

    /* renamed from: b */
    public final int f188778b;

    /* renamed from: c */
    private final String f188779c;

    public C70789b(C70788a aVar) {
        this.f188777a = aVar.f188775b;
        this.f188778b = aVar.mo62486a();
        this.f188779c = aVar.toString();
    }

    /* renamed from: a */
    public static int m103540a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: b */
    public static int m103541b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C70789b) && ((C70789b) obj).f188779c.equals(this.f188779c);
    }

    public final int hashCode() {
        return this.f188779c.hashCode();
    }

    public final String toString() {
        return this.f188779c;
    }
}
