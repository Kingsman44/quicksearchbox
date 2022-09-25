package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cc */
/* compiled from: PG */
public final class C143782cc {

    /* renamed from: a */
    private final Object f389803a;

    /* renamed from: b */
    private final String f389804b;

    public C143782cc(Object obj, String str) {
        this.f389803a = obj;
        this.f389804b = str;
    }

    /* renamed from: a */
    public final String mo119232a() {
        String str = this.f389804b;
        int identityHashCode = System.identityHashCode(this.f389803a);
        return str + "@" + identityHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143782cc)) {
            return false;
        }
        C143782cc ccVar = (C143782cc) obj;
        return this.f389803a == ccVar.f389803a && this.f389804b.equals(ccVar.f389804b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f389803a) * 31) + this.f389804b.hashCode();
    }
}
