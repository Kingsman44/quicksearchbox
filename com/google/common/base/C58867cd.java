package com.google.common.base;

/* renamed from: com.google.common.base.cd */
/* compiled from: PG */
abstract class C58867cd extends C58863c {

    /* renamed from: c */
    final CharSequence f156668c;

    /* renamed from: d */
    final C58912v f156669d;

    /* renamed from: e */
    final boolean f156670e;

    /* renamed from: f */
    int f156671f = 0;

    /* renamed from: g */
    int f156672g;

    protected C58867cd(C58869cf cfVar, CharSequence charSequence) {
        this.f156669d = cfVar.f156673a;
        this.f156670e = cfVar.f156674b;
        this.f156672g = cfVar.f156675c;
        this.f156668c = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56148a() {
        int i;
        int i2;
        int i3 = this.f156671f;
        while (true) {
            int i4 = this.f156671f;
            if (i4 != -1) {
                int c = mo56146c(i4);
                if (c == -1) {
                    c = this.f156668c.length();
                    this.f156671f = -1;
                    i = -1;
                } else {
                    i = mo56145b(c);
                    this.f156671f = i;
                }
                if (i == i3) {
                    int i5 = i + 1;
                    this.f156671f = i5;
                    if (i5 > this.f156668c.length()) {
                        this.f156671f = -1;
                    }
                } else {
                    while (i3 < c && this.f156669d.mo56144c(this.f156668c.charAt(i3))) {
                        i3++;
                    }
                    while (i2 > i3) {
                        int i6 = i2 - 1;
                        if (!this.f156669d.mo56144c(this.f156668c.charAt(i6))) {
                            break;
                        }
                        c = i6;
                    }
                    if (!this.f156670e || i3 != i2) {
                        int i7 = this.f156672g;
                    } else {
                        i3 = this.f156671f;
                    }
                }
            } else {
                this.f156663a = 3;
                return null;
            }
        }
        int i72 = this.f156672g;
        if (i72 == 1) {
            i2 = this.f156668c.length();
            this.f156671f = -1;
            while (i2 > i3) {
                int i8 = i2 - 1;
                if (!this.f156669d.mo56144c(this.f156668c.charAt(i8))) {
                    break;
                }
                i2 = i8;
            }
        } else {
            this.f156672g = i72 - 1;
        }
        return this.f156668c.subSequence(i3, i2).toString();
    }

    /* renamed from: b */
    public abstract int mo56145b(int i);

    /* renamed from: c */
    public abstract int mo56146c(int i);
}
