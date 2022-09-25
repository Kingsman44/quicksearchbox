package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.common.b.pm */
/* compiled from: PG */
final class C58720pm extends C58465ga {

    /* renamed from: a */
    final /* synthetic */ C58722po f156462a;

    public C58720pm(C58722po poVar) {
        this.f156462a = poVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C58471gg mo55358b() {
        return this.f156462a;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f156462a.size(), "index");
        long j = (long) i;
        Integer num = (Integer) this.f156462a.first();
        if (j >= 0) {
            return Integer.valueOf(C60757n.m92740a(num.longValue() + j));
        }
        throw new IllegalArgumentException("distance cannot be negative but was: " + j);
    }
}
