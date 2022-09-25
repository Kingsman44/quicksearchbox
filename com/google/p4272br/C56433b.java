package com.google.p4272br;

import java.util.HashMap;

/* renamed from: com.google.br.b */
/* compiled from: PG */
final class C56433b {

    /* renamed from: a */
    static final HashMap f150707a;

    /* renamed from: b */
    static final HashMap f150708b;

    /* renamed from: e */
    private static final int[] f150709e;

    /* renamed from: f */
    private static final int[] f150710f;

    /* renamed from: g */
    private static final int[] f150711g;

    /* renamed from: h */
    private static final int[] f150712h;

    /* renamed from: i */
    private static final int[] f150713i;

    /* renamed from: j */
    private static final int[] f150714j;

    /* renamed from: k */
    private static final int[] f150715k;

    /* renamed from: l */
    private static final int[] f150716l;

    /* renamed from: m */
    private static final int[] f150717m;

    /* renamed from: n */
    private static final int[] f150718n;

    /* renamed from: o */
    private static final int[] f150719o;

    /* renamed from: p */
    private static final int[] f150720p;

    /* renamed from: q */
    private static final int[] f150721q;

    /* renamed from: r */
    private static final int[] f150722r;

    /* renamed from: s */
    private static final int[] f150723s;

    /* renamed from: t */
    private static final int[] f150724t;

    /* renamed from: u */
    private static final int[] f150725u;

    /* renamed from: c */
    final int f150726c;

    /* renamed from: d */
    final int[] f150727d;

    static {
        int[] iArr = {48, 57};
        f150709e = iArr;
        int[] iArr2 = {9, 10, 12, 13, 32, 32};
        f150710f = iArr2;
        int[] iArr3 = {48, 57, 65, 90, 95, 95, 97, 122};
        f150711g = iArr3;
        HashMap hashMap = new HashMap();
        f150707a = hashMap;
        hashMap.put("\\d", new C56433b(1, iArr));
        hashMap.put("\\D", new C56433b(-1, iArr));
        hashMap.put("\\s", new C56433b(1, iArr2));
        hashMap.put("\\S", new C56433b(-1, iArr2));
        hashMap.put("\\w", new C56433b(1, iArr3));
        hashMap.put("\\W", new C56433b(-1, iArr3));
        int[] iArr4 = {48, 57, 65, 90, 97, 122};
        f150712h = iArr4;
        int[] iArr5 = {65, 90, 97, 122};
        f150713i = iArr5;
        int[] iArr6 = {0, 127};
        f150714j = iArr6;
        int[] iArr7 = {9, 9, 32, 32};
        f150715k = iArr7;
        int[] iArr8 = {0, 31, 127, 127};
        f150716l = iArr8;
        int[] iArr9 = {48, 57};
        f150717m = iArr9;
        int[] iArr10 = {33, 126};
        f150718n = iArr10;
        int[] iArr11 = {97, 122};
        f150719o = iArr11;
        int[] iArr12 = {32, 126};
        f150720p = iArr12;
        int[] iArr13 = {33, 47, 58, 64, 91, 96, 123, 126};
        f150721q = iArr13;
        int[] iArr14 = {9, 13, 32, 32};
        f150722r = iArr14;
        int[] iArr15 = {65, 90};
        f150723s = iArr15;
        int[] iArr16 = {48, 57, 65, 90, 95, 95, 97, 122};
        f150724t = iArr16;
        int[] iArr17 = {48, 57, 65, 70, 97, 102};
        f150725u = iArr17;
        HashMap hashMap2 = new HashMap();
        f150708b = hashMap2;
        hashMap2.put("[:alnum:]", new C56433b(1, iArr4));
        hashMap2.put("[:^alnum:]", new C56433b(-1, iArr4));
        hashMap2.put("[:alpha:]", new C56433b(1, iArr5));
        hashMap2.put("[:^alpha:]", new C56433b(-1, iArr5));
        hashMap2.put("[:ascii:]", new C56433b(1, iArr6));
        hashMap2.put("[:^ascii:]", new C56433b(-1, iArr6));
        hashMap2.put("[:blank:]", new C56433b(1, iArr7));
        hashMap2.put("[:^blank:]", new C56433b(-1, iArr7));
        hashMap2.put("[:cntrl:]", new C56433b(1, iArr8));
        hashMap2.put("[:^cntrl:]", new C56433b(-1, iArr8));
        hashMap2.put("[:digit:]", new C56433b(1, iArr9));
        hashMap2.put("[:^digit:]", new C56433b(-1, iArr9));
        hashMap2.put("[:graph:]", new C56433b(1, iArr10));
        hashMap2.put("[:^graph:]", new C56433b(-1, iArr10));
        hashMap2.put("[:lower:]", new C56433b(1, iArr11));
        hashMap2.put("[:^lower:]", new C56433b(-1, iArr11));
        hashMap2.put("[:print:]", new C56433b(1, iArr12));
        hashMap2.put("[:^print:]", new C56433b(-1, iArr12));
        hashMap2.put("[:punct:]", new C56433b(1, iArr13));
        hashMap2.put("[:^punct:]", new C56433b(-1, iArr13));
        hashMap2.put("[:space:]", new C56433b(1, iArr14));
        hashMap2.put("[:^space:]", new C56433b(-1, iArr14));
        hashMap2.put("[:upper:]", new C56433b(1, iArr15));
        hashMap2.put("[:^upper:]", new C56433b(-1, iArr15));
        hashMap2.put("[:word:]", new C56433b(1, iArr16));
        hashMap2.put("[:^word:]", new C56433b(-1, iArr16));
        int[] iArr18 = iArr17;
        hashMap2.put("[:xdigit:]", new C56433b(1, iArr18));
        hashMap2.put("[:^xdigit:]", new C56433b(-1, iArr18));
    }

    private C56433b(int i, int[] iArr) {
        this.f150726c = i;
        this.f150727d = iArr;
    }
}
