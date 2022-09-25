package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ag */
/* compiled from: PG */
final class C109787ag {

    /* renamed from: a */
    public final C58833ax f305911a;

    /* renamed from: b */
    public final int f305912b;

    public C109787ag(int i, C58833ax axVar) {
        this.f305912b = i;
        this.f305911a = axVar;
    }

    /* renamed from: a */
    static C109787ag m182809a() {
        return new C109787ag(8, C58836b.f156633a);
    }

    /* renamed from: b */
    static C109787ag m182810b(int i, C83956t tVar) {
        return new C109787ag(i, C58833ax.m90834k(tVar));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C109787ag) {
            C109787ag agVar = (C109787ag) obj;
            if (this.f305912b != agVar.f305912b || !this.f305911a.equals(agVar.f305911a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f305912b - 1), this.f305911a});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("state", String.valueOf(this.f305912b - 1));
        b.mo56102b("sequence", this.f305911a);
        return b.toString();
    }
}
