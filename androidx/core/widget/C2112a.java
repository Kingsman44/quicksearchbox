package androidx.core.widget;

/* renamed from: androidx.core.widget.a */
/* compiled from: PG */
final class C2112a {

    /* renamed from: a */
    public int f6055a;

    /* renamed from: b */
    public int f6056b;

    /* renamed from: c */
    public float f6057c;

    /* renamed from: d */
    public float f6058d;

    /* renamed from: e */
    public long f6059e = Long.MIN_VALUE;

    /* renamed from: f */
    public long f6060f = 0;

    /* renamed from: g */
    public long f6061g = -1;

    /* renamed from: h */
    public float f6062h;

    /* renamed from: i */
    public int f6063i;

    /* renamed from: a */
    public final float mo5353a(long j) {
        long j2 = this.f6059e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f6061g;
        if (j3 < 0 || j < j3) {
            return C2116c.m5868a(((float) (j - j2)) / ((float) this.f6055a), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f6062h;
        return (1.0f - f) + (f * C2116c.m5868a(((float) (j - j3)) / ((float) this.f6063i), 0.0f, 1.0f));
    }
}
