package p3186j$.time;

import java.io.Serializable;

/* renamed from: j$.time.a */
final class C40955a extends Clock implements Serializable {

    /* renamed from: b */
    static final C40955a f107276b = new C40955a(ZoneOffset.UTC);

    /* renamed from: a */
    private final ZoneId f107277a;

    static {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
    }

    C40955a(ZoneId zoneId) {
        this.f107277a = zoneId;
    }

    /* renamed from: a */
    public final ZoneId mo42991a() {
        return this.f107277a;
    }

    /* renamed from: b */
    public final Instant mo42992b() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    /* renamed from: c */
    public final long mo42993c() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C40955a)) {
            return false;
        }
        return this.f107277a.equals(((C40955a) obj).f107277a);
    }

    public final int hashCode() {
        return this.f107277a.hashCode() + 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f107277a);
        return "SystemClock[" + valueOf + "]";
    }
}
