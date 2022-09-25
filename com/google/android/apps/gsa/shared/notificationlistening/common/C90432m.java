package com.google.android.apps.gsa.shared.notificationlistening.common;

import com.google.android.libraries.p1730f.C21370a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.m */
/* compiled from: PG */
public final class C90432m {

    /* renamed from: a */
    public final int f252637a;

    /* renamed from: b */
    public final long f252638b;

    /* renamed from: c */
    public final boolean f252639c;

    public C90432m(int i, boolean z, long j) {
        this.f252637a = i;
        this.f252639c = z;
        this.f252638b = j;
    }

    /* renamed from: a */
    public final boolean mo84163a(C21370a aVar, long j) {
        return this.f252638b + j >= aVar.mo26870b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90432m)) {
            return false;
        }
        C90432m mVar = (C90432m) obj;
        if (this.f252637a == mVar.f252637a && this.f252639c == mVar.f252639c && this.f252638b == mVar.f252638b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f252637a), Boolean.valueOf(this.f252639c), Long.valueOf(this.f252638b)});
    }
}
