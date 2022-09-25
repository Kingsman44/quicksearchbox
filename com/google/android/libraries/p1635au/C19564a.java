package com.google.android.libraries.p1635au;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.au.a */
/* compiled from: PG */
final class C19564a {

    /* renamed from: a */
    static final Object[] f54469a;

    /* renamed from: b */
    static final C19564a f54470b;

    /* renamed from: c */
    public final Object[] f54471c;

    /* renamed from: d */
    private final int f54472d;

    static {
        Object[] objArr = new Object[0];
        f54469a = objArr;
        f54470b = new C19564a(objArr);
    }

    public C19564a(Object... objArr) {
        this.f54471c = objArr;
        this.f54472d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19564a)) {
            return false;
        }
        C19564a aVar = (C19564a) obj;
        return this.f54472d == aVar.f54472d && Arrays.equals(this.f54471c, aVar.f54471c);
    }

    public final int hashCode() {
        return this.f54472d;
    }

    public final String toString() {
        return Arrays.toString(this.f54471c);
    }
}
