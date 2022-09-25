package com.google.apps.tiktok.dataservice.p3638c;

import android.support.p033v7.widget.C0640fb;
import android.util.Log;
import com.google.android.libraries.p1623at.p1632e.C19555c;
import com.google.common.base.C58815af;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.apps.tiktok.dataservice.c.i */
/* compiled from: PG */
public final class C46752i implements C46745b {
    /* renamed from: b */
    private static final int m83294b(List list, List list2, int i, int i2, int i3, int i4, C58815af afVar) {
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * i4;
            if (!afVar.mo56077d(list.get(i + i6), list2.get(i6 + i2))) {
                return i5;
            }
        }
        return i3;
    }

    /* renamed from: c */
    private static final void m83295c(List list, List list2, int i, int i2, C0640fb fbVar) {
        int size = i < 0 ? list.size() + i : i;
        if (i < 0) {
            i += list2.size();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = size + i3;
            if (!C19555c.m37297b(list.get(i4), list2.get(i + i3))) {
                fbVar.notifyItemChanged(i4);
            }
        }
    }

    /* renamed from: a */
    public final void mo50766a(List list, List list2, C58815af afVar, C0640fb fbVar) {
        int i;
        int i2;
        boolean z;
        List list3 = list;
        List list4 = list2;
        C0640fb fbVar2 = fbVar;
        if (Log.isLoggable("TTDataService", 3)) {
            Log.d("TTDataService", "Source Items:      ".concat(String.valueOf(String.valueOf(list))));
            Log.d("TTDataService", "Destination Items: ".concat(String.valueOf(String.valueOf(list2))));
        }
        int size = list.size();
        int size2 = list2.size();
        int min = Math.min(size, size2);
        int b = m83294b(list, list2, 0, 0, min, 1, afVar);
        if (b == size && size == size2) {
            m83295c(list3, list4, 0, b, fbVar2);
            return;
        }
        int b2 = m83294b(list, list2, size - 1, size2 - 1, min - b, -1, afVar);
        if (Log.isLoggable("TTDataService", 3)) {
            Log.d("TTDataService", "Start Index:  " + b);
            Log.d("TTDataService", "End Trim:     " + b2);
        }
        int i3 = size - b2;
        int i4 = size2 - b2;
        if (b > Math.min(i3, i4)) {
            fbVar2.mObservable.mo2879a();
            return;
        }
        m83295c(list3, list4, 0, b, fbVar2);
        m83295c(list3, list4, -b2, b2, fbVar2);
        int i5 = i4 - b;
        int[] iArr = new int[Math.min(i3 - b, i5)];
        int[] iArr2 = new int[i5];
        int i6 = b;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i3) {
            Object obj = list3.get(i6);
            int i9 = b;
            while (true) {
                if (i9 >= i4) {
                    i = i3;
                    i2 = i8;
                    z = false;
                    break;
                }
                Object obj2 = list4.get(i9);
                if (afVar.mo56077d(obj, obj2)) {
                    int i10 = i9 - b;
                    i = i3;
                    if (iArr2[i10] == 1) {
                        fbVar2.mObservable.mo2879a();
                        return;
                    }
                    iArr[i8] = i10;
                    iArr2[i10] = 1;
                    z2 |= !(i6 == i9);
                    int i11 = i8 + 1;
                    if (!C19555c.m37297b(obj, obj2)) {
                        fbVar2.notifyItemChanged(i6 - i7);
                    }
                    i2 = i11;
                    z = true;
                } else {
                    int i12 = i3;
                    i9++;
                    List list5 = list;
                    list4 = list2;
                }
            }
            if (!z) {
                fbVar2.notifyItemRemoved(i6 - i7);
                i7++;
            }
            i6++;
            list4 = list2;
            i8 = i2;
            i3 = i;
            list3 = list;
        }
        if (i8 != 0) {
            int i13 = 0;
            for (int i14 = 0; i14 < i5; i14++) {
                if (iArr2[i14] == 1) {
                    iArr2[i14] = i13;
                    i13++;
                } else {
                    iArr2[i14] = -1;
                }
            }
            for (int i15 = 0; i15 < i8; i15++) {
                iArr[i15] = iArr2[iArr[i15]];
            }
            if (i5 - i8 != 0) {
                int i16 = 0;
                for (int i17 = i5 - 1; i17 >= 0; i17--) {
                    if (iArr2[i17] == -1) {
                        i16++;
                        iArr2[i5 - i16] = i17;
                    }
                }
            }
            if (z2) {
                for (int i18 = 0; i18 < i8; i18++) {
                    iArr2[i18] = i18;
                }
                if (Log.isLoggable("TTDataService", 3)) {
                    Log.d("TTDataService", "Async Source Positions:      ".concat(String.valueOf(Arrays.toString(iArr2))));
                    Log.d("TTDataService", "Async Destination Positions: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
                int i19 = i8 - 1;
                int i20 = 0;
                while (i20 < i8) {
                    int i21 = i20 + 1;
                    for (int i22 = i21; i22 < i8; i22++) {
                        int i23 = iArr2[i20];
                        int i24 = iArr2[i22];
                        if (i23 < i24) {
                            iArr2[i22] = i24 - 1;
                        }
                    }
                    for (int i25 = i19; i25 >= 0; i25--) {
                        int i26 = iArr[i19];
                        int i27 = iArr[i25];
                        if (i26 < i27) {
                            iArr[i25] = i27 - 1;
                        }
                    }
                    i19--;
                    i20 = i21;
                }
                int i28 = 0;
                while (i28 < i8) {
                    int i29 = i28 + 1;
                    for (int i30 = i29; i30 < i8; i30++) {
                        int i31 = iArr[i28];
                        int i32 = iArr2[i30];
                        if (i31 > i32) {
                            iArr[i28] = i31 + 1;
                        } else {
                            iArr2[i30] = i32 + 1;
                        }
                    }
                    i28 = i29;
                }
                if (Log.isLoggable("TTDataService", 3)) {
                    Log.d("TTDataService", "Sync Source Positions:      ".concat(String.valueOf(Arrays.toString(iArr2))));
                    Log.d("TTDataService", "Sync Destination Positions: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
                for (int i33 = 0; i33 < i8; i33++) {
                    int i34 = iArr2[i33] + b;
                    int i35 = iArr[i33] + b;
                    if (i34 != i35) {
                        fbVar2.mObservable.mo2880b(i34, i35);
                    }
                }
            }
            while (i8 < i5) {
                fbVar2.notifyItemInserted(iArr2[i8] + b);
                i8++;
            }
            return;
        }
        fbVar2.mObservable.mo2882d(b, i5);
    }
}
