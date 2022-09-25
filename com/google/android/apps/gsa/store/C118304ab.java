package com.google.android.apps.gsa.store;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.store.ab */
/* compiled from: PG */
final class C118304ab extends C118307ae {

    /* renamed from: b */
    private final C118302a f328382b;

    public C118304ab(C118302a aVar, int i) {
        super(i);
        this.f328382b = aVar;
    }

    /* renamed from: b */
    public final String mo103656b() {
        return Integer.toString(this.f328382b.f328381a);
    }

    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C118304ab)) {
            return false;
        }
        return this.f328382b.equals(((C118304ab) obj).f328382b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f328385a - 1), this.f328382b});
    }
}
