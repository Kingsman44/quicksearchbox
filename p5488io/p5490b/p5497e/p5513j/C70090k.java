package p5488io.p5490b.p5497e.p5513j;

/* renamed from: io.b.e.j.k */
/* compiled from: PG */
public final class C70090k {

    /* renamed from: a */
    public int f186821a;

    /* renamed from: b */
    public int f186822b;

    /* renamed from: c */
    public int f186823c;

    /* renamed from: d */
    public Object[] f186824d;

    public C70090k() {
        int a = C70091l.m101994a(16);
        this.f186821a = a - 1;
        this.f186823c = (int) (((float) a) * 0.75f);
        this.f186824d = new Object[a];
    }

    /* renamed from: a */
    public static int m101992a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: b */
    public final void mo61631b(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f186822b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int a = m101992a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
