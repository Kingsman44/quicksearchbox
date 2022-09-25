package p5488io.p5490b.p5497e.p5499b;

/* renamed from: io.b.e.b.j */
/* compiled from: PG */
public final class C69841j {
    /* renamed from: a */
    public static boolean m101336a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    public static void m101337b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: c */
    public static void m101338c(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " > 0 required but it was " + i);
        }
    }
}
