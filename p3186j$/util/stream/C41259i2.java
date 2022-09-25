package p3186j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.i2 */
enum C41259i2 {
    DISTINCT(0, r2),
    SORTED(1, r6),
    ORDERED(2, r8),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r14);
    

    /* renamed from: f */
    static final int f107922f = 0;

    /* renamed from: g */
    static final int f107923g = 0;

    /* renamed from: h */
    static final int f107924h = 0;

    /* renamed from: i */
    private static final int f107925i = 0;

    /* renamed from: j */
    private static final int f107926j = 0;

    /* renamed from: k */
    private static final int f107927k = 0;

    /* renamed from: l */
    static final int f107928l = 0;

    /* renamed from: m */
    static final int f107929m = 0;

    /* renamed from: n */
    static final int f107930n = 0;

    /* renamed from: o */
    static final int f107931o = 0;

    /* renamed from: p */
    static final int f107932p = 0;

    /* renamed from: q */
    static final int f107933q = 0;

    /* renamed from: r */
    static final int f107934r = 0;

    /* renamed from: s */
    static final int f107935s = 0;

    /* renamed from: t */
    static final int f107936t = 0;

    /* renamed from: u */
    static final int f107937u = 0;

    /* renamed from: a */
    private final Map f107939a;

    /* renamed from: b */
    private final int f107940b;

    /* renamed from: c */
    private final int f107941c;

    /* renamed from: d */
    private final int f107942d;

    /* renamed from: e */
    private final int f107943e;

    static {
        C41255h2 h2Var;
        C41255h2 h2Var2;
        C41255h2 h2Var3;
        int i;
        C41255h2 h2Var4;
        C41255h2 h2Var5;
        f107922f = m72150d(h2Var);
        f107923g = m72150d(h2Var2);
        f107924h = m72150d(h2Var3);
        m72150d(h2Var4);
        m72150d(h2Var5);
        int i2 = 0;
        for (C41259i2 i2Var : values()) {
            i2 |= i2Var.f107943e;
        }
        f107925i = i2;
        int i3 = f107923g;
        f107926j = i3;
        int i4 = i3 << 1;
        f107927k = i4;
        f107928l = i3 | i4;
        C41259i2 i2Var2 = DISTINCT;
        f107929m = i2Var2.f107941c;
        f107930n = i2Var2.f107942d;
        C41259i2 i2Var3 = SORTED;
        f107931o = i2Var3.f107941c;
        f107932p = i2Var3.f107942d;
        C41259i2 i2Var4 = ORDERED;
        f107933q = i2Var4.f107941c;
        f107934r = i2Var4.f107942d;
        C41259i2 i2Var5 = SIZED;
        f107935s = i2Var5.f107941c;
        f107936t = i2Var5.f107942d;
        f107937u = SHORT_CIRCUIT.f107941c;
    }

    private C41259i2(int i, C41251g2 g2Var) {
        C41255h2[] values = C41255h2.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            Map map = g2Var.f107908a;
            if (i2 < length) {
                Map.EL.putIfAbsent(map, values[i2], 0);
                i2++;
            } else {
                this.f107939a = map;
                int i3 = i * 2;
                this.f107940b = i3;
                this.f107941c = 1 << i3;
                this.f107942d = 2 << i3;
                this.f107943e = 3 << i3;
                return;
            }
        }
    }

    /* renamed from: b */
    static int m72149b(int i, int i2) {
        return i | (i2 & (i == 0 ? f107925i : ((((f107926j & i) << 1) | i) | ((f107927k & i) >> 1)) ^ -1));
    }

    /* renamed from: d */
    private static int m72150d(C41255h2 h2Var) {
        int i = 0;
        for (C41259i2 i2Var : values()) {
            i |= ((Integer) i2Var.f107939a.get(h2Var)).intValue() << i2Var.f107940b;
        }
        return i;
    }

    /* renamed from: e */
    static int m72151e(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i = characteristics & 4;
        int i2 = f107922f;
        return (i == 0 || spliterator.getComparator() == null) ? characteristics & i2 : characteristics & i2 & -5;
    }

    /* renamed from: k */
    private static C41251g2 m72152k(C41255h2 h2Var) {
        C41251g2 g2Var = new C41251g2(new EnumMap(C41255h2.class));
        g2Var.mo43854a(h2Var);
        return g2Var;
    }

    /* renamed from: l */
    static int m72153l(int i) {
        return i & ((i ^ -1) >> 1) & f107926j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo43855g(int i) {
        return (i & this.f107943e) == this.f107941c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo43856h(int i) {
        int i2 = this.f107943e;
        return (i & i2) == i2;
    }
}
