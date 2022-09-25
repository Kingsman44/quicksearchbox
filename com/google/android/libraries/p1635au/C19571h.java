package com.google.android.libraries.p1635au;

/* renamed from: com.google.android.libraries.au.h */
/* compiled from: PG */
public final class C19571h {

    /* renamed from: a */
    public final String f54479a;

    /* renamed from: b */
    public final Class f54480b;

    public C19571h(String str, Class cls) {
        str.getClass();
        this.f54479a = str;
        this.f54480b = cls;
    }

    /* renamed from: a */
    public static C19571h m37326a(String str) {
        return new C19571h(str, Boolean.class);
    }

    /* renamed from: b */
    public static C19571h m37327b(String str) {
        return new C19571h(str, Integer.class);
    }

    /* renamed from: c */
    public static C19571h m37328c(String str) {
        return new C19571h(str, String.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19571h) {
            C19571h hVar = (C19571h) obj;
            return this.f54480b == hVar.f54480b && this.f54479a.equals(hVar.f54479a);
        }
    }

    public final int hashCode() {
        return this.f54479a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", new Object[]{this.f54479a, this.f54480b});
    }
}
