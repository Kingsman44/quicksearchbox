package com.google.android.apps.gsa.store;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58832aw;

/* renamed from: com.google.android.apps.gsa.store.ae */
/* compiled from: PG */
class C118307ae implements C118336y {

    /* renamed from: a */
    public final int f328385a;

    public C118307ae(int i) {
        this.f328385a = i;
    }

    /* renamed from: b */
    public String mo103656b() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    public final int mo103659c() {
        return this.f328385a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C118307ae) {
            return C58832aw.m90831a(Integer.valueOf(this.f328385a - 1), Integer.valueOf(((C118307ae) obj).f328385a - 1));
        }
        return false;
    }

    public int hashCode() {
        return this.f328385a - 1;
    }
}
