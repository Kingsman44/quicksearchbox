package com.google.common.p4525e;

/* renamed from: com.google.common.e.e */
/* compiled from: PG */
public final class C58957e extends C58956d {

    /* renamed from: a */
    public final char[][] f156815a;

    /* renamed from: b */
    private final int f156816b;

    public C58957e(char[][] cArr) {
        this.f156815a = cArr;
        this.f156816b = cArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final char[] mo56217b(char c) {
        if (c < this.f156816b) {
            return this.f156815a[c];
        }
        return null;
    }
}
