package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.text.TextUtils;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.d */
/* compiled from: PG */
public final class C42094d {

    /* renamed from: a */
    public final int f110050a;

    /* renamed from: b */
    public final boolean f110051b;

    /* renamed from: c */
    public final String f110052c;

    /* renamed from: d */
    public final int f110053d;

    public C42094d(C42093c cVar) {
        this.f110050a = cVar.f110046a;
        this.f110051b = cVar.f110047b;
        this.f110052c = cVar.f110048c;
        this.f110053d = cVar.f110049d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42094d) {
            C42094d dVar = (C42094d) obj;
            if (TextUtils.equals(this.f110052c, dVar.f110052c) && this.f110051b == dVar.f110051b && this.f110050a == dVar.f110050a && this.f110053d == dVar.f110053d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String str = this.f110052c;
        int i = this.f110050a;
        boolean z = this.f110051b;
        return str + i + z;
    }
}
