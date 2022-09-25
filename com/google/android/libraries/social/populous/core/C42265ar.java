package com.google.android.libraries.social.populous.core;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.google.android.libraries.social.populous.core.ar */
/* compiled from: PG */
public final class C42265ar implements Serializable {

    /* renamed from: a */
    public final BitSet f110851a = new BitSet();

    /* renamed from: b */
    public final BitSet f110852b = new BitSet();

    /* renamed from: a */
    public static C42265ar m74424a(C42265ar arVar) {
        C42265ar arVar2 = new C42265ar();
        arVar2.mo45219b(arVar);
        return arVar2;
    }

    /* renamed from: b */
    public final void mo45219b(C42265ar arVar) {
        this.f110851a.andNot(arVar.f110852b);
        this.f110851a.or(arVar.f110851a);
        this.f110852b.or(arVar.f110852b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42265ar) {
            return this.f110851a.equals(((C42265ar) obj).f110851a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f110851a.hashCode();
    }

    public final String toString() {
        return this.f110851a.toString();
    }
}
