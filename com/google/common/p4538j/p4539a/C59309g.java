package com.google.common.p4538j.p4539a;

/* renamed from: com.google.common.j.a.g */
/* compiled from: PG */
public final class C59309g {

    /* renamed from: a */
    public static final C59309g f157476a = new C59309g("about:invalid#zGuavaz");

    /* renamed from: b */
    public final String f157477b;

    public C59309g(String str) {
        str.getClass();
        this.f157477b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59309g)) {
            return false;
        }
        return this.f157477b.equals(((C59309g) obj).f157477b);
    }

    public final int hashCode() {
        return this.f157477b.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.f157477b + "}";
    }
}
