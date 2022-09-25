package com.google.common.p4522b;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.b.jj */
/* compiled from: PG */
final class C58555jj extends C58431eu {

    /* renamed from: a */
    final /* synthetic */ Iterable f156212a;

    /* renamed from: b */
    final /* synthetic */ int f156213b;

    public C58555jj(Iterable iterable, int i) {
        this.f156212a = iterable;
        this.f156213b = i;
    }

    public final Iterator iterator() {
        Iterable iterable = this.f156212a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.f156213b), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        C58570jy.m90149a(it, this.f156213b);
        return new C58554ji(it);
    }
}
