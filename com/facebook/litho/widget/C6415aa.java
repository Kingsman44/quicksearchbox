package com.facebook.litho.widget;

/* renamed from: com.facebook.litho.widget.aa */
/* compiled from: PG */
final class C6415aa implements C6426al {

    /* renamed from: a */
    private final int f19039a;

    /* renamed from: b */
    private final int f19040b;

    /* renamed from: c */
    private final int f19041c;

    /* renamed from: d */
    private final int f19042d;

    /* renamed from: e */
    private int f19043e;

    /* renamed from: f */
    private int f19044f;

    public C6415aa(int i, int i2, int i3, int i4) {
        this.f19039a = i;
        this.f19040b = i2;
        this.f19041c = i3;
        this.f19042d = i4;
    }

    /* renamed from: a */
    public final int mo13497a() {
        return this.f19043e;
    }

    /* renamed from: b */
    public final void mo13498b(C6491cw cwVar, int i, int i2) {
        if (this.f19044f == 0) {
            int i3 = this.f19043e;
            if (this.f19041c == 1) {
                i = i2;
            }
            this.f19043e = i3 + i;
        }
        if (cwVar.mo13530l()) {
            this.f19044f = 0;
            return;
        }
        int a = this.f19044f + cwVar.mo13519a();
        this.f19044f = a;
        if (a == this.f19042d) {
            this.f19044f = 0;
        }
    }

    /* renamed from: c */
    public final boolean mo13499c() {
        return this.f19043e < (this.f19041c == 1 ? this.f19040b : this.f19039a);
    }
}
