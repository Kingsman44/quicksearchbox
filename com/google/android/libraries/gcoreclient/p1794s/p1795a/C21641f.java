package com.google.android.libraries.gcoreclient.p1794s.p1795a;

import com.google.android.gms.mdh.MdhFootprint;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import java.util.Iterator;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.s.a.f */
/* compiled from: PG */
public final class C21641f {

    /* renamed from: a */
    public final MdhFootprint f59994a;

    public C21641f(MdhFootprint mdhFootprint) {
        this.f59994a = mdhFootprint;
    }

    /* renamed from: a */
    public static Collection m40758a(Collection collection) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e.mo55395g(new C21641f((MdhFootprint) it.next()));
        }
        return e.mo55394f();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C21641f) && this.f59994a.equals(((C21641f) obj).f59994a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f59994a.hashCode();
    }
}
