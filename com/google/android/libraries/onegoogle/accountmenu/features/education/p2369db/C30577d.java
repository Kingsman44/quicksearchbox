package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.d */
/* compiled from: PG */
public final class C30577d {

    /* renamed from: a */
    public final String f82606a;

    /* renamed from: b */
    public final String f82607b;

    /* renamed from: c */
    public int f82608c;

    /* renamed from: d */
    public int f82609d;

    /* renamed from: e */
    public boolean f82610e;

    public C30577d(String str, String str2) {
        this.f82606a = str;
        this.f82607b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30577d)) {
            return false;
        }
        C30577d dVar = (C30577d) obj;
        return this.f82608c == dVar.f82608c && this.f82609d == dVar.f82609d && this.f82610e == dVar.f82610e && C58832aw.m90831a(this.f82606a, dVar.f82606a) && C58832aw.m90831a(this.f82607b, dVar.f82607b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f82606a, this.f82607b, Integer.valueOf(this.f82608c), Integer.valueOf(this.f82609d), Boolean.valueOf(this.f82610e)});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("educationName", this.f82606a);
        b.mo56102b("highlightId", this.f82607b);
        b.mo56103c("numImpressions", String.valueOf(this.f82608c));
        b.mo56103c("numInteractions", String.valueOf(this.f82609d));
        b.mo56103c("completed", String.valueOf(this.f82610e));
        return b.toString();
    }
}
