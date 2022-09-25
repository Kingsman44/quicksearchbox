package p3186j$.util;

import java.util.Iterator;

/* renamed from: j$.util.a0 */
public abstract class C41059a0 {

    /* renamed from: a */
    private static final Spliterator f107560a = new C41054W();

    /* renamed from: b */
    private static final C41039G f107561b = new C41052U();

    /* renamed from: c */
    private static final C41040H f107562c = new C41053V();

    /* renamed from: d */
    private static final C41038F f107563d = new C41051T();

    /* renamed from: a */
    private static void m71660a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    /* renamed from: b */
    public static C41038F m71661b() {
        return f107563d;
    }

    /* renamed from: c */
    public static C41039G m71662c() {
        return f107561b;
    }

    /* renamed from: d */
    public static C41040H m71663d() {
        return f107562c;
    }

    /* renamed from: e */
    public static Spliterator m71664e() {
        return f107560a;
    }

    /* renamed from: f */
    public static C41334z m71665f(C41038F f) {
        Objects.requireNonNull(f);
        return new C41045M(f);
    }

    /* renamed from: g */
    public static C41034B m71666g(C41039G g) {
        Objects.requireNonNull(g);
        return new C41043K(g);
    }

    /* renamed from: h */
    public static C41036D m71667h(C41040H h) {
        Objects.requireNonNull(h);
        return new C41044L(h);
    }

    /* renamed from: i */
    public static Iterator m71668i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new C41042J(spliterator);
    }

    /* renamed from: j */
    public static C41038F m71669j(double[] dArr, int i, int i2) {
        m71660a(((double[]) Objects.requireNonNull(dArr)).length, i, i2);
        return new C41050S(dArr, i, i2, 1040);
    }

    /* renamed from: k */
    public static C41039G m71670k(int[] iArr, int i, int i2) {
        m71660a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new C41055X(iArr, i, i2, 1040);
    }

    /* renamed from: l */
    public static C41040H m71671l(long[] jArr, int i, int i2) {
        m71660a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new C41057Z(jArr, i, i2, 1040);
    }

    /* renamed from: m */
    public static Spliterator m71672m(Object[] objArr, int i, int i2) {
        m71660a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new C41049Q(objArr, i, i2, 1040);
    }
}
