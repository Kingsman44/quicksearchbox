package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ay */
/* compiled from: PG */
public final class C81988ay {
    /* renamed from: a */
    public static C81987ax m130232a(String str, int i, int i2, int i3, int i4, int[][] iArr) {
        int i5;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i < i2) {
            int i9 = i3;
            while (i9 < i4) {
                int i10 = iArr[i][i9];
                int i11 = i10 > i6 ? i10 : i6;
                if (i10 > i6) {
                    i7 = i9;
                }
                if (i10 > i6) {
                    i8 = i;
                }
                i9++;
                i6 = i11;
            }
            i++;
        }
        if (i6 == 0) {
            return new C81987ax(str, i3 - 1);
        }
        int i12 = i8 + 1;
        if (i12 == i2 || (i5 = i7 + 1) == i4) {
            return new C81987ax(str, i7);
        }
        return m130232a(str, i12, i2, i5, i4, iArr);
    }
}
