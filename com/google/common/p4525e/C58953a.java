package com.google.common.p4525e;

/* renamed from: com.google.common.e.a */
/* compiled from: PG */
public abstract class C58953a extends C58956d {

    /* renamed from: a */
    private final char[][] f156808a;

    /* renamed from: b */
    private final int f156809b;

    /* renamed from: c */
    private final char f156810c;

    /* renamed from: d */
    private final char f156811d;

    protected C58953a(C58954b bVar, char c, char c2) {
        char[][] cArr = bVar.f156813a;
        this.f156808a = cArr;
        this.f156809b = cArr.length;
        this.f156810c = c;
        this.f156811d = c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final char[] mo56217b(char c) {
        char[] cArr;
        if (c < this.f156809b && (cArr = this.f156808a[c]) != null) {
            return cArr;
        }
        if (c < this.f156810c || c > this.f156811d) {
            return mo56218c(c);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract char[] mo56218c(char c);

    /* renamed from: a */
    public final String mo56216a(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f156809b && this.f156808a[charAt] != null) || charAt > this.f156811d || charAt < this.f156810c) {
                return mo56219d(str, i);
            }
        }
        return str;
    }
}
