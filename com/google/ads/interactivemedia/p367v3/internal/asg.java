package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asg */
/* compiled from: PG */
final class asg extends arx {

    /* renamed from: a */
    private final transient ars f21483a;

    /* renamed from: b */
    private final transient arn f21484b;

    public asg(ars ars, arn arn) {
        this.f21483a = ars;
        this.f21484b = arn;
    }

    /* renamed from: a */
    public final asp iterator() {
        return this.f21484b.listIterator();
    }

    public final boolean contains(Object obj) {
        return this.f21483a.get(obj) != null;
    }

    /* renamed from: e */
    public final arn mo15277e() {
        return this.f21484b;
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return true;
    }

    /* renamed from: g */
    public final int mo15279g(Object[] objArr) {
        return this.f21484b.mo15279g(objArr);
    }

    public final int size() {
        return this.f21483a.size();
    }
}
