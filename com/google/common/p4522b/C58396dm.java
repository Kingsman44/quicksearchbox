package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.b.dm */
/* compiled from: PG */
final class C58396dm extends C58518i {

    /* renamed from: b */
    final /* synthetic */ C58400dq f155994b;

    /* renamed from: c */
    private final Iterator f155995c;

    public C58396dm(C58400dq dqVar) {
        this.f155994b = dqVar;
        this.f155995c = dqVar.countMap.entrySet().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo55143a() {
        while (this.f155995c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f155995c.next();
            int i = ((AtomicInteger) entry.getValue()).get();
            if (i != 0) {
                return new C58697oq(entry.getKey(), i);
            }
        }
        this.f156164a = 3;
        return null;
    }
}
