package com.google.common.p4522b;

/* renamed from: com.google.common.b.gy */
/* compiled from: PG */
final class C58489gy {

    /* renamed from: a */
    private final Object f156118a;

    /* renamed from: b */
    private final Object f156119b;

    /* renamed from: c */
    private final Object f156120c;

    public C58489gy(Object obj, Object obj2, Object obj3) {
        this.f156118a = obj;
        this.f156119b = obj2;
        this.f156120c = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo55426a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f156118a + "=" + this.f156119b + " and " + this.f156118a + "=" + this.f156120c);
    }
}
