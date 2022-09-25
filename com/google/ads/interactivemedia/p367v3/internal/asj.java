package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asj */
/* compiled from: PG */
final class asj extends arx {

    /* renamed from: a */
    static final asj f21492a = new asj(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: b */
    final transient Object[] f21493b;

    /* renamed from: c */
    final transient Object[] f21494c;

    /* renamed from: d */
    private final transient int f21495d;

    /* renamed from: e */
    private final transient int f21496e;

    /* renamed from: f */
    private final transient int f21497f;

    public asj(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f21493b = objArr;
        this.f21494c = objArr2;
        this.f21495d = i2;
        this.f21496e = i;
        this.f21497f = i3;
    }

    /* renamed from: a */
    public final asp iterator() {
        return mo15277e().listIterator();
    }

    /* renamed from: b */
    public final Object[] mo15272b() {
        return this.f21493b;
    }

    /* renamed from: c */
    public final int mo15273c() {
        return 0;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f21494c;
        if (obj == null || objArr == null) {
            return false;
        }
        int c = ary.m19450c(obj);
        while (true) {
            int i = c & this.f21495d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    /* renamed from: d */
    public final int mo15276d() {
        return this.f21497f;
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return false;
    }

    /* renamed from: g */
    public final int mo15279g(Object[] objArr) {
        System.arraycopy(this.f21493b, 0, objArr, 0, this.f21497f);
        return this.f21497f;
    }

    public final int hashCode() {
        return this.f21496e;
    }

    /* renamed from: l */
    public final boolean mo15336l() {
        return true;
    }

    /* renamed from: m */
    public final arn mo15337m() {
        return arn.m19408o(this.f21493b, this.f21497f);
    }

    public final int size() {
        return this.f21497f;
    }
}
