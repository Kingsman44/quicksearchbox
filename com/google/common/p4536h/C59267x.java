package com.google.common.p4536h;

import com.google.common.p4522b.C58800sl;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.h.x */
/* compiled from: PG */
final class C59267x extends C58800sl {

    /* renamed from: a */
    final /* synthetic */ Iterator f157379a;

    /* renamed from: b */
    final /* synthetic */ C59268y f157380b;

    public C59267x(C59268y yVar, Iterator it) {
        this.f157380b = yVar;
        this.f157379a = it;
    }

    public final boolean hasNext() {
        return this.f157379a.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f157379a.next();
        this.f157380b.f157381a.f157383b = entry;
        return entry.getKey();
    }
}
