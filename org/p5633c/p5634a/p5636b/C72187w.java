package org.p5633c.p5634a.p5636b;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import org.p5633c.p5634a.C72285i;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.b.w */
/* compiled from: PG */
final class C72187w {

    /* renamed from: n */
    private static final ConcurrentMap f192138n = new ConcurrentHashMap();

    /* renamed from: a */
    public final String[] f192139a;

    /* renamed from: b */
    public final String[] f192140b;

    /* renamed from: c */
    public final String[] f192141c;

    /* renamed from: d */
    public final String[] f192142d;

    /* renamed from: e */
    public final String[] f192143e;

    /* renamed from: f */
    public final String[] f192144f;

    /* renamed from: g */
    public final TreeMap f192145g;

    /* renamed from: h */
    public final TreeMap f192146h;

    /* renamed from: i */
    public final TreeMap f192147i;

    /* renamed from: j */
    public final int f192148j;

    /* renamed from: k */
    public final int f192149k;

    /* renamed from: l */
    public final int f192150l;

    /* renamed from: m */
    public final int f192151m;

    private C72187w(Locale locale) {
        DateFormatSymbols b = C72285i.m106774b(locale);
        this.f192139a = b.getEras();
        this.f192140b = m106172d(b.getWeekdays());
        this.f192141c = m106172d(b.getShortWeekdays());
        this.f192142d = m106173e(b.getMonths());
        this.f192143e = m106173e(b.getShortMonths());
        this.f192144f = b.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f192145g = treeMap;
        m106171c(treeMap, this.f192139a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f192146h = treeMap2;
        m106171c(treeMap2, this.f192140b, numArr);
        m106171c(treeMap2, this.f192141c, numArr);
        m106174f(treeMap2, 7, numArr);
        TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f192147i = treeMap3;
        m106171c(treeMap3, this.f192142d, numArr);
        m106171c(treeMap3, this.f192143e, numArr);
        m106174f(treeMap3, 12, numArr);
        this.f192148j = m106170b(this.f192139a);
        this.f192149k = m106170b(this.f192140b);
        m106170b(this.f192141c);
        this.f192150l = m106170b(this.f192142d);
        m106170b(this.f192143e);
        this.f192151m = m106170b(this.f192144f);
    }

    /* renamed from: a */
    static C72187w m106169a(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentMap concurrentMap = f192138n;
        C72187w wVar = (C72187w) concurrentMap.get(locale);
        if (wVar == null) {
            wVar = new C72187w(locale);
            C72187w wVar2 = (C72187w) concurrentMap.putIfAbsent(locale, wVar);
            return wVar2 == null ? wVar : wVar2;
        }
    }

    /* renamed from: b */
    private static int m106170b(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    /* renamed from: c */
    private static void m106171c(TreeMap treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private static String[] m106172d(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    /* renamed from: e */
    private static String[] m106173e(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: f */
    private static void m106174f(TreeMap treeMap, int i, Integer[] numArr) {
        for (int i2 = 1; i2 <= i; i2++) {
            treeMap.put(String.valueOf(i2).intern(), numArr[i2]);
        }
    }
}
