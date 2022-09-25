package com.facebook.litho;

/* renamed from: com.facebook.litho.f */
/* compiled from: PG */
public final class C6253f implements C6388hm {

    /* renamed from: a */
    private final int f18477a;

    public C6253f() {
        this.f18477a = 1;
    }

    public C6253f(int i) {
        this.f18477a = i;
    }

    /* renamed from: c */
    private static boolean m16797c(int i, int i2, int i3, int i4) {
        return i >= i2 - i4 && i <= i3 + i4;
    }

    /* renamed from: a */
    public final boolean mo13237a(int i, int i2, int i3) {
        return m16797c(i, i2, i3, this.f18477a);
    }

    /* renamed from: b */
    public final boolean mo13238b(int i, int i2, int i3) {
        return !m16797c(i, i2, i3, this.f18477a);
    }
}
