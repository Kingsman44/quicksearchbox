package com.google.common.p4536h;

import com.google.common.p4522b.C58518i;
import java.util.Iterator;

/* renamed from: com.google.common.h.h */
/* compiled from: PG */
final class C59251h extends C58518i {

    /* renamed from: b */
    final /* synthetic */ Iterator f157356b;

    public C59251h(Iterator it) {
        this.f157356b = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        while (this.f157356b.hasNext()) {
            C59255l lVar = (C59255l) this.f157356b.next();
            if (lVar instanceof C59254k) {
                return lVar.f157358a;
            }
        }
        this.f156164a = 3;
        return null;
    }
}
