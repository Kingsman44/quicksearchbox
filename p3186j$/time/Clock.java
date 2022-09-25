package p3186j$.time;

import p3186j$.util.Objects;

/* renamed from: j$.time.Clock */
public abstract class Clock {
    protected Clock() {
    }

    /* renamed from: d */
    public static Clock m71126d() {
        return C40955a.f107276b;
    }

    public static Clock system(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return zoneId == ZoneOffset.UTC ? C40955a.f107276b : new C40955a(zoneId);
    }

    /* renamed from: a */
    public abstract ZoneId mo42991a();

    /* renamed from: b */
    public abstract Instant mo42992b();

    /* renamed from: c */
    public abstract long mo42993c();

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
