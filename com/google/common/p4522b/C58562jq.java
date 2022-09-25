package com.google.common.p4522b;

import com.google.common.base.C58839bc;
import java.util.Iterator;

/* renamed from: com.google.common.b.jq */
/* compiled from: PG */
final class C58562jq extends C58518i {

    /* renamed from: b */
    final /* synthetic */ Iterator f156223b;

    /* renamed from: c */
    final /* synthetic */ C58839bc f156224c;

    public C58562jq(Iterator it, C58839bc bcVar) {
        this.f156223b = it;
        this.f156224c = bcVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        while (this.f156223b.hasNext()) {
            Object next = this.f156223b.next();
            if (this.f156224c.mo5941a(next)) {
                return next;
            }
        }
        this.f156164a = 3;
        return null;
    }
}
