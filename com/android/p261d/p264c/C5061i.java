package com.android.p261d.p264c;

/* renamed from: com.android.d.c.i */
/* compiled from: PG */
public final class C5061i {

    /* renamed from: a */
    public int[] f16130a = new int[8];

    /* renamed from: b */
    public int f16131b = 0;

    /* renamed from: a */
    public final void mo10035a(int i) {
        int[] iArr = this.f16130a;
        int length = iArr.length;
        int i2 = this.f16131b;
        if (length == i2) {
            int[] iArr2 = new int[(i2 + i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f16130a = iArr2;
        }
        int[] iArr3 = this.f16130a;
        int i3 = this.f16131b;
        this.f16131b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    public final void mo10036b() {
        this.f16131b = 0;
        if (this.f16130a.length != 8) {
            this.f16130a = new int[8];
        }
    }
}
