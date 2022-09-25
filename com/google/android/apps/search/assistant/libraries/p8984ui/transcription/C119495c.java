package com.google.android.apps.search.assistant.libraries.p8984ui.transcription;

import com.google.common.base.C58837ba;
import java.lang.reflect.Array;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.transcription.c */
/* compiled from: PG */
public final class C119495c {
    /* renamed from: a */
    public static C119494b m198347a(String str, String str2) {
        if (C58837ba.m90859h(str) || C58837ba.m90859h(str2)) {
            return new C119494b(str2);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        String lowerCase2 = str2.toLowerCase(Locale.US);
        int length = lowerCase.length();
        int[] iArr = new int[2];
        iArr[1] = lowerCase2.length();
        iArr[0] = length;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            int i2 = 0;
            while (i2 < lowerCase2.length()) {
                if (charAt == lowerCase2.charAt(i2)) {
                    iArr2[i][i2] = ((i == 0 || i2 == 0) ? 0 : iArr2[i - 1][i2 - 1]) + (charAt == ' ' ? 0 : 1);
                }
                i2++;
            }
            i++;
        }
        return m198348b(str2, 0, str.length(), 0, str2.length(), iArr2);
    }

    /* renamed from: b */
    private static C119494b m198348b(String str, int i, int i2, int i3, int i4, int[][] iArr) {
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
            return new C119494b(str, i3 - 1);
        }
        int i12 = i8 + 1;
        if (i12 == i2 || (i5 = i7 + 1) == i4) {
            return new C119494b(str, i7);
        }
        return m198348b(str, i12, i2, i5, i4, iArr);
    }
}
