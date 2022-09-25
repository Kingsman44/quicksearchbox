package com.google.android.apps.gsa.store;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.store.ad */
/* compiled from: PG */
final class C118306ad extends C118307ae {

    /* renamed from: b */
    private final String f328384b;

    public C118306ad(String str, int i) {
        super(i);
        this.f328384b = str;
    }

    /* renamed from: b */
    public final String mo103656b() {
        return this.f328384b;
    }

    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C118306ad)) {
            return false;
        }
        return this.f328384b.equals(((C118306ad) obj).f328384b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f328385a - 1), this.f328384b});
    }
}
