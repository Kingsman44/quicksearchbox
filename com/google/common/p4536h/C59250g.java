package com.google.common.p4536h;

import com.google.common.p4522b.C58518i;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.h.g */
/* compiled from: PG */
final class C59250g extends C58518i {

    /* renamed from: b */
    final /* synthetic */ Iterator f157355b;

    public C59250g(Iterator it) {
        this.f157355b = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        while (this.f157355b.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f157355b.next();
            if (C59257n.m92000a(entry.getValue())) {
                return entry.getKey();
            }
        }
        this.f156164a = 3;
        return null;
    }
}
