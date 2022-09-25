package p5462h.p5470d;

/* renamed from: h.d.d */
/* compiled from: PG */
public final class C69595d {
    /* renamed from: a */
    public static final int m101009a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - m101010b(i2, i, i3);
            }
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i > i2) {
            return i2 + m101010b(i, i2, 1);
        }
        return i2;
    }

    /* renamed from: b */
    private static final int m101010b(int i, int i2, int i3) {
        return m101011c(m101011c(i, i3) - m101011c(i2, i3), i3);
    }

    /* renamed from: c */
    private static final int m101011c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
