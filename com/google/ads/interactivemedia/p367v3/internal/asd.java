package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asd */
/* compiled from: PG */
final class asd extends arn {

    /* renamed from: a */
    static final arn f21475a = new asd(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f21476b;

    /* renamed from: c */
    private final transient int f21477c;

    public asd(Object[] objArr, int i) {
        this.f21476b = objArr;
        this.f21477c = i;
    }

    /* renamed from: b */
    public final Object[] mo15272b() {
        return this.f21476b;
    }

    /* renamed from: c */
    public final int mo15273c() {
        return 0;
    }

    /* renamed from: d */
    public final int mo15276d() {
        return this.f21477c;
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return false;
    }

    /* renamed from: g */
    public final int mo15279g(Object[] objArr) {
        System.arraycopy(this.f21476b, 0, objArr, 0, this.f21477c);
        return this.f21477c;
    }

    public final Object get(int i) {
        aqd.m19281i(i, this.f21477c);
        return this.f21476b[i];
    }

    public final int size() {
        return this.f21477c;
    }
}
