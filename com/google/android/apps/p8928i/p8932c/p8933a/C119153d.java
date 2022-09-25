package com.google.android.apps.p8928i.p8932c.p8933a;

/* renamed from: com.google.android.apps.i.c.a.d */
/* compiled from: PG */
final class C119153d extends C119158i {

    /* renamed from: a */
    private final String f332326a;

    /* renamed from: b */
    private final int f332327b;

    public C119153d(String str, int i) {
        this.f332326a = str;
        this.f332327b = i;
    }

    /* renamed from: a */
    public final String mo104219a() {
        return this.f332326a;
    }

    /* renamed from: b */
    public final int mo104220b() {
        return this.f332327b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119158i) {
            C119158i iVar = (C119158i) obj;
            return this.f332326a.equals(iVar.mo104219a()) && this.f332327b == iVar.mo104220b();
        }
    }

    public final int hashCode() {
        return ((this.f332326a.hashCode() ^ 1000003) * 1000003) ^ this.f332327b;
    }

    public final String toString() {
        String str = this.f332326a;
        String str2 = this.f332327b != 1 ? "PHONE_NUMBER" : "EMAIL";
        return "CalleeId{id=" + str + ", type=" + str2 + "}";
    }
}
