package com.facebook.litho.widget;

/* renamed from: com.facebook.litho.widget.s */
/* compiled from: PG */
final class C6554s implements C6426al {

    /* renamed from: a */
    private final int f19521a;

    /* renamed from: b */
    private final int f19522b;

    /* renamed from: c */
    private final int f19523c;

    /* renamed from: d */
    private final int f19524d;

    /* renamed from: e */
    private int f19525e;

    /* renamed from: f */
    private final int[] f19526f;

    /* renamed from: g */
    private int f19527g;

    public C6554s(int i, int i2, int i3, int i4) {
        this.f19521a = i;
        this.f19522b = i2;
        this.f19523c = i3;
        this.f19524d = i4;
        this.f19526f = new int[i4];
    }

    /* renamed from: a */
    public final int mo13497a() {
        return this.f19527g;
    }

    /* renamed from: b */
    public final void mo13498b(C6491cw cwVar, int i, int i2) {
        int[] iArr = this.f19526f;
        int i3 = this.f19525e;
        int i4 = iArr[i3];
        if (1 == this.f19523c) {
            i = i2;
        }
        int i5 = i4 + i;
        iArr[i3] = i5;
        this.f19527g = Math.max(this.f19527g, i5);
        int i6 = this.f19525e + 1;
        this.f19525e = i6;
        if (i6 == this.f19524d) {
            this.f19525e = 0;
        }
    }

    /* renamed from: c */
    public final boolean mo13499c() {
        return this.f19527g < (this.f19523c == 1 ? this.f19522b : this.f19521a);
    }
}
