package com.google.android.libraries.search.assistant.p2783s.p2785b;

/* renamed from: com.google.android.libraries.search.assistant.s.b.c */
/* compiled from: PG */
final class C36384c {

    /* renamed from: a */
    public final int f95011a;

    /* renamed from: b */
    public final int f95012b;

    public C36384c(int i, int i2) {
        this.f95011a = i;
        this.f95012b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36384c)) {
            return false;
        }
        C36384c cVar = (C36384c) obj;
        return this.f95011a == cVar.f95011a && this.f95012b == cVar.f95012b;
    }

    public final int hashCode() {
        return (this.f95011a * 31) + this.f95012b;
    }

    public final String toString() {
        int i = this.f95011a;
        int i2 = this.f95012b;
        return "MccMnc(mcc=" + i + ", mnc=" + i2 + ")";
    }
}
