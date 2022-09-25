package p5462h.p5480j;

/* renamed from: h.j.i */
/* compiled from: PG */
class C69701i extends C69700h {
    /* renamed from: a */
    public static final float m101119a(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            return f > f3 ? f3 : f;
        }
    }

    /* renamed from: b */
    public static final long m101120b(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        } else if (j < j2) {
            return j2;
        } else {
            return j > j3 ? j3 : j;
        }
    }

    /* renamed from: c */
    public static final C69693a m101121c(int i, int i2) {
        return new C69693a(i, i2, -1);
    }

    /* renamed from: d */
    public static final C69695c m101122d(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C69695c.f186066d;
        }
        return new C69695c(i, i2 - 1);
    }

    /* renamed from: e */
    public static final int m101123e(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
        } else if (i < 0) {
            return 0;
        } else {
            return i > i2 ? i2 : i;
        }
    }
}
