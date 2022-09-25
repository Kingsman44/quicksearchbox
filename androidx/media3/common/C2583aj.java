package androidx.media3.common;

/* renamed from: androidx.media3.common.aj */
/* compiled from: PG */
public final class C2583aj implements C2668l {

    /* renamed from: a */
    public final long f7126a;

    /* renamed from: b */
    public final long f7127b;

    /* renamed from: c */
    public final long f7128c;

    /* renamed from: d */
    public final float f7129d;

    /* renamed from: e */
    public final float f7130e;

    public C2583aj(C2582ai aiVar) {
        long j = aiVar.f7121a;
        long j2 = aiVar.f7122b;
        long j3 = aiVar.f7123c;
        float f = aiVar.f7124d;
        float f2 = aiVar.f7125e;
        this.f7126a = j;
        this.f7127b = j2;
        this.f7128c = j3;
        this.f7129d = f;
        this.f7130e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2583aj)) {
            return false;
        }
        C2583aj ajVar = (C2583aj) obj;
        return this.f7126a == ajVar.f7126a && this.f7127b == ajVar.f7127b && this.f7128c == ajVar.f7128c && this.f7129d == ajVar.f7129d && this.f7130e == ajVar.f7130e;
    }

    public final int hashCode() {
        long j = this.f7126a;
        long j2 = this.f7127b;
        long j3 = this.f7128c;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.f7129d;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f7130e;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }
}
