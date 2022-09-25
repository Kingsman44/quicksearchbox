package androidx.media3.exoplayer.dash.p141a;

/* renamed from: androidx.media3.exoplayer.dash.a.q */
/* compiled from: PG */
public final class C2926q {

    /* renamed from: a */
    final long f8381a;

    /* renamed from: b */
    final long f8382b;

    public C2926q(long j, long j2) {
        this.f8381a = j;
        this.f8382b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2926q qVar = (C2926q) obj;
            return this.f8381a == qVar.f8381a && this.f8382b == qVar.f8382b;
        }
    }

    public final int hashCode() {
        return (((int) this.f8381a) * 31) + ((int) this.f8382b);
    }
}
