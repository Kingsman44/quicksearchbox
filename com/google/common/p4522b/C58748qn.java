package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.qn */
/* compiled from: PG */
public final class C58748qn extends C58518i {

    /* renamed from: b */
    final Iterator f156522b;

    /* renamed from: c */
    final /* synthetic */ C58749qo f156523c;

    public C58748qn(C58749qo qoVar) {
        this.f156523c = qoVar;
        this.f156522b = qoVar.f156524a.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        while (this.f156522b.hasNext()) {
            Object next = this.f156522b.next();
            if (!this.f156523c.f156525b.contains(next)) {
                return next;
            }
        }
        this.f156164a = 3;
        return null;
    }
}
