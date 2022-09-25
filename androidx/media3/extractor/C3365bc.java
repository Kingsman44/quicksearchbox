package androidx.media3.extractor;

/* renamed from: androidx.media3.extractor.bc */
/* compiled from: PG */
public final class C3365bc {

    /* renamed from: a */
    public static final C3365bc f10173a = new C3365bc(0, 0);

    /* renamed from: b */
    public final long f10174b;

    /* renamed from: c */
    public final long f10175c;

    public C3365bc(long j, long j2) {
        this.f10174b = j;
        this.f10175c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3365bc bcVar = (C3365bc) obj;
            return this.f10174b == bcVar.f10174b && this.f10175c == bcVar.f10175c;
        }
    }

    public final int hashCode() {
        return (((int) this.f10174b) * 31) + ((int) this.f10175c);
    }

    public final String toString() {
        long j = this.f10174b;
        long j2 = this.f10175c;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
