package com.google.common.p4525e;

import java.util.HashMap;

/* renamed from: com.google.common.e.o */
/* compiled from: PG */
public final class C58967o {

    /* renamed from: a */
    public static final char[] f156820a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final C58959g f156821b;

    /* renamed from: c */
    public static final C58959g f156822c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(8, "\\b");
        hashMap.put(12, "\\f");
        hashMap.put(10, "\\n");
        hashMap.put(13, "\\r");
        hashMap.put(9, "\\t");
        hashMap.put('\"', "\\\"");
        hashMap.put('\\', "\\\\");
        new C58966n(hashMap);
        hashMap.put('\'', "\\'");
        f156821b = new C58965m(hashMap);
        new C58966n(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('\'', "\\x27");
        hashMap2.put('\"', "\\x22");
        hashMap2.put('<', "\\x3c");
        hashMap2.put('=', "\\x3d");
        hashMap2.put('>', "\\x3e");
        hashMap2.put('&', "\\x26");
        hashMap2.put(8, "\\b");
        hashMap2.put(9, "\\t");
        hashMap2.put(10, "\\n");
        hashMap2.put(12, "\\f");
        hashMap2.put(13, "\\r");
        hashMap2.put('\\', "\\\\");
        f156822c = new C58964l(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(10, "\\n");
        hashMap3.put(13, "\\r");
        hashMap3.put(9, "\\t");
        hashMap3.put('\\', "\\\\");
        String str = "\\'";
        hashMap3.put('\'', str);
        String str2 = "\\\"";
        hashMap3.put(34, str2);
        new C58955c(hashMap3);
        C58958f fVar = new C58958f();
        fVar.mo56221b(10, "\\n");
        fVar.mo56221b(13, "\\r");
        fVar.mo56221b(9, "\\t");
        fVar.mo56221b('\\', "\\\\");
        fVar.mo56221b('\"', str2);
        fVar.mo56221b('\'', str);
        fVar.mo56220a();
        HashMap hashMap4 = new HashMap();
        hashMap4.put(10, "\\n");
        hashMap4.put(13, "\\r");
        hashMap4.put(12, "\\f");
        hashMap4.put(8, "\\b");
        hashMap4.put(9, "\\t");
        hashMap4.put(11, "\\v");
        hashMap4.put(34, str2);
        hashMap4.put(39, str);
        hashMap4.put(92, "\\\\");
        hashMap4.put('$', "\\$");
        new C58955c(hashMap4);
        C58958f fVar2 = new C58958f();
        fVar2.mo56221b('\'', str);
        fVar2.mo56221b('\"', str2);
        fVar2.mo56221b('?', "\\?");
        fVar2.mo56221b('\\', "\\\\");
        fVar2.mo56221b(12, "\\f");
        fVar2.mo56221b(10, "\\n");
        fVar2.mo56221b(13, "\\r");
        fVar2.mo56221b(9, "\\t");
        fVar2.mo56221b(7, "\\a");
        fVar2.mo56221b(8, "\\b");
        fVar2.mo56221b(11, "\\v");
        fVar2.mo56220a();
    }

    /* renamed from: a */
    public static char[] m91124a(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        char[] cArr2 = f156820a;
        cArr[5] = cArr2[c & 15];
        int i = c >>> 4;
        cArr[4] = cArr2[i & 15];
        int i2 = i >>> 4;
        cArr[3] = cArr2[i2 & 15];
        cArr[2] = cArr2[i2 >>> 4];
        return cArr;
    }
}
