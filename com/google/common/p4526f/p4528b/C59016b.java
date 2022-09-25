package com.google.common.p4526f.p4528b;

/* renamed from: com.google.common.f.b.b */
/* compiled from: PG */
public enum C59016b {
    STRING('s', C59029d.GENERAL, "-#", true),
    BOOLEAN('b', C59029d.BOOLEAN, "-", true),
    CHAR('c', C59029d.CHARACTER, "-", true),
    DECIMAL('d', C59029d.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', C59029d.INTEGRAL, "-#0(", false),
    HEX('x', C59029d.INTEGRAL, "-#0(", true),
    FLOAT('f', C59029d.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', C59029d.FLOAT, "-#0+ (", true),
    GENERAL('g', C59029d.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', C59029d.FLOAT, "-#0+ ", true);
    

    /* renamed from: k */
    public static final C59016b[] f156922k = null;

    /* renamed from: l */
    public final char f156924l;

    /* renamed from: m */
    public final C59029d f156925m;

    /* renamed from: n */
    public final int f156926n;

    /* renamed from: o */
    public final String f156927o;

    static {
        int i;
        f156922k = new C59016b[26];
        for (C59016b bVar : values()) {
            f156922k[m91243a(bVar.f156924l)] = bVar;
        }
    }

    private C59016b(char c, C59029d dVar, String str, boolean z) {
        this.f156924l = c;
        this.f156925m = dVar;
        this.f156926n = C59028c.m91263a(str, z);
        this.f156927o = "%" + c;
    }

    /* renamed from: a */
    public static int m91243a(char c) {
        return (c | ' ') - 'a';
    }
}
