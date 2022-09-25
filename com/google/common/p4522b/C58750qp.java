package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.qp */
/* compiled from: PG */
final class C58750qp extends C58518i {

    /* renamed from: b */
    final /* synthetic */ Iterator f156526b;

    /* renamed from: c */
    final /* synthetic */ Iterator f156527c;

    /* renamed from: d */
    final /* synthetic */ C58751qq f156528d;

    public C58750qp(C58751qq qqVar, Iterator it, Iterator it2) {
        this.f156528d = qqVar;
        this.f156526b = it;
        this.f156527c = it2;
    }

    /* renamed from: a */
    public final Object mo55143a() {
        Object next;
        while (this.f156526b.hasNext()) {
            Object next2 = this.f156526b.next();
            if (!this.f156528d.f156530b.contains(next2)) {
                return next2;
            }
        }
        do {
            Iterator it = this.f156527c;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f156164a = 3;
                return null;
            }
        } while (this.f156528d.f156529a.contains(next));
        return next;
    }
}
