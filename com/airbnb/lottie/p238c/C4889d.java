package com.airbnb.lottie.p238c;

import java.util.List;

/* renamed from: com.airbnb.lottie.c.d */
/* compiled from: PG */
public final class C4889d {

    /* renamed from: a */
    public final List f15619a;

    /* renamed from: b */
    public final double f15620b;

    /* renamed from: c */
    private final char f15621c;

    /* renamed from: d */
    private final String f15622d;

    /* renamed from: e */
    private final String f15623e;

    public C4889d(List list, char c, double d, String str, String str2) {
        this.f15619a = list;
        this.f15621c = c;
        this.f15620b = d;
        this.f15622d = str;
        this.f15623e = str2;
    }

    /* renamed from: a */
    public static int m13579a(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return m13579a(this.f15621c, this.f15623e, this.f15622d);
    }
}
