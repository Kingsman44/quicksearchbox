package com.facebook.litho.widget;

/* renamed from: com.facebook.litho.widget.dh */
/* compiled from: PG */
final class C6503dh implements C6426al {

    /* renamed from: a */
    private final int f19275a;

    /* renamed from: b */
    private final int f19276b;

    /* renamed from: c */
    private final int f19277c;

    /* renamed from: d */
    private final int f19278d;

    /* renamed from: e */
    private int f19279e;

    /* renamed from: f */
    private final int[] f19280f;

    /* renamed from: g */
    private int f19281g;

    public C6503dh(int i, int i2, int i3, int i4) {
        this.f19275a = i;
        this.f19276b = i2;
        this.f19277c = i3;
        this.f19278d = i4;
        this.f19280f = new int[i4];
    }

    /* renamed from: a */
    public final int mo13497a() {
        return this.f19281g;
    }

    /* renamed from: b */
    public final void mo13498b(C6491cw cwVar, int i, int i2) {
        int[] iArr = this.f19280f;
        int i3 = this.f19279e;
        int i4 = iArr[i3];
        if (1 == this.f19277c) {
            i = i2;
        }
        int i5 = i4 + i;
        iArr[i3] = i5;
        this.f19281g = Math.max(this.f19281g, i5);
        int i6 = this.f19279e + 1;
        this.f19279e = i6;
        if (i6 == this.f19278d) {
            this.f19279e = 0;
        }
    }

    /* renamed from: c */
    public final boolean mo13499c() {
        return this.f19281g < (this.f19277c == 1 ? this.f19276b : this.f19275a);
    }
}
