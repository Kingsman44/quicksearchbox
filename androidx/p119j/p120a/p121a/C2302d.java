package androidx.p119j.p120a.p121a;

/* renamed from: androidx.j.a.a.d */
/* compiled from: PG */
public final class C2302d {
    /* renamed from: a */
    public static float m6236a(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = fArr[min];
        return f2 + (((f - (((float) min) * 0.005f)) / 0.005f) * (fArr[min + 1] - f2));
    }
}
