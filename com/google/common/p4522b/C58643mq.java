package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.mq */
/* compiled from: PG */
final class C58643mq extends C58800sl {

    /* renamed from: a */
    final /* synthetic */ Iterator f156368a;

    public C58643mq(Iterator it) {
        this.f156368a = it;
    }

    public final boolean hasNext() {
        return this.f156368a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return C58662ni.m90354m((Map.Entry) this.f156368a.next());
    }
}
