package androidx.camera.core.p069a;

/* renamed from: androidx.camera.core.a.i */
/* compiled from: PG */
public final class C1382i extends C1362cv {

    /* renamed from: a */
    private final int f3892a;

    /* renamed from: b */
    private final int f3893b;

    public C1382i(int i, int i2) {
        this.f3892a = i;
        this.f3893b = i2;
    }

    /* renamed from: a */
    public final int mo4252a() {
        return this.f3893b;
    }

    /* renamed from: b */
    public final int mo4253b() {
        return this.f3892a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1362cv) {
            C1362cv cvVar = (C1362cv) obj;
            return this.f3892a == cvVar.mo4253b() && this.f3893b == cvVar.mo4252a();
        }
    }

    public final int hashCode() {
        return ((this.f3892a ^ 1000003) * 1000003) ^ this.f3893b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.f3892a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "RAW" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        int i2 = this.f3893b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "MAXIMUM" : "RECORD" : "PREVIEW" : "VGA");
        sb.append("}");
        return sb.toString();
    }
}
