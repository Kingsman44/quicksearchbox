package com.google.common.p4536h;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.common.h.p */
/* compiled from: PG */
public final class C59259p {

    /* renamed from: a */
    public final C59258o f157370a;

    /* renamed from: b */
    private final Comparator f157371b = null;

    public C59259p(C59258o oVar) {
        oVar.getClass();
        this.f157370a = oVar;
        C58838bb.m90883r(oVar != C59258o.SORTED);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59259p)) {
            return false;
        }
        C59259p pVar = (C59259p) obj;
        if (this.f157370a == pVar.f157370a) {
            Comparator comparator = pVar.f157371b;
            if (C58832aw.m90831a((Object) null, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f157370a, null});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("type", this.f157370a);
        return b.toString();
    }
}
