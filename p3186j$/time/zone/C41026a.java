package p3186j$.time.zone;

import java.io.Serializable;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneOffset;
import p3186j$.util.List;

/* renamed from: j$.time.zone.a */
public final class C41026a implements Comparable, Serializable {

    /* renamed from: a */
    private final long f107469a;

    /* renamed from: b */
    private final LocalDateTime f107470b;

    /* renamed from: c */
    private final ZoneOffset f107471c;

    /* renamed from: d */
    private final ZoneOffset f107472d;

    C41026a(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f107469a = j;
        this.f107470b = LocalDateTime.m71187p(j, 0, zoneOffset);
        this.f107471c = zoneOffset;
        this.f107472d = zoneOffset2;
    }

    C41026a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f107469a = localDateTime.mo43134t(zoneOffset);
        this.f107470b = localDateTime;
        this.f107471c = zoneOffset;
        this.f107472d = zoneOffset2;
    }

    /* renamed from: b */
    public final LocalDateTime mo43393b() {
        return this.f107470b.mo43133r((long) (this.f107472d.mo43201q() - this.f107471c.mo43201q()));
    }

    public final int compareTo(Object obj) {
        return (this.f107469a > ((C41026a) obj).f107469a ? 1 : (this.f107469a == ((C41026a) obj).f107469a ? 0 : -1));
    }

    /* renamed from: d */
    public final LocalDateTime mo43395d() {
        return this.f107470b;
    }

    /* renamed from: e */
    public final Duration mo43396e() {
        return Duration.ofSeconds((long) (this.f107472d.mo43201q() - this.f107471c.mo43201q()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C41026a)) {
            return false;
        }
        C41026a aVar = (C41026a) obj;
        return this.f107469a == aVar.f107469a && this.f107471c.equals(aVar.f107471c) && this.f107472d.equals(aVar.f107472d);
    }

    /* renamed from: g */
    public final ZoneOffset mo43398g() {
        return this.f107472d;
    }

    /* renamed from: h */
    public final ZoneOffset mo43399h() {
        return this.f107471c;
    }

    public final int hashCode() {
        return (this.f107470b.hashCode() ^ this.f107471c.hashCode()) ^ Integer.rotateLeft(this.f107472d.hashCode(), 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final List mo43401k() {
        return mo43402l() ? List.CC.m71630a() : List.CC.m71631b(this.f107471c, this.f107472d);
    }

    /* renamed from: l */
    public final boolean mo43402l() {
        return this.f107472d.mo43201q() > this.f107471c.mo43201q();
    }

    public final long toEpochSecond() {
        return this.f107469a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(mo43402l() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f107470b);
        sb.append(this.f107471c);
        sb.append(" to ");
        sb.append(this.f107472d);
        sb.append(']');
        return sb.toString();
    }
}
