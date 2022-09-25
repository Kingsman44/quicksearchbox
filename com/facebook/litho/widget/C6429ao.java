package com.facebook.litho.widget;

/* renamed from: com.facebook.litho.widget.ao */
/* compiled from: PG */
public final class C6429ao implements C6426al {

    /* renamed from: a */
    private final int f19076a;

    /* renamed from: b */
    private final int f19077b;

    /* renamed from: c */
    private final int f19078c;

    /* renamed from: d */
    private int f19079d;

    public C6429ao(int i, int i2, int i3) {
        this.f19076a = i;
        this.f19077b = i2;
        this.f19078c = i3;
    }

    /* renamed from: a */
    public final int mo13497a() {
        return this.f19079d;
    }

    /* renamed from: b */
    public final void mo13498b(C6491cw cwVar, int i, int i2) {
        int i3 = this.f19079d;
        if (this.f19078c == 1) {
            i = i2;
        }
        this.f19079d = i3 + i;
    }

    /* renamed from: c */
    public final boolean mo13499c() {
        return this.f19079d < (this.f19078c == 1 ? this.f19077b : this.f19076a);
    }
}
