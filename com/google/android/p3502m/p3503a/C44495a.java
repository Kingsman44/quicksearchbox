package com.google.android.p3502m.p3503a;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: com.google.android.m.a.a */
/* compiled from: PG */
public final class C44495a {

    /* renamed from: a */
    private static final int[] f115646a = {0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 17, 106, 2026, 1000, 1015};

    /* renamed from: b */
    private static final String[] f115647b = {"*", "us-ascii", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-9", "shift_JIS", "utf-8", "big5", "iso-10646-ucs-2", "utf-16"};

    /* renamed from: c */
    private static final HashMap f115648c = new HashMap();

    /* renamed from: d */
    private static final HashMap f115649d = new HashMap();

    static {
        for (int i = 0; i <= 15; i++) {
            HashMap hashMap = f115648c;
            int[] iArr = f115646a;
            Integer valueOf = Integer.valueOf(iArr[i]);
            String[] strArr = f115647b;
            hashMap.put(valueOf, strArr[i]);
            f115649d.put(strArr[i], Integer.valueOf(iArr[i]));
        }
    }

    /* renamed from: a */
    public static String m78595a(int i) {
        String str = (String) f115648c.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }
}
