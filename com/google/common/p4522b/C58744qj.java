package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.qj */
/* compiled from: PG */
public final class C58744qj extends C58518i {

    /* renamed from: b */
    final Iterator f156513b;

    /* renamed from: c */
    final Iterator f156514c;

    /* renamed from: d */
    final /* synthetic */ C58745qk f156515d;

    public C58744qj(C58745qk qkVar) {
        this.f156515d = qkVar;
        this.f156513b = qkVar.f156516a.iterator();
        this.f156514c = qkVar.f156517b.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        if (this.f156513b.hasNext()) {
            return this.f156513b.next();
        }
        while (this.f156514c.hasNext()) {
            Object next = this.f156514c.next();
            if (!this.f156515d.f156516a.contains(next)) {
                return next;
            }
        }
        this.f156164a = 3;
        return null;
    }
}
