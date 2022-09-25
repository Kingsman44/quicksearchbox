package com.google.common.p4575r;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.r.n */
/* compiled from: PG */
public final class C60757n extends C60758o {
    /* renamed from: a */
    public static int m92740a(long j) {
        int i = (int) j;
        C58838bb.m90872g(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: b */
    public static int m92741b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i <= i2 ? 0 : 1;
    }

    /* renamed from: c */
    public static int m92742c(int i, int i2, int i3) {
        C58838bb.m90875j(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: d */
    public static int m92743d(byte[] bArr) {
        int length = bArr.length;
        C58838bb.m90875j(length >= 4, "array too small: %s < %s", length, 4);
        return m92744e(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* renamed from: e */
    public static int m92744e(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: f */
    public static int m92745f(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: g */
    public static int m92746g(int... iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static int m92747h(int... iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    /* renamed from: i */
    public static int m92748i(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j;
    }

    /* renamed from: j */
    public static List m92749j(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new C60756m(iArr, 0, length);
    }

    /* renamed from: k */
    public static boolean m92750k(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static int[] m92751l(int[]... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += iArr[i2].length;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            int[] iArr3 = iArr[i4];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2, i3, length);
            i3 += length;
        }
        return iArr2;
    }

    /* renamed from: m */
    public static int[] m92752m(Collection collection) {
        if (collection instanceof C60756m) {
            C60756m mVar = (C60756m) collection;
            return Arrays.copyOfRange(mVar.f164799a, mVar.f164800b, mVar.f164801c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* renamed from: n */
    public static Integer m92753n(String str) {
        Long h = C60761r.m92762h(str);
        if (h == null || h.longValue() != ((long) h.intValue())) {
            return null;
        }
        return Integer.valueOf(h.intValue());
    }
}
