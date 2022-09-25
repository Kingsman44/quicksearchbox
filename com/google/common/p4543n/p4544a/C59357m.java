package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.m */
/* compiled from: PG */
public final class C59357m extends C59356l implements CharSequence {

    /* renamed from: a */
    private final String f157556a;

    public C59357m(String str) {
        this.f157556a = str;
    }

    public final char charAt(int i) {
        return this.f157556a.charAt(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59357m) && this.f157556a.equals(((C59357m) obj).f157556a);
    }

    public final int hashCode() {
        return this.f157556a.hashCode();
    }

    /* renamed from: lG */
    public final C59354j mo56871lG(String str) {
        if (str.startsWith(this.f157556a, 0)) {
            return C59354j.m92245a(str, 0, this.f157556a.length());
        }
        return null;
    }

    public final int length() {
        return this.f157556a.length();
    }

    public final /* synthetic */ CharSequence subSequence(int i, int i2) {
        return this.f157556a.substring(i, i2);
    }

    public final String toString() {
        return this.f157556a;
    }
}
