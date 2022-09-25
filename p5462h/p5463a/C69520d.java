package p5462h.p5463a;

/* renamed from: h.a.d */
/* compiled from: PG */
public final class C69520d {
    /* renamed from: a */
    public static final void m100898a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* renamed from: b */
    public static final void m100899b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* renamed from: c */
    public static final void m100900c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        } else if (i > i2) {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }
}
