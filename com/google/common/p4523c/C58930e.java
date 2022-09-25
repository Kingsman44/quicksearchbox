package com.google.common.p4523c;

/* renamed from: com.google.common.c.e */
/* compiled from: PG */
public final class C58930e {

    /* renamed from: a */
    public final int f156774a;

    /* renamed from: b */
    public final int f156775b;

    public C58930e(int i, int i2) {
        this.f156774a = i;
        this.f156775b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C58930e)) {
            return false;
        }
        C58930e eVar = (C58930e) obj;
        return this.f156774a == eVar.f156774a && this.f156775b == eVar.f156775b;
    }

    public final int hashCode() {
        return this.f156774a ^ this.f156775b;
    }
}
