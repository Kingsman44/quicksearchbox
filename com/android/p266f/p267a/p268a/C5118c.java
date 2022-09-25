package com.android.p266f.p267a.p268a;

import android.util.SparseArray;
import androidx.p060c.C0984n;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.f.a.a.c */
/* compiled from: PG */
public final class C5118c {

    /* renamed from: a */
    public static final C0984n f16306a = new C0984n(0);

    /* renamed from: b */
    private static final int[] f16307b = {0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 17, 18, 38, 39, 40, 106, 113, 114, 2025, 2026, 1000, 1015, 2085};

    /* renamed from: c */
    private static final String[] f16308c = {"*", "us-ascii", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-9", "shift_JIS", "euc-jp", "euc-kr", "iso-2022-jp", "iso-2022-jp-2", "utf-8", "gbk", "gb18030", "gb2312", "big5", "iso-10646-ucs-2", "utf-16", "hz-gb-2312"};

    /* renamed from: d */
    private static final SparseArray f16309d = new SparseArray();

    static {
        for (int i = 0; i <= 23; i++) {
            SparseArray sparseArray = f16309d;
            int[] iArr = f16307b;
            int i2 = iArr[i];
            String[] strArr = f16308c;
            sparseArray.put(i2, strArr[i]);
            f16306a.put(strArr[i], Integer.valueOf(iArr[i]));
        }
    }

    /* renamed from: a */
    public static String m13992a(int i) {
        String str = (String) f16309d.get(i);
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }
}
