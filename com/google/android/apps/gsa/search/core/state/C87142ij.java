package com.google.android.apps.gsa.search.core.state;

import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.search.core.state.ij */
/* compiled from: PG */
public final class C87142ij implements Comparator {

    /* renamed from: a */
    private static final int[] f235455a = new int[250];

    /* renamed from: b */
    private static final int[] f235456b;

    static {
        int[] iArr = {71, 55, 50, 58, 57, 51, 52, 17, 0, 56, 18, 54, 59, 19, 62, 13, 76, 8, 75, 24, 66, 2, 1, 65, 16, 77, 7, 5, 26, 3, 79, 6, 69, 10, 68};
        f235456b = iArr;
        int i = 1;
        int i2 = 0;
        while (i2 < 35) {
            f235455a[iArr[i2]] = i;
            i2++;
            i++;
        }
        for (int i3 = 0; i3 < 250; i3++) {
            int[] iArr2 = f235455a;
            if (iArr2[i3] == 0) {
                iArr2[i3] = i;
                i++;
            }
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = f235455a;
        return iArr[((C86898ct) ((C87143ik) obj).mo80512a()).f235452J] - iArr[((C86898ct) ((C87143ik) obj2).mo80512a()).f235452J];
    }
}
