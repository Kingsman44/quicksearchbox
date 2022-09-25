package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.k */
/* compiled from: PG */
public final class C110424k {

    /* renamed from: a */
    public final C110423j f307801a = new C110423j();

    /* renamed from: b */
    public int f307802b;

    /* renamed from: c */
    private final float f307803c;

    /* renamed from: d */
    private final float f307804d;

    public C110424k(float f, float f2) {
        this.f307803c = f;
        this.f307804d = f2;
        this.f307802b = 4;
    }

    /* renamed from: a */
    public final void mo98662a(int i, int i2, int i3, int i4, boolean z, int i5) {
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        boolean z2 = z;
        C110423j jVar = this.f307801a;
        jVar.f307782a = i9;
        jVar.f307783b = i4;
        if ((!z2 || i8 <= i7) && (z2 || i7 <= i8)) {
            int i10 = i8;
            i8 = i7;
            i7 = i10;
        }
        int i11 = true != z2 ? 30 : 200;
        float f = this.f307803c;
        float f2 = this.f307804d;
        int i12 = this.f307802b;
        int i13 = i7 - (i12 + i12);
        float f3 = (float) (i8 - (i11 + i11));
        float min = Math.min(f3 / ((float) i9), f);
        float min2 = Math.min(((float) i13) / ((float) jVar.f307783b), f2);
        float f4 = (float) jVar.f307782a;
        int i14 = (int) ((min - 4.0f) * f4);
        float f5 = (float) jVar.f307783b;
        int i15 = (int) ((-1.0f + min2) * f5);
        jVar.f307793l = i8 - i14;
        jVar.f307794m = i7 - i15;
        jVar.f307795n = i8 + i14;
        jVar.f307796o = i7 + i15;
        int i16 = i11 + (((int) (f3 - (f4 * min))) / 2);
        int i17 = (int) (f5 * min2);
        int i18 = i5 - 1;
        if (i18 != 0) {
            i6 = i18 != 1 ? i13 - i17 : (i13 - i17) / 2;
        } else {
            i6 = 0;
        }
        int i19 = i12 + i6;
        int i20 = i14 / 7;
        jVar.f307791j = i20;
        int i21 = i15 / 10;
        jVar.f307792k = i21;
        int i22 = i20 * 7;
        int i23 = i21 * 10;
        jVar.f307784c = i16;
        jVar.f307785d = i19;
        jVar.f307786e = i16 + i22;
        jVar.f307787f = i19 + i23;
        int i24 = i16 + (i20 * 3);
        jVar.f307789h = i24;
        jVar.f307790i = i19 + (i21 * 4);
        jVar.f307788g = i24 + (i20 / 2);
        jVar.f307797p = true;
        int[][] iArr = {new int[]{1, 3}, new int[]{1, 4}, new int[]{2, 3}, new int[]{2, 4}, new int[]{3, 1}, new int[]{3, 2}, new int[]{4, 1}, new int[]{4, 2}};
        int[][] iArr2 = {new int[]{1, 0}, new int[]{2, 0}};
        int[][] iArr3 = {new int[]{3, 0}, new int[]{4, 0}};
        int[][] iArr4 = {new int[]{0, 0}};
        if (i22 != 0 && i23 != 0) {
            jVar.mo98661b(iArr);
        } else if (i22 == 0 && i23 != 0) {
            jVar.mo98661b(iArr3);
        } else if (i22 != 0) {
            jVar.mo98661b(iArr2);
        } else {
            jVar.mo98661b(iArr4);
        }
    }
}
