package androidx.media3.exoplayer.p150j;

/* renamed from: androidx.media3.exoplayer.j.a */
/* compiled from: PG */
public final class C3193a {

    /* renamed from: a */
    public final long f9581a;

    /* renamed from: b */
    public final long f9582b;

    public C3193a(long j, long j2) {
        this.f9581a = j;
        this.f9582b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3193a)) {
            return false;
        }
        C3193a aVar = (C3193a) obj;
        return this.f9581a == aVar.f9581a && this.f9582b == aVar.f9582b;
    }

    public final int hashCode() {
        return (((int) this.f9581a) * 31) + ((int) this.f9582b);
    }
}
