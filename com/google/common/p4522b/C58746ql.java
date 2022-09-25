package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.ql */
/* compiled from: PG */
public final class C58746ql extends C58518i {

    /* renamed from: b */
    final Iterator f156518b;

    /* renamed from: c */
    final /* synthetic */ C58747qm f156519c;

    public C58746ql(C58747qm qmVar) {
        this.f156519c = qmVar;
        this.f156518b = qmVar.f156520a.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        while (this.f156518b.hasNext()) {
            Object next = this.f156518b.next();
            if (this.f156519c.f156521b.contains(next)) {
                return next;
            }
        }
        this.f156164a = 3;
        return null;
    }
}
