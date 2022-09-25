package com.google.android.apps.p471d.p472a.p477b.p478a;

import java.util.ArrayList;

/* renamed from: com.google.android.apps.d.a.b.a.e */
/* compiled from: PG */
public final class C9032e extends C9028a {

    /* renamed from: a */
    private final int f31230a;

    /* renamed from: b */
    private final int f31231b;

    /* renamed from: c */
    private final ArrayList f31232c;

    public C9032e(int i, int i2, ArrayList arrayList) {
        this.f31230a = i;
        this.f31231b = i2;
        this.f31232c = arrayList;
    }

    /* renamed from: a */
    public final int mo17316a() {
        return this.f31231b;
    }

    /* renamed from: b */
    public final int mo17317b() {
        return this.f31230a;
    }

    /* renamed from: c */
    public final ArrayList mo17318c() {
        return this.f31232c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9028a) {
            C9028a aVar = (C9028a) obj;
            return this.f31230a == aVar.mo17317b() && this.f31231b == aVar.mo17316a() && this.f31232c.equals(aVar.mo17318c());
        }
    }

    public final int hashCode() {
        return ((((this.f31230a ^ 1000003) * 1000003) ^ this.f31231b) * 1000003) ^ this.f31232c.hashCode();
    }

    public final String toString() {
        int i = this.f31230a;
        int i2 = this.f31231b;
        String obj = this.f31232c.toString();
        return "AlternativeSpan{start=" + i + ", end=" + i2 + ", alternatives=" + obj + "}";
    }
}
