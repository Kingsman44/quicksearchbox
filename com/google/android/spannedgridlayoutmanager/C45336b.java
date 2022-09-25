package com.google.android.spannedgridlayoutmanager;

/* renamed from: com.google.android.spannedgridlayoutmanager.b */
/* compiled from: PG */
public final class C45336b {

    /* renamed from: a */
    public final int f118488a;

    /* renamed from: b */
    public final float[] f118489b;

    /* renamed from: c */
    public final int[] f118490c;

    public C45336b(int i, float[] fArr, int[] iArr) {
        this.f118488a = i;
        if (fArr == null) {
            fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr[i2] = 1.0f;
            }
        }
        this.f118489b = fArr;
        if (iArr == null) {
            iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = 0;
            }
        }
        this.f118490c = iArr;
    }
}
