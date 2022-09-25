package com.google.common.p4525e;

import java.util.Map;

/* renamed from: com.google.common.e.l */
/* compiled from: PG */
final class C58964l extends C58953a {
    public C58964l(Map map) {
        super(C58954b.m91108a(map), ' ', '~');
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final char[] mo56218c(char c) {
        if (c >= 256) {
            return C58967o.m91124a(c);
        }
        char[] cArr = new char[4];
        cArr[3] = C58967o.f156820a[c & 15];
        cArr[2] = C58967o.f156820a[c >>> 4];
        cArr[1] = 'x';
        cArr[0] = '\\';
        return cArr;
    }
}
