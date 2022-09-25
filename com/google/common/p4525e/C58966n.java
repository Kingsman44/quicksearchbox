package com.google.common.p4525e;

import java.util.Map;

/* renamed from: com.google.common.e.n */
/* compiled from: PG */
final class C58966n extends C58953a {
    public C58966n(Map map) {
        super(C58954b.m91108a(map), ' ', '~');
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final char[] mo56218c(char c) {
        if (c >= 256) {
            return C58967o.m91124a(c);
        }
        char[] cArr = C58967o.f156820a;
        char[] cArr2 = new char[4];
        cArr2[0] = '\\';
        char[] cArr3 = C58967o.f156820a;
        cArr2[3] = cArr3[c & 7];
        int i = c >>> 3;
        cArr2[2] = cArr3[i & 7];
        cArr2[1] = cArr3[i >>> 3];
        return cArr2;
    }
}
